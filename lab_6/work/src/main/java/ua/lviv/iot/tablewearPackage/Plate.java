package ua.lviv.iot.tablewearPackage;
import java.util.Date;
public class Plate extends DisposibleTabelware {
    private final String typeOfTablewear = "plate";
    public String usePlate(){
        return("I am " + typeOfTablewear);
    }
    public String getHeaders(){
        return super.getHeaders();
    }
    public String toCSV(){
        return super.toCSV();
    }
    public Plate(int setSize, double setPrice, String setMaterial, Date setDateOfCreating){
        super(setDateOfCreating, setPrice, setMaterial, setSize);
    }
}
