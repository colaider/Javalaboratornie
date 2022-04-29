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
}