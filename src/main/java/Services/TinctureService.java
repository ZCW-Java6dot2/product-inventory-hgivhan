package Services;

import Models.Tea;
import Models.Tincture;
import java.util.ArrayList;

public class TinctureService {
    private static int nextId = 1;
    private ArrayList<Tincture> inventory = new ArrayList<>();

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
        return inventory.removeIf(Tincture -> Tincture.getId().equals(id));
        //should remove the object with this id from ArrayList if it exists and returns true
        //otherwise return false
    }
}
