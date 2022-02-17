package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Node2{
    ArrayList<Node2> edge;//edgee means and children
    ArrayList<Integer> time;
    ArrayList<Boolean> chm;//childhave machine
    Node2(){
        edge=new ArrayList<>();
        time=new ArrayList<>();
        
    }
    boolean mac=false;//true machine is present else not
    boolean ash=false;//any sibling having machine 
    Node2 par;//parent index
}
public class Matrix3 {
    static HashMap<Integer,Node2> graph=new HashMap<>(); 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for (int i = 0; i < n; i++) {
            graph.put(i, new Node2());
        }
        for (int i = 0; i < n-1; i++) {
            int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
            if(x<y){int temp=x;x=y;y=temp;}
            graph.get(x).edge.add(graph.get(y));
            graph.get(x).time.add(z);
            graph.get(x).par=graph.get(x);
        }
        for (int i = 0; i < k; i++) {
           graph.get(sc.nextInt()).mac=true;
        }
        System.out.println(sol(graph.get(0)));
    }
    static int sol(Node2 cn){//current node and previous machine
        return 0;
    }
}
