/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author akggupta
 */
class x{
    x meth(){
        return new x();
    }
}
public class testcall {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        new x()
                .meth()
                .meth()
                .meth();
    }
    
}
