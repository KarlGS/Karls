/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook.student;

/**
 *name, address, phone and any special notes
 * @author apprentice
 */
public class Student {
    private String studentID;
    private String name;
    private String phone;
    private String notes;
    private int grades;

     public Student(String studentId) {
        this.studentID = studentId;
    }
     
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }
    
}
