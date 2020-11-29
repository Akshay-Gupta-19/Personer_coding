/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank2;

import java.util.*;

/**
 *
 * @author akggupta
 */
public class LTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Set<Integer>,Integer> hm=new HashMap<>();
        for (int i = 0; i <n; i++) {
            HashSet<Integer> hs=new HashSet();
            char c[]=sc.next().toCharArray();
            for (int j = 0; j < c.length; j++) {
               hs.add(c[j]-'0');
               if(hs.size()==10)break;
            }
            hm.put(hs, hm.getOrDefault(hs, 0)+1);
        }
        Iterator<Set<Integer>> it=hm.keySet().iterator();
        ArrayList<Set<Integer>> al=new ArrayList<>();
        int fc[]=new int[hm.size()];
        int t=0;
        while(it.hasNext()){
            Set<Integer> nv=it.next();
            al.add(nv);
            fc[t++]=hm.get(nv);
        }
        long ans=0;
        for (int i = 0; i < al.size(); i++) {
            if(fc[i]==10){ans+=(n);continue;}
            for (int j = i+1; j < al.size(); j++) {
                HashSet<Integer> hs=new HashSet<>();
                hs.addAll(al.get(i));
                hs.addAll(al.get(j));
                if(hs.size()==10)ans+=(fc[i]*fc[j]);
            }
            ans+=(fc[i]*(fc[i-1])/2);
        }
        System.out.println(ans);
    }
    
}
class A{
    public void meth(){
        System.out.println("As");
    }
}
interface B{ 
    default void meth(){
        System.out.println("Bs");
    }
}
class C extends A implements B{
    public static void main(String[] args) {
       new C().meth();
    }
}