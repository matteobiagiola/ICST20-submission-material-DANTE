package com.dante.parsing;

import com.dante.utils.FileUtils;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.stream.Collectors;

public class JavaFormatter {

    public static void format(File javaFile) {
        try {
            String content = Files.lines(javaFile.toPath()).map(String::valueOf)
                    .collect(Collectors.joining("\n"));
            JavaClassSource javaClass = Roaster.parse(JavaClassSource.class, content);
            FileUtils.writeFile(javaClass.toString(), javaFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void removeComments(File javaFile) {
        try {
            String content = Files.lines(javaFile.toPath()).map(String::valueOf)
                    .collect(Collectors.joining("\n"));
            JavaClassSource javaClass = Roaster.parse(JavaClassSource.class, content);
            javaClass.getMethods().stream().forEach(method -> {
                String newMethodBody = Arrays.stream(method.getBody().split("\n"))
                        .filter(statement -> !statement.startsWith("//"))
                        .collect(Collectors.joining("\n"));
                method.setBody(newMethodBody);
            });
            FileUtils.writeFile(javaClass.toString(), javaFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
