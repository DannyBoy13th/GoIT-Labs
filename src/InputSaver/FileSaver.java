package InputSaver;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Daniel Solo on 10.04.2016.
 */
public class FileSaver {
    public static void saveFile(String fileName, String text){
        File file = new File(fileName);

        try {
            if (!file.exists())
                file.createNewFile();
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
