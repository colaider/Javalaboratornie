public class DisposibleTabelware {
    private float dateOfCreation;
    float price;
    String material;
    public float getDateOfCreation(){
        return dateOfCreation;
    }
    public void setDateOfCreation(float dateSet){
        dateOfCreation = dateSet;
    }
    public float getPriceOFTabelwear(){
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
    public DisposibleTabelware(String setMaterial, float setPrice, float setDateOfCreation){
        dateOfCreation = setDateOfCreation;
        material = setMaterial;
        price = setPrice;
    }
}
