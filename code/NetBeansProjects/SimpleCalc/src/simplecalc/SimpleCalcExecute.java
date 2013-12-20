/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalc;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SimpleCalcExecute {
    public static void main(String[] args){
        String operator;
        double first;
        double second;
        int result;
        
        Console myConsole=new Console();
        Scanner sc= new Scanner(System.in);
       
        operator=myConsole.getString();
        
        first=myConsole.rightInt();
        second=myConsole.rightInt();
        SimpleCalc calc = new SimpleCalc();
        
        if(operator.equals("add")){
          result=(int) calc.add(first, second);
        }else if(operator.equals("substract")){
          result= (int)calc.subtract(first, second);
        }else if(operator.equals("multiply")){
          result=(int)calc.multiply(first, second);
        }else{
          result=(int)calc.division(first, second);
        }
        myConsole.printString(result);
       }
}
