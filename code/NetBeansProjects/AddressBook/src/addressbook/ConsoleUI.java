/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author apprentice
 */
public class ConsoleUI {
   public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int choice;
           int runAgain=1;
           AddressBook myAddressBook= new AddressBook();
           Address currentAddress = new Address();
           try{
               myAddressBook.loadAddy();
           }catch(FileNotFoundException ex){
               System.out.println("That didn't work.Later!");
               System.exit(1);
           }
           System.out.println("Initial Menu: ");
           while(runAgain==1){
           System.out.println("\t1. Add Address");
           System.out.println("\t2. Delete Address");
           System.out.println("\t3. List Address Count");
           System.out.println("\t4. List All Addresses");
           System.out.println("\t5. Search for an Address");
           choice=sc.nextInt();
           sc.nextLine();
           if(choice ==1){
          
           System.out.println("Please enter first name");
           currentAddress.setFirstName(sc.nextLine());
           System.out.println("Please enter last name");
           currentAddress.setLastName(sc.nextLine());
           System.out.println("Please enter street address");
           currentAddress.setStreet(sc.nextLine());
           System.out.println("Please enter city");
           currentAddress.setCity(sc.nextLine());
           System.out.println("Please enter state");
           currentAddress.setState(sc.nextLine());
           System.out.println("Please enter zip");
           currentAddress.setZip(sc.nextLine());
           myAddressBook.addAddy(currentAddress);
           }
           
           else if(choice==2){
               System.out.println("Please enter the Last Name of the entry you would like to delete");
               myAddressBook.removeAddy(sc.nextLine());
               
           }
           else if(choice==3){
               myAddressBook.displayNumAddy();
           }else if(choice==4){
               HashMap<String,Address>addy = myAddressBook.listAddy();
               Set<String>keySet=addy.keySet();
               Iterator<String> iter = keySet.iterator();
               while(iter.hasNext()){
               String currentKey=iter.next();
               Address currentAddy = addy.get(currentKey);
               System.out.println(currentAddy.firstName+"::"+currentAddy.lastName+"::"+currentAddy.street+"::"+currentAddy.city+"::"+currentAddy.state+"::"+currentAddy.zip);
               }
               
           }
           else if(choice==5){
               System.out.println("Please enter the last name to search:");
               Address currentAddy=myAddressBook.searchAddy(sc.next());
               if(currentAddy!=null){
                   System.out.println(currentAddy.firstName+ "::"+currentAddy.lastName+"::"+currentAddy.street+"::"+ currentAddy.city+"::"+currentAddy.state+"::"+currentAddy.zip);
               }else{
                   System.out.println("Does not exist.");
               }
               
           }
           System.out.println("Do you want to continue using this address book? (1-yes, 2-no)");
                    runAgain=sc.nextInt();
           
           }
}
}
