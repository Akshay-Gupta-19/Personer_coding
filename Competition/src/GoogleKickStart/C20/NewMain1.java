/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleKickStart.C20;

/**
 *
 * @author akggupta
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution2 {

    public static void main(String[] args) {
        FastReader2 sc = new FastReader2();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int r = sc.nextInt(), c = sc.nextInt();
            char arr[][] = new char[r][c];
           ArrayList<Character> al=new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.next().toCharArray();
                for (int k = 0; k < arr[j].length; k++) {
                    if(!al.contains(arr[j][k]))al.add(arr[j][k]);
                }
            }
            Graph g = new Graph(al.size());
            for (int j = 1; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    g.addEdge(al.indexOf(arr[j][k]), al.indexOf(arr[j-1][k]));
                }
            }
           String ans=g.topologicalSort(al);
            System.out.println("Case #"+i+": "+ans);
        }
    }
}

class Graph {

    private int V;   // No. of vertices  

    // Adjacency List as ArrayList of ArrayList's 
    private ArrayList<ArrayList<Integer>> adj;

    //Constructor  
    Graph(int v) {
        V = v;
        adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; ++i) {
            adj.add(new ArrayList<Integer>());
        }
    }

    // Function to add an edge into the graph  
    void addEdge(int v, int w) {
        if(!adj.get(v).contains(w) && v!=w)
        adj.get(v).add(w);
    }

    // A recursive function used by topologicalSort  
    void topologicalSortUtil(int v, boolean visited[],
            Stack<Integer> stack) {
        // Mark the current node as visited.  
        visited[v] = true;
        Integer i;

        // Recur for all the vertices adjacent to this  
        // vertex  
        Iterator<Integer> it = adj.get(v).iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        // Push current vertex to stack which stores result  
        stack.push(new Integer(v));
    }

    public boolean isCyclicUtil(int i, boolean[] visited,
            boolean[] recStack) {

        // Mark the current node as visited and 
        // part of recursion stack 
        if (recStack[i]) {
            return true;
        }

        if (visited[i]) {
            return false;
        }

        visited[i] = true;

        recStack[i] = true;
        List<Integer> children = adj.get(i);

        for (Integer c : children) {
            if (isCyclicUtil(c, visited, recStack)) {
                return true;
            }
        }

        recStack[i] = false;

        return false;
    }

    // The function to do Topological Sort. It uses  
    // recursive topologicalSortUtil()  
    String topologicalSort(ArrayList<Character> al) {
        Stack<Integer> stack = new Stack<Integer>();

        // Call the recursive helper function to store  
        // Topological Sort starting from all vertices  
        // one by one  
        for (int i = 0; i < V; i++) {
            boolean visited[] = new boolean[V];
            boolean recStack[] = new boolean[V];
            if (isCyclicUtil(i, visited, recStack)) {
                continue;
            } else {
                visited=new boolean[V];
                stack=new Stack<>();
                topologicalSortUtil(i, visited, stack);
                if(stack.size()==al.size())break;
            }
        }
        // Print contents of stack  
        if(stack.size()!=al.size()){
            return "-1";
        }
        int arr[] = new int[stack.size()];
        String ans="";
        for (int i = 0; stack.empty() == false; i++) {
             ans+=(char)(al.get(stack.pop()));
        }
        return ans;
    }

}

class FastReader2 {

    BufferedReader br;
    StringTokenizer st;

    public FastReader2() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
