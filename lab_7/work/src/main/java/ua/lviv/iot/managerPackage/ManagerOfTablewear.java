package ua.lviv.iot.managerPackage;

import java.util.List;
import java.util.Comparator;
import lombok.AllArgsConstructor;
import ua.lviv.iot.tablewearPackage.DisposibleTabelware;


@AllArgsConstructor()
public class ManagerOfTablewear{

    private final List<DisposibleTabelware> arrOfTableware;

    public List<DisposibleTabelware> sortByPrice( final boolean direct){
        List<DisposibleTabelware> arrOfTablewearTemp = this.arrOfTableware;
        if(direct){
            arrOfTablewearTemp.sort(Comparator.comparing(DisposibleTabelware::getPrice));
        }else{
            arrOfTablewearTemp.sort(Comparator.comparing(DisposibleTabelware::getPrice, Comparator.reverseOrder()));
        }
        return arrOfTablewearTemp;
    }
    
    public List<DisposibleTabelware> sortBySize(final boolean direct){
        List<DisposibleTabelware> arrOfTablewearTemp = this.arrOfTableware;
        if(direct){
            arrOfTablewearTemp.sort(Comparator.comparing(DisposibleTabelware::getSize));
        }else{
            arrOfTablewearTemp.sort(Comparator.comparing(DisposibleTabelware::getSize, Comparator.reverseOrder()));
        }
        return arrOfTablewearTemp;
    }

    public List<DisposibleTabelware> sortByDate(final boolean direct){
        List<DisposibleTabelware> arrOfTablewearTemp = this.arrOfTableware;
        if(direct){
            arrOfTablewearTemp.sort(Comparator.comparing(DisposibleTabelware::getDateOfCreation));
        }else{
            arrOfTablewearTemp.sort(Comparator.comparing(DisposibleTabelware::getDateOfCreation, Comparator.reverseOrder()));
        }
        return arrOfTablewearTemp;
    }


    public DisposibleTabelware findByMaterial( final String materialToFind){
        for (DisposibleTabelware el: arrOfTableware) {
            if(el.getMaterial().equals(materialToFind)){
                return(el);
            }
        }
        return null;
    }


}
