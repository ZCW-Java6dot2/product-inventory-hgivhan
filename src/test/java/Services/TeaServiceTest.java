package Services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TeaServiceTest {

    @Test
    public void createTest(){
        String expectedName = "Cha Cha Chai Fresh";
        int expectedId = 2;
        String expectedBrand = "BHB";
        String expectedQty = "8oz";
        String expectedIngred = "Ground Cinnamon, Ground Ginger, Ground Cardamom, Ground Black Pepper, Ground Nutmeg, Ground Cloves, Peppermint Leaf, Spearmint Leaf";
        float expectedPrice = 7.75f;

        TeaService teaService = new TeaService();
        TeaService testTea = TeaService.create(expectedName, expectedId, expectedBrand, expectedQty, expectedIngred, expectedPrice);

        String actualName = testTea.getName();
        int actualId = testTea.getId();
        String actualBrand = testTea.getBrand();
        String actualQty = testTea.getQty();
        String actualIngred = testTea.getIngred();
        float actualPrice = testTea.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).class().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedIngred, actualIngred);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testFindTea(){

    }

    @Test
    public void testFindAll(){

    }

    @Test
    public void testDelete(){

    }
}
