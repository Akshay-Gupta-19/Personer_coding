/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactoryPattern;

/**
 *
 * @author Akshay Gupta
 */
public class PolygonFactory extends ShapeFactory {

    @Override
    Polygons getShape(String shapeName) {
        switch (shapeName) {
            case "Triangle" -> {
                return new Triangle();
            }
            case "Rectangle" -> {
                return new Rectangle();
            }
        }
        return null;
    }

}
