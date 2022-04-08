public class Plate extends DisposibleTabelware {
    private int size;
    public int outSizeOFTabelwear(){
        return size;
    }
    public Plate(int setSize, float setPrice, String setMaterial, float setDateOfCreating){
        super(setMaterial, setPrice, setDateOfCreating);
        size = setSize;
    }  
}
