package Alecrithiring;


import java.util.HashSet;
import java.util.Scanner;

class solve{
    public static void main(String[] args) {
   int n;
   Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
   HashSet<String> hs=new HashSet<>();
   sc.nextLine();
        for (int j = 0; j <n; j++) {
            String s=sc.nextLine();
            hs.add(s.substring(0,s.indexOf("=")).trim());
        }
        System.out.println(hs.size());
}
}