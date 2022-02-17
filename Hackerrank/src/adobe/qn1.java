package adobe;

import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a1=0;
        int ans=100000000;
        int i;
        for(i=0;i<n;i++){
            int cv=sc.nextInt();
            if(cv==1){
            a1=i-1;
                break;
            }
        }
        for(i++;i<n;i++){
            int aans=0;
            int cv=sc.nextInt();
            if(cv==1){
                aans=(a1+1)+((i-a1-1)*k);
                a1=cv;
                if(aans<ans)ans=aans;
            }
        }
        System.out.println(ans);
    }
}