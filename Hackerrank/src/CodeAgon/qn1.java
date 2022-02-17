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
public class qn1 {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       t: while(t--!=0){
            TreeMap<Integer,TreeSet<Integer>> tm=new TreeMap<>();
        for(int i=0;i<5;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(!tm.containsKey(x))tm.put(x,new TreeSet<>());
            tm.get(x).add(y);
        }
        
        try{
        Iterator<Integer> it1=tm.keySet().iterator();
        int xs[]=new int[3]; 
        xs[0]=it1.next();
        xs[1]=it1.next();
        xs[2]=it1.next();
        int ys[]=new int[3];
                   Iterator<Integer> it2=tm.get(xs[1]).iterator();
                   ys[0]=it2.next();
                   ys[1]=it2.next();
                   ys[2]=it2.next();
           for (int i = 1; i < ys.length; i++) {
               if(ys[i]!=ys[i-1]+1){System.out.println("No");continue t;}
           }
           for (int i = 1; i < xs.length; i++) {
               if(xs[i]!=xs[i-1]+1){System.out.println("No");continue t;}
           }
           System.out.println("Yes");}
        catch(Exception ex){System.out.println("No");}
         //  System.out.println(tm);
       }
    }
    
}
/*
1
0 2
0 1
0 0
1 1
2 2
*/