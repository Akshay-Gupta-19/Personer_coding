/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int s=sc.nextInt();
            if(s==1 )
                System.out.println(1);
            else{
                int ans=0;
                for (int j = 1; j <= (int)(Math.sqrt(s)+0.5); j++) {
                    ans=ans+(int)(s/j+0.5)-(j-1);
                }
                System.out.println(ans);
            }
        }
    }
}
