/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit;
import java.util.*;
/**
 *
 * @author USER
 */
public class BiggestThreeRhombus1878 {
    public static void main(String[] args) {
        int[] biggestThree = new BiggestThreeRhombus1878().getBiggestThree(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        System.out.println(Arrays.toString(biggestThree));
    }
    public int[] getBiggestThree(int[][] grid) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int ca=grid[i][j];
                int k=i+1,l,m;
                int hei=grid.length-i-1;
                int n=0;
                for(l=j-1,m=j+1;l>=0 && m<grid[i].length && n<hei/2;l--,m++,k++,n++){
                    ca+=(grid[k][m]);
                    ca+=(grid[k][l]);
                }
                l+=2;m-=2;
                for(;l<m;l++,m--,k++){
                    ca+=(grid[k][m]);
                    ca+=(grid[k][l]);
                }
                if(k<grid.length && m>=0 && l==m)
                    ca+=grid[k][m];
                if(pq.size()>=3 && pq.peek()<ca)
                    pq.poll();
                if(pq.size()<3 || pq.peek()<ca)
                    pq.add(ca);
            }
        }
        int ans[]=new int[pq.size()];
        int x=0;
        while(!pq.isEmpty())
            ans[x++]=pq.poll();
        return ans;
    }
}
