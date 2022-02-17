package Agust_Circuits;

import java.util.Scanner;

class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int ans=-1;
            for (int j = 0; j < n; j++) {
                int in=sc.nextInt();
                if(in>ans && isprime(in))ans=in;
            }
            if(ans!=-1)System.out.println(ans*ans);
            else System.out.println(-1);
        }
    }
    static boolean isprime(int x){
        if(x==2)return true;
        if(x%2==0)return false;
        if(x==1)return false;
        for (int i = 3; i*i <= x; i+=2) {
            if(x%i==0)return false;
        }
        return true;
    }
}
