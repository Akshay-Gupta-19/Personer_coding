/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author avnegers
 *//*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int j=0;j<n;j++)
	            arr[j]=sc.nextInt();
	        HashSet<Integer> hs=new HashSet<>();
	        int ans=0;
	        for(int j=0;j<n;j++){
	            if(hs.contains(arr[j]))continue;
	            int sn=arr[j],gn=arr[j];
	            for(int k=j+1;k<n;k++){
	                int ls=1;
	                if(arr[k]%arr[j]==0 || arr[j]%arr[k]==0){
	                    if(arr[k]%arr[j]==0){gn=arr[k];}
	                    else{sn=arr[k];}
	                    ls++;
	                    hs.add(arr[k]);
	                    for(int l=k+1;l<n;l++){
	                        if(arr[l]%gn==0){gn=arr[l];ls++;hs.add(arr[l]); System.out.println(gn+" "+arr[j]+" 1 "+arr[k]+" "+arr[l]+" ");
	                        }
	                        else if(sn%arr[l]==0){sn=arr[l];ls++;hs.add(arr[l]); System.out.println(gn+" "+arr[j]+" 2 "+arr[k]+" "+arr[l]+" ");
	                        }
	                        else if(arr[l]%sn==0 && gn%arr[l]==0){ls++;hs.add(arr[l]); System.out.println(gn+" "+arr[j]+" 3 "+arr[k]+" "+arr[l]+" ");
	                        }
	                       
	                    }
	                }
	                ans=Math.max(ans,ls);
	            }
	        }
	        if(ans!=1)
	        System.out.println(ans);
	        else
	        System.out.println(-1);
	    }
	}
}