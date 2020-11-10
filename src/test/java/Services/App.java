package Services;

public class App {
    private TeaService teaService = new TeaService();

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
