package ua.lviv.iot.tablewearPackage;
import java.util.Date;
public class Plate extends DisposibleTabelware {
    public String usePlate(){
        return("I am plate");
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
