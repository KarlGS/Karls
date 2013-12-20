/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalcreloaded;

/**
 *
 * @author apprentice
 */
public class SimpleCalcReloaded {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConsoleIO con = new ConsoleIO();
        Calculator calc = new Calculator();
        boolean keepGoing = true;
        String mainMenu = "Please enter an operation: \n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Quit";
        int a =0;
        int b =0;
        int command = 0;
        do {
             command = con.readInt(mainMenu, 1, 5);
        
             switch (command){
                 case 1:
                     con.print("Add");
                     a=con.readInt("Please enter first number to add:");
                     b=con.readInt("Please enter second number to add:");
                     con.print("Sum = "+ calc.add(a, b));
                     break;
                 case 2:
                     con.print("Subtract");
                     a=con.readInt("Please enter first number to add:");
                     b=con.readInt("Please enter second number to add:");
                     con.print("Difference = "+ calc.subtract(a, b));                     
                     break;
                 case 3: 
                     con.print("Multiply");
                     a=con.readInt("Please enter first number to add:");
                     b=con.readInt("Please enter second number to add:");
                     con.print("Product = "+ calc.multiply(a, b));
                     break;
                 case 4:
                     con.print("Divide");
                     a=con.readInt("Please enter first number to add:");
                     b=con.readInt("Please enter second number to add:");
                     con.print("Quotient = "+ calc.divide(a, b));                    
                     break;
                 case 5:
                     con.print("Thank you for using Simple Calc");
                     keepGoing=false;
                     break;
                 default:
                     con.print("Unknown");
                     break;
             }
             
        
        } while (keepGoing);
    }
}
