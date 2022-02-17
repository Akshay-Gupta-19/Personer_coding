/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeAgon;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long ans=0;
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            String bs=Integer.toBinaryString(x);
            
            for (int j = 0; j < bs.length(); j++) {
                if(bs.charAt(j)=='1')
               ans+=((n-(long)i-1)<<(bs.length()-1));
            }
        }
        System.out.println(ans);
    }
}
