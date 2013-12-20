/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import sun.awt.image.ImageWatched.Link;

/**
 *
 * @author apprentice
 */
public class Rectangle extends Shape {
private int length;
private int height;

    @Override
    public void area() {
       System.out.println(length*height);
         Link haha = new Link();
         
    }

    @Override
    public void perimeter() {
        System.out.println((length*2)+(height*2));

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
}
