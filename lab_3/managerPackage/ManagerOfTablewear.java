package managerPackage;

import java.util.*;  
import tablewearPackage.DisposibleTabelware;

public class ManagerOfTablewear{
    private DisposibleTabelware[] arrOfTablewear;

    public DisposibleTabelware[] sortByPrice(DisposibleTabelware[] setArrOfTablewear, boolean direct){
        DisposibleTabelware[] arrOfTablewearTemp = setArrOfTablewear;
        Comparator sortByDate = Comparator.comparing(DisposibleTabelware::getPriceOFTabelwear);
        if(direct == true){
            Arrays.sort(arrOfTablewearTemp, sortByDate);
        }else{
            Arrays.sort(arrOfTablewearTemp, sortByDate.reversed());
        }
        return arrOfTablewearTemp;
    }
    public DisposibleTabelware[] sortBySize(DisposibleTabelware[] setArrOfTablewear, boolean direct){
        DisposibleTabelware[] arrOfTablewearTemp = setArrOfTablewear;
        Comparator sortByDate = Comparator.comparing(DisposibleTabelware::getSizeTabelwear);
        if(direct == true){
            Arrays.sort(arrOfTablewearTemp, sortByDate);
        }else{
            Arrays.sort(arrOfTablewearTemp, sortByDate.reversed());
        }
        return arrOfTablewearTemp;
    }


    public DisposibleTabelware findByMaterial(String materialToFind){
        for (DisposibleTabelware disposibleTabelware : arrOfTablewear) {
            if(disposibleTabelware.getMaterialOfTablewear() == materialToFind){
                return disposibleTabelware;
            }
        }
        return null;
    }
    public void outSortedArrByPrice(DisposibleTabelware[] setArrOfTablewear,boolean direct){
        for (DisposibleTabelware disposibleTabelware : sortByPrice(arrOfTablewear, direct)) {
            System.out.println(disposibleTabelware.getMaterialOfTablewear());
        }
    }
    public void outSortedArrBySize(DisposibleTabelware[] setArrOfTablewear,boolean direct){
        for (DisposibleTabelware disposibleTabelware : sortBySize(arrOfTablewear, direct)) {
            System.out.println(disposibleTabelware.getMaterialOfTablewear());
        }
    }
    public ManagerOfTablewear(DisposibleTabelware[] setArrOfATabelware){
        arrOfTablewear = setArrOfATabelware; 
    }
}
