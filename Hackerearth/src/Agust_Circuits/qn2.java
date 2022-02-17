package Agust_Circuits;

import java.util.Scanner;

public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(fgcd(16,12));
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int ub=sc.nextInt();
            int m=n-ub;
            int numerator=9*n*ub;
            int denominator=(3*ub+4*m)*(3*ub+2*m);
            int gcd=fgcd(numerator,denominator);
            System.out.println(numerator/gcd+"/"+denominator/gcd);
        }
    }
        static int fgcd(int a,int b){
           while(b!=0){
               int t=b;
               b=a%b;
               a=t;
           } 
           return a;
        }
}
