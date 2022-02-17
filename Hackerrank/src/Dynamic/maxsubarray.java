package Dynamic;
import java.util.Scanner;
public class maxsubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            System.out.println(mac(arr)+" "+manc(arr));
        }   
    }
    static int mac(int[] A) {
       int newsum=A[0];
       int max=A[0];
       for(int i=1;i<A.length;i++){
           newsum=Math.max(newsum+A[i],A[i]);
           max= Math.max(max, newsum);
       }
       return max;
    }
 
    static int manc(int a[]){
        int ans=0;
        for (int i = 0; i < a.length; i++) {
           if(a[i]>0)
               ans+=a[i];
        }
        if(ans==0){
           int min=-10001;
            for (int i = 0; i < a.length; i++) {
              if(a[i]>min)min=a[i]; 
            }
        ans=min;
        }
        return ans;
    }

}