/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversitySprint4;
import java.util.*;
/**
 *
 * @author akggupta
 */
public class maxPermutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            char s1[]=sc.next().toCharArray();
            char s2[]=sc.next().toCharArray();
            String s3=new String(s2);
            int max=0;
            String ans="";
            HashMap<String,Integer> hm=new HashMap<>();
            int fc[]=new int[26];
            for (int j = 0; j < s1.length-1; j++) {
                fc[s1[j]-'a']++;
                fc[s2[j]-'a']--;
            }
            outer: for (int j = s1.length-1; j + s1.length <= s2.length ; j++) {
                fc[s2[j]-'a']++;
               if(j!=s1.length-1) fc[s2[j-s1.length]-'a']--;
              for (int k = 0; k < fc.length; k++) {
                 if(fc[k]!=0)continue outer; 
              }
               String css=s3.substring(j,j+s1.length);
                    Integer cv=hm.getOrDefault(css, 0);
                    if(cv==0)hm.put(css, 0);
                    hm.put(css, cv+1);
                    if(cv+1>max){max=cv+1;ans=css;}
                
            }
            if("".equals(ans))System.out.println(-1);
            else System.out.println(ans);
        }
    
    }
   
}
