import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
      String s=new Scanner(System.in).next();
        int cnt[]=new int[27];
        int i;
        for(i=0;i<s.length();i++){
            cnt[s.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(cnt));
        int x=0,y,j;
        for (j = 0; j < cnt.length; j++) {
            if(cnt[j]!=0){x=cnt[j];break;}
        }
        for (j++; j < cnt.length; j++) {
            if(cnt[j]!=0&&cnt[j]!=x){break;}
        }
        for ( j++; j < cnt.length; j++) {
            if(cnt[j]!=0&&cnt[j]!=x){System.out.println("NO");return;}
        }
        System.out.println("YES");
    }
}