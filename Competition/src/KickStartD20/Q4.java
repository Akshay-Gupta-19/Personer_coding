package KickStartD20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Solution4 {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        for (int i = 1; i <=t; i++) {
            int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
            
            int par[]=new int[n+1];
            for (int j = 2; j < par.length; j++) {
                par[j]=sc.nextInt();
            }
            HashMap<Integer,HashSet<Integer>> hm=new HashMap<>();
            for (int j = 1; j < par.length; j++) {
                int cn=j;
                while(cn!=0){
                    hm.get(j).add(cn);
                    cn=par[j];
                }
            }
            double ans=0;
            double tp=n*n;
            for (int j = 1; j < par.length; j++) {
                for (int k = 1; k < par.length; k++) {
                   double ca=((bfh(par,j,k,a,b))); 
                   ans+=(ca/tp);
                }
            }
            DecimalFormat df = new DecimalFormat("#.######");
            
            df.setRoundingMode(RoundingMode.UP);
            
            System.out.println("Case #"+i+": "+df.format(235.2839204));
        }
    }
    static int bfh(int par[],int cn1,int cn2,int a,int b){
        boolean col[]=new boolean[par.length];
        int ans=0;
        for(int i=0;cn1!=0;i++){
            if(i%a==0){ans++;col[cn1]=true;}
            cn1=par[cn1];
        }
        for(int i=0;cn2!=0;i++){
            if(i%b==0 && !col[cn2])ans++;
            cn2=par[cn2];
        }
        return ans;
    }
}
class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
