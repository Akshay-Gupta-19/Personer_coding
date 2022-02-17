package novembereasy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author avnegers
 */
public class qn4 {
    public static void main(String[] args) {
     Main sc=new Main();
     int n=sc.nextInt(),m=sc.nextInt(),s=sc.nextInt()-1,e=sc.nextInt()-1;
        int noe=m;
        int weight[][]=new int[n][n];
        for (int i = 0; i < weight.length; i++) {
            Arrays.fill(weight[i],100000001);
        }
        for (int i = 0; i < noe; i++) {
            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;   
            int mo;
            if((mo=sc.nextInt())<weight[x][y])weight[x][y]=mo;
         }
        int ans=dej(weight,s,e,n)+dej(weight,e,s,n);
        if(ans<10000000)
            System.out.println(ans);
        else
            System.out.println(-1);
    
    }
    static int dej(int weight[][],int s,int d,int n){
     int way=0;
     int src=s;   
     int size=n;
        boolean visited[]=new boolean[size];//stores that this node is taken
        //as intermidiate or not
        visited[s]=true;
        
         for(int k=0;k<size;k++){
        //geting index of largest weight from 1    
        int l;
            for (l = 0; l < weight[k].length; l++) {
                if (visited[l]) {
                    continue;
                }
                int minway=Integer.MAX_VALUE;
                if (weight[src][l] < minway) {
                    way = k;
                    break;
                }
            }
            for (; l < weight[k].length; l++) {
                if (visited[l]) {
                    continue;
                }
                if (weight[src][l] < weight[src][way]) {
                    way = l;
                }
            }
            
                //getting the next intermidiate node
            visited[way]=true;
            //cheking old weight vs new wight
            for (int j = 0; j <size; j++) {
                if(weight[src][j]>weight[src][way]+weight[way][j])
                    weight[src][j]=weight[src][way]+weight[way][j];
            }
        }return weight[s][d];
    }
}

class Main
{
        BufferedReader br;
        StringTokenizer st;

        Main(){    br = new BufferedReader(new
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