package ua.lviv.iot.tablewearPackage;

import junit.framework.TestCase;

import java.util.Date;

public class SpoonTest extends TestCase {
    private Spoon spoon;
    public void setUp() throws Exception {
        super.setUp();
        spoon = new Spoon(12, 110.4, "carbon",  new Date(-89, 8, 4));
    }

    public void tearDown() throws Exception {

    }
    public void testUseSpon() {
        String result = spoon.useSpoon();
        assertEquals(result, "I am spoon");
    }
    public void testGetHeadrs(){
        assertEquals("dateOfCreation, price, material, size", spoon.getHeaders());
    }
    public void testToCSV(){
        assertEquals("1811-00-04 12:00:00, 110.4, carbon, 12", spoon.toCSV());
    }
}