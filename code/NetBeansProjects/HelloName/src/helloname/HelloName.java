/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloname;

/**
 *
 * @author apprentice
 */
public class HelloName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msg;
        String name = "Eric";
        msg = helloName(name);
        System.out.println(msg);
        
        name = "Jeff";
        msg= helloName(name);
        System.out.println(msg);
               
    }
    public static String helloName(String name){
        return "Hello " + name + "!";
    }
}
