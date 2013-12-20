/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author apprentice
 */
public class Item {
    private String name;
    private float price;
    
    public Item(String name, float price){
        this.name=name;
        this.price=price;
        
        
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
    
}
