package Services;

import Models.Tea;
import Models.Tincture;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    private TeaService teaService = new TeaService();
    private static int nextId = 0; // the value we'll use to start counting ids
    private ArrayList<Tea> inventory = new ArrayList<>(); // arraylist to hold the info
    private ArrayList<Tincture> inventory = new ArrayList<>(); // arraylist to hold the info

    public static void main(String...args){
        App application = new App();
        application.init();

    }

    public void init(){
        // application logic here
        // call methods to take user input and interface with services
        Console.printWelcome();
    }
}
