
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
 class qn3 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        boolean isp[]=new boolean[1000001];
        for (int i = 1; i < isp.length; i++) {
            isp[i]=isprime(i);
        }
        for (int i = 0; i < t; i++) {
           int l=sc.nextInt();
           int r=sc.nextInt();
           int ans=0;
            for (int j = l; j <= r; j++) {
                if(!isp[j])ans++;
            }
            System.out.println(ans);
        }
    }
   static boolean isprime(int n){
      if (n <= 1)  return false;
    if (n <= 3)  return true;
 
    // This is checked so that we can skip 
    // middle five numbers in below loop
    if (n%2 == 0 || n%3 == 0) return false;
 
    for (int i=5; i*i<=n; i=i+6)
        if (n%i == 0 || n%(i+2) == 0)
           return false;
 
    return true;
   }
}
