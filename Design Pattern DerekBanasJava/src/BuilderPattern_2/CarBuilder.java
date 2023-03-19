/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BuilderPattern_2;

import java.awt.Color;

/**
 *
 * @author Akshay Gupta
 */
public class CarBuilder {
   private Car buildedCar;
   CarBuilder(){
       this.buildedCar=new Car();
   }
   public CarBuilder specifyEngine(Engine engine){
       this.buildedCar.setEngine(engine);
       return this;
   }

    public CarBuilder specifyPrice(int price){
        this.buildedCar.setPrice(price);
       return this;
    }

    public CarBuilder specifyCapacity(int capacity){
        this.buildedCar.setCapacity(capacity);
       return this;
    }

    public CarBuilder specifyColor(Color color){
        this.buildedCar.setColor(color);
       return this;
    }
    
    public Car getCar(){
       return this.buildedCar;
    }

}
