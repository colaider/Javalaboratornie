package ua.lviv.iot.tablewearPackage;
import java.util.Date;
public class Spoon extends DisposibleTabelware {
    private final String typeOfTableware = "spoon";
    public String useSpoon(){
        return("I am " + typeOfTableware);
    }
    public String getHeaders(){
        return super.getHeaders();
    }
    public String toCSV(){
        return super.toCSV();
    }
    public Spoon(int setSize, double setPrice, String setMaterial, Date setDateOfCreating){
        super(setDateOfCreating, setPrice, setMaterial, setSize);
    }  
}
