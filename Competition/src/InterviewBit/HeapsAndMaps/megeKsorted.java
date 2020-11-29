/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.HeapsAndMaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author akggupta
 */
public class megeKsorted {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ListNode> lon=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int k=sc.nextInt();
            
        }
    }
     class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
    public ListNode mergeKLists(ArrayList<ListNode> a) {
        PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>((o1,o2) ->o2.val-o1.val);
        for(int i=0;i<a.size();i++){
            pq.add(a.get(i));
        }
        ListNode temp=null,ans;
        while(!pq.isEmpty()){
            ListNode sn= pq.poll();if(sn.next!=null)pq.add(sn.next);
           ListNode nn=new ListNode(sn.val);
           if(temp!=null){
               temp.next=nn;
               temp=nn;
           }
           else {ans=nn;temp=nn;}
        }
        return temp;
    }
}
