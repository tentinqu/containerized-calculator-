import java.util.Scanner;
public class sample {
        // Simple calculator class with basic arithmetic operations
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double num1, num2, result;
    char operator;

    // Get input from user
    System.out.print("Enter first number: ");
    num1 = scanner.nextDouble();

    System.out.print("Enter an operator (+, -, *, /): ");
    operator = scanner.next().charAt(0);

    System.out.print("Enter second number: ");
    num2 = scanner.nextDouble();

    // Perform calculation based on operator
    switch(operator) {
        case '+':
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
            break;

        case '-':
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
            break;

        case '*':
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
            break;

        case '/':
            if(num2 != 0) {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Error! Cannot divide by zero!");
            }
            break;

        default:
            System.out.println("Invalid operator!");
            break;
        }
        scanner.close();
    }
}


       
