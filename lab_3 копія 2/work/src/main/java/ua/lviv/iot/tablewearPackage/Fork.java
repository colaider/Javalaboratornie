package ua.lviv.iot.tablewearPackage;
import java.util.Date;

public class Fork extends DisposibleTabelware{
    public String useFork(){
       return("I am fork");
    }
    public String getHeaders(){
        return super.getHeaders();
    }
    public String toCSV(){
        return super.toCSV();
    }
    public Fork(int setSize, double setPrice, String setMaterial, Date setDateOfCreating){
        super(setDateOfCreating, setPrice, setMaterial, setSize);
    }
}
