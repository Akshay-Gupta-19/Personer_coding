/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
class i{
    
    i(String x){
        do System.out.println("akshya");
            while(false);
    }
}
class j extends i{
    
  
}
/**
 *
 * @author akggupta
 */class A7{
private int i = 6;
private int j = i;
public void A() {
i = 5;
}
public static void main(String[] args) {
A7 a = new A7();
System.out.println(a.i + a.j);
} }
public class CastingOnArguments {

    /**
     * @param args the command line arguments
     */
    void meth(short a){System.out.println("short");}
     void meth(int a){System.out.println("int");}
     void meth(byte a){System.out.println("byte");}
    void meth(Double a){System.out.println("Double");}
    public static void main(String[] args) {
        char b=1;
        new CastingOnArguments().meth(b);
    }
    
}
