public class Spoon extends DisposibleTabelware {
    private int size;
    public int outSizeOFTabelwear(){
        return size;
    }
    public Spoon(int setSize, float setPrice, String setMaterial, float setDateOfCreating){
        super(setMaterial, setPrice, setDateOfCreating);
        size = setSize;
    }  
}
