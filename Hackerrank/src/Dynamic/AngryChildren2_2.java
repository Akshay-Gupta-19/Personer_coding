/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class AngryChildren2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) 
            arr[i]=sc.nextInt();
        Arrays.sort(arr);        
        long dyPrevDis[]=new long[n];
        long dyForwDis[]=new long[n];
        dyPrevDis[0]=0;
        dyForwDis[k-1]=0;
        long ans=0;
        for (int i = 1; i < k; i++) {
            dyPrevDis[i]=dyPrevDis[i-1]+(arr[i]-arr[i-1])*i;
            dyForwDis[k-1-i]=dyForwDis[k-i]+(arr[k-i]-arr[k-i-1])*i;
            ans+=dyPrevDis[i];
        }
        for (int i = k; i < dyForwDis.length; i++) {
            dyPrevDis[i]=dyPrevDis[i-1]+(arr[i]-arr[i-1])*i-dyForwDis[i-k];
            dyForwDis[i-k+1]=dyForwDis[i-k+1]+arr[i]-arr[i-k+1];
            if(ans>dyPrevDis[i])ans=dyPrevDis[i];
        }
        System.out.println(ans);
    }
}

/*
20
5
4504
1520
5857
4094
4157
3902
822
6643
2422
7288
8245
9948
2822
1784
7802
3142
9739
5629
5413
7232

out:5958
*/