/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class longestpalindromicsubseq {
    static char s[];
    public static void main(String[] args) {
        s=new Scanner(System.in).next().toCharArray();
        dy=new int[s.length][s.length];
        System.out.println(solve(0,s.length-1));
    }
    static int dy[][];
    static int solve(int i,int j){
        if(dy[i][j]!=0)return dy[i][j];
        else if(i>j)dy[i][j]=0;
        else if(i==j)dy[i][j]=1;
        else if(s[i]==s[j])dy[i][j]=solve(i+1,j-1)+2;
        else dy[i][j]=Math.max(solve(i,j-1), solve(i+1,j))+1;
        return dy[i][j];
    }
}
