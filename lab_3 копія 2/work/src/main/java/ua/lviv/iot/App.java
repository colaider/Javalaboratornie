package ua.lviv.iot;
import ua.lviv.iot.tablewearPackage.*;
import ua.lviv.iot.managerPackage.*; 
public class App{
    Fork fork = new Fork(10, 12, "metal", 2);
    Plate plate = new Plate(8, 12, "steal", 5);
    Spoon spoon = new Spoon(10, 12, "carbin", 1);
    DisposibleTabelware[] arrOfTableware = {fork,plate,spoon};
    ManagerOfTablewear manager = new ManagerOfTablewear(arrOfTableware);
    
    public static void main(String[] args) {
        App mainOb = new App();
        mainOb.manager.outSortedArrByPrice(mainOb.arrOfTableware, false);
        mainOb.manager.outSortedArrBySize(mainOb.arrOfTableware, false);
        System.out.println(mainOb.manager.findByMaterial("steal").getMaterialOfTablewear());
    }
}
