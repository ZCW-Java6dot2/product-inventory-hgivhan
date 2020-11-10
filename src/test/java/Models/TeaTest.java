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

    @Test
    public void setId(){
        //given
        int expected = 000001;
        //when
        testId = new Tea();
        testId.setId(expected);
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
    public void setPriceTest(){
        float expected = 3.75f;
        testPrice = new Tea();
        testPrice.setPrice(expected);
        Assertions.assertEquals(expected, testPrice.getPrice());
    }

    @Test
    public void constructorTest(){
        String expectedName = "Cha Cha Chai Fresh";
        int expectedId = 2;
        String expectedBrand = "BeeHillBotanicals";
        String expectedQty = "8oz";
        String expectedIngred = "Ground Cinnamon, Ground Ginger, Ground Cardamom, Ground Black Pepper, Ground Nutmeg, Ground Cloves, Peppermint Leaf, Spearmint Leaf";
        float expectedPrice = 7.75f;

        Tea testTea = new Tea(expectedName, expectedId, expectedBrand, expectedQty, expectedIngred, expectedPrice);

        Assertions.assertEquals(expectedName, testTea.getName());
        Assertions.assertEquals(expectedId, testTea.getId());
        Assertions.assertEquals(expectedBrand, testTea.getBrand());
        Assertions.assertEquals(expectedQty, testTea.getQty());
        Assertions.assertEquals(expectedIngred, testTea.getIngred());
        Assertions.assertEquals(expectedPrice, testTea.getPrice());
    }

}
