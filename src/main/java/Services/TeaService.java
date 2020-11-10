package Services;

import Models.Tea;
import java.util.ArrayList;

public class TeaService {
    private static int nextId = 1;
    private AList<Tea> inventory = new ArrayList<>();
    private String name;
    private int id;
    private String brand;
    private String qty;
    private String ingred;
    private float price;


    public Tea create(String name, int id, String brand, String qty, String ingred, float price){
        Tea createdTea = new Tea(nextId++, name, id, brand, qty, ingred, price);
        inventory.add(createdTea);
        return createdTea;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getQty() {
        return qty;
    }

    public String getIngred() {
        return ingred;
    }

    public float getPrice() {
        return price;
    }

    //read
    public Tea findSneaker(int id){
        // should take an int and return an object with that id, if exists
    }

    //read all
    public Tea findAll(){
        //should return basic array copy of ArrayList if it exists and returns true
    }

    //delete
    public boolean delete(int id){
        //should remove the object with this id from ArrayList if it exists and returns true
        //otherwise return false
    }
}
