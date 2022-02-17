/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;
import java.util.*;

/**
 *
 * @author avnegers
 */
class SortComparator implements Comparator<Integer>{
   @Override
   public int compare(Integer t1,Integer t2)
   {
       /*if(t1>t2)
           return 1;
       else if(t1<t2)
           return -1;
       else
           return 0;
        */
       return t1.compareTo(t2);
   }
}
public class BigSort2  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       /*Comparator<Integer> c=new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                
           return t1.compareTo(t2);
            }

           
        };*/
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); 
        }
    }

   
}