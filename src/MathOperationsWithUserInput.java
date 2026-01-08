
import java.util.Scanner;

public class MathOperationsWithUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ask the user for two numbers
        // output the sum, difference, product, and quotient of those numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        scanner.close();
        
    }
}
