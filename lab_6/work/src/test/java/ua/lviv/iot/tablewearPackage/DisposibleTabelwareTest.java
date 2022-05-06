package ua.lviv.iot.tablewearPackage;

import junit.framework.TestCase;
import java.text.DateFormat;
import java.util.Date;

public class DisposibleTabelwareTest extends TestCase {
    private DisposibleTabelware disposibleTabelware;
    public void setUp() throws Exception {
        disposibleTabelware = new DisposibleTabelware(new Date(5, 5, 5), 10.1, "carbon", 3);
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testGetHeaders() {
        assertEquals("dateOfCreation, price, material, size", disposibleTabelware.getHeaders());
    }

    public void testToCSV() {
        assertEquals("1905-00-05 12:00:00, 10.1, carbon, 3", disposibleTabelware.toCSV());
    }
}