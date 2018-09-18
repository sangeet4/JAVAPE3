package pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks class1 = null;

    @Before
    public void setUp() throws Exception {
        class1 = new StudentMarks(5);
    }

    @After
    public void tearDown() throws Exception {
        class1 = null;
    }

    @Test (expected = InvalidGradeException.class)
    public void throwsExceptionOnWrongGrades() throws Exception{
        class1.addGrades(new int[]{20, 40, 101, 50, 80});
    }

    @Test
    public void rightGradesInput() throws Exception{
        assertArrayEquals(new int[]{20, 30, 40, 60, 80}, class1.addGrades(new int[]{20, 30, 40, 60, 80}));
    }
}