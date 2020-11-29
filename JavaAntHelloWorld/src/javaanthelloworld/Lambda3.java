package javaanthelloworld;
import java.util.*;
public class Lambda3 {
    public static void main(String[] args) {
        var a1=10;//var keyword used for making variables who will become the type based
                   //on the variable with which its being initillized
        var a2="String";
        System.out.println(doCal((a,b)->a+b, 10, 15));//this keyword here reprsent the enclosing 
                                                        //classes refrence unlike anonyms inner class
        System.out.println(doCal((a,b)->a-b, 10, 15));
        System.out.println(doCal((a,b)->a*b, 10, 15));
        System.out.println(doCal((a,b)->a/b, 10, 5));
        
    }
    static float doCal(Cal c,float a,float b){
        return c.eval(a, b);
    }
}
class sap{
    int a,b;
    void f(){
        new Lambda3().doCal(()->this.a+this.b,10,15);
    }
}

@FunctionalInterface
interface Cal{
    float eval(float a,float b);
}