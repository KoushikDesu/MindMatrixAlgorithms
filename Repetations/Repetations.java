import java.util.Scanner;

class Repetations {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.next();
            int i = 0, k = 0, max = 0;
            char p = str.charAt(0);

            while (i < str.length()) {
                if (str.charAt(i) == p) {
                    k++;
                } else {
                    if (k > max) max = k;
                    p = str.charAt(i);
                    k = 1;
                }
                i++;
            }

            if (k > max) max = k;
            System.out.println(max);
        }
    }
}
