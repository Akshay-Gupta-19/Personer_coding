package zenifitcoadsprint;
import java.util.Scanner;
import java.math.*;
public class primetarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pop[]=new int[n];
        long ans=0;
        for (int i = 0; i <n; i++) {
            pop[i]=sc.nextInt();
            for (int j = 0; j < i; j++) {
                if(isp(i-j)){ans+=(pop[i]-pop[j]);}
            }
        }
        System.out.println(ans);
    }
   static boolean isp(int n){
          if (n <= 1) {
                return false;
            }
            if (n == 2) {
                return true;
            }
            if (n % 2 == 0) {
                return false;
            }
            for (int i = 3; i <= Math.sqrt(n) + 1; i = i + 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
    }
}
