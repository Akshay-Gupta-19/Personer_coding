/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeetCode1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test1 {
    public static void main(String[] args) {
       Test1 t= new Test1();
        System.out.println(t.minimumTime(new int[][]{{0,1,3,2},{5,1,2,5},{4,3,8,6}}));
        
    }
    public int minimumTime(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        if(grid[0][1]!=1 && grid[1][0]!=1) return -1;
        boolean vis[][]=new boolean[n][m];
        PriorityQueue<Pair2> queue=new PriorityQueue<>((a,b)->grid[a.row][a.col] - grid[b.row][b.col]);
        queue.add(new Pair2(0,0));
        vis[0][0]=true;
        int currTime=1;
        while(!queue.isEmpty()){
            if(currTime<gridValue(grid,queue.peek())){
                currTime=adjust(grid,queue.peek(),currTime);
            }
            while(!queue.isEmpty() && currTime>gridValue(grid,queue.peek())){
                Pair2 next=queue.poll();
                if(isDest(next,grid)){
                    return currTime;
                }
                addNeighbour(grid,next,vis,queue);
            }
            currTime++;
        }
        return -1;
    }
    
     void addNeighbour(int[][] grid, Pair2 next, boolean[][] vis , Queue<Pair2> queue) {
            int dir[][]=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
            for (int i = 0; i < dir.length; i++) {
                int nr=next.row+dir[i][0],nc=next.col+dir[i][1];
                if(isValid(grid,nr,nc) && !vis[nr][nc]){
                    queue.add(new Pair2(nr,nc));
                    vis[nr][nc]=true;
                }
         }
     }
     boolean isValid(int grid[][],int r,int c){
         return r<grid.length && r>=0 && c>=0 && c<grid[0].length;
     }
    boolean isDest(Pair2 p, int grid[][]){
        return p.row==grid.length-1 && p.col==grid[0].length-1;
    }
    int gridValue(int grid[][],Pair2 p){
        return grid[p.row][p.col];
    }
    int adjust(int grid[][],Pair2 p, int currTime){
        if(grid[p.row][p.col]%2==currTime%2){
            return grid[p.row][p.col];
        }else{
            return grid[p.row][p.col]+1;
        }
    }

}
class Pair2{
    int row,col;
    Pair2(){
    
    }
    Pair2(int r,int c){
        row=r;
        col=c;
    }
    
    @Override
    public String toString(){
        return row+" "+col;
    }
}