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
public class qn46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        int n=sc.nextInt();
        int maxo=10000;
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            ans+=x;
            if(x%2==1 && x<maxo)maxo=x;
        }
        if(ans==0)System.out.println(":(");
        else if(ans%2==1)System.out.println(ans);
        else System.out.println(ans-maxo);
    }
}

