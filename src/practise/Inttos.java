package practise;

import java.util.*;

public class Inttos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        String s = Integer.toString(n);

        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}
//// why changed Since Java 17 and later, the SecurityManager API is deprecated and disabled for security reasons.
//Eclipse by default often runs on Java 17+, so this line fails.