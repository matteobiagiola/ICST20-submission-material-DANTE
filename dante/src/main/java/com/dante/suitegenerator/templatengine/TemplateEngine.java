package com.dante.suitegenerator.templatengine;

import java.io.File;

public interface TemplateEngine {

    void render(String templateName, File outputDirectory);
}
