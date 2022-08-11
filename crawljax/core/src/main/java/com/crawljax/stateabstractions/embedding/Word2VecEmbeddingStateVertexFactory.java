package com.crawljax.stateabstractions.embedding;

import com.crawljax.browser.EmbeddedBrowser;
import com.crawljax.core.state.StateVertex;
import com.crawljax.core.state.StateVertexFactory;
import com.google.gson.Gson;

public class Word2VecEmbeddingStateVertexFactory extends StateVertexFactory {
    private String classifierURI = "http://127.0.0.1:5000";

    // creates object which will then make the comparison
    @Override
    public StateVertex newStateVertex(int id, String url, String name, String dom, String strippedDom, EmbeddedBrowser browser) {
        return new Word2VecEmbeddingStateVertexImpl(id, url, name, dom, strippedDom, classifierURI);
    }
}
