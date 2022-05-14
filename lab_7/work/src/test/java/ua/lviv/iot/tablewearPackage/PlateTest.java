package ua.lviv.iot.tablewearPackage;

import junit.framework.TestCase;

import java.util.Date;

public class PlateTest extends TestCase {
    private Plate plate;
    public void setUp() throws Exception {
        super.setUp();
        plate = new Plate(12, 110.4, "carbon",  new Date(-89, 8, 4));
    }

    public void tearDown() throws Exception {

    }
    public void testUseSpon() {
        String result = plate.usePlate();
        assertEquals(result, "I am plate");
    }
    public void testGetHeaders(){
        assertEquals("dateOfCreation, price, material, size", plate.getHeaders());
    }
    public void testToCSV(){
        assertEquals("1811-00-04 12:00:00, 110.4, carbon, 12", plate.toCSV());
    }
}