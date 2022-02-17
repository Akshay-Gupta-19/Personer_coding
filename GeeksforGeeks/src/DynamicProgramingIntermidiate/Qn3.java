/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramingIntermidiate;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class Qn3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        m=1000000007;
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int grid[][]=new int[sc.nextInt()][sc.nextInt()];
            int k=sc.nextInt();
            for (int j = 0; j < k; j++) {
                grid[sc.nextInt()-1][sc.nextInt()-1]=-1;
            }
            int dy[][]=new int[grid.length][grid[0].length];
            for (int j = 0; j < dy.length; j++) {
               Arrays.fill(dy[j],-1);
            }
            System.out.println(solve(0, 0, grid,dy));
        }
    }
    static int m;
    static int solve(int i,int j,int grid[][],int dy[][]){
        if(grid[i][j]==-1)return 0;
        if(i==grid.length-1 && j==grid[0].length-1)return 1;
        if(dy[i][j]!=-1)return dy[i][j];
        int ans=0;
        if(i+1<grid.length)ans=(ans+solve(i+1,j,grid,dy))%m;
        if(j+1<grid[i].length)ans=(ans+solve(i,j+1,grid,dy))%m;
        dy[i][j]=ans;
        return ans;
    }
}
