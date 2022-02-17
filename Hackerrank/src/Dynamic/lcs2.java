/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class lcs2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int arr1[]=new int[n];
       int arr2[]=new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=sc.nextInt();
        }
        System.out.println(lcs(arr1,arr2));
    }
   static String lcs(int x[],int y[]){
        int arr[][] = new int[x.length + 1][y.length+1];
        String ans[][] = new String[x.length + 1][y.length + 1];
        Arrays.fill(ans[0], "");
        for (int i = 0; i < ans.length; i++) {
            ans[i][0] = "";
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (x[i-1] == y[j-1]) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                    ans[i][j] = (ans[i - 1][j - 1] +x[i-1] +" ");
                } else if (arr[i - 1][j] > arr[i][j - 1]) {
                    arr[i][j] = arr[i - 1][j];
                    ans[i][j] = ans[i - 1][j];
                } else {
                    arr[i][j] = arr[i][j - 1];
                    ans[i][j] = ans[i][j - 1];
                }
            }
        }
        return ans[x.length][y.length];
   
   }
}
