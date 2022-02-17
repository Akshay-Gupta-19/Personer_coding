/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LNMIITCodingLeague1;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class Qn3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int div[]=new int[12];
        for (int i = 0; i < div.length; i++) {
           div[i]=sc.nextInt(); 
        }
        int ans=0;
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < div.length; j++) {
               if(i%div[j]==0){ans++;break;}
            }
        }
        System.out.println(ans);
    }
    
}
