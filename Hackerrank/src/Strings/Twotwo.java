package Strings;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import java.awt.AWTEventMulticaster;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Twotwo {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s=sc.next();
            int slen=s.length();
            int ans=0;
            for (int j = slen; j >0 ; j--) {
                if(!(s.charAt(j-1)=='2'||s.charAt(j-1)=='4'||s.charAt(j-1)=='8'||s.charAt(j-1)=='6'))continue;
                if(s.charAt(i)=='1'){ans++;continue;}
                for (int k = j-1; k >=0 && j-k<241; k--) {
                    if(s.charAt(k)=='0')continue;
                    if(check(new BigInteger(s.substring(k, j))))ans++;
                }
            }
            System.out.println(ans);
        }
    }
     static boolean check(BigInteger b){
         BigInteger two=new BigInteger("2");
         for (; b.mod(two).equals(BigInteger.ZERO); b=b.divide(two));
         if(b.equals(BigInteger.ONE))return true;
         else return false;
     }
}
