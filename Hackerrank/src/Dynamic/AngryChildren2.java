/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class AngryChildren2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) 
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int mindiff=2000000000;
        int mindiffi=0;
        for (int i = 0; i < arr.length-k; i++){
            if(arr[k-1+i]-arr[i]<mindiff){
                mindiff=arr[k-1+i]-arr[i];
                mindiffi=i;
            }
        }
        int arr2[]=new int[k];
        for (int i = mindiffi; i < arr2.length-mindiffi; i++) 
            arr2[i-mindiffi]=arr[i];
        
        long dyPrevDis[]=new long[k];
        System.out.println(solve(arr2,k-1,dyPrevDis));
    }
  static long solve(int arr[],int ending,long dy[]){
      if(ending==0){dy[ending]=0;return 0;}
        long prevSol=solve(arr,ending-1,dy);
      dy[ending]=dy[ending-1]+(arr[ending]-arr[ending-1])*ending;
      return prevSol+dy[ending];
  }
}
