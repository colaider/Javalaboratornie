package ua.lviv.iot.tablewearPackage;
import java.util.Date;
public class Plate extends DisposibleTabelware {
    public String usePlate(){
        return("I am plate");
    }
    public Plate(int setSize, double setPrice, String setMaterial, Date setDateOfCreating){
        super(setDateOfCreating, setPrice, setMaterial, setSize);
    }  
}
