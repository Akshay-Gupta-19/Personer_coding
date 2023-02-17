/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scrap;
import java.util.*;
/**
 *
 * @author guptaakshay
 */
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution1474 obj = new Solution1474();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution1474 {
    public static ArrayList<String> findPath(int[][] m, int n) {
        boolean vis[][]=new boolean[n][n];
        return numPath(m,0,0,vis);
    }
    static ArrayList<String> numPath(int maze[][],int row,int col,boolean vis[][]){
        if(row<0 || row>=maze.length ||
        col<0 || col>=maze[row].length ||
        vis[row][col] || maze[row][col]==0)return null;
        vis[row][col]=true;
        if(row==maze.length-1 && col==maze[row].length-1)
            return new ArrayList<>();
        ArrayList<String> left=numPath(maze,row,col-1,vis);
        ArrayList<String> right=numPath(maze,row,col+1,vis);
        ArrayList<String> up=numPath(maze,row-1,col,vis);
        ArrayList<String> down=numPath(maze,row+1,col,vis);
        ArrayList<String> ans=new ArrayList<>();
        if(left!=null){
            for(String leftPath:left){
            ans.add("L"+leftPath);
            }
        }
         if(right!=null){
            for(String rightPath:right){
                ans.add("R"+rightPath);
            }
         }
         if(up!=null){
            for(String upPath:up){
                ans.add("U"+upPath);
            }
         }
         if(down!=null){
            for(String downPath:down){
                ans.add("U"+downPath);
            }
         }
        return ans;
    }
}