/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks;

/**
 *
 * @author USER
 */
public class ReverseLLInChunks {
    public static void main(String[] args) {
        Node head=null,temp=null;
        for (int i = 1; i < 10; i++) {
            if(head==null){
                head=new Node(10*i);
                temp=head;
            }
            else
            {
                temp.next=new Node(10*i);
                temp=temp.next;
            }
        }
        print(head);
        head = Solution.reverse(head,4);
        print(head);
    }
    static void print(Node head){
        for(Node temp=head;temp!=null;temp=temp.next)
            System.out.print(temp.val+" ");
        System.out.println("");
    }
}
class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
    
}
class Solution
{
    public static Node reverse(Node node, int k)
    {
        Node prevLast=null,newHead=null;
        for(Node curHead=node;curHead!=null;){
            Node temp1=curHead;
            for(int i=0;i<k-1 && temp1.next!=null;i++,temp1=temp1.next);
            Node nextCurHead=temp1.next;
            temp1.next=null;
            Node fal[]=reverse(curHead);
            if(prevLast!=null){
                prevLast.next=fal[0];
            }else{
                newHead=fal[0];
            }
            prevLast=fal[1];
            curHead=nextCurHead;
        }
        return newHead;
    }
    static Node[] reverse(Node head){
        Node temp1=head,temp2=head.next,temp3=head.next!=null?head.next.next:null;
        while(temp2!=null){
            temp2.next=temp1;
            temp1=temp2;
            temp2=temp3;
            if(temp3!=null)temp3=temp3.next;
        }
        head.next=null;
        return new Node[]{temp1,head};
    }
}
