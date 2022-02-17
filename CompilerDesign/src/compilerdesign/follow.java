/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerdesign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author avnegers
 */
public class follow {
    public static void main(String[] args) {
        System.out.println("Enter no of productions");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Character,ArrayList<String>> pro=new HashMap<>();//list of produtions
        HashMap<Character,HashSet<Character>> lof=new HashMap<>();//list of firsts
        for (int i = 0; i < n; i++) {
            char ps=sc.next().charAt(0);//production source
            if(pro.containsKey(ps)){
                String pd=sc.next();//production derivation
                pro.get(ps).add(pd);
                if(pd.charAt(0)<='z' && pd.charAt(0)>='a' ||  pd.charAt(0)=='@')lof.get(ps).add(pd.charAt(0));
            }else{
                String pd=sc.next();
                ArrayList np=new ArrayList();
                np.add(pd);
                pro.put(ps, np);
                lof.put(ps, new HashSet<>());
                if(pd.charAt(0)<='z' && pd.charAt(0)>='a'  || pd.charAt(0)=='@')
                    lof.get(ps).add(pd.charAt(0));
            }
        }
        Set<Character> s=pro.keySet();
        while (true) {
            boolean breaker=true;
            Iterator<Character> it=s.iterator();
            while(it.hasNext()){
                char cc=it.next();//current charater to add firsts
                for (int j = 0; j < pro.get(cc).size(); j++) {
                  String cp=pro.get(cc).get(j);//currentt production to analyse
                  
                 for(int k=0;k<cp.length()-1;k++){int loc;
                 
                 for(loc=k+1;loc<cp.length()-1&&cp.charAt(loc)<='Z'&&cp.charAt(loc)>='A';loc++)
                 {
                      int nof=lof.size(); 
                      if(cp.charAt(loc+1)<'a' && cp.charAt(loc+1)<'a')
                      lof.get(cc).addAll(lof.get(cp.charAt(loc))); 
                      if(nof<lof.size())breaker=false;
                 }
                 if(loc==pro.get(cc).get(j).length())lof.get(cc).addAll(lof.get(cc));
                }
                 
                }
            }
            if(breaker)break;
    }
        
        System.out.println(lof);
    }
    
}
