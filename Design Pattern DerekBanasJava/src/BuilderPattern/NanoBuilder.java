/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderPattern;

import java.awt.Color;

/**
 *
 * @author Akshay Gupta
 */
public class NanoBuilder implements CarBuilder{
    Car buildCar;
    NanoBuilder(){
        buildCar=new Car();
    }

    @Override
    public  void specifyEngine() {
        this.buildCar.setEngine(new Engine(10,30));
    }

    @Override
    public void specifyPrice() {
        buildCar.price=100000;
     }

    @Override
    public void specifyCapacity() {
        buildCar.capacity=4;
     }

    @Override
    public void specifyColor() {
        buildCar.color=Color.RED;
     }

    public Car getBuildCar() {
        return buildCar;
    }

    public void setBuildCar(Car buildCar) {
        this.buildCar = buildCar;
    }

    @Override
    public Car getCar() {
        return buildCar;
    }
    
    
}
