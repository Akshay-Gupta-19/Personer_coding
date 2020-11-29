package javaanthelloworld;
import java.util.*;
public class JavaSets {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("aman");
        hs.add("vimal");
        hs.add("swapnil");
        hs.add("vimal");
        for (int i = 0; i < 10; i++) {
           hs.add(i+""); 
        }
         System.out.println(hs);
    
        TreeSet<String> ts=new TreeSet<>();
        ts.add("aman");
        ts.add("vimal");
        ts.add("swapnil");
        ts.add("vimal");
         System.out.println(ts);
    /*
         
    */
         LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("aman");
        lhs.add("vimal");
        lhs.add("swapnil");
        lhs.add("vimal");
        for (int i = 0; i < 10; i++) {
            lhs.add(i+"");
        }
        
        System.out.println(lhs);
    
    }
}
