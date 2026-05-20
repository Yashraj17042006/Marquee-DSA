import java.util.*;

import static java.lang.System.out;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int min = sc.nextInt();
        while (min != 0) {
            int rem = max % min;
            max = min;
            min = rem;

        }
        out.println(max);
    }
}
