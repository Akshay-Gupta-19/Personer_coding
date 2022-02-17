package Strings;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class letterisland {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        int ans=0;
        ArrayList<String> al=new ArrayList<String>();
        for (int j = 0;s.length()-j-1>=2*(k-1) ; j++) {
                for (int l = j+1;s.length()-l>=(k-1+(l-j)*(k-1)) ; l++) {
                    String sub=s.substring(j, l);
                if(!al.contains(sub))
                {if(noi(s.substring(l),sub,k-1))ans++;al.add(sub);}
                 }
            }
            System.out.println(ans);
    }
   static boolean noi(String s,String s2,int k){
       int land=0;
       int app=s.indexOf(s2),appp=0;//appp is app previous one
       if(app==-1){
           if(k==0)return true;
           else return false;
       }
       if(app!=0)land++;
       int slen=s.length();
       while(app!=-1){
           appp=app;
           app=s.indexOf(s2,app+1);
           if(appp+s2.length()<app&&app!=-1)land++;
           if(land>k)return false;
           if(s.length()-app<(k-land)*(s2.length())+(k-land+1))return false;
       }
      if(k==land)return true;
       return false;
   }
}
