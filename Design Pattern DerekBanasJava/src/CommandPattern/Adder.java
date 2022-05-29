/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommandPattern;

/**
 *
 * @author Akshay Gupta
 */ 
public class Adder implements Command{
    private Calculator tempCalc;

    public Adder(Calculator tempCalc) {
        this.tempCalc = tempCalc;
    }

    @Override
    public int execute() {
        return tempCalc.add();
    }
    
}
