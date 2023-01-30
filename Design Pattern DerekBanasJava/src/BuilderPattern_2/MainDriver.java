/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderPattern_2;

import BuilderPattern.*;

/**
 *
 * @author Akshay Gupta
 */
public class MainDriver {
    public static void main(String[] args) {
        CarBuilder carBuilder=new CarBuilder();
        BuilderPattern_2.Car car = carBuilder.specifyCapacity(100).specifyPrice(100000).getCar();
        System.out.println(car);
    }
  
}
