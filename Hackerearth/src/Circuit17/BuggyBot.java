/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circuit17;
import java.io.*;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class BuggyBot {
    public static void main(String[] args) {
        FastInput3 sc=new FastInput3();
        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
        HashMap<Integer,HashSet<Integer>> hm=new HashMap<>();
        for (int i = 1; i <= n; i++) {
            hm.put(i, new HashSet<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int src=sc.nextInt();
            int des=sc.nextInt();
            hm.get(src).add(des);
        }
        int instr[][]=new int[k][2];
        for (int i = 0; i < instr.length; i++) {
           instr[i][0]=sc.nextInt();
           instr[i][1]=sc.nextInt(); 
        }
        HashSet<Integer> dy[][]=new HashSet[n+1][k+1];
        HashSet<Integer> dy2[][]=new HashSet[n+1][k+1];
        HashSet<Integer> ans=recSol(hm, instr, 1, 0,dy);
        System.out.println(ans.size());
        for(int cl:ans){
            System.out.print(cl+" ");
        }
    }
    //add bug at start end and no bug
    static HashSet<Integer> recSol(HashMap<Integer,HashSet<Integer>> hm,int instr[][],int cl,int ci,HashSet dy[][]){//current location and instr bugremain or not
        if(dy[cl][ci]!=null)return dy[cl][ci];
        if(ci>=instr.length){
            HashSet<Integer> hs=new HashSet<>();
            hs.add(cl);
            hs.addAll(hm.get(cl));
            dy[cl][ci]=hs;
            return hs;
        }
        HashSet<Integer> hs=new HashSet<>();
        for (int des:hm.get(cl))
            //if(des!=instr[ci][1] || instr[ci][0]!=cl)
                hs.add(OneWay(hm, instr, des, ci));
        if(hm.get(cl).contains(instr[ci][1]) && instr[ci][0]==cl)
            hs.addAll(recSol(hm, instr, instr[ci][1], ci+1,dy));
        else
            hs.addAll(recSol(hm, instr, cl, ci+1,dy));    
        dy[cl][ci]=hs;
        return hs;
    }
    static int dy2[][];
    static int OneWay(HashMap<Integer,HashSet<Integer>> hm,int instr[][],int cl,int ci){//current location and instr bugremain or not
        if(dy2[cl][ci]!=0)return dy2[cl][ci];
        for (int i = ci; i < instr.length; i++) {
            if(cl==instr[i][0])
                cl=instr[i][1];
        }
        dy2[cl][ci]=cl;
        return cl;
    }    
}

class FastInput3
{
        BufferedReader br;
        StringTokenizer st;

        FastInput3(){    br = new BufferedReader(new
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