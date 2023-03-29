/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeetCode1;
import java.util.*;
/**
 *
 * @author Akshay Gupta
 */
public class ConvertBigBracketToMedium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String orignal=sc.next();
        orignal=orignal.replaceAll("\\[", "{");
        orignal = orignal.replaceAll("\\]", "}");
        System.out.println(orignal);
    }
}
