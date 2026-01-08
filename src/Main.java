import java.io.Console;

public class Main {
    // main + tab, osvm + tab

    public static void main(String[] args) {
        //sout + tab
        System.out.println("Hello, World!");
        
        Console console = System.console();
        System.out.println("Enter your name: ");
        String name = console.readLine();

        System.out.println("Hello, " + name + "!");
    }

}