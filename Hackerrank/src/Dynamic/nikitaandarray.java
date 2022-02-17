import java.util.Arrays;
import java.util.Scanner;
public class nikitaandarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
           int n=sc.nextInt();
           int arr[]=new int[n];
           long sum=0; 
           for (int j = 0; j < arr.length; j++) {
               arr[j]=sc.nextInt();
               sum+=arr[j];
            }
            System.out.println(dev(arr,0,arr.length-1,sum));
        }
    }
    
    static int dev(int arr[],int s,int e,long sum){
        if(s==e) return 0;
        int np=0;
        long lp=0,rp=sum;
        int i;
        for (i = s; i <= e; i++) {
            lp+=arr[i];
            rp-=arr[i];
            if(lp==rp){
                np=i;break;
            }
        }
        if(i==e+1)return 0;
        else{
            return Math.max(dev(arr,s,np,lp), dev(arr,np+1,e,rp))+1;
        }
    }
}