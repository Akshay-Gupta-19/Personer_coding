/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactoryPattern;

/**
 *
 * @author Akshay Gupta
 */
public class MainDriver {
    public static void main(String[] args) {
        ShapeFactory polygonShapeFactory=new PolygonFactory();
        Shape traingle=polygonShapeFactory.getShape("Triangle");
        traingle.draw();
         Shape rectangle=polygonShapeFactory.getShape("Rectangle");
        rectangle.draw();
        
        ShapeFactory curveShapeFactory=new CurvesFactory();
         Shape circle=curveShapeFactory.getShape("Circle");
        circle.draw();
         Shape parabola=curveShapeFactory.getShape("Parabola");
        parabola.draw();
    }
    
}
