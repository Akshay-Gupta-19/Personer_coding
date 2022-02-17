
import java.util.Scanner;

public class MorganAndString {
    public static void main(String[] args) {
   int t;
   Scanner sc=new Scanner(System.in);
   t=sc.nextInt();     
   for (int i = 0; i < t; i++) {
            String a=sc.next();
            String b=sc.next();
            String ans="";
            int alen=a.length();
            int blen=b.length();
            boolean big=alen<blen?true:false;
            for (int j = 0; j <(big?alen:blen) ; ) {
               boolean t1=false;
                if(a.charAt(0)<b.charAt(0)){
                    ans+=a.charAt(0);
                    t1=true;
                    if(big)j++;
                } 
               else if(a.charAt(0)>=b.charAt(0)){
                    ans+=b.charAt(0);
                    if(!big)j++;
                }
                if(t1)a=a.substring(1);
                else b=b.substring(1);
       //          System.out.println(a+" "+b+" "+ans);
            }
            if(big)ans=ans+b;
            else ans=ans+a;
            System.out.println(ans);
        }
}
}
