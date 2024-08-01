package bitmanupulation;

public class powerof2 {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        long na = n & (n - 1);

        if (na == 0) {
            return true;
        }

        return false;
    }
}
