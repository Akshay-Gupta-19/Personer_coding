/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nitsurat;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    static int ro[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int sp[]=new int[n];
        int ep[]=new int[n];
        ro=new int[n][];
        for (int i = 0; i < ep.length; i++) {
            int noe=sc.nextInt();
            ro[i]=new int[noe];
            ep[i]=noe-1;
            for (int j = 0; j < ro[i].length; j++) {
               ro[i][j]=sc.nextInt();
            }
        }
        System.out.println(solve(sp,ep,m));
    }
    /*4
6
2 6 9
8 9 17
7 12 19 1 7 9
3 7 2
1
2
1
2
*/
    static int solve(int ip[],int ep[],int m){
        if(m==0)return 0;
        int sh=0;
        int iti=0,ww=0;
        for (int i = 0; i < ip.length; i++) {
            if(ip[i]>ep[i])continue;
           ip[i]++;
                   int sol1=solve(ip,ep,m-1);
           int ps=sol1+ro[i][ip[i]-1];
           if(sh<ps)
           { 
               sh=ps;iti=i;ww=0;}
               ip[i]--;
        }
        for (int i = 0; i < ep.length; i++) {
           if(ip[i]>ep[i])continue;
           ep[i]--;
           int ps=solve(ip,ep,m-1)+ro[i][ep[i]+1];
           if(sh<ps)
           {sh=ps;iti=i;ww=1;}
           ep[i]++;    
        }
        if(ww==0)ip[iti]++;
        else ep[iti]--;
        return sh;
    }
}