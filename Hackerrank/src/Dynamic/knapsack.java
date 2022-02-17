import java.util.Scanner;
public class knapsack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t; i++) {
            int n=sc.nextInt(),k=sc.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j < arr.length; j++) {
               arr[j]=sc.nextInt(); 
            }
            int arr2[][]=new int[k+1][n+1];
           
                for (int l = 1; l < arr2[0].length; l++) {
                     for (int j = 1; j < arr2.length; j++) {
                       //  arr2[j][l]=Math.max(arr2[j][l-1],arr2[j%arr[l-1]][l-1]+(j-j%arr[l-1]));
                       if(arr[l-1]>j)
                           arr2[j][l]=arr2[j][l-1];
                       else
                         arr2[j][l]=Math.max(arr2[j][l-1],arr2[j-arr[l-1]][l]+arr[l-1]);
                }
            }
            System.out.println(arr2[k][n]);
        }
    }
}
