package CeasarsCipher;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Daniel Solo on 12.04.2016.
 */
public class CipherTest {
    private static Cipher cipher;
    private static int key = 7;

    @BeforeClass
    public static void setUpClass() throws Exception{
        cipher = new Cipher();
    }

    @Test
    public void testEncode() throws Exception {
        final String textToEncode = "A second trailer for the upcoming season of Game of Thrones";
        final String result = cipher.encode(textToEncode,key);

        Assert.assertEquals("H zljvuk ayhpsly mvy aol bwjvtpun zlhzvu vm Nhtl vm Aoyvulz", result);
    }

    @Test
    public void testDecode() throws Exception {
        final String textToDecode = "H zljvuk ayhpsly mvy aol bwjvtpun zlhzvu vm Nhtl vm Aoyvulz";
        final String result = cipher.decode(textToDecode,key);

        Assert.assertEquals("A second trailer for the upcoming season of Game of Thrones", result);

    }
}