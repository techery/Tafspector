package techery.uitests.appspector.Utils;


import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class FileHelper {

    private FileHelper(){}

    public static String getResourceFilePath(String relativeFilePath) throws FileNotFoundException {
        ClassLoader classLoader = FileHelper.class.getClassLoader();
        URL resource = classLoader.getResource(relativeFilePath);
        if (resource == null) {
            throw new FileNotFoundException("Resource file was not found by path " +relativeFilePath);
        }
        return resource.getPath();
    }
}