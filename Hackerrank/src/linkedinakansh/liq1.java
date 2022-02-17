package linkedinakansh;
import java.util.Arrays;
import java.util.Scanner;
public class liq1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        findSeries(arr);
    }
    static void findSeries(int[] a) {
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            for (int j = i+1; j < a.length; j++) {
                int k=binarySearch(a, j+1, a.length-1, a[i]+2*(a[j]-a[i]));
               if(k!=-1)
                    System.out.println(a[i]+" "+a[j]+" "+a[k]);
            }
        }
         for(int i=0;i<a.length;i++){
            for (int j = i+1; j < a.length; j++) {
                if((float)a[j]/a[i]!=a[j]/a[i])continue;;
                int k=binarySearch(a, j+1, a.length-1,(int)(a[j]*((float)a[j]/a[i])));
               if(k!=-1)
                    System.out.println(a[i]+" "+a[j]+" "+a[k]);
            }
        }

    }
        static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
               return mid;
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
            return binarySearch(arr, mid+1, r, x);
        }
  return -1;
    }
}