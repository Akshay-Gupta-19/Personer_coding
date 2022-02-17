
import java.util.Scanner;

public class mrxandshorts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int sr[][] = new int[n][2];
        int ans = 0;
        for (int[] sr1 : sr) {
            sr1[0] = sc.nextInt();
            sr1[1] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            for (int[] sr1 : sr) {
                if (x >= sr1[0] && x <= sr1[1]) {
                    ans++;
                } else if (y >= sr1[0] && y <= sr1[1]) {
                    ans++;
                } else if (x < sr1[0] && y > sr1[1]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
