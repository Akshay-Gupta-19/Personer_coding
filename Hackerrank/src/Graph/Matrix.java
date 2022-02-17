package Graph;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
class Node{
    boolean visited;
    ArrayList<Node> edge;
    ArrayList<Integer> time;
    boolean machine;
    Node() {
        this.edge = new ArrayList<>();
        this.time=new ArrayList<>();
    }
}
public class Matrix {
    
    static int ans=0;
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        Node[] tree=new Node[n];
        for (int i = 0; i < tree.length; i++) {
            tree[i]=new Node();
        }
        for (int i = 0; i < n-1; i++) {
            int n1=sc.nextInt(),n2=sc.nextInt(),t=sc.nextInt();
            tree[n1].edge.add(tree[n2]);
            tree[n2].edge.add(tree[n1]);
            tree[n1].time.add(t);
            tree[n2].time.add(t);
        }
        for (int i = 0; i < k-1; i++) {
            tree[sc.nextInt()].machine=true;
        }
        int root=sc.nextInt();
        tree[root].machine=true;
        sol(tree[root],0);
        System.out.println(ans);
    }
    static void sol(Node x,int ti){
        x.visited=true;
        if(x.machine){
            
        }
        for (int i = 0; i < x.edge.size(); i++) {
            if(!x.edge.get(i).visited){
                
          
        }
        }
    }
}
