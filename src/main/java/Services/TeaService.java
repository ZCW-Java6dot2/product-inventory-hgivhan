package Services;

import Models.Tea;
import java.util.ArrayList;

public class TeaService {
    private static int nextId = 0; // the value we'll use to start counting ids
    private ArrayList<Tea> inventory = new ArrayList<>(); // arraylist to hold the info



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
