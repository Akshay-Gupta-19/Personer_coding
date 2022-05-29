/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BuilderPattern;

import java.awt.Color;

/**
 *
 * @author Akshay Gupta
 */
public interface CarBuilder {

   public void specifyEngine();

    public void specifyPrice();

    public void specifyCapacity();

    public void specifyColor();
    
    public Car getCar();

}
