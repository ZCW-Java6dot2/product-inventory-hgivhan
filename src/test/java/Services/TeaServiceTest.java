package Services;

import Models.Tea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TeaServiceTest {

    @Test
    public void createTest(){
        String expectedName = "Cha Cha Chai Fresh";
        int expectedId = 0;
        String expectedBrand = "BHB";
        String expectedQty = "8oz";
        String expectedIngred = "Ground Cinnamon, Ground Ginger, Ground Cardamom, Ground Black Pepper, Ground Nutmeg, Ground Cloves, Peppermint Leaf, Spearmint Leaf";
        float expectedPrice = 7.75f;

        TeaService teaService = new TeaService();
        Tea testTea = teaService.create(expectedName, expectedBrand, expectedQty, expectedIngred, expectedPrice);

        String actualName = testTea.getName();
        int actualId = testTea.getId();
        String actualBrand = testTea.getBrand();
        String actualQty = testTea.getQty();
        String actualIngred = testTea.getIngred();
        float actualPrice = testTea.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedIngred, actualIngred);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testFindTea(){
        //make sure tea is created so that there is a tea to find
        String expectedName = "Cha Cha Chai Fresh";
        int expectedId = 0;
        String expectedBrand = "BHB";
        String expectedQty = "8oz";
        String expectedIngred = "Ground Cinnamon, Ground Ginger, Ground Cardamom, Ground Black Pepper, Ground Nutmeg, Ground Cloves, Peppermint Leaf, Spearmint Leaf";
        float expectedPrice = 7.75f;

        TeaService teaService = new TeaService();
        Tea expectedTea = teaService.create(expectedName, expectedBrand, expectedQty, expectedIngred, expectedPrice);

        Tea actualTea = teaService.findTea(expectedId);

        Assertions.assertEquals(expectedTea, actualTea);
    }

    @Test
    public void testGetInventoryAsArray(){
        //have this here to have ArrayList to turn into array
        String expectedName = "Cha Cha Chai Fresh";
        int expectedId = 0;
        String expectedBrand = "BHB";
        String expectedQty = "8oz";
        String expectedIngred = "Ground Cinnamon, Ground Ginger, Ground Cardamom, Ground Black Pepper, Ground Nutmeg, Ground Cloves, Peppermint Leaf, Spearmint Leaf";
        float expectedPrice = 7.75f;

        TeaService teaService = new TeaService();
        Tea expectedTea = teaService.create(expectedName, expectedBrand, expectedQty, expectedIngred, expectedPrice);

        Tea[] actualArr = teaService.getInventoryAsArray();
        Tea[] expectedArr = new Tea[1]; //say size
        expectedArr[0] = expectedTea;

        Assertions.assertEquals(expectedArr[0], actualArr[0]); // compare 1st index item in arrays, not whole arrays
                //expected and actual tea both made in constructor so same hash code
        // expected and actual ArrayList have diff hash code
    }

    @Test
    public void testDelete(){
        String expectedName = "Cha Cha Chai Fresh";
        int expectedId = 0;
        String expectedBrand = "BHB";
        String expectedQty = "8oz";
        String expectedIngred = "Ground Cinnamon, Ground Ginger, Ground Cardamom, Ground Black Pepper, Ground Nutmeg, Ground Cloves, Peppermint Leaf, Spearmint Leaf";
        float expectedPrice = 7.75f;

        TeaService teaService = new TeaService();
        Tea expectedTea = teaService.create(expectedName, expectedBrand, expectedQty, expectedIngred, expectedPrice);

        assertTrue(teaService.delete(expectedId));

        //public boolean delete(int id){
            //should remove the object with this id from ArrayList if it exists and returns true
            //otherwise return false
    }
}
