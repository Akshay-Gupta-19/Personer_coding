/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CogniJavaHiring;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class Qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c[]=sc.next().toCharArray();
        int q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            c[sc.nextInt()-1]=sc.next().charAt(0);
        }
        String str=new String(c);
        System.out.println(str);
        int m=sc.nextInt();
        for (int i = 0; i < m; i++) {
            int a=sc.nextInt()-1,b=sc.nextInt()-1;
            String ans="";
            ans=str.substring(0,a)+strrev(str.substring(a,b+1));
            if(b!=str.length()-1)ans+=str.substring(b+1);
            str=ans;
        }
        System.out.println(str);
        int ans=0;
        for (int i = 0; i < c.length; i++) {
            if(c[i]==str.charAt(i))ans++;
        }
        System.out.println(ans);
    }
    static String strrev(String s){
     String rev="";
       for (int i = s.length()-1; i >-1; i--) {
           rev+=(char)s.charAt(i);
       }
       return rev;
   }
}
