package com.dante.suitegenerator.templatengine;

import com.dante.parsing.JavaFormatter;
import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;

public class PebbleTemplateEngine implements TemplateEngine {

    private final Map<String, Object> context;
    private final String templatesPath = "src" + File.separator + "main" + File.separator
            + "resources" + File.separator + "templates";

    public PebbleTemplateEngine(Map<String, Object> context) {
        this.context = new LinkedHashMap<>(context);
    }

    @Override
    public void render(String templateName, File outputDirectory) {
        PebbleEngine engine = new PebbleEngine.Builder().autoEscaping(false).build();
        PebbleTemplate pebbleTemplate = engine.getTemplate(templatesPath
                + File.separator + templateName);

        try {

            Writer writer = new StringWriter();
            pebbleTemplate.evaluate(writer, this.context);

            String output = writer.toString();
            FileWriter fw = new FileWriter(outputDirectory);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(output);
            bw.close();

            if(outputDirectory.getAbsolutePath().endsWith(".java")) {
                JavaFormatter.format(outputDirectory);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
