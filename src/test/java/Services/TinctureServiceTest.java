package Services;

import Models.Tea;
import Models.Tincture;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TinctureServiceTest {

    @Test
    public void createTest(){
        String expectedName = "Daily Immune Boost";
        int expectedId = 1;
        String expectedBrand = "BHB";
        String expectedQty = "8oz";
        String expectedIngred = "Codonopsis root (Codonopsis lanceolata), Eleuthero root (Eleutherococcus senticosus), Reishi mushroom and mycelium (Ganoderma spp.), Schisandra berry (Schisandra chinensis), Astragalus root (Astragalus membranaceus), Bai-Zhu Atractylodes root (Atractylodes macrocephala), Licorice root (Glycyrrhiza glabra) , Ligustrum berry (Ligustrum lucidum)";
        float expectedPrice = 20.25f;

        TinctureService tinctureService = new TinctureService();
        Tincture testTincture = tinctureService.create(expectedName, expectedBrand, expectedQty, expectedIngred, expectedPrice);

        String actualName = testTincture.getName();
        int actualId = testTincture.getId();
        String actualBrand = testTincture.getBrand();
        String actualQty = testTincture.getQty();
        String actualIngred = testTincture.getIngred();
        float actualPrice = testTincture.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedIngred, actualIngred);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testFindTincture(){
        //make sure tea is created so that there is a tea to find
        String expectedName = "Daily Immune Boost";
        int expectedId = 0;
        String expectedBrand = "BHB";
        String expectedQty = "8oz";
        String expectedIngred = "Codonopsis root (Codonopsis lanceolata), Eleuthero root (Eleutherococcus senticosus), Reishi mushroom and mycelium (Ganoderma spp.), Schisandra berry (Schisandra chinensis), Astragalus root (Astragalus membranaceus), Bai-Zhu Atractylodes root (Atractylodes macrocephala), Licorice root (Glycyrrhiza glabra) , Ligustrum berry (Ligustrum lucidum)";
        float expectedPrice = 20.25f;

        TinctureService tinctureService = new TinctureService();
        Tincture expectedTincture = tinctureService.create(expectedName, expectedBrand, expectedQty, expectedIngred, expectedPrice);

        Tincture actualTincture = tinctureService.findTincture(expectedId);

        Assertions.assertEquals(expectedTincture, actualTincture);


    }

    @Test
    public void testGetInventoryAsArray(){
        //make sure tea is created so that there is a tea to find
        String expectedName = "Daily Immune Boost";
        int expectedId = 0;
        String expectedBrand = "BHB";
        String expectedQty = "8oz";
        String expectedIngred = "Codonopsis root (Codonopsis lanceolata), Eleuthero root (Eleutherococcus senticosus), Reishi mushroom and mycelium (Ganoderma spp.), Schisandra berry (Schisandra chinensis), Astragalus root (Astragalus membranaceus), Bai-Zhu Atractylodes root (Atractylodes macrocephala), Licorice root (Glycyrrhiza glabra) , Ligustrum berry (Ligustrum lucidum)";
        float expectedPrice = 20.25f;

        TinctureService tinctureService = new TinctureService();
        Tincture expectedTincture = tinctureService.create(expectedName, expectedBrand, expectedQty, expectedIngred, expectedPrice);

        Tincture[] actualArr = tinctureService.getInventoryAsArray();
        Tincture[] expectedArr = new Tincture[1]; //say size
        expectedArr[0] = expectedTincture;

        Assertions.assertEquals(expectedArr[0], actualArr[0]); // compare 1st index item in arrays, not whole arrays
        //expected and actual tea both made in constructor so same hash code
        // expected and actual ArrayList have diff hash code
    }

    @Test
    public void testDelete(){
        String expectedName = "Daily Immune Boost";
        int expectedId = 0;
        String expectedBrand = "BHB";
        String expectedQty = "8oz";
        String expectedIngred = "Codonopsis root (Codonopsis lanceolata), Eleuthero root (Eleutherococcus senticosus), Reishi mushroom and mycelium (Ganoderma spp.), Schisandra berry (Schisandra chinensis), Astragalus root (Astragalus membranaceus), Bai-Zhu Atractylodes root (Atractylodes macrocephala), Licorice root (Glycyrrhiza glabra) , Ligustrum berry (Ligustrum lucidum)";
        float expectedPrice = 20.25f;

        TinctureService tinctureService = new TinctureService();
        Tincture expectedTincture = tinctureService.create(expectedName, expectedBrand, expectedQty, expectedIngred, expectedPrice);

        assertTrue(tinctureService.delete(expectedId));

    }
}

