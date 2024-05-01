public class Calculator {

    // This method has high complexity and duplicated code.
    public int calculate(String operation, int x, int y) {
        if (operation.equals("add")) {
            return x + y;
        } else if (operation.equals("subtract")) {
            return x - y;
        } else if (operation.equals("multiply")) {
            return x * y;
        } else if (operation.equals("add")) { // Duplicated case, should be another operation
            return x + y;
        } else {
            System.out.println("Operation not supported");
            return 0;
        }
    }

    // This method is not used anywhere, representing a code smell (dead code).
    private void unusedMethod() {
        System.out.println("This method is not used.");
    }

    // This method uses magic numbers and has duplicated code, increasing its complexity.
    public double calculateInterest(double amount, int years) {
        double interestRate = 0.05; // Magic number, should be defined as a constant
        double result = amount;
        for (int i = 0; i < years; i++) {
            result += result * 0.05; // Duplicated magic number
        }
        return result;
    }

    // This method has a logical error which affects test coverage as it never reaches certain code paths.
    public boolean isPositive(int number) {
        if (number > 0) {
            return true;
        } else if (number > 0) { // Logical error: This condition is the same as the first if condition
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition of 5 and 3: " + calc.calculate("add", 5, 3));
        System.out.println("Interest on 1000 for 2 years: " + calc.calculateInterest(1000, 2));
        System.out.println("Is 10 positive? " + calc.isPositive(10));
    }
}
