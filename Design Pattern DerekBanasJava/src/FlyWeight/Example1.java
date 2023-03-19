/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlyWeight;

import java.awt.Color;
import java.util.*;
/**
 *
 * @author Akshay Gupta
 */

//Similar to singlton and factory, to create 1000s of simlar classes
public class Example1 {
    public static void main(String[] args) {
        CarFactory carFactory=new CarFactory();
        for (int i = 0; i < 10000; i++) {
             carFactory.getColoredCar(new Color(new Random().nextInt(255)));
        }
        System.out.println("Objects created" + ColoredCar.cnt);
    }
}

class CarFactory{
    HashMap<Color,Car> preBuild;

    public CarFactory() {
        preBuild=new HashMap<>();
    }
    
    Car getColoredCar(Color requestedColor){
        if(!preBuild.containsKey(requestedColor)){
            preBuild.put(requestedColor, new ColoredCar(requestedColor));
        }
        return preBuild.get(requestedColor);
    }
}
interface Car{
    Color getColor();
}
class ColoredCar implements Car{
    
    Color color;
    static int cnt;
    public ColoredCar(Color color) {
        this.color = color;
        cnt++;
    }
    
    @Override
    public Color getColor(){
       return this.color;
    }
}