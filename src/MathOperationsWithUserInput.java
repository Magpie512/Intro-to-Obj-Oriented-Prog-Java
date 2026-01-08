
import java.util.Scanner;

public class MathOperationsWithUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ask the user for two numbers
        // output the sum, difference, product, and quotient of those numbers
        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();
        System.out.println("Sum: " + (n1 + n2));
        
        //souf > System.out.printf()
        //%d => whole number
        //%f => floating-point number
        //%s => string
        //%n => new line

        System.out.printf("Difference: %d%n", (n1 - n2));
    }
}
