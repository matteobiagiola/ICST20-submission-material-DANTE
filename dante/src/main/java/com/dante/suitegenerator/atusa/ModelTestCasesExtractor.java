package com.dante.suitegenerator.atusa;

import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.state.Identification;
import com.dante.parsing.TestCase;
import com.dante.subjects.ApplicationNames;
import com.dante.subjects.Config;
import com.dante.subjects.config.RetroboardConfig;
import com.dante.suitegenerator.atusa.extraction.ClickableLocator;
import com.dante.suitegenerator.atusa.extraction.CrawlGraph;
import com.dante.suitegenerator.atusa.extraction.InputFieldLocator;
import com.dante.suitegenerator.atusa.json.JacksonParser;
import com.dante.suitegenerator.atusa.json.model.CrawlResults;
import com.dante.suitegenerator.atusa.json.model.Edge;
import com.dante.suitegenerator.atusa.json.model.State;
import com.dante.utils.NumberUtils;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;
import org.jgrapht.GraphPath;
import org.jgrapht.graph.DirectedPseudograph;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class ModelTestCasesExtractor {

    private final static Logger logger = Logger.getLogger(ModelTestCasesExtractor.class.getName());

    public List<TestCase> extractTestCases(File crawlerResultsFile, Config config) {
        List<TestCase> result = new LinkedList<>();

        CrawljaxConfiguration crawljaxConfiguration = config.getCrawljaxConfig().buildWithoutWritingLogFile();
        Set<Identification> inputFieldIdsWithEnterClick = crawljaxConfiguration.getCrawlRules().getInputFieldIdsWithEnterClick();

        JacksonParser jacksonParser = new JacksonParser();
        CrawlResults crawlResults = jacksonParser.parse(crawlerResultsFile.getAbsolutePath());
        CrawlGraph crawlGraph = new CrawlGraph(crawlResults);
        DirectedPseudograph<State,Edge> graph = crawlGraph.buildGraph();
        logger.info("* Crawl graph nodes: " + graph.vertexSet().size());
        logger.info("* Crawl graph edges: " + graph.edgeSet().size());
        List<GraphPath<State, Edge>> graphPaths = crawlGraph.generatePaths(graph);
        int j = 0;
        for (GraphPath<State, Edge> graphPath : graphPaths) {
            String previousToNode = null;
            for (Edge edge : graphPath.getEdgeList()) {
                if(previousToNode != null && !edge.getFrom().equals(previousToNode)){
                    throw new IllegalStateException("Current From node " + edge.getFrom()
                            + " must match with previous To node " + previousToNode + " in path "
                            + graphPath.getEdgeList().stream()
                            .map(edge1 -> edge1.getFrom() + " -> " + edge1.getTo()).collect(Collectors.joining(":")));
                }
                previousToNode = edge.getTo();
            }
            logger.info(j + " Graph path: " + graphPath.getEdgeList().stream()
                    .map(edge -> edge.getFrom() + " -> " + edge.getTo()).collect(Collectors.joining(":")));
            j++;
        }


        List<ClickableLocator> clickableLocators = new LinkedList<>();
        int i = 0;
        for(GraphPath<State, Edge> graphPath: graphPaths) {
            List<Edge> edges = graphPath.getEdgeList();
            for (Edge edge : edges) {
                ClickableLocator clickableLocator = crawlGraph.parseEdgeId(edge);
                String value = crawlGraph.parseEdgeElement(edge);
                if (value != null) {
                    clickableLocator.setValue(value);
                }
                clickableLocators.add(clickableLocator);
            }

            TestCase testCase = new TestCase(this.getStatements(clickableLocators,
                    graphPath, inputFieldIdsWithEnterClick), i);
            result.add(testCase);
            clickableLocators.clear();
            i++;
        }

        int numberOfLeadingZeros = NumberUtils.getNumberOfDigits(result.size());
        for(TestCase testCase: result) {
            // String format below will add leading zeros (the %0 syntax)
            // to the number above.
            // The length of the formatted string will be numberOfLeadingZeros characters.
            String name = "test" + String.format("%0" + numberOfLeadingZeros + "d", testCase.getOrder());
            testCase.setName(name);
        }

        return result;
    }

    private List<String> getStatements(List<ClickableLocator> clickableLocators, GraphPath<State, Edge> graphPath,
                                       Set<Identification> inputFieldIdsWithEnterClick) {

        StringBuilder builder = new StringBuilder();
        int counter = 0;
        builder.append("/* path: ").append(graphPath.getEdgeList().stream().map(edge -> edge.getFrom()
                + "->" + edge.getTo()).collect(Collectors.joining(":"))).append("*/ \n");
        for (ClickableLocator clickableLocator : clickableLocators) {
            builder.append("List<WebElement> elements").append(counter)
                    .append(" = driver.findElements(By.").append(clickableLocator.type).append("(\"");
            if(Properties.APPLICATION_NAME.equals(ApplicationNames.Name.DIMESHIFT.getName())
                    && clickableLocator.type.equalsIgnoreCase("xpath")) {
                if(clickableLocator.id.contains("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]")) {
                    builder.append(clickableLocator.id.replace("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]",
                            "//DIV[@class=\\\"page_holder\\\"]")).append("\"));\n");
                } else if(clickableLocator.id.contains("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]")) {
                    builder.append(clickableLocator.id.replace("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]",
                            "//DIV[@class=\\\"page_holder\\\"]")).append("\"));\n");
                } else {
                    builder.append(clickableLocator.id).append("\"));\n");
                }
            } else {
                builder.append(clickableLocator.id).append("\"));\n");
            }

            builder.append("if(elements").append(counter).append(".size() > 0){\n");
            int innerCounter = 0;
            for (InputFieldLocator inputFieldLocator : clickableLocator.inputFieldLocators) {
                builder.append("List<WebElement> inputElements").append(innerCounter).append(" = driver.findElements(By.")
                        .append(inputFieldLocator.type).append("(\"").append(inputFieldLocator.id).append("\"));\n");
                builder.append("if(inputElements").append(innerCounter).append(".size() > 0){\n");
                if(Properties.APPLICATION_NAME.equals(ApplicationNames.Name.PHOENIX.getName())
                        && inputFieldLocator.type.equals("xpath")
                        && (inputFieldLocator.id.equalsIgnoreCase("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]")
                        || inputFieldLocator.id.equalsIgnoreCase("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"))) {
                    builder.append("inputElements").append(innerCounter).append(".get(0).clear();\n");
                }
                builder.append("try { \n");
                builder.append("inputElements").append(innerCounter).append(".get(0).sendKeys(\"")
                        .append(inputFieldLocator.value).append("\");\n");
                builder.append("} catch(Exception ex) { \n ").append("System.out.println(\" WARNING: exception - message \" + ex.getMessage() + \" cause \" + ex.getCause()); ");
                builder.append("Thread.sleep(2000); \n");
                builder.append("inputElements").append(innerCounter).append(".get(0).sendKeys(\"")
                        .append(inputFieldLocator.value).append("\");\n");
                builder.append("} \n");

                // if dimeshift replace "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]" and "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]" with "//DIV[@class=\"page_holder\"]"

                if(containsFieldWithEnterClick(inputFieldIdsWithEnterClick, inputFieldLocator)
                        || (Properties.APPLICATION_NAME.equals(ApplicationNames.Name.RETROBOARD.getName())
                        && inputFieldLocator.type.equals("xpath")
                        && RetroboardConfig.usersXPath.equalsIgnoreCase(inputFieldLocator.id))) {
                    builder.append("inputElements").append(innerCounter).append(".get(0).sendKeys(")
                            .append("Keys.ENTER);\n");
                }
                builder.append("}\n");
                builder.append("else { \n throw new RuntimeException(\"Input element not found\"); \n } \n");
                innerCounter++;
            }
            try{

            }catch (Exception ex) {
                System.out.println(ex.getMessage() );
            }
            builder.append("try { \n");
            builder.append("elements").append(counter).append(".get(0).click();\n");
            builder.append("Thread.sleep(2000);\n");
            builder.append("} catch(Exception ex) { \n ").append("System.out.println(\" WARNING: exception - message \" + ex.getMessage() + \" cause \" + ex.getCause()); \n } \n");
            builder.append("}\n");
            builder.append("else { \n throw new RuntimeException(\"Clickable element not found\"); \n } \n");
            counter++;
        }

        return new LinkedList<>(Arrays.asList(builder.toString().split("\n")));
    }


    private boolean containsFieldWithEnterClick(Set<Identification> inputFieldIdsWithEnterClick,
                                                InputFieldLocator inputFieldLocator) {
        for (Identification identification : inputFieldIdsWithEnterClick) {
            if(identification.getHow().name().equals(inputFieldLocator.type)
                    && identification.getValue().equals(inputFieldLocator.id)) {
                return true;
            }
        }
        return false;
    }
}
