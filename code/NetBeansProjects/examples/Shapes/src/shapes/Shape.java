/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author apprentice
 */
public abstract class Shape {

    private String color;
    
    public String getColor(){
        return color;
        
    }
    
    public void setColor(String color){
        this.color= color;
        
    }
    
    public abstract void area();
    
    public abstract void perimeter();
    
    
}
