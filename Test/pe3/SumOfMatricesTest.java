package pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfMatricesTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void matrixAddition() throws Exception{
        int[][] actual = SumOfMatrices.addTwoMatrices(3,3, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}} );
        int[][] expected = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void matrixsubstraction() throws Exception{
        int[][] actual = SumOfMatrices.addTwoMatrices(3, 2, new int[][]{{1, 2}, {3, 4}, {5, 6}}, new int[][]{{-1, -2}, {-3, -4}, {-5, -6}});
        int[][] expected = {{0, 0}, {0, 0}, {0, 0}};
    }
}