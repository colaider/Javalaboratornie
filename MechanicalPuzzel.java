
record MechaicalPuzzel(int garantie, String material, String typeOfPuzzel, int countOfElements, double price, int weight) {
    
    public MechaicalPuzzel(){
        this(1,"d","d",1, 1.1, 1);
    }
    public MechaicalPuzzel(int garantie, String material, String typeOfPuzzel){
        this(garantie,material,typeOfPuzzel,0 ,0.0, 0);
    }
    public static final String PUZZEL_NAME = "name";
    public static String getNAme(){
        return PUZZEL_NAME;
    }

    @Override
    public String toString(){ 
        return " gorantie: " + this.garantie + " material: " + this.material+ " type: " +
        this.typeOfPuzzel + " count: " + this.countOfElements + " price:" +
        this.price + " weight " + this.weight;
    }
}