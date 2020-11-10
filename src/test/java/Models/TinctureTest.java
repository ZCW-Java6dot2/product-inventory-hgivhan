package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TinctureTest {
    Tincture testTincture;
    Tincture testId;
    Tincture testBrand;
    Tincture testQty;
    Tincture testIngred;
    Tincture testPrice;



    @Test
    public void setTestTincture(){
        String expected = "Immune Tune Up";
        testTincture = new Tincture();
        testTincture.setTincture(expected);
        Assertions.assertEquals(expected, testTincture.getTincture());
    }

    @Test
    public void setTestId(){
        int expected = 10000;
        testId = new Tincture();
        testId.setId(expected);
        Assertions.assertEquals(expected, testId.getId());
    }

    @Test
    public void setTestBrand(){
        String expected = "BeeHillBotanicals";
        testBrand = new Tincture();
        testBrand.setBrand(expected);
        Assertions.assertEquals(expected, testBrand.getBrand());
    }

    @Test
    public void setTestQty(){
        String expected = "8oz";
        testQty = new Tincture();
        testQty.setQty(expected);
        Assertions.assertEquals(expected, testQty.getQty());
    }

    @Test
    public void setTestIngred(){
        String expected = "Codonopsis root (Codonopsis lanceolata), Eleuthero root (Eleutherococcus senticosus), Reishi mushroom and mycelium (Ganoderma spp.), Schisandra berry (Schisandra chinensis), Astragalus root (Astragalus membranaceus), Bai-Zhu Atractylodes root (Atractylodes macrocephala), Licorice root (Glycyrrhiza glabra) , Ligustrum berry (Ligustrum lucidum)";
        testIngred = new  Tincture();
        testIngred.setIngred(expected);
        Assertions.assertEquals(expected, testIngred.getIngred());
    }

    @Test
    public void setTestPrice(){
        float expected = (float) 20.25;
        testPrice = new Tincture();
        testPrice.setPrice(expected);
        Assertions.assertEquals(expected,testPrice.getPrice());

    }


}



