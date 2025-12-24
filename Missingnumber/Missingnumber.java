import java.util.*;

public class Missingnumber {
    public static void main(String[] args) {
        long k, n, b = 0;

        try (Scanner s = new Scanner(System.in)) {
            n = s.nextLong();

            for (int i = 0; i < n - 1; i++) {
                k = s.nextLong();
                b += k;
            }

            k = (n * (n + 1)) / 2;
            System.out.println(k - b);
        }
    }
}
