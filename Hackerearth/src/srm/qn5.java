package srm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int i=0;
        while ( i < n) {
        	int pi=i;
            for (int j = 0; j < n; j++) {
               int x=arr[i][j];
               if(x==1){
                   if(hs.contains(j)||j==i){
                       System.out.println(i+1);
                       System.exit(0);
            		 }
                   else{
                       hs.add(j);
                       i=j;
                   }
               } 
            }
           if(i==pi)break; 
        }
        System.out.println(-1);
    }
}
