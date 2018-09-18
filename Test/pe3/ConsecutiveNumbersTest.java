package pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers obj = null;

    @Before
    public void setUp() throws Exception {
        obj = new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void testForPositiveConsecutive() throws Exception{
        obj.setSeries("1,2,3,4,5,6,7");
        assertEquals("Consecutive Numbers", obj.checkIfConsecutive());
    }

    @Test
    public void testForNegativeConsecutive() throws Exception{
        obj.setSeries("101, 100, 99, 98, 97, 96, 95");
        assertEquals("Consecutive Numbers", obj.checkIfConsecutive());
    }

    @Test
    public void testForNonConsecutive() throws Exception{
        obj.setSeries("2, 4, 8, 8, 16, 32, 32");
        assertEquals("Non-consecutive Numbers", obj.checkIfConsecutive());
    }

    @Test
    public void testForNonConsecutive1() throws Exception{
        obj.setSeries("1,0,1,2,3,2,3");
        assertEquals("Non-consecutive Numbers", obj.checkIfConsecutive());
    }
}