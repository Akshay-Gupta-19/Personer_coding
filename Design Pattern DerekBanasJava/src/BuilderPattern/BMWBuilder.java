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
public class BMWBuilder implements CarBuilder{
    Car buildCar;
    BMWBuilder(){
        buildCar=new Car();
    }

    @Override
    public  void specifyEngine() {
        this.buildCar.setEngine(new Engine(100,300));
    }

    @Override
    public void specifyPrice() {
        buildCar.price=10000000;
     }

    @Override
    public void specifyCapacity() {
        buildCar.capacity=2;
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
