package com.dante.parsing;

import java.util.LinkedList;
import java.util.List;

public class TestCase {

    private final List<String> statements;
    private final int order;
    private String name;

    public TestCase(List<String> statements, int order) {
        this.statements = new LinkedList<>(statements);
        // remove last statement if it is a Thread.sleep
        String lastStatement = ((LinkedList<String>) this.statements).getLast();
        if(lastStatement.trim().startsWith("Thread.sleep")) {
            this.statements.remove(this.statements.size() - 1);
        }
        this.order = order;
    }

    public List<String> getStatements() {
        return new LinkedList<>(this.statements);
    }

    public int getOrder() {
        return order;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
