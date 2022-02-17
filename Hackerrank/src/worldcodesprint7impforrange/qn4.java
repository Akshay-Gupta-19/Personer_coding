
package worldcodesprint7impforrange;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=1000000007;
        int n=sc.nextInt();
        long arr[]=new long[n+1];
        long ans=0;
        for (int i = 1; i <= n; i++) {
            arr[i]=(arr[i-1]+sc.nextInt());
        }
        for (int i = 1; i <= n; i++) {
            int j;
            for (j=i; j <= n; j++) {
                ans=(ans+((j-i+1)*(((arr[j]-arr[i-1])*part(n-j))%m*(part(i-1)))%m)%m)%m;
            }
        }
        System.out.println(ans%m);
    }
static long part(int p)
{
    long reasult=1;p--;
    int no=2;
if(p==-1)return 1;
int opow=p;
int m=1000000007;
   if(p==1)return 2;
   while(p!=0){
       if((p&1)!=0)reasult*=no;
       reasult%=m;
       p>>=1;
       no*=no;
       no%=m;
   }
   return reasult;
}
}