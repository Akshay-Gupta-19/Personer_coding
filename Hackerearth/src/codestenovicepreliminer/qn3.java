/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codestenovicepreliminer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn3 {
static HashMap<Integer,ArrayList<Integer>> hm;
    static LinkedList<Integer> q;
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
         for (int i = 0; i < t; i++) {
             int n=sc.nextInt();
             hm=new HashMap();
             q=new LinkedList<>();
             for (int j = 1; j <= n; j++) {
                 ArrayList al=new ArrayList();
                 hm.put(j, al);
             }
             for (int j = 0; j < n-1; j++) {
                 int src=sc.nextInt(),des=sc.nextInt();
                 hm.get(src).add(des); hm.get(des).add(src);
             }
             q.addFirst(1);
             sol(1);
             while(!q.isEmpty()){
                 sol(q.pollFirst());
             }
             
             System.out.println();
        }
    }
    static void sol(int cn){//parent cost
        q.remove(new Integer(cn));
        for (int i = 0; i < hm.get(cn).size(); i++) {
            int ctg=(Integer) hm.get(cn).get(i);//child to go next
          //  if(!q.contains(ctg) ){q.add(ctg);ans.put(ctg,ans.get(cn)+6);}
           
        }
    }    
}
