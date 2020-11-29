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
public class LongPalSubStr {
    public static void main(String[] args) {
        String A="caba";
        char c[]=A.toCharArray();
        String ans="";
        for (int i = 0; i < A.length(); i++) {
            String ca="";
            String ca2="";
            ca=mp(i,i,c);
            if(i<A.length()-1)ca2=mp(i,i+1,c);
            if(ans.length()<ca.length())ans=ca;
            if(ans.length()<ca2.length())ans=ca2;
        }
        System.out.println(ans);
    }
    static String mp(int i,int j,char c[]){
        while(i>=0 && j<c.length && c[i]==c[j]){
            i--;j++;
        }
        if(i+2>=j){
            try{
            return (char)c[i]+"";}
            catch(Exception ex){
                return (char)c[j]+"";
            }
        }
        return new String(c).substring(i+1,j);
    }
}
