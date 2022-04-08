package tablwareModels;
public class Fork extends DisposibleTabelware{
    private int size;
    public int outSizeOFTabelwear(){
        return size;
    }
    public Fork(int setSize, double setPrice, String setMaterial, double setDateOfCreating){
        super(setMaterial, setPrice, setDateOfCreating);
        size = setSize;
    }  
}
