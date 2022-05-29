/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommandPattern;

/**
 *
 * @author Akshay Gupta
 */
public class CalculatorUser {
    public int placeComputation(Command cmd){
        return cmd.execute();
    }
}
