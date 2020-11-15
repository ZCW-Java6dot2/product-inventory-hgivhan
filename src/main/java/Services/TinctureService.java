package Services;

import Models.Tea;
import Models.Tincture;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TinctureService {
    private static int nextId = 1;
    private ArrayList<Tincture> inventory = new ArrayList<>();
//    String csvFile = "/Users/hillary/dev/product-inventory-hgivhan/Tincture.csv";
//    FileWriter writer = new FileWriter(csvFile);

//
//    CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));
//
//for(Tincture t : inventory) {
//        List<String> list = new ArrayList<>();
//        list.add(String.valueOf(t.getId()));
//        list.add(t.getName());
//        list.add(t.getBrand());
//        list.add(t.getIngred());
//        list.add(String.valueOf(t.getQty()));
//        list.add(String.valueOf(t.getPrice()));
//
//        CSVUtils.writeLine(writer, list);
//    }
//
//writer.flush();
//writer.close();

    private void loadDataTincture() {
        String csvFile = "/Users/hillary/dev/product-inventory-hgivhan/Tincture.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            nextId = Integer.parseInt(br.readLine());

            while ((line = br.readLine()) != null) {
                // split line with comma
                String[] beer = line.split(csvSplitBy);

                String name = beer[0];
                int id = Integer.parseInt(beer[1]);
                String brand = beer[2];
                String ingred = beer[3];
                String qty = beer[4];
                float price = Float.parseFloat(beer[5]);

                inventory.add(new Tincture(name, id, brand, ingred, qty, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    ObjectMapper objectMapper = new ObjectMapper();
//this.inventory = objectMapper.readValue(new File("tincture.json"), new TypeReference<List<Tea>>(){});
//
//    ObjectMapper mapper = new ObjectMapper();
//    ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
//writer.writeValue(new File("tincture.json"), inventory);


    public Tincture create(String name, String brand, String qty, String ingred, float price){
        Tincture createdTincture = new Tincture(name, nextId++, brand, qty, ingred, price);
        inventory.add(createdTincture);
        return createdTincture;
    }

    //read
    public Tincture findTincture(int id){
        return inventory.get(id);
        // should take an int and return an object with that id, if exists
    }

    //read all
    public Tincture[] getInventoryAsArray(){
        return inventory.toArray(new Tincture[inventory.size()]);
        //should return basic array copy of ArrayList if it exists and returns true
    }

    //delete
    public boolean delete(int id){
        for (Tincture n : inventory) {
            if (n.getId() == id){
                inventory.remove(id);
                return true;
            }
        }
        return false;
        //should remove the object with this id from ArrayList if it exists and returns true
        //otherwise return false
    }
}
