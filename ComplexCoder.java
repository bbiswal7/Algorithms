public class ComplexCoder {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        
        // This if-else ladder introduces high cyclomatic complexity
        if (a > 0) {
            if (b > 0) {
                if (c > 0) {
                    System.out.println("All numbers are positive.");
                } else {
                    System.out.println("c is not positive.");
                }
            } else {
                if (c > 0) {
                    System.out.println("b is not positive.");
                } else {
                    System.out.println("b and c are not positive.");
                }
            }
        } else {
            if (b > 0) {
                if (c > 0) {
                    System.out.println("a is not positive.");
                } else {
                    System.out.println("a and c are not positive.");
                }
            } else {
                if (c > 0) {
                    System.out.println("a and b are not positive.");
                } else {
                    System.out.println("None of the numbers are positive.");
                }
            }
        }
    }
}
