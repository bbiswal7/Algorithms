import java.util.Scanner;

public class ComplexCode {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Complex Code!");
        System.out.println("Enter your choice:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                performOperation("addition");
                break;
            case 2:
                performOperation("subtraction");
                break;
            case 3:
                performOperation("multiplication");
                break;
            case 4:
                performOperation("division");
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
    
    public static void performOperation(String operation) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        int result = 0;
        switch (operation) {
            case "addition":
                result = num1 + num2;
                break;
            case "subtraction":
                result = num1 - num2;
                break;
            case "multiplication":
                result = num1 * num2;
                break;
            case "division":
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation!");
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}
