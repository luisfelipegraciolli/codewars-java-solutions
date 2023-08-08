package solutions;


public class Square {
    public static boolean isSquare(int n) {
        double a = Math.sqrt(n);
        long b = (long) a;
        if (b * b == n) {
            return true;
        } else {
            return false;
        }

    }
}
