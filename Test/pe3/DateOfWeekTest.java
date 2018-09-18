package pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateOfWeekTest {
    DateOfWeek obj = null;

    @Before
    public void setUp() throws Exception {
        obj = new DateOfWeek();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void checkForDay() throws Exception{
        String [] expectedValue={"Mon 17/09/2018","Sun 23/09/2018"};
        assertEquals(expectedValue, obj.firstLastDay());
    }
}