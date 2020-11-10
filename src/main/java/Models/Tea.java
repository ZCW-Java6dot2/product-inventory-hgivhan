package Models;

public class Tea {
    private int id;
    private String name;
    private String brand;
    private String qty;
    private String ingred;
    private float price;

    public Tea(){}
    public Tea(String expectedName, int expectedId, String expectedBrand, String expectedQty, String expectedIngred, float expectedPrice) {
        name = expectedName;
        id = expectedId;
        brand = expectedBrand;
        qty = expectedQty;
        ingred = expectedIngred;
        price = expectedPrice;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setIngred(String ingred){
        this.ingred = ingred;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setQty(String qty){
        this.qty = qty;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getName(){
        return null;
    }

    public Integer getId(){
        return 0;
    }

    public String getBrand(){
        return null;
    }

    public String getQty(){
        return null;
    }

    public String getIngred(){
        return null;
    }

    public float getPrice(){
        return (float) 0.0;
    }

}
