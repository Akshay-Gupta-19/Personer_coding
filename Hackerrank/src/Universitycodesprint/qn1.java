package Universitycodesprint;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 class qn1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fv=sc.nextInt();
        int max=fv,min=fv;
        int maxc=0,minc=0;
        for(int score_i=1; score_i < n; score_i++){
            int cs=sc.nextInt();
            if(cs>max){maxc++;max=cs;}
            else if(cs<min){minc++;min=cs;}
        }
        System.out.println(maxc+" "+minc);
    }
}
