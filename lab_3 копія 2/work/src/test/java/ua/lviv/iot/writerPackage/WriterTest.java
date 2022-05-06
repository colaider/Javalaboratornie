package ua.lviv.iot.writerPackage;

import junit.framework.TestCase;
import ua.lviv.iot.tablewearPackage.DisposibleTabelware;
import ua.lviv.iot.tablewearPackage.Fork;
import ua.lviv.iot.tablewearPackage.Spoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class WriterTest extends TestCase {
    private List<DisposibleTabelware> arrOfTablewareForSet = new ArrayList<>();
    private Writer writer;
    public void setUp() throws Exception {
        super.setUp();
        arrOfTablewareForSet.addAll(
                Arrays.asList(
                        new Fork(3, 10.1, "carbon",  new Date(3, 3, 3)),
                        new Spoon(7, 2.1, "paper",  new Date(5, 5, 5)),
                        new Fork(1, 20.1, "steel",  new Date(1, 1, 1))
                )
        );
        writer = new Writer(arrOfTablewareForSet);
    }

    public void tearDown() throws Exception {

    }

    public void testWriteToFile() {
        try{
            writer.writeToFile();
        }catch (Exception e){
            System.out.println("You have error" + e);
        }
    }
}