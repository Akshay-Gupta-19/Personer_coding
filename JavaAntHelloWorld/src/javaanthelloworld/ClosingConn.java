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
public class ClosingConn {
    public static void main(String[] args) {
        try(DBConn db=new DBConn()){
            System.out.println("Connection opened");
            
        }
        
        System.out.println("End of try");
    }
    
}
class DBConn implements AutoCloseable{

    @Override
    public void close(){
        System.out.println("Conn closed autometically");
    }
}