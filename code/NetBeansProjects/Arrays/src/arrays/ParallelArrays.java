/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ParallelArrays {
    public static void main(String[] args) {
    double[] avg= {99.5,78.5,95.6,96.8,82.7};
    String[] names={"Mitchell","Ortiz","Luu","Zimmerman","Brooks"};
    int[] id={123456,813225,823669,307760,827131};
    Scanner sc=new Scanner(System.in);
    int find;
    System.out.println("Values: ");
    
    for(int i=0;i<5;i++){
    System.out.println("\t"+names[i]+" "+avg[i]+" "+id[i]);
    }
    
    
    System.out.println("\nID number to find: ");    
    find=sc.nextInt();
    
    for(int i=0;i<5;i++){
        if(find==id[i]){
        System.out.println("Name: "+names[i]);
        System.out.println("Average: "+avg[i]);
        System.out.println("ID: "+ id[i]);
    }
    }}}

