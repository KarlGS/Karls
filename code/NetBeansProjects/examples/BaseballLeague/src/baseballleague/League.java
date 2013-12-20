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
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class League {
    private String leagueName;
    private HashMap<String, Team> leagueMap = new HashMap<String, Team>();
    
    public void loadsTeams(){
        Scanner sc= null;
        try{
            sc = new Scanner(new BufferedReader(new FileReader("teams.txt")));
            String currentLine;
            String[] currentTokens;
            while(sc.hasNextLine()){
                currentLine = sc.nextLine();
                currentTokens=currentLine.split("::");
                Team myTeam = new Team();
                myTeam.setCity(currentTokens[0]);
                myTeam.setTeamName(currentTokens[1]);
                leagueMap.put(myTeam.getCity(),myTeam);
                
            }
        }catch(FileNotFoundException ex){
                 System.out.println("Caught FileNotFoundException: " +ex.getMessage());
             }finally{
                if (sc!=null){
                    sc.close();
                }
                
                }
            }
    public Team getTeam(String city){
        return leagueMap.get(city);
    }    
   
    
    public void writeLeague(){
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("teams.txt"));
            String[] keys = this.getAllTeams();
            for (int i = 0; i<keys.length;i++){
                Team currentTeam = this.getTeam(keys[i]);
                ArrayList<String> newList = new ArrayList<String>();
                out.println(currentTeam.getCity()+"::"+ currentTeam.getTeamName());
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

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
    public Team addTeam(Team addTeam){
        return leagueMap.put(addTeam.getCity(), addTeam);
    }
    public void removeTeam(Team city){
        leagueMap.remove(city);
    }
        public String[] getAllTeams(){
        Set<String> keySet= leagueMap.keySet();
        String[] keyArray = new String[keySet.size()];
        keyArray = keySet.toArray(keyArray);
        return keyArray;
    }
        
  
}
