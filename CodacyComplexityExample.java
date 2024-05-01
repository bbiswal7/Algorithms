public class CodacyComplexityExample {
    
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        
        int result = 0;
        
        if (x > 0) {
            result += x;
        } else {
            result -= x;
        }
        
        if (y > 0) {
            result += y;
        } else {
            result -= y;
        }
        
        if (z > 0) {
            result += z;
        } else {
            result -= z;
        }
        
        System.out.println("Result: " + result);
    }
}
