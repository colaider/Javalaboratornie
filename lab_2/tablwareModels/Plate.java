package tablwareModels;

public class Plate extends DisposibleTabelware {
    private int size;
    public int outSizeOFTabelwear(){
        return size;
    }
    public Plate(int setSize,  double setPrice, String setMaterial, double setDateOfCreating){
        super(setMaterial, setPrice, setDateOfCreating);
        size = setSize;
    }  
}
