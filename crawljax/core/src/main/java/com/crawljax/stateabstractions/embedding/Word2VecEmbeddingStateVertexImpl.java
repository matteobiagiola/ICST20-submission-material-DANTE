package com.crawljax.stateabstractions.embedding;

import com.crawljax.core.state.StateVertexImpl;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Dictionary;
import java.util.Hashtable;

public class Word2VecEmbeddingStateVertexImpl extends StateVertexImpl {
    private String classifierURI;

    {
        classifierURI = null;
    }

    private static URL restUrl;
    private static HttpURLConnection connection;

    /**
     * Defines a State.
     *
     * @param id
     * @param url         the current url of the state
     * @param name        the name of the state
     * @param dom         the current DOM tree of the browser
     * @param strippedDom the stripped dom by the OracleComparators
     */
    public Word2VecEmbeddingStateVertexImpl(int id, String url, String name, String dom, String strippedDom, String classifierURI) {
        super(id, url, name, dom, strippedDom);

        this.classifierURI = classifierURI;
    }

    @Override
//    compares two pages and makes an HTTP request to the exposed python app
    public boolean equals(Object object) {
        try {
            Word2VecEmbeddingStateVertexImpl that = (Word2VecEmbeddingStateVertexImpl) object;

            String this_dom = this.getDom();
            String this_strippedDom = this.getStrippedDom();

            String that_dom = that.getDom();
            String that_strippedDom = that.getStrippedDom();

            // set up connection to flask
            restUrl = new URL("http://127.0.0.1:5000");
            connection = (HttpURLConnection) restUrl.openConnection();

            // POST to pass params to python function
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setDoOutput(true);

            Gson gson = new Gson();
            Dictionary<String, String> dict = new Hashtable<>();
            //adding values in the dictionary
            dict.put("dom1", this_dom);
            dict.put("dom2", that_dom);
            String jsonStr = gson.toJson(dict);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonStr.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer responseContent = new StringBuffer();
            String line;

            int status = connection.getResponseCode();

            if (status == 200) {
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }

            boolean result = false;
            if (responseContent.toString().equals("Content-Type not supported!")) {
                System.out.println("Content-Type not supported!");
                System.exit(1);
            } else {
                result = responseContent.toString().equals("true");
            }

            System.out.print(this.getName() + ", " + that.getName() + ": ");
            System.out.println(result ? "clones" : "distinct");
            return result;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
