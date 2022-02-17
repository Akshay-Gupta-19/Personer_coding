/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implimentation;

import java.util.ArrayList;
import java.util.Scanner;

public class Lisasworkbook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int pn=0;
        int ans=0;
        for (int i = 0; i < n; i++) {
            int t=sc.nextInt();
            int j;
            for (j = k; j <= t; j+=k) {
                if(++pn<=j && pn>j-k)
                    ans++;
            }
            if(t%k==0)continue;
            if(++pn>j-k && pn<=t)
                ans++;
        }
        System.out.println(ans);
       
    }
}
