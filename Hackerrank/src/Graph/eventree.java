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

    Node() {
        this.edge = new ArrayList<>();
    }
    
}
public class eventree {
    
    static int ans=0;
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextInt();
        Node[] tree=new Node[n];
        for (int i = 0; i < tree.length; i++) {
            tree[i]=new Node();
        }
        for (int i = 0; i < n-1; i++) {
            int n1=sc.nextInt()-1,n2=sc.nextInt()-1;
            tree[n1].edge.add(tree[n2]);
            tree[n2].edge.add(tree[n1]);
        }
        sol(tree[0]);
        System.out.println(ans);
    }
    static int sol(Node x){
        int retval=1;
        x.visited=true;
        for (int i = 0; i < x.edge.size(); i++) {
            if(!x.edge.get(i).visited){
            int childn=sol(x.edge.get(i));
            if(childn%2==0){
                ans++;
            }
            else{
                retval+=childn;
            }
        }
        }
        return retval;
    }
}
