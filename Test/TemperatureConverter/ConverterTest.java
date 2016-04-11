package TemperatureConverter;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class ConverterTest {

    private static Converter converter;

    @BeforeClass
    public static void setUpClass() throws Exception {
        converter = new Converter();
    }

    @Test
    public void testFahrConverter() throws Exception {
        final double celTemp = 17.0;
        final double result = converter.fahrConverter(celTemp);

        Assert.assertEquals(62.6, result, 0.1);
    }

    @Test
    public void testCelConverter() throws Exception {
        final double fahrTemp = 56.0;
        final double result = converter.celConverter(fahrTemp);

        Assert.assertEquals(13.33, result, 0.1);
    }
}