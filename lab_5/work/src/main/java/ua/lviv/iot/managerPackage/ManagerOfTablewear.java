package ua.lviv.iot.managerPackage;
import java.util.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import ua.lviv.iot.tablewearPackage.DisposibleTabelware;


@AllArgsConstructor()
public @Data class ManagerOfTablewear{

    private List<DisposibleTabelware> arrOfTablewear;

    public List<DisposibleTabelware> sortByPrice(boolean direct){
        List<DisposibleTabelware> arrOfTablewearTemp = this.arrOfTablewear;
        if(direct == true){
            arrOfTablewearTemp.sort(Comparator.comparing(DisposibleTabelware::getPrice));
        }else{
            arrOfTablewearTemp.sort(Comparator.comparing(DisposibleTabelware::getPrice, Comparator.reverseOrder()));
        }
        return arrOfTablewearTemp;
    }
    
    public List<DisposibleTabelware> sortBySize(boolean direct){
        List<DisposibleTabelware> arrOfTablewearTemp = this.arrOfTablewear;
        if(direct == true){
            arrOfTablewearTemp.sort(Comparator.comparing(DisposibleTabelware::getSize));
        }else{
            arrOfTablewearTemp.sort(Comparator.comparing(DisposibleTabelware::getSize, Comparator.reverseOrder()));
        }
        return arrOfTablewearTemp;
    }

    public List<DisposibleTabelware> sortByDate(boolean direct){
        List<DisposibleTabelware> arrOfTablewearTemp = this.arrOfTablewear;
        if(direct == true){
            arrOfTablewearTemp.sort(Comparator.comparing(DisposibleTabelware::getDateOfCreation));
        }else{
            arrOfTablewearTemp.sort(Comparator.comparing(DisposibleTabelware::getDateOfCreation, Comparator.reverseOrder()));
        }
        return arrOfTablewearTemp;
    }


    public DisposibleTabelware findByMaterial(String materialToFind){
        for (DisposibleTabelware el: arrOfTablewear) {
            if(el.getMaterial().equals(materialToFind)){
                return(el);
            }
        }
        return null;
    }


}
