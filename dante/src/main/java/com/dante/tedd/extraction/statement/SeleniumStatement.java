package com.dante.tedd.extraction.statement;

import java.util.List;

public interface SeleniumStatement {

    List<Action> getActions();

    Action getLocator();
}
