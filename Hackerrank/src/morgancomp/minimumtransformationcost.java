package morgancomp;

import java.util.Scanner;

public class minimumtransformationcost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i<t; i++) {
            int ans=0;
            String x=sc.next();
            String u=sc.next();
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            int nodc=cnt(x,u);       //no of different charector
           // System.out.println("nod"+nodc);
            int xlen=x.length(),ulen=u.length();
            if(xlen>ulen)
                ans+=a*(xlen-ulen);
            else if(ulen>xlen)ans+=b*(ulen-xlen);
            if(a+b<c)ans+=(nodc-Math.abs(ulen-xlen))*(a+b);
            else ans+=(nodc-Math.abs(ulen-xlen))*c;
            System.out.println(ans);
        }
    }
    static int cnt(String x,String y){//count no of different charector
        int ch[]=new int[27];
        int ans=0;
        int xlen=x.length(),ylen=y.length();
        for (int i = 0; i < xlen; i++) {
            ch[x.charAt(i)-'a']++;
        }
        for (int i = 0; i < ylen; i++) {
            ch[y.charAt(i)-'a']--;
        }
        for (int i = 0; i < ch.length; i++) {
           if(ch[i]!=0)ans+=Math.abs(ch[i]); 
        }
        return (ans+Math.abs(xlen-ylen))/2;
    }
}
