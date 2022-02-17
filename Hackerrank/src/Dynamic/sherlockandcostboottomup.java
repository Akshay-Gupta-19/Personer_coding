package Dynamic;
import java.util.Scanner;
public class sherlockandcostboottomup {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            int arrsol[][]=new int[2][n];
            arrsol[0][n-1]=0;
            arrsol[1][n-1]=0;
            for (int j = n-2; j >=0; j--) {
                    arrsol[0][j]=Math.max(arrsol[0][j+1]+Math.abs(arr[j+1]-arr[j]), arrsol[1][j+1]+Math.abs(1-arr[j]));
                    arrsol[1][j]=Math.max(arrsol[0][j+1]+Math.abs(arr[j+1]-1), arrsol[1][j+1]);        
            }
            System.out.println(Math.max(arrsol[0][0], arrsol[1][0]));
        }
    }
    
}
