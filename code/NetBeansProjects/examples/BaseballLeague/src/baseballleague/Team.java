/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballleague;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class Team {
     String teamName;
     String city;
    private HashMap<String, Player> teamMap =new HashMap<String, Player>();
    
    public void loadRoster(Team city){
        Scanner sc = null;
        try {
            
            sc = new Scanner(new BufferedReader(new FileReader(city.getCity()+".txt"))); 
       
            String currentLine;
            String[] currentTokens;
            while (sc.hasNextLine()) {
                currentLine=sc.nextLine();
                currentTokens= currentLine.split("::");
                Player newPlayer = new Player();
                newPlayer.setFirstName(currentTokens[0]);
                newPlayer.setLastName(currentTokens[1]);
                newPlayer.setPosition(currentTokens[2]);
                
                teamMap.put(newPlayer.getPosition(), newPlayer);
                
        }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Caught FileNotFoundException: "+ ex.getMessage());
        } finally{
            if(sc!=null){
                sc.close();
            }
        }
        }
    
    public String getTeamName() {
        return teamName;
    }
    public Player getPlayer(String title){
        return teamMap.get(title);
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public Player addPlayer(Player addPlayer){
        return teamMap.put(addPlayer.getPosition(), addPlayer);
    }
    
    public void removePlayer(String position){
         teamMap.remove(position);
    }
    public String[] getAllPlayers(){
        Set<String> keySet= teamMap.keySet();
        String[] keyArray = new String[keySet.size()];
        keyArray = keySet.toArray(keyArray);
        return keyArray;
    }
    
        public void writeRoster(Team city){
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter(city.getCity()+".txt"));
            String[] keys = this.getAllPlayers();
            for (int i = 0; i<keys.length;i++){
                Player currentPlayer = this.getPlayer(keys[i]);
                ArrayList<String> newList = new ArrayList<String>();
                out.println(currentPlayer.getFirstName()+"::"+ currentPlayer.getLastName()+"::"+currentPlayer.getPosition());
            }
        } catch (IOException ex){
            System.out.println("Caught IOException: "+ ex.getMessage());
        }finally{
            if(out!= null){
                out.flush();
            }
            out.close();
        }
        
    }
    
}
