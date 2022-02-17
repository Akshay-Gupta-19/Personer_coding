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
public class currencyarbitrage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            double x=sc.nextDouble(),y=sc.nextDouble(),z=sc.nextDouble();
            double ans=x*y*z;
            if(ans>1){
                System.out.println(0);
                continue;
            }
            else
                System.out.println((int)(100000/ans-100000));
            }
    }
    
}
