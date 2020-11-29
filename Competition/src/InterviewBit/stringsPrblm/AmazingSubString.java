/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.stringsPrblm;

/**
 *
 * @author akggupta
 */
public class AmazingSubString {
    public static void main(String[] args) {
        String A="";
        char c[]=A.toCharArray();
        int ans=0;
        for (int i = 0; i < c.length; i++) {
           if(c[i]=='U'||c[i]=='O'||c[i]=='I'||c[i]=='E'||c[i]=='A'||c[i]=='u'||c[i]=='o'||c[i]=='i'||c[i]=='e'||c[i]=='a') 
               ans+=(c.length-i);
        }
        System.out.println(ans);
    }
}
