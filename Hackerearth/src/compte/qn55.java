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
public class qn55 {
    

    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        
        for(int i=0;i<q;i++){
            long n=sc.nextLong();
            int t=sc.nextInt();
            for(int j=0;j<t;j++){
             if(n%2==0)n/=2;
             else n=(n-1)/2;
             n=n-n/4;
            }
            
        System.out.println(n);
        }
    }


}
