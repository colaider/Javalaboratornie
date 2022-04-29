package ua.lviv.iot.managerPackage;
import java.util.*;
import junit.framework.TestCase;
import ua.lviv.iot.tablewearPackage.DisposibleTabelware;
import ua.lviv.iot.tablewearPackage.Fork;
import ua.lviv.iot.tablewearPackage.Plate;
import ua.lviv.iot.tablewearPackage.Spoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ManagerOfTablewearTest extends TestCase {
    private List<DisposibleTabelware> arrOfTablewareForSet = new ArrayList<>();
    private ManagerOfTablewear manager;
    public void setUp() throws Exception {
        super.setUp();
        arrOfTablewareForSet.addAll(
                Arrays.asList(
                        new Fork(3, 10.1, "carbon",  new Date(3, 3, 3)),
                        new Spoon(7, 2.1, "paper",  new Date(5, 5, 5)),
                        new Fork(1, 20.1, "steel",  new Date(1, 1, 1))
                )
        );
        manager = new ManagerOfTablewear(arrOfTablewareForSet);
    }

    public void tearDown() throws Exception {

    }

    public void testSortByPrice() {
        int ind = 0;
        List<DisposibleTabelware> arrOfTablewareForCheckTrue = new ArrayList<>();
        List<DisposibleTabelware> arrOfTablewareForCheckFalse = new ArrayList<>();
        arrOfTablewareForCheckTrue.addAll(
                Arrays.asList(
                        new Fork(3, 2.1, "carbon",  new Date(3, 3, 3)),
                        new Spoon(7, 10.1, "paper",  new Date(5, 5, 5)),
                        new Plate(1, 20.1, "steel",  new Date(1, 1, 1))
                )
        );
        arrOfTablewareForCheckFalse.addAll(
                Arrays.asList(
                        new Fork(3, 20.1, "carbon",  new Date(3, 3, 3)),
                        new Spoon(7, 10.1, "paper",  new Date(5, 5, 5)),
                        new Plate(1, 2.1, "steel",  new Date(1, 1, 1))
                )
        );

        for(DisposibleTabelware el:  manager.sortByPrice(true)) {
            assertEquals(el.getPrice(), arrOfTablewareForCheckTrue.get(ind).getPrice());
            ind++;
        }
        ind = 0;
        for(DisposibleTabelware el:  manager.sortByPrice(false)) {
            assertEquals(el.getPrice(), arrOfTablewareForCheckFalse.get(ind).getPrice());
            ind++;
        }
        ind = 0;
    }


    public void testSortBySize() {
        int ind = 0;
        List<DisposibleTabelware> arrOfTablewareForCheckTrue = new ArrayList<>();
        List<DisposibleTabelware> arrOfTablewareForCheckFalse = new ArrayList<>();
        arrOfTablewareForCheckTrue.addAll(
                Arrays.asList(
                        new Fork(1, 10.1, "carbon",  new Date(3, 3, 3)),
                        new Spoon(3, 2.1, "paper",  new Date(5, 5, 5)),
                        new Plate(7, 20.1, "steel",  new Date(1, 1, 1))
                )
        );
        arrOfTablewareForCheckFalse.addAll(
                Arrays.asList(
                        new Fork(7, 10.1, "carbon",  new Date(3, 3, 3)),
                        new Spoon(3, 2.1, "paper",  new Date(5, 5, 5)),
                        new Plate(1, 20.1, "steel",  new Date(1, 1, 1))
                )
        );

        for(DisposibleTabelware el:  manager.sortBySize(true)) {
            assertEquals(el.getSize(), arrOfTablewareForCheckTrue.get(ind).getSize());
            ind++;
        }
        ind = 0;
        for(DisposibleTabelware el:  manager.sortBySize(false)) {
            assertEquals(el.getSize(), arrOfTablewareForCheckFalse.get(ind).getSize());
            ind++;
        }
        ind = 0;
    }

    public void testSortByDate() {
        int ind = 0;
        List<DisposibleTabelware> arrOfTablewareForCheckTrue = new ArrayList<>();
        List<DisposibleTabelware> arrOfTablewareForCheckFalse = new ArrayList<>();
        arrOfTablewareForCheckTrue.addAll(
                Arrays.asList(
                        new Fork(3, 10.1, "carbon",  new Date(1, 1, 1)),
                        new Spoon(7, 2.1, "paper",  new Date(3, 3, 3)),
                        new Fork(1, 20.1, "steel",  new Date(5, 5, 5))
                )
        );
        arrOfTablewareForCheckFalse.addAll(
                Arrays.asList(
                        new Fork(3, 10.1, "carbon",  new Date(5, 5, 5)),
                        new Spoon(7, 2.1, "paper",  new Date(3, 3, 3)),
                        new Fork(1, 20.1, "steel",  new Date(1, 1, 1))
                )
        );

        for(DisposibleTabelware el:  manager.sortByDate(true)) {
            assertEquals(el.getDateOfCreation(), arrOfTablewareForCheckTrue.get(ind).getDateOfCreation());
            ind++;
        }
        ind = 0;
        for(DisposibleTabelware el:  manager.sortByDate(false)) {
            assertEquals(el.getDateOfCreation(), arrOfTablewareForCheckFalse.get(ind).getDateOfCreation());
            ind++;
        }
        ind = 0;
    }

    public void testFindByMaterial() {
        String material1 = "carbon";
        String material2 = "paper";
        String material3 = "steel";
        String materialNull = "";
        assertEquals(manager.findByMaterial(material1).getMaterial(), material1);
        assertEquals(manager.findByMaterial(material2).getMaterial(), material2);
        assertEquals(manager.findByMaterial(material3).getMaterial(), material3);
        assertEquals(manager.findByMaterial(materialNull), null);
    }
}