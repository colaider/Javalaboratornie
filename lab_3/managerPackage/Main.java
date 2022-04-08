package managerPackage;
import tablewearPackage.*;
public class Main{
    Fork fork = new Fork(10, 12, "metal", 2);
    Plate plate = new Plate(8, 12, "steal", 5);
    Spoon spoon = new Spoon(10, 12, "carbin", 1);
    DisposibleTabelware[] arrOfTableware = {fork,plate,spoon};
    ManagerOfTablewear manager = new ManagerOfTablewear(arrOfTableware);
   
    int a = 0 ;

    public static void main(String[] args) {
        Main mainOb = new Main();
        mainOb.manager.outSortedArrByPrice(mainOb.arrOfTableware, false);
        mainOb.manager.outSortedArrBySize(mainOb.arrOfTableware, false);
        System.out.println(mainOb.manager.findByMaterial("steal").getMaterialOfTablewear());
    }
}

