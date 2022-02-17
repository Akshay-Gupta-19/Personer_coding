package weekofcode;

import java.util.Scanner;

public class qn1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        if (a < c && b < d) {
            System.out.println("NO");
        } else if (a > c && b > d) {
            System.out.println("NO");
        } else {
            if (a < c) {
                for (; a < c; a += b, c += d);
            } else {
                for (; a > c; a += b, c += d);
            }
            if (a == c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}
