/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocatraining;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author akggupta
 */
class A{Number m(){return null;
}}
class B extends A{ Long m(){return null;
}}

public class OCATraining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1=
                "hello";
        CharSequence cs;
        List al=new ArrayList<>();
        al.add("");
        System.out.println(al);
    
        String s[]={"akshay","gupta"};
        List<String> ls=Arrays.asList(s);
        //imutabl list ls.remove(0);
        System.out.println(ls);
        
        Integer a[]={12,32,53};
        List<Integer> ls2=Arrays.asList(a);
        System.out.println(a);
    
        Integer i1=-128;
        Integer i2=-128;
        System.out.println(i1==i2);
        
        System.out.println(1+2+"h");
        System.out.println("h"+1+2);
        
        StringBuilder sb=new StringBuilder();
        
        LocalDate l = new Date(98,90,90);
        l.format(DateTimeFormatter.ISO_DATE);
    }
    
}
class Ac{
    int a,b;
    final int c;
    Ac(){
        a=20;
        System.out.println("1");
        c=109;
    }
    
    int getC(){
        return c;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(a,b);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ac other = (Ac) obj;
        if (this.a != other.a) {
            return false;
        }
        if (this.b != other.b) {
            return false;
        }
        return true;
    }
    
}
