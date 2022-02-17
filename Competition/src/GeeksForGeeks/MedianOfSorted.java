/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks;
import java.util.*;
/**
 *
 * @author USER
 */
public class MedianOfSorted {
    public static void main(String[] args) {
        Median m=new Median();
        double medianOfArrays = Median.medianOfArrays(1, 5, new int[]{4}, new int[]{1,3,4,6,7});
        System.out.println(medianOfArrays);
    }
}

class Median
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        int size=n+m;
        if(size%2==1){
            return getKth(a,b,size/2);
        }else{
            return ((double)(getKth(a,b,size/2-1))+getKth(a,b,size/2))/2;
        }
    }
    static int getKth(int a[],int b[],int kth){
        
        int l=0,r=a.length-1;
            while(l<=r){
                int mid=(l+r)/2;
                int indB=Arrays.binarySearch(b,a[mid]);
                if(indB<0){
                    indB++;
                    indB=-indB;
                }
                if(mid+indB==kth){
                    return a[mid];
                }
                if(mid+indB<kth)
                    l=mid+1;
                else
                    r=mid-1;
            }
            
            l=0;r=b.length-1;
            while(l<=r){
                int mid=(l+r)/2;
                int indB=Arrays.binarySearch(a,b[mid]);
                if(indB<0){
                    indB++;
                    indB=-indB;
                }
                if(mid+indB==kth){
                    return b[mid];
                }
                if(mid+indB<kth)
                    l=mid+1;
                else
                    r=mid-1;
            }
        return -1;
    }
}