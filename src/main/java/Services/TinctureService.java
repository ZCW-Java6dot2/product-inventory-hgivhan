package Services;

import Models.Tea;
import Models.Tincture;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import jdk.internal.org.objectweb.asm.TypeReference;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TinctureService {
    private static int nextId = 1;
    private ArrayList<Tincture> inventory = new ArrayList<>();

    public void saveCSV() {
        try {
            String csvFile = "/Users/hillary/dev/product-inventory-hgivhan/Tincture.csv";
            FileWriter writer = new FileWriter(csvFile);


            CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));

            for (Tincture t : inventory) {
                List<String> list = new ArrayList<>();
                list.add(String.valueOf(t.getId()));
                list.add(t.getName());
                list.add(t.getBrand());
                list.add(t.getIngred());
                list.add(String.valueOf(t.getQty()));
                list.add(String.valueOf(t.getPrice()));

                CSVUtils.writeLine(writer, list);
            }

            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.print("CSV not working!!");
        }
    }

    private void loadDataTincture() {
        String csvFile = "/Users/hillary/dev/product-inventory-hgivhan/Tincture.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            nextId = Integer.parseInt(br.readLine());

            while ((line = br.readLine()) != null) {
                // split line with comma
                String[] tincture = line.split(csvSplitBy);

                String name = tincture[0];
                int id = Integer.parseInt(tincture[1]);
                String brand = tincture[2];
                String ingred = tincture[3];
                String qty = tincture[4];
                float price = Float.parseFloat(tincture[5]);

                inventory.add(new Tincture(name, id, brand, ingred, qty, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public void jSon() {
//        ObjectMapper objectMapper = new ObjectMapper();
//        this.inventory = objectMapper.readValue(new File("tincture.json"), new TypeReference<List<Tincture>>() {
//        });
//
//        ObjectMapper mapper = new ObjectMapper();
//        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
//        writer.writeValue(new File("tincture.json"), inventory);
//    }



    public Tincture create(String name, String brand, String qty, String ingred, float price){
        Tincture createdTincture = new Tincture(name, nextId++, brand, qty, ingred, price);
        inventory.add(createdTincture);
        return createdTincture;
    }

    //read
    public Tincture findTincture(int nextId){
        return inventory.get(nextId);
        // should take an int and return an object with that id, if exists
    }

    //read all
    public Tincture[] getInventoryAsArray(){
        return inventory.toArray(new Tincture[inventory.size()]);
        //should return basic array copy of ArrayList if it exists and returns true
    }

    //delete
    public boolean delete(int nextId){
        boolean isTincturePresent = false;
        for (int i = 0; i < inventory.size(); i++){
            isTincturePresent = nextId == i;
        }
        return isTincturePresent;

//        for (Tincture n : inventory) {
//            System.out.println(n);
//            if (n.getId() == nextId){
//                inventory.remove(nextId);
//                return true;
//            }
//        }
//
//        return false;
        //should remove the object with this id from ArrayList if it exists and returns true
        //otherwise return false
    }
}
