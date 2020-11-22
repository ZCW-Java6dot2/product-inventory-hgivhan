package Services;

import Models.Tincture;

import java.util.ArrayList;

public class App {
    private TeaService teaService = new TeaService();
    private TinctureService tinctureService = new TinctureService();

    public static void main(String...args){
//        Tincture tincture = new Tincture(12, "Immune Boost");
//        Tincture tincture2 = new Tincture(13, "Immune Booster");
//        ArrayList<Tincture> tinctureList = new ArrayList<>();
//        tinctureList.add(tincture);
//        tinctureList.add(tincture2);
//        System.out.println(tinctureList);
        App application = new App();
        application.init();

    }

    public void init(){
        // application logic here
        // call methods to take user input and interface with services
        Console.printWelcome();
    }
}
