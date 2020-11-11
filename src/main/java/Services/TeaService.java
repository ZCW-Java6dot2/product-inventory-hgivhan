package Services;

import Models.Tea;
import Models.Tincture;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TeaService {
    private static int nextId = 0; // the value we'll use to start counting ids
    private ArrayList<Tea> inventory = new ArrayList<>(); // arraylist to hold the info
    String csvFile = "/Users/hillary/dev/product-inventory-hgivhan/Tea.csv";
    FileWriter writer = new FileWriter(csvFile);


    CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));

for (Tea s : inventory) {
        List<String> list = new ArrayList<>();
        list.add(String.valueOf(s.getId()));
        list.add(s.getName());
        list.add(s.getBrand());
        list.add(s.getIngred());
        list.add(String.valueOf(s.getQty()));
        list.add(String.valueOf(s.getPrice()));

        CSVUtils.writeLine(writer, list);
    }

writer.flush();
writer.close();

    private void loadDataTea() {
        String csvFile = "/Users/hillary/dev/product-inventory-hgivhan/Tea.csv";
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

    ObjectMapper objectMapper = new ObjectMapper();
this.inventory = objectMapper.readValue(new File("tincture.json"), new TypeReference<List<Tincture>>(){});

    ObjectMapper mapper = new ObjectMapper();
    ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
writer.writeValue(new File("tea.json"), inventory);


    public Tea create(String name, String brand, String qty, String ingred, float price){
        Tea createdTea = new Tea(name, nextId++, brand, qty, ingred, price);
        inventory.add(createdTea);
        return createdTea;
        //nextId++ hold and track values bc it's static as long as the app is running
    }

    //read
    public Tea findTea(int id){
        return inventory.get(id);
    }

    //read all
    public Tea [] getInventoryAsArray(){
        return inventory.toArray(new Tea[inventory.size()]);

        //should return basic array copy of ArrayList if it exists and returns true
    }

    //delete
    public boolean delete(int id){
       return inventory.removeIf(Tea -> Tea.getId().equals(id));
        //should remove the object with this id from ArrayList if it exists and returns true
        //otherwise return false
    }
}
