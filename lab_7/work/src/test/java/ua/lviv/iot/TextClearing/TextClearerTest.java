package ua.lviv.iot.TextClearing;

import junit.framework.TestCase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextClearerTest extends TestCase {
    TextClearer textClearer;
    public void setUp() throws Exception {
        super.setUp();
        textClearer = new TextClearer();
    }

    public void tearDown() throws Exception {
    }

    public void testTxtFileRider() {
    }

    public void testAreStringContainsQuestion(){
        assertTrue(textClearer.areStringContainsQuestion("agdf agdf?"));
    }

    public void testHowOften(){
        assertTrue(textClearer.howOften("fiat","as fiat fiat fiat?"));
    }

    public void testClear() {
        textClearer.clear("/Users/sasaminaev/Desktop/codits/java/Labs/lab_3 копія 2/work/text.txt", "fiat");
        String path = "/Users/sasaminaev/Desktop/codits/java/Labs/lab_3 копія 2/work/clearText.txt";
        String path1 = "/Users/sasaminaev/Desktop/codits/java/Labs/lab_3 копія 2/work/clearExample.txt";
        try{
            assertEquals(new String(Files.readAllBytes(Paths.get(path))).replace("\n",""), new String(Files.readAllBytes(Paths.get(path1))).replace("\n",""));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}