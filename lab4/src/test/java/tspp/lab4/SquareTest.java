package tspp.lab4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareTest {

    private Square a;
    
    @Before
    public void runT() {
        a = new Square();
    }

    @Test
    public void testSquareRomb() {

        float res = a.squareRomb(6, 30);
        Assert.assertTrue(res == 18);
    }
    
    @Test
    public void testExist() {

        float res = a.squareRomb(6, 30);
        Assert.assertNotNull(a);
    }
    
    @Test
    public void testMinus() {

        float res = a.squareRomb(-4, 30);
        Assert.assertFalse(res != 0);
    }
}