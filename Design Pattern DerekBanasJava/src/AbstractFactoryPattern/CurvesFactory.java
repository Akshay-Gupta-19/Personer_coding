/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactoryPattern;

/**
 *
 * @author Akshay Gupta
 */
public class CurvesFactory extends ShapeFactory {

    @Override
    Curves getShape(String shapeName) {
        switch (shapeName) {
            case "Circle" -> {
                return new Circle();
            }
            case "Parabola" -> {
                return new Parabola();
            }
        }
        return null;
    }

}
