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

        int res = a.squareRomb(6, 30.0);
        Assert.assertTrue(res == 18);
    }
}