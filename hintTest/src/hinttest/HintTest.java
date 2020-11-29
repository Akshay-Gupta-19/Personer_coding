/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinttest;

/**
 *
 * @author akggupta
 */
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.*;

public class HintTest {

    /**
     * @param args the command line arguments
     */
    static void f(String s){}
    public static void main(String[] args) {
        // TODO code application logic here
        Integer a[] = new Integer[10];
        int y=10;
        int z=new Integer(10);
       ArrayList al=new ArrayList();
   
       
        //String s="abc"+"def"+"\n"+"efg";
        int x = switch (y) {
            default:
                yield 10;
        };
        String s="";
            System.out.println(s + " " + x);
    }
}
//new line at the end
                    class Test {
                         public static void main(String[] args) {
                             assert args[0].equals("{\n"+"  int i=10;\n"+"}");
                         }
                     }
//new line at the end
class Test1 {
                         public static void main(String[] args) {
                             assert args[0].equals("{\n"+"  int i=10;\n"+"}\n\n");
                         }
                     }

  class Test3 {
                         public static void main(String[] args) {
                             assert args[0].equals("{\n"+"  int i=10;\n"+"}");
                         }
                     }

 class YieldTest {
                        private int map(int i) {
                            return switch (i) { default -> { yield 0; } };
                        }
                    }