
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BuilderPattern_2;


/**
 *
 * @author Akshay Gupta
 */
public class Engine {
    int power,price;

    public Engine(int power, int price) {
        this.power = power;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Engine{" + "power=" + power + ", price=" + price + '}';
    }
    
    
}
