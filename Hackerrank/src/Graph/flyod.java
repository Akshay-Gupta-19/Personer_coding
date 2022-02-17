package Graph;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class flyod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], 1000000);
            arr[i][i]=0;
        }
        for (int i = 0; i < m; i++) {
            arr[sc.nextInt()-1][sc.nextInt()-1]=sc.nextInt();
        }
        warshal(arr);
        int q=sc.nextInt();
        for (int i = 0; i <q; i++) {
            int src=sc.nextInt()-1;
            int des=sc.nextInt()-1;
            int ans=arr[src][des];
            if(ans>100000)
                System.out.println(-1);
            else
                System.out.println(ans);
        }
    }
    static void warshal(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if(arr[j][i]+arr[i][k]<arr[j][k]){
                        arr[j][k]=arr[j][i]+arr[i][k];
                    }
                }
            }
        }
    }
}
