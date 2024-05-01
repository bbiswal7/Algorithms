public class ComplexJavaFile {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        
        int result = 0;
        
        if (a > 0 && b > 0 && c > 0) {
            result = a + b + c;
        } else if (a < 0 && b < 0 && c < 0) {
            result = a * b * c;
        } else if (a == 0 || b == 0 || c == 0) {
            result = 0;
        } else {
            if (a % 2 == 0) {
                if (b % 2 == 0) {
                    if (c % 2 == 0) {
                        result = a * b * c;
                    } else {
                        result = a * b;
                    }
                } else {
                    if (c % 2 == 0) {
                        result = a * c;
                    } else {
                        result = a;
                    }
                }
            } else {
                if (b % 2 == 0) {
                    if (c % 2 == 0) {
                        result = b * c;
                    } else {
                        result = b;
                    }
                } else {
                    result = c;
                }
            }
        }
        
        System.out.println("Result: " + result);
    }
}
