import java.util.Scanner;

/**
 *
 * @author Avengers
 */
class largestrechtangle {

    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int ans = 0;
        int build[] = new int[n];
        for (int i = 0; i < n; i++) {
            build[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int cans=build[i];
            int ce=cans;//current element of array
            int traversal = i - 1;
            try {
                while (build[traversal] > ce) {
                    traversal--;
                    cans += ce;
                }
           
            } catch (Exception ex) {
            }
            traversal = i + 1;
            try {
                while (build[traversal] > ce) {
                    traversal++;
                    cans += ce;
                }
            } catch (Exception ex) {
            }
            if (cans > ans) {
                ans = cans;
            }
        }
        System.out.println(ans);
    }

}
