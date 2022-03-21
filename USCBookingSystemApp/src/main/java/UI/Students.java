/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author gnamu
 */
public class Students {
    
    private int StudenID, StudentAge;
    private String StudentFName, StudentLName;
    private char StudentSex;

    public Students(int StudenID, int StudentAge, String StudentFName, String StudentLName, char StudentSex) {
        this.StudenID = StudenID;
        this.StudentAge = StudentAge;
        this.StudentFName = StudentFName;
        this.StudentLName = StudentLName;
        this.StudentSex = StudentSex;
    }

    public int getStudenID() {
        return StudenID;
    }

    public void setStudenID(int StudenID) {
        this.StudenID = StudenID;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int StudentAge) {
        this.StudentAge = StudentAge;
    }

    public String getStudentFName() {
        return StudentFName;
    }

    public void setStudentFName(String StudentFName) {
        this.StudentFName = StudentFName;
    }

    public String getStudentLName() {
        return StudentLName;
    }

    public void setStudentLName(String StudentLName) {
        this.StudentLName = StudentLName;
    }

    public char getStudentSex() {
        return StudentSex;
    }

    public void setStudentSex(char StudentSex) {
        this.StudentSex = StudentSex;
    }
    
    
}
