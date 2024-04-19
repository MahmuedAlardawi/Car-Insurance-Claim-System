/*
Name: Mahmued Ahmed Alardawi
ID: 21352089
Section: ZJ
Course name: Programming II
Course code: CPCS 203
Assignment number: Assignment #2 (Car Insurance Claim System)
 */

import java.util.Date;

public class Owner {
    private String nationalID;
    private String firstName;
    private String lastName;
    private Date date;
    private int numberOfClaims = 0;

    //

    public Owner(String nationalID, String firstName, String lastName, Date date) {
        this.nationalID = nationalID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
    }

    //

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumberOfClaims() {
        return numberOfClaims;
    }

    public void setNumberOfClaims(int numberOfClaims) {
        this.numberOfClaims = numberOfClaims;
    }

    //

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void increaseNumberOfClaims() {
        this.numberOfClaims++;
    }

    //

    @Override
    public String toString() {
        return "Owner{" +
                "nationalID='" + nationalID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", date=" + date +
                ", numberOfClaims=" + numberOfClaims +
                '}';
    }
}