package tablwareModels;
public class Spoon extends DisposibleTabelware {
    private int size;
    public int outSizeOFTabelwear(){
        return size;
    }
    public Spoon(int setSize,  double setPrice, String setMaterial, double setDateOfCreating){
        super(setMaterial, setPrice, setDateOfCreating);
        size = setSize;
    }  
}
