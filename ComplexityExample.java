public class ComplexityExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int result = calculateResult(a, b, c);

        System.out.println("Result: " + result);
    }

    public static int calculateResult(int a, int b, int c) {
        int result = 0;

        // Nested complexity starts
        if (a > 0) {
            if (b > 0) {
                if (c > 0) {
                    result = a + b + c;
                } else {
                    result = a + b;
                }
            } else {
                if (c > 0) {
                    result = a + c;
                } else {
                    result = a;
                }
            }
        } else {
            if (b > 0) {
                if (c > 0) {
                    result = b + c;
                } else {
                    result = b;
                }
            } else {
                if (c > 0) {
                    result = c;
                } else {
                    result = 0;
                }
            }
        }
        // Nested complexity ends

        return result;
    }
}
