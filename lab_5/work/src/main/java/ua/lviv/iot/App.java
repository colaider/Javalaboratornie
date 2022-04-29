//package ua.lviv.iot;
//import ua.lviv.iot.tablewearPackage.*;
//import ua.lviv.iot.managerPackage.*;
//import java.util.*;
//public class App{
//    public void outSortedArr(List<DisposibleTabelware> arr){
//        for (DisposibleTabelware disposibleTabelware : arr) {
//            System.out.println(disposibleTabelware.getMaterialOfTablewear());
//        }
//    }
//    public static void main(String[] args) {
//        App app = new App();
//        List<DisposibleTabelware> arrOfTableware = new ArrayList<>();
//        ManagerOfTablewear manager = new ManagerOfTablewear(arrOfTableware);
//        arrOfTableware.addAll(
//            Arrays.asList(
//            new Fork(12, 110.4, "carbon",  new Date(89, 8, 4)),
//            new Spoon(6, 50.4, "paper",  new Date(123, 7, 3)),
//            new Plate(132, 200.4, "steel",  new Date(23, 6, 2))
//            )
//        );
//        app.outSortedArr(manager.sortByPrice(true));
//        System.out.println("|-------------------------|");
//        app.outSortedArr(manager.sortByDate(true));
//        System.out.println("|-------------------------|");
//        System.out.println(manager.findByMaterial("steel").getMaterialOfTablewear());
//        System.out.println("x");
//    }
//}
