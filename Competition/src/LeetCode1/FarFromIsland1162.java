/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1;

import java.util.LinkedList;
import java.util.Objects;

/**
 *
 * @author USER
 */
class Pair32 {

    int x, y;

    public Pair32(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pair32 other = (Pair32) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pair{" + "x=" + x + ", y=" + y + '}';
    }

}

public class FarFromIsland1162 {
    public static void main(String[] args) {
        System.out.println(new FarFromIsland1162().maxDistance(
                new int[][]{{1,0,0},{0,0,0},{0,0,0}}
        ));
    }
    boolean checkZero(int grid[][],boolean v[][],int i,int j){
        return i>=0 && i<grid.length && j>=0 && j<grid[i].length && !v[i][j] && grid[i][j]==0;
    }
    boolean checkOne(int grid[][],boolean v[][],int i,int j){
        return i>=0 && i<grid.length && j>=0 && j<grid[i].length && grid[i][j]==1;
    }
    public int maxDistance(int[][] grid) {
        int ans = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    boolean v[][] = new boolean[grid.length][grid[0].length];
                    int dis[][] = new int[grid.length][grid[0].length];
                    LinkedList<Pair32> buf = new LinkedList<>();
                    buf.add(new Pair32(i, j));
                    dis[i][j]=0;
                    v[i][j]=true;
                    int cdl=Integer.MAX_VALUE;
                    while (!buf.isEmpty()) {
                        Pair32 g=buf.pollFirst();
                        int ci=g.x;
                        int cj=g.y;
                        if (checkZero(grid, v, ci+1, cj)) {
                            buf.add(new Pair32(ci+1, cj));
                            v[ci+1][cj] = true;
                            dis[ci+1][cj]=dis[ci][cj]+1;
                        }
                        if (checkOne(grid, v, ci+1, cj)) {
                            cdl=Math.min(cdl,dis[ci][cj]+1);
                            break;
                        }
                        if (checkZero(grid, v, ci-1, cj)) {
                            buf.add(new Pair32(ci-1, cj));
                            v[ci-1][cj] = true;
                           dis[ci-1][cj]=dis[ci][cj]+1;
                        }
                        if (checkOne(grid, v, ci-1, cj)) {
                            cdl=Math.min(cdl,dis[ci][cj]+1);
                            break;
                        }
                        if (checkZero(grid, v, ci, cj+1)) {
                            buf.add(new Pair32(ci, cj+1));
                            v[ci][cj+1] = true;
                           dis[ci][cj+1]=dis[ci][cj]+1;
                        }
                        if (checkOne(grid, v, ci, cj+1)) {
                            cdl=Math.min(cdl,dis[ci][cj]+1);
                            break;
                        }
                        if (checkZero(grid, v, ci, cj-1)) {
                            buf.add(new Pair32(ci, cj-1));
                            v[ci][cj-1] = true;
                           dis[ci][cj-1]=dis[ci][cj]+1;
                        }
                        if (checkOne(grid, v, ci, cj-1)) {
                            cdl=Math.min(cdl,dis[ci][cj]+1);
                            break;
                        }
                    }
                    ans = Math.max(cdl, ans);
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
