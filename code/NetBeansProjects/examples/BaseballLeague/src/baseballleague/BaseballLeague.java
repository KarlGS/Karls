/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballleague;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BaseballLeague {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice;
        int runAgain = 1;
        League myLeague = new League();

        System.out.println("Welcome to your Baseball League:");
        while (runAgain == 1) {
            myLeague.loadsTeams();
            System.out.println("Main Menu");
            System.out.println("1. List all Teams");
            System.out.println("2. View Roster of Individual Team");
            System.out.println("3. Initiate a Trade");
            System.out.println("4. Delete a Player");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                String[] allTeams = myLeague.getAllTeams();
                for (int i = 0; i < allTeams.length; i++) {
                    Team currentTeam = myLeague.getTeam(allTeams[i]);
                    System.out.println("Team #" + (i + 1) + ": " + currentTeam.city + " - " + currentTeam.teamName);
                }
            } else if (choice == 2) {
                System.out.println("Please enter the city of the roster you would like to see");
                Team currentTeam = myLeague.getTeam(sc.nextLine());
                currentTeam.loadRoster(currentTeam);
                String[] roster = currentTeam.getAllPlayers();
                if (roster != null) {
                    for (int i = 0; i < roster.length; i++) {
                        Player currentPlayer = currentTeam.getPlayer(roster[i]);
                        System.out.println((i+1)+".  "+ currentPlayer.getFirstName()+" "+ currentPlayer.getLastName()+" "+currentPlayer.getPosition());
                    }
                } else {
                    System.out.println("That city doesn't have a team!");
                }
            } else if(choice ==3){
                System.out.println("Please enter what team the player is being traded from");
                Team currentTeam = myLeague.getTeam(sc.nextLine());
                currentTeam.loadRoster(currentTeam);
                String[] roster = currentTeam.getAllPlayers();
                if(roster != null){
                    for(int i = 0; i<roster.length;i++){
                        Player currentPlayer = currentTeam.getPlayer(roster[i]);
                        System.out.println((i+1)+".  "+ currentPlayer.getFirstName()+" "+ currentPlayer.getLastName()+" "+currentPlayer.getPosition());
                    }
                   
                 System.out.println("Which player would you like to be traded?");
                 Player playerTraded = currentTeam.getPlayer(sc.nextLine());
                 String playerTradedPos = playerTraded.getPosition();
                 currentTeam.removePlayer(playerTradedPos);
                 System.out.println("To what team should he be traded to?");
                 Team newTeam = myLeague.getTeam(sc.nextLine());
                 newTeam.loadRoster(newTeam);
                 roster = newTeam.getAllPlayers();
                   if(roster != null){
                    for(int i = 0; i<roster.length;i++){
                        Player currentPlayer = newTeam.getPlayer(roster[i]);
                        System.out.println((i+1)+".  "+ currentPlayer.getFirstName()+" "+ currentPlayer.getLastName()+" "+currentPlayer.getPosition());
                    }
                   }
                 System.out.println("What player do you want to trade him for?");
                 Player otherPlayer = newTeam.getPlayer(sc.nextLine()); 
                 String otherPlayerPos = otherPlayer.getPosition();
                 newTeam.removePlayer(playerTradedPos);
                 
                 currentTeam.addPlayer(otherPlayer);
                 newTeam.addPlayer(playerTraded);
                 
                  newTeam.writeRoster(newTeam);
                 currentTeam.writeRoster(currentTeam);
                
            }else{ System.out.println("That city doesn't have a team!");
            }
            }else if(choice==4){
                System.out.println("What team is the player on that you'd like to remove?");
                Team currentTeam= myLeague.getTeam(sc.nextLine());
                currentTeam.loadRoster(currentTeam);
                String[] roster = currentTeam.getAllPlayers();
                   if(roster != null){
                    for(int i = 0; i<roster.length;i++){
                        Player currentPlayer = currentTeam.getPlayer(roster[i]);
                        System.out.println((i+1)+".  "+ currentPlayer.getFirstName()+" "+ currentPlayer.getLastName()+" "+currentPlayer.getPosition());
                    }
                    
            }
                   System.out.println("What is the position of the player you'd like to cut?");
                   String position = sc.nextLine();
                   currentTeam.removePlayer(position);
                   currentTeam.writeRoster(currentTeam);
                   
        }else if(choice ==5){
            System.out.println("Goodbye!");
            runAgain=0;
        }
    }
    }
}