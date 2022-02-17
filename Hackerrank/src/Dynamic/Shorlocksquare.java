import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution1 {

    public static void main(String[] args) {
        int t;
      Scanner sc=new Scanner(System.in);
      t=sc.nextInt();
        for(int i=0;i<t;i++){
            int ans=0;
            int a=(int) Math.ceil(Math.sqrt(sc.nextInt()));
            int b=(int) Math.ceil(Math.sqrt(sc.nextInt())); 
            System.out.println(b-a+1);
        }
    }
}