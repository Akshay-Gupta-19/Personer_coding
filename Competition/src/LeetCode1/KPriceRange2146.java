/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeetCode1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author Akshay Gupta
 */
public class KPriceRange2146 {
    public static void main(String[] args) {
        Solution2146 solve=new Solution2146();
        List<List<Integer>> highestRankedKItems = solve.highestRankedKItems(new int[][]{{1,2,0,1},{1,3,0,1},{0,2,5,1}}
                , new int[]{2,5},
                new int[]{0,0},
                3);
        System.out.println(highestRankedKItems);
    }
}
class Solution2146 {
    public List<List<Integer>> highestRankedKItems(int[][] grid, int[] pricing, int[] start, int k) {
        int m=grid.length,n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        LinkedList<Pair> queue=new LinkedList<>();
        vis[start[0]][start[1]]=true;
        int dir[][]=new int[][]{{-1,0},{0,-1},{0,1},{1,0}};
        queue.add(new Pair(start[0],start[1]));
        LinkedList<List<Integer>> ans=new LinkedList<>();
        while(!queue.isEmpty()){
            Pair next=queue.pollFirst();
            //System.out.println("For" + next);
            PriorityQueue<Pair> pq=new PriorityQueue<Pair>((a,b)->{
                    if(grid[a.row][a.col]==grid[b.row][b.col]){
                        if(a.row==b.row){
                            return a.col-b.col;
                        }
                        return a.row-b.row;
                    }
                return grid[a.row][a.col]-grid[b.row][b.col];
            });
            for(int i=0;i<dir.length;i++){
                int nextR=dir[i][0]+next.row,nextC=dir[i][1]+next.col;
               // System.out.println(nextR+" "+nextC);
                if(isGood(nextR,nextC,vis,grid)){
                    vis[nextR][nextC]=true;
                    queue.add(new Pair(nextR,nextC));
                    if(moreGood(grid[nextR][nextC],pricing)){
                       // System.out.println("While adding "+nextR+" "+nextC);
                        pq.add(new Pair(nextR,nextC));
                    }
                }
            }
           //System.out.println(pq);
            if(!pq.isEmpty())
                ans.add(new ArrayList(pq));
            if(ans.size()>k){
                while(ans.size()>k)ans.pollLast();
                break;
            }
        }
        //System.out.println("Here"+" "+ans);
       
        return ans;
    }
    boolean isGood(int row,int col,boolean vis[][],int grid[][]){
        return row>=0 && row<vis.length && col>=0 && col<vis[0].length && !vis[row][col] && grid[row][col]!=0;
    }
    boolean moreGood(int price,int range[]){
        return price>=range[0] && price<=range[1];
    }
}
class Pair{
    int row,col;
    Pair(int x,int y){
        row=x;
        col=y;
    }
    public String toString(){
        return row+" "+col;
    }
}
