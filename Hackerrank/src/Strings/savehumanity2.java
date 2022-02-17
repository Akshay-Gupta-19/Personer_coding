package Strings;

import java.util.*;
import java.io.*;
 class SaveHumanity2 {
    public static void main(String[] args) {
        Main1 sc=new Main1();
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            char p[]=sc.next().toCharArray();
            char v[]=sc.next().toCharArray();
            boolean m=false;
            for (int j = 0; j <= p.length-v.length; j++) {
                if(eq(p,v,j)){
                    System.out.print(j+" ");
                    m=true;
                }
            }
            if(!m){System.out.println("No Match!");continue;}
            System.out.println("");
        }
    }
    static boolean eq(char x[],char y[],int si){
        int i,j;
        for ( i = si,j=0; j<y.length&&x[i]==y[j]; i++,j++);
        for (i++,j++; j<y.length; i++,j++){if(x[i]!=y[j])return false;}
        return true;
    }
}

class Main1
{
        BufferedReader br;
        StringTokenizer st;

        Main1(){    br = new BufferedReader(new
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
    
}