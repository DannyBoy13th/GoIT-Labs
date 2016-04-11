package SpaceCounter;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class CounterTest {


    private static Counter counter;

    @BeforeClass
    public static void setUpClass() throws Exception {
        counter = new Counter();
    }


    @Test
    public void testTriangleCounter() throws Exception {
        final int sideC = 4;
        final int height = 5;

        final int result = Counter.triangleCounter(sideC, height);

        Assert.assertEquals(10, result);
    }

    @Test
    public void testCircleCounter() throws Exception{
        final double radius = 4;

        final double result = Counter.circleCounter(radius);

        Assert.assertEquals(50.264, result, 0.3);

    }

    @Test
    public void testRectangleCounter() throws Exception{
        final int sideA = 5;
        final int sideB = 4;

        final int result = Counter.rectangleCounter(sideA,sideB);

        Assert.assertEquals(20, result);
    }
}

