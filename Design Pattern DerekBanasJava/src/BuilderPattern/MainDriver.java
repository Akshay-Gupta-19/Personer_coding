/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderPattern;

/**
 *
 * @author Akshay Gupta
 */
public class MainDriver {
    public static void main(String[] args) {
        CarBuilder nanoBuilding=new NanoBuilder();
        CarBuilder bmwBuilding=new BMWBuilder();
        Car nano=buildSpecificCar(nanoBuilding);
        Car bmw=buildSpecificCar(bmwBuilding);
        System.out.println(nano+" \n"+bmw);
    }
   static Car buildSpecificCar(CarBuilder builder){
        builder.specifyCapacity();
        builder.specifyColor();
        builder.specifyEngine();
        builder.specifyPrice();
        return builder.getCar();
    }
}
