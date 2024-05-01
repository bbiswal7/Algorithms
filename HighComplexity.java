public class HighComplexity {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        
        if (x > 0) {
            if (y > 0) {
                System.out.println("Both x and y are positive.");
            } else if (y < 0) {
                System.out.println("x is positive but y is negative.");
            } else {
                System.out.println("x is positive but y is zero.");
            }
        } else if (x < 0) {
            if (y > 0) {
                System.out.println("x is negative but y is positive.");
            } else if (y < 0) {
                System.out.println("Both x and y are negative.");
            } else {
                System.out.println("x is negative but y is zero.");
            }
        } else {
            if (y > 0) {
                System.out.println("x is zero but y is positive.");
            } else if (y < 0) {
                System.out.println("x is zero but y is negative.");
            } else {
                System.out.println("Both x and y are zero.");
            }
        }
    }
}
