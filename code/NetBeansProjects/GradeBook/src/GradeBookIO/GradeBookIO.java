/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GradeBookIO;

import gradebook.student.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class GradeBookIO {

    public static final String ROSTER_FILE = "roster.txt";
    public static final String DELIMITER = "::";
    private HashMap<String, Student> students = new HashMap<String, Student>();

    public void loadClass() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
        String currentLine;
        String[] currentTokens;
        while(sc.hasNextLine()){
            currentLine=sc.next();
            currentTokens = currentLine.split(DELIMITER);
            Student currentStudent = new Student(currentTokens[0]);
            currentStudent.setName(currentTokens[1]);
            currentStudent.setPhone(currentTokens[2]);
            currentStudent.setPhone(currentTokens[3]);
            currentStudent.setGrades(Integer.parseInt(currentTokens[4]));
            students.put(currentStudent.getStudentID(), currentStudent);   
        }
        sc.close();
    }
    public void writeClass() throws IOException{
        PrintWriter out = new PrintWriter(new FileWriter(ROSTER_FILE));
        
    }
    public String[] getAllStudentsID(){
        Set<String> keySet = students.keySet();
        String[] keyArray = new String[keySet.size()];
        keyArray=keySet.toArray(keyArray);
        return keyArray;
    }
