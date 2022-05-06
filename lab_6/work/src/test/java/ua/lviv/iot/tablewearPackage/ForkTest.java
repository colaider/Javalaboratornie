package ua.lviv.iot.tablewearPackage;
import java.util.Date;
import junit.framework.TestCase;

public class ForkTest extends TestCase {
    private Fork fork;
    public void setUp() throws Exception {
        super.setUp();
        fork = new Fork(12, 110.4, "carbon",  new Date(-89, 8, 4));
    }

    public void tearDown() throws Exception {
    }

    public void testUseFork() {
        String result = fork.useFork();
        assertEquals(result, "I am fork");
    }
    public void testGetHeadrs(){
        assertEquals("dateOfCreation, price, material, size", fork.getHeaders());
    }
    public void testToCSV(){
        assertEquals("1811-00-04 12:00:00, 110.4, carbon, 12", fork.toCSV());
    }
}