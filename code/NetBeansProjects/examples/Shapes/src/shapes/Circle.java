/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author apprentice
 */
public class Circle extends Shape{
private int radius;

    @Override
    public void area() {
        System.out.println(radius*radius*(Math.PI));
        
    }

    @Override
    public void perimeter() {
        System.out.println(2*(Math.PI)*radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    
}
