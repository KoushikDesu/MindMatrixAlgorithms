import java.util.Scanner;

class weirdalgorithm{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long k;
        try {
            k = s.nextLong();
            while (k != 1) {
                System.out.printf("%d ", k);
                if (k % 2 == 0) {
                    k /= 2; // Integer division for efficiency
                } else {
                    k = k * 3 + 1;
                }
            }
            System.out.println(k);
        } catch (Exception e) {
            System.err.println("Error: Invalid input.");
        } finally {
            s.close();
        }
    }
}
