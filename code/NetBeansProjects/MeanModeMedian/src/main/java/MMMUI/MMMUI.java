/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MMMUI;

import MMMDAO.MMMDAO;
import MMMIO.MMMIO;
import Numbers.Numbers;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MMMUI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MMMIO intGetter = new MMMIO();
        Numbers inputNumber = new Numbers();
        MMMDAO myMMMDAO = new MMMDAO();


        int choice = 0;
        int arrayLength = 0;
        int counter = 0;
        int newNumber = 0;
        System.out.println("Welcome to Mode, Median, Mean finder!");
        System.out.println("1. Give a file to compute");
        System.out.println("2. Give numbers to computer");
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Please list the file you'd like me to scavenge through");
            
        } else if (choice == 2) {
            arrayLength = intGetter.readInt("How many numbers?");
            ArrayList<Numbers> myList = new ArrayList<Numbers>();
            while (counter < arrayLength) {
                inputNumber = new Numbers();
                newNumber = intGetter.readInt("Give me number");
                inputNumber.setNumber(newNumber);
                myList.add(inputNumber);
                counter++;
            }

            int[] intArray = myMMMDAO.convertIntegers(myList);


            double mean = myMMMDAO.getMean(myList);
            System.out.println("The mean for the numbers given is: " + mean);
            double mode = myMMMDAO.getMode(intArray);
            System.out.println("The mode is: " + mode);
            int median = myMMMDAO.getMedian(intArray);
            System.out.println("The median is: " + median);
        }

    }
}
