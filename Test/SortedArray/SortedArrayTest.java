package SortedArray;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class SortedArrayTest {

    private static SortedArray sortedArray;

    @BeforeClass
    public static void setUpClass() throws Exception{
        sortedArray = new SortedArray();
    }

    @Test
    public void testMinimum() throws Exception {
        final int[] Array = {5,76,879,56,34,32,7};

        final int result = sortedArray.minimum(Array);

        Assert.assertEquals(5, result);
    }

    @Test
    public void testMaximum() throws Exception {
        final int[] Array ={9,56,98,2,6,34,78,34,78};

        final int result = sortedArray.maximum(Array);

        Assert.assertEquals(98, result);

    }
}