package Searching;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import javafx.util.Pair;

/**
 *
 * @author avnegers
 */
public class countluck2 {
    static boolean arr[][];
    static int fpx,fpy;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int k = 0; k < t; k++) {  
        int n=sc.nextInt();
        int m=sc.nextInt();
        int spx=0,spy=0;
         arr=new boolean[n][m];
        for (int i = 0; i < arr.length; i++) {
            char c[]=sc.next().toCharArray();
            for (int j = 0; j < arr[i].length; j++) {
                if(c[j]=='X')
                    arr[i][j]=true;
                else if(c[j]=='M'){
                    spx=i;spy=j;
                }
                else if(c[j]=='*'){
                    fpx=i;fpy=j;
                }
            }
        }
        HashSet<Pair<Integer,Integer>> al=new HashSet<>();
          Pair p=new Pair(spx,spy);
          al.add(p);
        int x=sc.nextInt();
        if(x==solve(spx,spy,al))
                System.out.println("Impressed");
        else
                System.out.println("Oops!");
          // System.out.println(solve(spx,spy,al));
        }
    }
    static int solve(int x,int y,HashSet<Pair<Integer,Integer>> al){
        int ans=0;
        Pair p=new Pair(x, y);
        Pair p2=new Pair(x+1, y);
        Pair p3=new Pair(x-1, y);
        Pair p4=new Pair(x, y+1);
        Pair p5=new Pair(x, y-1);
        if(x==fpx && y==fpy)return 0;
        int dc=0;
       if( x<arr.length-1 && !arr[x+1][y] && !al.contains(p2)){al.add(p2);ans+=solve(x+1,y,al);al.remove(p2);dc++;}
       if(x>0 && !arr[x-1][y] && !al.contains(p3)){al.add(p3);ans+=solve(x-1,y,al);al.remove(p3);dc++;}
       if( y<arr[x].length-1 && !arr[x][y+1] && !al.contains(p4)){al.add(p4);ans+=solve(x,y+1,al);al.remove(p4);dc++;}
       if( y>0 && !arr[x][y-1] && !al.contains(p5)){al.add(p5);ans+=solve(x,y-1,al);al.remove(p5);dc++;}
       if(dc>1)return ans+1;
       else return ans;
    }
}
