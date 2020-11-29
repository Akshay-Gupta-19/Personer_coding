/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;


class sample1{
    sample1(){
    int x=0;
        System.out.print("");
    }
    void meth(){
        
    }
}
public class ObjTime3 {

    
    public static void main(String[] args) {
        sample1 obj;
      //obj=new sample1();System.out.println("one instance only");
        for (int i = 0; i < 500000000; i++) {
            obj=new sample1(); 
            obj.meth();
        }
    }
    
}
