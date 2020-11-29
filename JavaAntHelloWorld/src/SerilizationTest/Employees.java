/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerilizationTest;
import java.util.*;
import java.io.*;
/**
 *
 * @author akggupta
 */

//interface having no mehods are called marker interface
public class Employees implements Serializable{
    int empId;
   transient String empName;//transient fields never gets serialized

    public Employees(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    
    }

    @Override
    public String toString() {
        return "Employees{" + "empId=" + empId + ", empName=" + empName + '}';
    }
    
}

class Main{

    public static void main(String[] args) {
        File f1=new File("D:/test/emp.ser");
        try(FileOutputStream fo=new FileOutputStream(f1);
            ObjectOutputStream oo=new ObjectOutputStream(fo);
                ){
            
                Employees obj1=new Employees(101,"lolol");
                oo.writeObject(obj1);
                System.out.println("Written");
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}