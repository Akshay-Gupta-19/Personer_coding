package javaanthelloworld;
import java.util.*;
public class JavaMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"akshay");
        hm.put(2,"naman");
        hm.put(3,"shiva");
        for (int i = 0; i < 10; i++) {
            hm.put(i,"abc"+i);
        }
        hm.put(2,"karan");
        System.out.println(hm);
        Collection<String> vals=hm.values();
        System.out.println("Values");
        for(String val:vals)System.out.print(val+" ");
        Set<Integer> ks=hm.keySet();
        System.out.println("");
        System.out.println("Keys");
        for(Integer kes:ks){System.out.println(kes);}
        Set<Map.Entry<Integer,String>> data=hm.entrySet();
        System.out.println("Data");
        for(Map.Entry<Integer,String> ad:data){System.out.println(ad);}
        Set<Map.Entry<Integer,String>> ss=hm.entrySet();
        
    }
    
}
