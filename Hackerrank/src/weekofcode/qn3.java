package weekofcode;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;
public class qn3 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long factlist[]={1,2,6,24,120,720,5040,40320,362880,3628800,39916800,479001600,6227020800l,87178291200l,1307674368000l,20922789888000l,355687428096000l};
       int p=sc.nextInt();
       int arr[]=new int[100];
        System.out.println(qn3.class);
        for (int i = 0; i < p; i++) {
              arr[sc.nextInt()]++;
        }
        long fact=factlist[p-1];
        for (int i = 0; i < arr.length; i++) 
           if(arr[i]>1)
               fact/=factlist[arr[i]-1];        
        
        
        float ans=0;
        float temp=1/fact;
        float mul=1-(1/fact);
        for (int i = 1; i*temp>=0.0000001; i++) {
            ans+=i*temp;
            temp*=mul;
        }
        ans*=1000000;
        ans=Math.round(ans);
        System.out.printf("%.6f\n",ans/1000000);
    }    
}

//5
//12 65 34 23 89 54 63 23 40 69 89 89 89
