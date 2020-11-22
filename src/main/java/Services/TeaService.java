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

public class TeaService {
    private static int nextId = 1; // the value we'll use to start counting ids
    private ArrayList<Tea> inventory = new ArrayList<>(); // arraylist to hold the info

    public void saveCSV() {
        try {
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
        } catch(Exception e){
            System.out.print("CSV not working!!");
        }
    }

    private void loadDataTea() {
        String csvFile = "/Users/hillary/dev/product-inventory-hgivhan/Tea.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            nextId = Integer.parseInt(br.readLine());

            while ((line = br.readLine()) != null) {
                // split line with comma
                String[] tea = line.split(csvSplitBy);

                String name = tea[0];
                int id = Integer.parseInt(tea[1]);
                String brand = tea[2];
                String ingred = tea[3];
                String qty = tea[4];
                float price = Float.parseFloat(tea[5]);

                inventory.add(new Tea(name, id, brand, ingred, qty, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public void jSon() {
//        ObjectMapper objectMapper = new ObjectMapper();
//        this.inventory = objectMapper.readValue(new File("tea.json"), new TypeReference<List<Tincture>>() {
//        });
//
//        ObjectMapper mapper = new ObjectMapper();
//        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
//        writer.writeValue(new File("tea.json"), inventory);
//    }


    public Tea create(String name, String brand, String qty, String ingred, float price){
        Tea createdTea = new Tea(name, nextId++, brand, qty, ingred, price);
        inventory.add(createdTea);
        return createdTea;
        //nextId++ hold and track values bc it's static as long as the app is running
    }

    //read
    public Tea findTea(int nextId){
        return inventory.get(nextId);
    }

    //read all
    public Tea [] getInventoryAsArray(){
        return inventory.toArray(new Tea[inventory.size()]);

        //should return basic array copy of ArrayList if it exists and returns true
    }

    //delete
    public boolean delete(int nextId){
        boolean isTeaPresent = false;
        for (int i = 0; i < inventory.size(); i++){
            isTeaPresent = nextId == i;
        }
        return isTeaPresent;
        //should remove the object with this id from ArrayList if it exists and returns true
        //otherwise return false
    }
}
