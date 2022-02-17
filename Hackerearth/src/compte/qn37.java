/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;
/*
3
10 7 5
50 100 50
1000000000 999999999 1000000000

25
1750
444444445222222222
*/
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn37 {
   static long dy[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int x=sc.nextInt(),y=sc.nextInt(),n=sc.nextInt();
           long ans=x+y;
           int t1=x,t2=y;
            for (int j = 2; j < n; j++) {
                int ca=Math.abs(t1-t2);
                ans+=ca;
                t1=t2;
                t2=ca;
            }
            System.out.println(ans);
        }
    }
   
    static long solve(int x,int y,int n){
        if(n==0)return 0;
        else if(dy[x][y]!=0)return dy[x][y];
       dy[x][y]=Math.min(Math.abs(x-y)+solve(y,Math.abs(x-y),n-1), (x+y)+solve(y,x+y,n-1));
       return dy[x][y];
    }
}
