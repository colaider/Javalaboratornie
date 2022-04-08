package tablwareModels;

public class DisposibleTabelware {
    private double dateOfCreation;
    double price;
    String material;
    public double getDateOfCreation(){
        return dateOfCreation;
    }
    public void setDateOfCreation(float dateSet){
        dateOfCreation = dateSet;
    }
    public double getPriceOFTabelwear(){
        return price;
    }
    public String getMaterialOfTablewear(){
        return material;
    }
    public void setPriceOFTabelwear(float priceSet){
        price = priceSet;
    }
    public void setMaterialOfTablewear(String materialSet){
        material = materialSet;
    }
    public DisposibleTabelware(String setMaterial, double setPrice, double setDateOfCreation){
        dateOfCreation = setDateOfCreation;
        material = setMaterial;
        price = setPrice;
    }
}
