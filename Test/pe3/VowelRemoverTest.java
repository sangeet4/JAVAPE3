package pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelRemoverTest {
    VowelRemover[] countryList = null;

    @Before
    public void setUp() throws Exception {
        countryList = new VowelRemover[5];
        for(int i=0; i<5; i++)
            countryList[i] = new VowelRemover();
    }

    @After
    public void tearDown() throws Exception {
        countryList = null;
    }

    @Test
    public void Test1() throws Exception{
        countryList[0].setCountry("India");
        countryList[1].setCountry("United States");
        countryList[2].setCountry("Germany");
        countryList[3].setCountry("Egypt");
        countryList[4].setCountry("czechoslovakia");
        for(int i=0; i<5; i++){
            countryList[i].removeVowelOfCountry();
        }
        assertEquals("Ind", countryList[0].getCountry());
        assertEquals("Untd Stts", countryList[1].getCountry());
        assertEquals("Grmny", countryList[2].getCountry());
        assertEquals("Egypt", countryList[3].getCountry());
        assertEquals("czchslvk", countryList[4].getCountry());
    }
}