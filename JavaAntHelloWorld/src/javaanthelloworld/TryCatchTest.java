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
public class TryCatchTest {
    public static void main(String[] args) {
        try{
            //open resources
            
            for (int i = 5; i >=0; i--) {
                System.out.println(1/i);   
            }
        }
        catch(Exception ex){
               System.out.println("Arth Except");
               int val=f1();
               System.out.println(val);
               return;
        }
        finally{
            System.out.println("Inside finally");
        }
        System.out.println("End of code");
        //in gernal we use finally to close the resources
        
    }
    static int f1(){
        try{
            return 1;
        }
        catch(Exception ex){
        return 2;
        }
        finally{
            System.out.println("akshay");
        }
        
    }
}
