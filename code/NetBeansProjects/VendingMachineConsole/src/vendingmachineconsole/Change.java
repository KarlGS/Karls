/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachineconsole;

/**
 *
 * @author apprentice
 */
public class Change {
    private int quarters = 0;
    private int dimes = 0;
    private int nickels=0;
    private int pennies = 0;
    private int changeAmount = 0;
   
    public Change(int penniesIn){
        changeAmount= penniesIn;
        quarters = penniesIn / 25;
        penniesIn = penniesIn % 25;
        dimes = penniesIn / 10;
        penniesIn = penniesIn % 10;
        nickels = penniesIn / 5;
        penniesIn = penniesIn%5;
        pennies = penniesIn;
    
    
    
    
    }
    
    
    public Change(float changeIn){
        this((int)(changeIn*100));
        
    }
    
    public int getQuarters() {
        return quarters;
    }

    public int getDimes() {
        return dimes;
    }

    public int getNickels() {
        return nickels;
    }

    public int getPennies() {
        return pennies;
    }
    
    public float getChangeAmount(){
        return ((float) changeAmount)/ 100.0f;
    }
    
}
