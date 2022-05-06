package ua.lviv.iot.writerPackage;
import java.io.File;
import junit.framework.TestCase;
import ua.lviv.iot.tablewearPackage.DisposibleTabelware;
import ua.lviv.iot.tablewearPackage.Fork;
import ua.lviv.iot.tablewearPackage.Spoon;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class WriterTest extends TestCase {
    private final List<DisposibleTabelware> arrOfTablewareForSet = new ArrayList<>();

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
        List<String> checkArr = new ArrayList<>();
        List<String> exampleArr = new ArrayList<>();
        try{
            writer.writeToFile();
            Scanner checkFile = new Scanner(new File("/Users/sasaminaev/Desktop/codits/java/Labs/lab_3 копія 2/work/result.csv"));
            Scanner exampleFile = new Scanner(new File("/Users/sasaminaev/Desktop/codits/java/Labs/lab_3 копія 2/work/example.csv"));

            checkFile.useDelimiter(",");
            while (checkFile.hasNext()){
                checkArr.add(checkFile.next());
            }
            exampleFile.useDelimiter(",");
            while (exampleFile.hasNext()) {
                exampleArr.add(exampleFile.next());
            }
            exampleFile.close();
            checkFile.close();
            assertEquals(checkArr, exampleArr);

        }catch (Exception e){
            System.out.println("You have error" + e);
        }
    }


}