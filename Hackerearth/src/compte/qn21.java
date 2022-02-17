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
public class qn21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
            double s=(a+b+c)/2;
            double hf=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            double ra=a*b*c;
            ra/=4;
            ra/=hf;
            
            
            System.out.println(Math.round((3.1415*ra*ra)*10000)/10000d);
        }
    }
    
}
