/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankicpc;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author akshay gupta
 */
public class parades {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n;
            n=sc.nextInt();
            int edge[][]=new int[n-1][2];
            for (int j = 0; j < edge.length; j++) {
                edge[j][0]=sc.nextInt()-1;
                edge[j][1]=sc.nextInt()-1;
            }
            int m=sc.nextInt();
            boolean ua[][]=new boolean[m][n-1];
            int noup[]=new int[m];//no of path used by paradse m
            for (int j = 0; j < m; j++) {
                ua[j]=getua(edge,sc.nextInt()-1,sc.nextInt()-1);
               // System.out.println(Arrays.toString(ua[j]));
            }
            for (int j = 0; j < noup.length; j++) {
                for (int k = 0; k < ua[j].length; k++) {
                    if(ua[j][k])noup[j]++;
                }
            }
            sort(noup,0,noup.length-1,ua);
            
            //for (int j = 0; j < noup.length; j++){System.out.println(Arrays.toString(ua[j]));}
            boolean finaltick[]=new boolean[n-1];
            int ans=0;
            for (int j = 0; j < noup.length; j++) {
                int k;
                for ( k= 0; k < ua[j].length; k++) {
                    if(ua[j][k]){
                        if(!finaltick[k])finaltick[k]=true;
                        else break;
                    }
                }
                if(k==ua[j].length)ans++;
            }
            System.out.println(ans);
        }
    }
    static boolean[] getua(int edge[][],int s,int d){
        LinkedList<Integer> q=new LinkedList<Integer>();
        q.add(s);
        boolean visited[]=new boolean[edge.length+1];
        int par[]=new int[edge.length+1];
        boolean pathused[]=new boolean[edge.length];
        ow:  while(!q.isEmpty()) {
             int cin=q.pop();
             for (int i = 0; i < edge.length; i++) {
                 if(edge[i][0]==cin&&!visited[edge[i][1]])
                 { 
                     q.push(edge[i][1]); visited[edge[i][1]]=true;
                     par[edge[i][1]]=cin;
                     if(edge[i][1]==d)break;
                 }
                 if(edge[i][1]==cin&&!visited[edge[i][0]])
                 { 
                     q.push(edge[i][0]);visited[edge[i][0]]=true;
                     par[edge[i][0]]=cin;
                     if(edge[i][0]==d)break;
                 }
             }
            // System.out.println(q);
        }
        int cin=d;
        while(cin!=s){
            int par1=par[cin];
            for (int i = 0; i < edge.length; i++) {
                if((edge[i][0]==cin||edge[i][0]==par1)&&(edge[i][1]==cin||edge[i][1]==par1)){
                    pathused[i]=true;
                }
            }
            cin=par1;
        }
        return pathused;
    }
 static void sort(int[] arr, int low, int high,boolean b[][]) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
                                boolean temp1[] = b[i];
				b[i] = b[j];
				b[j] = temp1;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			sort(arr, low, j,b);
 
		if (high > i)
			sort(arr, i, high,b);
	}
}
