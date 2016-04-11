package InputSaver;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Daniel Solo on 12.04.2016.
 */
public class FileSaverTest {

        private static FileSaver fileSaver;
        private static String fileName = "FileSaver.txt";

        @BeforeClass
        public static void setUpClass() throws Exception{
            fileSaver = new FileSaver();
        }

        @Test
        public void testWriterAndReader() throws Exception {
            String text = "A second trailer for the upcoming season of Game of Thrones";

            fileSaver.saveFile(fileName, text);

            String readResult = text;

            Assert.assertEquals(text, readResult);
    }
}