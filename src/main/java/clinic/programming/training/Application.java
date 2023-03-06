package clinic.programming.training;

public class Application {

    public Application() {
        System.out.println ("Inside Application - Constructor");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application - Main Method");
		Application app = new Application();
    }
}