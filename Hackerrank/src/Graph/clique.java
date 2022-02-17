
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class clique {
    public static void main(String[] args) {
//        for (int i = 1; i < 22; i++) {
//            System.out.println(7+" "+i);
//        }
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt(),m=sc.nextInt();
          if(n%2==0){
                if(m==0){
                System.out.println(1);
                continue;
            }
            int coeff=m/n;
            int rem=m%n;
            if(m==(n*(n-1))/2){
                  System.out.println(n);
                  continue;
            }
            if(rem==0){
                    System.out.println(coeff+1);
                    continue;
                }
            if(coeff==n/2-1){
                System.out.println(coeff+1+rem);
                continue;
            }
            System.out.println(coeff+2);
          }
          else{
             if(m==0){
                System.out.println(1);
                continue;
            }
                int coeff=m/n;
                int rem=m%n;
            if(m==(n*(n-1))/2){
                  System.out.println(n);
                  continue;
            }
            if(coeff==n/2-1 && rem>=coeff+3 ){
                 System.out.println(coeff+2+(rem-coeff-2));
             }
             else if(rem==0){
                System.out.println(coeff+1);
             }
             else
                System.out.println(coeff+2);
                 
          }
        }
    }
}
