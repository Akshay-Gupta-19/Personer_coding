/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CompileRunJavaProgram {

    public static void main(String[] args) {
        try {
            System.out.println("**********");
            runProcess("javac -cp src C:\\Users\\akggupta\\Documents\\NetBeansProjects\\JavaApplication2\\src\\javaapplication2\\Test.java");
            System.out.println("**********");
            runProcess("java");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    private static void printLines(String cmd, InputStream ins) throws Exception {
        String line = null;
        BufferedReader in = new BufferedReader(
            new InputStreamReader(ins));
        while ((line = in.readLine()) != null) {
            System.out.println(cmd + " " + line);
        }
      }

      private static void runProcess(String command) throws Exception {
        Process pro = Runtime.getRuntime().exec(command);
        printLines(command + " stdout:", pro.getInputStream());
        printLines(command + " stderr:", pro.getErrorStream());
        pro.waitFor();
        System.out.println(command + " exitValue() " + pro.exitValue());
      }

}