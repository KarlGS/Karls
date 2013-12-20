/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvd;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DVDLibraryUI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        int runAgain=1;
        DVD theDVD = new DVD();
        DVDLibrary myDVD = new DVDLibrary();
        myDVD.loadDVD();
        System.out.println("Welcome to your DVD Library");
        while(runAgain==1){
        System.out.println("\nMain Menu");
        System.out.println("\t1.List DVD collection");
        System.out.println("\t2. Add a new DVD");
        System.out.println("\t3. Remove a DVD");
        System.out.println("\t4. View a DVD from library");
        System.out.println("\t5. Display Library Size");
        System.out.println("\t6. Add notes to a particular movie");
        System.out.println("\t7. Exit");
        choice = sc.nextInt();
        sc.nextLine();
        
        if (choice==1){
            myDVD.getAllTitles();
            String[] dvdLibrary = myDVD.getAllTitles();
            for(int i = 0; i<dvdLibrary.length;i++){
                DVD currentDVD = myDVD.getDVD(dvdLibrary[i]);
                System.out.println(dvdLibrary[i]);//Removing currentDVD
                
            }
            
        }else if(choice ==2){
            System.out.println("Please enter the title of the new DVD:");
            theDVD.setTitle(sc.nextLine());
            System.out.println("Please enter the release date of the new DVD:");
            theDVD.setReleaseDate(sc.nextLine());
            System.out.println("Please enter the rating of the new DVD:");
            theDVD.setRating(sc.nextLine());
            System.out.println("Please enter the director of the new DVD:");
            theDVD.setDirector(sc.nextLine());
            System.out.println("Please enter the studio of the new DVD:");
            theDVD.setStudio(sc.nextLine());
            System.out.println("Please enter your notes about the DVD");
            theDVD.setNote(sc.nextLine());
            myDVD.addDVD(theDVD);
            myDVD.writeLibrary();
            
        }else if(choice ==3){
            System.out.println("Please enter the title of the DVD you'd like to delete");
            myDVD.removeDVD(sc.nextLine());
            myDVD.writeLibrary();
        }else if(choice ==4){
            System.out.println("Please enter the title of the DVD you'd like to see");
            
            DVD listDVD = myDVD.getDVD(sc.nextLine());
            if(listDVD!=null){
                System.out.println(listDVD.getTitle()+" "+listDVD.getReleaseDate()+" "+listDVD.getRating()+" "+listDVD.getDirector()+" "+listDVD.getStudio()+" ");
            for(int i=0;i<listDVD.getNote().length;i++){
            String[] localNotesArray = listDVD.getNote();
           
                System.out.print(localNotesArray[i]+"\n");
                
        } 
            }
            
        }else if(choice==5){
           System.out.println("Here is your amount of dvds, "+ myDVD.displayDVDS());
        }else if(choice==6){
            System.out.println("Please enter the movie you'd like to add notes to");
            DVD listDVD=myDVD.getDVD(sc.nextLine());
            System.out.println("Please enter your notes");
            ArrayList newList= new ArrayList<>();
            newList = listDVD.getNotes();
            newList.add(sc.nextLine());
            myDVD.writeLibrary();
           
                    
            
        }else if(choice==7){
            System.out.println("Thanks for playing.");
            runAgain=2;
        }
        
        }
    }
}
