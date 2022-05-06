package ua.lviv.iot.tablewearPackage;
import java.util.Date;

public class Fork extends DisposibleTabelware{
    private final String typeOfTableware = "fork";
    public String useFork(){
       return("I am " + typeOfTableware);
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
