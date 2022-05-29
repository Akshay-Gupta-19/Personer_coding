/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommandPattern;

/**
 *
 * @author Akshay Gupta
 */ 
public class Mul implements Command{
    private Calculator tempCalc;

    public Mul(Calculator tempCalc) {
        this.tempCalc = tempCalc;
    }

    @Override
    public int execute() {
        return tempCalc.mul();
    }
    
}
