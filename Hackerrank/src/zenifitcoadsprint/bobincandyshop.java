package zenifitcoadsprint;


import java.util.Scanner;

public class bobincandyshop {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        System.out.println(ans(n));
    }
 static int ans(int n){
   int ans;
     if(n==1)return 1;
   else {
     ans=ans(n-1);
    if(n%2==0)
           ;
    if(n%5==0)
           ans++;
    if(n%10==0)
           ans++;
    if(n%20==0)
           ans++;
    if(n%50==0)
           ans++;
    if(n%100==0)
           ans++;
   }
   return ans;
 }
}
