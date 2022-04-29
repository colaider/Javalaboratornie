package ua.lviv.iot.tablewearPackage;
import java.util.Date;
public class Spoon extends DisposibleTabelware {
    public String useSpoon(){
        return("I am spoon");
    }
    public Spoon(int setSize, double setPrice, String setMaterial, Date setDateOfCreating){
        super(setDateOfCreating, setPrice, setMaterial, setSize);
    }  
}
