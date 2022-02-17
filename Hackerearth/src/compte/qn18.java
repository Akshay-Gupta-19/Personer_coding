/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        test:for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            long a2=1;
            for (int j = 1; j <= n; j++) {
                a2*=j;
                
            if(a2>105){System.out.println(0);continue test;}
            }
                BigInteger b1=BigInteger.ONE;
                for (int j = 1; j < a2; j++) {
                    b1.multiply(new BigInteger(j+""));
                }
                String ans=b1.toString();
                try{
            System.out.println(ans.substring(ans.length()-19, ans.length()));
                }catch(Exception ex){
                    System.out.println(ans);
                }
        }
    }
}
