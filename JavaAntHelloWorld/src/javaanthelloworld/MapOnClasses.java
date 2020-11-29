/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaanthelloworld;

/**
 *
 * @author akggupta
 */
import java.util.*;
class Emp implements Comparable<Emp>{
    int empNo;
    String name;
    String email;

    public Emp(int empNo, String name, String email) {
        this.empNo = empNo;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Emp{" + "empNo=" + empNo + ", name=" + name + ", email=" + email + "}\n";
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(empNo,name);}
//**************************************************
    //**************Important **********************
//**************************************************
//equals method is called only when hash code is equal
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
        final Emp other = (Emp) obj;
        return this.empNo == other.empNo;
    }

    @Override
    public int compareTo(Emp e) {
        return email.compareTo(e.email);
    }
    
}
public class MapOnClasses {
    public static void main(String[] args) {
        Emp e1=new Emp(101,"Akshay","aks@oracle.com");
        Emp e2=new Emp(101,"Akshay","aks@oracle.com");
        Emp e3=new Emp(101,"Akshay","aks@oracle.com");
        Emp e4=new Emp(103,"basd","fdfe@oracle.com");
        Emp e5=new Emp(106,"fde","kitg@oracle.com");
        System.out.println(e1.equals(e2));
        HashSet<Emp> hs=new HashSet<>();
        hs.add(e1);hs.add(e2);hs.add(e3);hs.add(e4);hs.add(e5);
        
        Emp e6=e1;
        System.out.println(e6.equals(e1));
        System.out.println(hs);
        //for collision hash uses linked list
    
        System.out.println("Trees");
        TreeSet<Emp> ts=new TreeSet<>();
        ts.add(e1);ts.add(e2);ts.add(e4);ts.add(e5);
        System.out.println(ts);
    }
}
