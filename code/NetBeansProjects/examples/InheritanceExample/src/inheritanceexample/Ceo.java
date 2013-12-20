/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

/**
 *
 * @author apprentice
 */
public class Ceo extends Manager{
    
    public Ceo(String nameIn, String ssnIn){
        // This calls the Manager constructor, which then calls the 
        // Employee constructor
        super(nameIn,ssnIn);
        System.out.println("Ceo: Constructor(String, String,");
    }
    
    public void acquireCompany(){
        System.out.println("Ceo: acquireCompany");
    }
    
    @Override
    public void createObjectives(){
        super.createObjectives();
        name = "foo";
        System.out.println("Ceo: createObjectives()"); 
    }
}
