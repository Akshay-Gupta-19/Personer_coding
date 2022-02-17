import java.util.Scanner;
class maxsubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            System.out.println(mac(arr,m));
        }   
    }
    static int mac(int[] A,int m) {
       int newsum=A[0];
       int max=A[0];
       for(int i=1;i<A.length;i++){
           newsum=Math.max((newsum+A[i])%m,A[i]%m);
           max= Math.max(max%m, newsum);
       }
       return max;
    }
}