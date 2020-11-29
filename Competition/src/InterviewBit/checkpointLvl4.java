/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit;

/**
 *
 * @author akggupta
 */ 
class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
 }
public class checkpointLvl4 {
    public static void main(String[] args) {
        ListNode A=null;
        ListNode h2=null;
        int size=0;
        for (ListNode temp=A; temp!=null; temp=temp.next) {
            ListNode n2=new ListNode(temp.val);
            n2.next=h2;
            h2=n2;
            size++;
        }
        size=size/2;
        for (ListNode temp=A; size!=0; temp=temp.next,size--) {
            temp.val=h2.val-temp.val;
        }
        //return A;
    }
    
}
