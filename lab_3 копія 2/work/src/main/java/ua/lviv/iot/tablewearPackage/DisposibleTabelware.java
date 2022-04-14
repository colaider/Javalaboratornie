package ua.lviv.iot.tablewearPackage;
public class DisposibleTabelware {
    private double dateOfCreation;
    double price;
    String material;
    private int size;

    public int getSizeTabelwear(){
        return size;
    }
    public double getDateOfCreation(){
        return dateOfCreation;
    }
    public void setDateOfCreation(double dateSet){
        dateOfCreation = dateSet;
    }
    public double getPriceOFTabelwear(){
        return price;
    }
    public String getMaterialOfTablewear(){
        return material;
    }
    public void setPriceOFTabelwear(double priceSet){
        price = priceSet;
    }
    public void setMaterialOfTablewear(String materialSet){
        material = materialSet;
    }
    public DisposibleTabelware(String setMaterial, double setPrice, double setDateOfCreation, int setSize){
        dateOfCreation = setDateOfCreation;
        material = setMaterial;
        price = setPrice;
        size = setSize;
    }
}
