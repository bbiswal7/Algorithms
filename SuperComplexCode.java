import java.util.Scanner;

public class SuperComplexCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Super Complex Code!");
        System.out.println("Enter your choice:");
        System.out.println("1. Perform Operations");
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
        scanner.close();
    }

    public static void performOperations() {
        Scanner scanner = new Scanner(System.in);
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
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operation!");
            }
            System.out.println("Result: " + result);
        }

        // Duplication: This block of code is exactly the same as the one above
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
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operation!");
            }
            System.out.println("Result: " + result);
        }
        // End of duplicated block

        scanner.close();
    }
}
