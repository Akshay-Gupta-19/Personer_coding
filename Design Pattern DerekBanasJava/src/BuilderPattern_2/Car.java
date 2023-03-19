/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderPattern_2;

import java.awt.Color;

/**
 *
 * @author Akshay Gupta
 */
public class Car {
    public Engine engine;
    public int price;
    public int capacity;
    public Color color;

    public Engine getEngine() {
        return engine;
    }

    protected void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Color getColor() {
        return color;
    }

    protected void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "engine=" + engine + ", price=" + price + ", capacity=" + capacity + ", color=" + color + '}';
    }
    
    
}
