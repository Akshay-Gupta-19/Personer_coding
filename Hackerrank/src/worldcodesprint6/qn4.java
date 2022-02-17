/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcodesprint6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn4 {
    static String s2;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            hs=new HashMap<>();
            String sts=sc.next();
            s2=sc.next();
        if(sol(sts,0))
                System.out.println("YES");
        else
                System.out.println("NO");
        }
    }
    static HashMap<String,ArrayList> hs;
    static boolean sol(String s,int i){
        if(hs.containsKey(s)){
            ArrayList al2=hs.get(s);
            for (int j = 0; j < al2.size(); j+=2) {
                if((Integer)al2.get(j)==i)
                    return (Boolean) al2.get(j+1);
            }
        }
        else{
            hs.put(s, new ArrayList());
        }
        if(s.equals(s2)){
                ArrayList al4=new ArrayList();
                al4.add(i);
                al4.add(true);
                hs.put(s, al4);
                return true;
        }
        if(s.length()<s2.length()||i>=s.length()){
                ArrayList al4=new ArrayList();
                al4.add(i);
                al4.add(false);
                hs.put(s, al4);
                return false;
        }
        if('A'<=s.charAt(i)&&s.charAt(i)<='Z'){
            boolean ct=sol(s,i+1);
                ArrayList al4=new ArrayList();
                al4.add(i);
                al4.add(ct);
                hs.put(s, al4); 
            return ct;
        }
            boolean ct=sol(s.substring(0,i)+s.substring(i+1,s.length()),i)||sol(s.substring(0,i)+(char)(s.charAt(i)-'a'+'A')+s.substring(i+1,s.length()),i+1);
                ArrayList al4=new ArrayList();
                al4.add(1);
                al4.add(ct);
                hs.put(s, al4); 
            return ct;
        
        
    }
}
