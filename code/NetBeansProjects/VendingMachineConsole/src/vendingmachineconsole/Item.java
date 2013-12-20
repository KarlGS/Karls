/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachineconsole;

/**
 *
 * @author apprentice
 */
public class Item {
    private String name;
    private float price;
    private int inventory;
    
    
    public Item(String name, float price, int inventory){
        this.name=name;
        this.price=price;
        this.inventory= inventory;
        
        
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
    
    public int getInventory(){
        return inventory;
    }
    public int setInventory(){
        return inventory;
    }
}
