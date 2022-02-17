/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefight;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
        String s="";
        StringBuffer s2=new StringBuffer("");
        s=s.trim();
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)==' '){
                int j=i+1;
                while(s.charAt(j++)==' ');
                s=s.substring(0,i+1)+s.substring(j,s.length());
            }
        }
        if(s.charAt(0)<'z'&&s.charAt(0)>'a')s=(char)(s.charAt(0)-('a'-'A'))+s.substring(1,s.length());
        int k=s.length()-1;
        while(s.charAt(k--)=='?');
        s=s.substring(0,k+1);
    }
    
}
