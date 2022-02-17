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
public class qn6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int r=sc.nextInt();
            int c=sc.nextInt();
                r/=2;
                c=r-c;
               if(c<0)c=0;
            
            if(r%2==0){
                    c/=2;
                System.out.print(r*(r+1)-c*(c+1)+" ");
                
                if(c%2!=0){c++;}
                else{
                 c++;
                }
                  System.out.print(r*r-c*c);
              
            }
            else{
                     c/=2;
                    System.out.println(r*(r+1)-c*(c+1)+" ");
             r++;
             
                if(c%2!=0)
                {   c++;}
                
                System.out.println(r*r-c*c);
            }
               System.out.println();
        }
    }
}
