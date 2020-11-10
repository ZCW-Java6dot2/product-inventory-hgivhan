package Services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TinctureServiceTest {

    @Test
    public void createTest(){
        String expectedName = "Daily Immune Boost";
        int expectedId = 4;
        String expectedBrand = "BHB";
        String expectedQty = "8oz";
        String expectedIngred = "Codonopsis root (Codonopsis lanceolata), Eleuthero root (Eleutherococcus senticosus), Reishi mushroom and mycelium (Ganoderma spp.), Schisandra berry (Schisandra chinensis), Astragalus root (Astragalus membranaceus), Bai-Zhu Atractylodes root (Atractylodes macrocephala), Licorice root (Glycyrrhiza glabra) , Ligustrum berry (Ligustrum lucidum)";
        float expectedPrice = 20.25f;

        TinctureService tinctureService = new TinctureService();
        TinctureService testTincture = TinctureService.create(expectedName, expectedId, expectedBrand, expectedQty, expectedIngred, expectedPrice);

        String actualName = testTincture.getName();
        int actualId = testTincture.getId();
        String actualBrand = testTincture.getBrand();
        String actualQty = testTincture.getQty();
        String actualIngred = testTincture.getIngred();
        float actualPrice = testTincture.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).class().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedIngred, actualIngred);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testFindTincture(){

    }

    @Test
    public void testFindAll(){

    }

    @Test
    public void testDelete(){

    }
}

