/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1.codeDrift;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

class Ele{
    int x;
    TreeMap<Integer,Integer> tm;

    public Ele(int x, TreeMap<Integer, Integer> tm) {
        this.x = x;
        this.tm = tm;
    }
}
 class Solution2 {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        LinkedList<Ele> ll=new LinkedList<>();
        ArrayList<Integer> ansl=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            switch(A.get(i).get(0)){
                case 1:
                    TreeMap<Integer,Integer> tm2=new TreeMap<>();
                    tm2.put(A.get(i).get(1),1);
                    ll.add(new Ele(A.get(i).get(1),tm2));
                    for (int j = 0; j < ll.size()-1; j++) {
                        Ele get = ll.get(j);
                        Iterator<Integer> it=get.tm.keySet().iterator();
                        TreeMap<Integer,Integer> ntm=new TreeMap<>();
                        
                        while(it.hasNext()){
                            int cn=it.next();
                            ntm.put(cn+A.get(i).get(1), get.tm.get(cn)+1);
                        }
                        get.tm.putAll(ntm);
                    }
                    break;
                case 2:
                    ll.pollFirst();
                    break;
                case 3:
                    int mss=-1;
                    for(int j=0;j<ll.size();j++){
                        if(ll.get(j).tm.getOrDefault(A.get(i).get(1),-1)>mss )
                            mss=ll.get(j).tm.getOrDefault(A.get(i).get(1),0);
                    }
                    ansl.add(mss);
                    break;
            }
            //System.out.println(ll);
        }
        return ansl;
    }
}
