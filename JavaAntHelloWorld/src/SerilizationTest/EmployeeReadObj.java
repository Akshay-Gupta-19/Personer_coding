/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerilizationTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.*;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author akggupta
 */
public class EmployeeReadObj {
    public static void main(String[] args) {
       File f1=new File("D:/test/emp.ser");
        try(FileInputStream fo=new FileInputStream(f1);
            ObjectInputStream oo=new ObjectInputStream(fo);
                ){
               Employees obj1=(Employees)oo.readObject();
                System.out.println(obj1);
        }
        catch(IOException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeReadObj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
