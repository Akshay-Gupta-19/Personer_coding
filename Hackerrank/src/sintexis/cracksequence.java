package sintexis;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        int cnt=1;
        for(int j=0;j<n;j++){
            int lta=al.size();
            al.addAll(al);
            al.add(lta,++cnt);
        }
        System.out.println(al);
        System.out.println(al.get(x-1));
    }
}
