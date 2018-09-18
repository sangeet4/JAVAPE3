package pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateExceptionsTest {
    GenerateExceptions obj = null;

    @Before
    public void setUp() throws Exception {
        obj = new GenerateExceptions();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test(expected = NegativeArraySizeException.class)
    public void catchNegativeArraySizeException() throws Exception{
        obj.returnNegativeArraySizeException();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void catchArrayIndexOutOfBoundException() throws Exception{
        obj.returnArrayIndexOutOfBoundException();
    }

    @Test(expected = NullPointerException.class)
    public void catchNullPointerException() throws Exception{
        obj.returnNullPointerException();
    }

}