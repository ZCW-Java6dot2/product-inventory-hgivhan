package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TeaTest {
    Tea testTea;
    Tea testId;
    Tea testBrand;
    Tea testQty;
    Tea testIngred;
    Tea testPrice;

    /*private int id;

    private String brand;
    private int qty;
    private String ingred;
    private float price;*/

    @Test
    public void setId(){
        //given
        double expected = 000001;
        //when
        testId = new Tea();
        testId.setId();
        //then
        Assertions.assertEquals(expected, testId.getId());
    }

    @Test
    public void setNameTest(){
        //given
        String expected = "Cha Cha Chai";
        //when
        testTea = new Tea();
        testTea.setName(expected);
        //then
        Assertions.assertEquals(expected, testTea.getName());
    }

    @Test
    public void setBrandTest(){
        String expected = "BeeHillBotanicals";

        testBrand = new Tea();
        testBrand.setBrand(expected);

        Assertions.assertEquals(expected, testBrand.getBrand());
    }

    @Test
    public void setQtyTest(){
        String expected = "4oz";
        testQty = new Tea();
        testQty.setQty(expected);
        Assertions.assertEquals(expected, testQty.getQty());
    }

    @Test
    public void setIngredTest(){
        String expected = "Ground Cinnamon, Ground Ginger, Ground Cardamom, Ground Black Pepper, Ground Nutmeg, Ground Cloves, Ground Turmeric";
        testIngred = new Tea();
        testIngred.setIngred(expected);
        Assertions.assertEquals(expected, testIngred.getIngred());
    }

    @Test
    public void setPrice(){
        float expected = (float) 3.75;
        testPrice = new Tea();
        testPrice.setPrice(expected);
        Assertions.assertEquals(expected, testPrice.getPrice());
    }

}
