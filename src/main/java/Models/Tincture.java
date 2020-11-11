package Models;

public class Tincture {
    private int id;
    private String name;
    private String brand;
    private String qty;
    private String ingred;
    private float price;

   public Tincture(){}

   public Tincture(String expectedName, int expectedId, String expectedBrand, String expectedQty, String expectedIngred, float expectedPrice) {
        name = expectedName;
        id = expectedId;
        brand = expectedBrand;
        qty = expectedQty;
        ingred = expectedIngred;
        price = expectedPrice;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBrand(String name){
        this.brand = brand;
    }

    public void setQty(String gty){
        this.qty = qty;
    }

    public void setIngred(String ingred){
        this.ingred = ingred;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public Integer getId(){
        return id;
    }

    public String getBrand(){
        return brand;
    }

    public String getQty(){
        return qty;
    }

    public String getIngred(){
        return ingred;
    }

    public float getPrice(){
        return price;
    }



}
