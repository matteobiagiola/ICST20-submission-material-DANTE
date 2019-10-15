package utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.session.SessionFactory;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SessionProvider {

    private Map<String, String> mapNameSource = new HashMap<>();

    private static utils.SessionProvider ourInstance = new utils.SessionProvider();

    public Session createSession(WebDriver driver) {

        try {

            URL devtoolsUrl = this.findCdpEndpoint(driver);
            String seleniumTargetId = this.getSeleniumTargetId(devtoolsUrl, driver.getTitle());

            SessionFactory factory = new SessionFactory(devtoolsUrl.getPort());

            Session session = factory.connect(seleniumTargetId);
            // enable debugger
            session.getCommand().getDebugger().enable();
            // enable code coverage
            session.getCommand().getProfiler().enable();

            return session;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String getSeleniumTargetId(URL cdp, String title) throws IOException {
        for (JsonElement element : new JsonParser().parse(new InputStreamReader(cdp.openStream(), StandardCharsets.UTF_8)).getAsJsonArray()) {
            JsonObject object = element.getAsJsonObject();
            if (title == null || title.isEmpty()
                    ? object.get("type").getAsString().equalsIgnoreCase("page")
                    : object.get("title").getAsString().equalsIgnoreCase(title)) {
                return object.get("id").getAsString();
            }
        }
        throw new RuntimeException("Selenium target not found.");
    }

    private URL findCdpEndpoint(WebDriver driver) throws IOException {
        Map<?, ?> capChrome = (Map<?,?>) ((HasCapabilities)driver).getCapabilities().getCapability("chrome");
        String userDataDir = (String) capChrome.get("userDataDir");
        int port = Integer.parseInt(Files.readAllLines(Paths.get(userDataDir, "DevToolsActivePort")).get(0));
        return new URL("http", "localhost", port, "/json");
    }

    public static utils.SessionProvider getInstance(){
        return ourInstance;
    }

    public String getResourceFromApp(URL url, String resourceName) {
        if(this.mapNameSource.get(resourceName) != null) {
            return this.mapNameSource.get(resourceName);
        }
        try {
            FileUtils.createDirIfDoesNotExist(new
                    File(Properties.user_dir + "/src/main/resources/scripts"));
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String scriptSource = reader.lines().collect(Collectors.joining("\n"));
            this.mapNameSource.put(resourceName, scriptSource);
            FileUtils.writeFile(scriptSource, Properties.user_dir
                    + "/src/main/resources/scripts/" + resourceName);
            return scriptSource;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
