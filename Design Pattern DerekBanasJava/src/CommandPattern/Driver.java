/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Akshay Gupta
 */
public class Driver {
    public static void main(String[] args) {
        
        List<Integer> number=List.of(5,2,5);
        Calculator mycalc=new Calculator(number);
         Command add=new Adder(mycalc);
        Command mul=new Mul(mycalc);
        CalculatorUser user=new CalculatorUser();
        System.out.println(user.placeComputation(add));
        System.out.println(user.placeComputation(mul));
    }
}
