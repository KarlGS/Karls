/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexample;

/**
 *
 * @author apprentice
 */
public class Student {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double gpa;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
