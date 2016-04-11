package DistanceMeter;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class DistanceMeterTest {

    private static DistanceMeter distanceMeter;

    @BeforeClass
    public static void setUpClass() throws Exception{
        distanceMeter = new DistanceMeter();
    }

    @Test
    public void testDistCounter() throws Exception {
        final double X1 = 4;
        final double Y1 = 8;
        final double X2 = 13;
        final double Y2 = 10;

        final double result = distanceMeter.distCounter(X1,Y1,X2,Y2);

        Assert.assertEquals(9.21, result, 0.1);

    }
}