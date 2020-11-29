package UniversitySprint4;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
   class Pair implements Comparable<Pair>{
         double a; int b;

        public Pair(double a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Pair o) {
                if(a==o.a)return 0;
                return a-o.a>0 ? 1 : -1;
        }  
     }
 class Solution {


    /*
     * Complete the function below.
     */
  
    static long maximumPackages(double[] S, int[] K, int[] R, int[] C) {
        Pair box[]=new Pair[S.length];
        Pair cyl[]=new Pair[R.length];
        for (int i = 0; i < S.length; i++) {
            box[i]=new Pair(S[i],K[i]);
        }
        Arrays.sort(box);
        for (int i = 0; i < box.length; i++) {
            S[i]=box[i].a;
            K[i]=box[i].b;
        }
        for (int i = 0; i < cyl.length; i++) {
           cyl[i]=new Pair(R[i],C[i]); 
        }
        Arrays.sort(cyl);
        for (int i = 0; i < cyl.length; i++) {
           R[i]=(int)cyl[i].a;
           C[i]=cyl[i].b;
        }
        long ans=0;
         for (int i = 0,j=0; i < S.length;) {
             if(j>=R.length)break;
            if(S[i]<R[j]){
                if(K[i]<C[j]){
                    C[j]-=K[i];
                    ans+=K[i];
                    i++;
                }
                else if(K[i]==C[j]){
                    ans+=C[j];
                    C[j]=K[i]=0;
                    i++;j++;
                }
                else{
                    K[i]-=C[j];
                    ans+=C[j];
                    j++;
                }
            }else{
                i++;
            }
            
        }
         return ans;
    }


    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      int n=sc.nextInt(),m=sc.nextInt();
      double S[]=new double[n];
      int K[]=new int[n];
      int R[]=new int[m];
      int C[]=new int[m];
        for (int i = 0; i < S.length; i++) {
            S[i]=sc.nextInt();
            S[i]=(Math.sqrt(2)*S[i]);
        }
        for (int i = 0; i < K.length; i++) {
            K[i]=sc.nextInt();
            
        }
        for (int i = 0; i < C.length; i++) {
           R[i]=sc.nextInt(); 
           R[i]=2*R[i];
        }
        for (int i = 0; i < C.length; i++) {
           C[i]=sc.nextInt(); 
        }
        System.out.println(maximumPackages(S, K, R, C));
    }
}