package javaapplication22;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
record x(){

}

 class DriverClass
{
	public static void main(String args[]) 
	{
            System.out.println(LocalDateTime.now());
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   while(t-- >0)
	   {
	     int n = sc.nextInt();
	     int k = sc.nextInt();
	     int arr[][] = new int[k][n];
	       for(int i = 0; i < k; i++)
	       {
	        for(int j = 0; j < n; j++)
	               arr[i][j] = sc.nextInt();
	       }
	       new smallestRangeFromKLists().findSmallestRange(arr, n, k);
	       System.out.println();
	   }
	}
}
// } Driver Code Ends


class smallestRangeFromKLists
{
	static void findSmallestRange(int[][] arr,int n,int k)
	{
	    Pair pts[]=new Pair[arr.length];
	    PriorityQueue<Pair> pq=new PriorityQueue<>((p1,p2) -> arr[p1.li][p1.ci]-arr[p2.li][p2.ci]);
	    int low=6000,high=0;
	    for(int i=0;i<pts.length;i++){
	        pts[i]=new Pair(0,i);
	        pq.add(pts[i]);
	        low=Math.min(low,arr[i][0]);
	        high=Math.max(high,arr[i][0]);
	    }
            System.out.println(pq);
	    while(true){
	        Pair nn=pq.poll();
                if(arr[nn.li][nn.ci]>=high)break;
	        low=arr[nn.li][nn.ci];
	        nn.ci++;
	        if(nn.ci>=arr[nn.li].length)break;
                pq.add(nn);
	    }
	    System.out.print(low+" "+high);
	}
}
class Pair{
    int ci,li;
    Pair(int ci,int li){
        this.ci=ci;
        this.li=li;
    }

    @Override
    public String toString() {
        return "Pair{" + "ci=" + ci + ", li=" + li + '}';
    }
    
}