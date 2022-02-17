package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class biggerisgreater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        test:      for (int i = 0; i < t; i++) {
            String thestr=sc.next();
            ArrayList<Character> al=new ArrayList<Character>();
            for (int j = thestr.length()-1; j >=0 ; j--) {
                for (int k = 0; k < al.size(); k++) {
                    if(al.get(k)>thestr.charAt(j)){
                        al.add(thestr.charAt(j));
                        System.out.println(thestr.substring(0, j)+al.remove(k)+min(al));continue test;
                    }
                }
                al.add(thestr.charAt(j));
            }
            System.out.println("no answer");
        }
    }
    static String min(ArrayList<Character> al){
         int count[]=new int[27];
         String ans="";
         for (int i = 0; i < al.size(); i++) {
            count[al.get(i)-'a']++;
        }
         for (int i = 0; i < count.length; i++) {
             for (int j = 0; j < count[i]; j++) {
                 ans+=(char)(i+'a');
             }
        }
         return ans;
    }
}
