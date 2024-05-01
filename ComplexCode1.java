import java.util.Scanner;

public class ComplexCode1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Complex Code!");
        System.out.println("Enter your choice:");
        System.out.println("1. Operations");
        System.out.println("2. Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                performOperations();
                break;
            case 2:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void performOperations() {
        System.out.println("How many operations do you want to perform?");
        int numOperations = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        for (int i = 0; i < numOperations; i++) {
            System.out.println("Enter operation " + (i + 1) + ":");
            String operation = scanner.nextLine();
            System.out.println("Enter first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number:");
            int num2 = scanner.nextInt();
            int result = calculate(operation, num1, num2);
            System.out.println("Result: " + result);
        }

        // Duplicated block starts
        System.out.println("How many operations do you want to perform?");
        numOperations = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        for (int i = 0; i < numOperations; i++) {
            System.out.println("Enter operation " + (i + 1) + ":");
            String operation = scanner.nextLine();
            System.out.println("Enter first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number:");
            int num2 = scanner.nextInt();
            int result = calculate(operation, num1, num2);
            System.out.println("Result: " + result);
        }
        // Duplicated block ends
    }

    public static int calculate(String operation, int num1, int num2) {
        switch (operation) {
            case "addition":
                return num1 + num2;
            case "subtraction":
                return num1 - num2;
            case "multiplication":
                return num1 * num2;
            case "division":
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    return 0;
                }
                return num1 / num2;
            default:
                System.out.println("Invalid operation!");
                return 0;
        }
    }
}
