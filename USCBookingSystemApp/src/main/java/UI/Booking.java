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
public class Booking {
    private String BookingID, StudentFName, StudentLName, LessonName, LessonWeek, LessonDay, LessonPeriod, LessonStatus, LessonReview;
    private char StudentSex;
    private int StudentID, LessonRating, BookingMonth;
    private double LessonPrice;

    public Booking(String BookingID, String StudentFName, String StudentLName, String LessonName, String LessonWeek, String LessonDay, String LessonPeriod, String LessonStatus, String LessonReview, char StudentSex, int StudentID, int LessonRating, int BookingMonth, double LessonPrice) {
        this.BookingID = BookingID;
        this.StudentFName = StudentFName;
        this.StudentLName = StudentLName;
        this.LessonName = LessonName;
        this.LessonWeek = LessonWeek;
        this.LessonDay = LessonDay;
        this.LessonPeriod = LessonPeriod;
        this.LessonStatus = LessonStatus;
        this.LessonReview = LessonReview;
        this.StudentSex = StudentSex;
        this.StudentID = StudentID;
        this.LessonRating = LessonRating;
        this.BookingMonth = BookingMonth;
        this.LessonPrice = LessonPrice;
    }

    public String getBookingID() {
        return BookingID;
    }

    public void setBookingID(String BookingID) {
        this.BookingID = BookingID;
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

    public String getLessonName() {
        return LessonName;
    }

    public void setLessonName(String LessonName) {
        this.LessonName = LessonName;
    }

    public String getLessonWeek() {
        return LessonWeek;
    }

    public void setLessonWeek(String LessonWeek) {
        this.LessonWeek = LessonWeek;
    }

    public String getLessonDay() {
        return LessonDay;
    }

    public void setLessonDay(String LessonDay) {
        this.LessonDay = LessonDay;
    }

    public String getLessonPeriod() {
        return LessonPeriod;
    }

    public void setLessonPeriod(String LessonPeriod) {
        this.LessonPeriod = LessonPeriod;
    }

    public String getLessonStatus() {
        return LessonStatus;
    }

    public void setLessonStatus(String LessonStatus) {
        this.LessonStatus = LessonStatus;
    }

    public String getLessonReview() {
        return LessonReview;
    }

    public void setLessonReview(String LessonReview) {
        this.LessonReview = LessonReview;
    }

    public char getStudentSex() {
        return StudentSex;
    }

    public void setStudentSex(char StudentSex) {
        this.StudentSex = StudentSex;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public int getLessonRating() {
        return LessonRating;
    }

    public void setLessonRating(int LessonRating) {
        this.LessonRating = LessonRating;
    }

    public int getBookingMonth() {
        return BookingMonth;
    }

    public void setBookingMonth(int BookingMonth) {
        this.BookingMonth = BookingMonth;
    }

    public double getLessonPrice() {
        return LessonPrice;
    }

    public void setLessonPrice(double LessonPrice) {
        this.LessonPrice = LessonPrice;
    }
    
}
