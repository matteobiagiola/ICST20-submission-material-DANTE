package utils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;

public class FileUtils {

    public static void deleteScreenshotsNonRecursively(File dir) {
        File[] files = dir.listFiles();
        if(files != null) {
            for (File file : files) {
                if(file.getName().endsWith(".png")) {
                    if(!file.delete())
                        throw new RuntimeException("Cannot delete file " + file);
                }
            }
        }
    }

    public static void createDirIfDoesNotExist(File dir) {
        if(!dir.exists()) {
            if(!dir.mkdirs()) {
                throw new RuntimeException("Failed in creating dir: " + dir);
            }
        } else if(dir.exists() && !dir.isDirectory()) {
            throw new RuntimeException("Dir " + dir + " exists but it is not a directory");
        }
    }

    /**
     * Write string to file
     *
     * @param fileName
     *            - name of the file to write to
     * @param content
     *            - text to write into the file
     */
    public static void writeFile(String content, String fileName) {
        try {
            Writer writer = new PrintWriter(new File(fileName));
            writer.write(content);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.err.println("Error while writing file " + fileName + " , " + e.getMessage());
        }
    }


    public static void copyFile(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }

    public static void deleteDirectory(File file) throws IOException {
        if (file.isDirectory()) {
            File[] entries = file.listFiles();
            if (entries != null) {
                for (File entry : entries) {
                    deleteDirectory(entry);
                }
            }
        }
        if (!file.delete()) {
            throw new IOException("Failed to delete " + file);
        }
    }
}
