/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author apprentice
 */
public class ShapesMain {
     public static void main(String[] args){
        Rectangle rec = new Rectangle();
        Circle crc = new Circle();
        Triangle tri = new Triangle();
        Shape a = new Triangle();
        
        
     
        rec.setLength(4);
        rec.setColor("Brown");
        rec.setHeight(8);
        rec.area();
        rec.perimeter();
        System.out.println(rec.getColor());
        
        crc.setColor("Blue");
        crc.setRadius(6);
        crc.area();
        crc.perimeter();
        System.out.println(crc.getColor());
        
        tri.setBase(10);
        tri.setSide2(5);
        tri.setSide3(5);
        tri.setHeight(9);
        tri.setColor("Turqoise");
        tri.area();
        tri.perimeter();    
        System.out.println(tri.getColor());
    }
}
