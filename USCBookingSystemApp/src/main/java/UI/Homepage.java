/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import UI.Lesson;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;  

/**
 *
 * @author gnamu
 */
public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    public Homepage() {
        initComponents();
        dt();
        addRowToSaturdayTable();
        addRowToSundayTable();
        addRowToYogaTable();
        addRowToZumbaTable();
        addRowToBoxFitTable();
        addRowToBodyBlitzTable();
        addRowToBooked();
        addRowToAllLessonsTable();
        addRowToBookingHistory();
        addRowToStudents();
        
    }
    
    private ArrayList listOfStudents(){
        ArrayList<Students> student = new ArrayList<Students>();
        student.add( new Students(208947, 20, "James", "Fox", 'M'));
        student.add( new Students(208948, 21, "John", "Doe", 'M'));
        student.add( new Students(208949, 19, "Sarah", "James", 'F'));
        student.add( new Students(208950, 22, "James", "Bull", 'M'));
        student.add( new Students(208951, 19, "Michael", "Jones", 'M'));
        student.add( new Students(208952, 21, "Ivan", "Rictish", 'M'));
        student.add( new Students(208953, 19, "Mary", "King", 'F'));
        student.add( new Students(208954, 20, "Will", "Smith", 'M'));
        student.add( new Students(208955, 19, "Vivian", "Jones", 'F'));
        student.add( new Students(208956, 20, "Jane", "Jackson", 'F'));        
        student.add( new Students(208957, 20, "Elizaberth", "Brown", 'F'));
        student.add( new Students(208958, 21, "Christian", "Bill", 'M'));
        student.add( new Students(208959, 19, "Sharon", "Stone", 'F'));
        student.add( new Students(208960, 22, "Hipsy", "Cone", 'F'));
        student.add( new Students(208961, 19, "Paul", "Walker", 'M'));
        
        return student;
    }
    
    private ArrayList listOfSaturdayLessons(){
        ArrayList<Lesson> saturdayLessons = new ArrayList<Lesson>();
        saturdayLessons.add( new Lesson("Week 1","Yoga","Saturday","Morning",12.86,0));
        saturdayLessons.add( new Lesson("Week 1","Zumba","Saturday","Afternoon",15.78,1));
        saturdayLessons.add( new Lesson("Week 1","Box Fit","Saturday","Evening",17.93,2));
        saturdayLessons.add( new Lesson("Week 2","Body Blitz","Saturday","Morning",20.74,3));
        saturdayLessons.add( new Lesson("Week 2","Yoga","Saturday","Afternoon",12.86,4));
        saturdayLessons.add( new Lesson("Week 2","Zumba","Saturday","Evening",15.78,0));
        saturdayLessons.add( new Lesson("Week 3","Box Fit","Saturday","Morning",17.93,1));
        saturdayLessons.add( new Lesson("Week 3","Body Blitz","Saturday","Afternoon",20.74,2));
        saturdayLessons.add( new Lesson("Week 3","Yoga","Saturday","Evening",12.86,3));
        saturdayLessons.add( new Lesson("Week 4","Zumba","Saturday","Morning",15.78,4));
        saturdayLessons.add( new Lesson("Week 4","Box Fit","Saturday","Afternoon",17.93,0));
        saturdayLessons.add( new Lesson("Week 4","Body Blitz","Saturday","Evening",20.74,1));
        saturdayLessons.add( new Lesson("Week 5","Yoga","Saturday","Morning",12.86,2));
        saturdayLessons.add( new Lesson("Week 5","Zumba","Saturday","Afternoon",15.78,3));
        saturdayLessons.add( new Lesson("Week 5","Box Fit","Saturday","Evening",17.93,4));
        saturdayLessons.add( new Lesson("Week 6","Body Blitz","Saturday","Morning",20.74,0));
        saturdayLessons.add( new Lesson("Week 6","Yoga","Saturday","Afternoon",12.86,1));
        saturdayLessons.add( new Lesson("Week 6","Zumba","Saturday","Evening",15.78,2));
        saturdayLessons.add( new Lesson("Week 7","Box Fit","Saturday","Morning",17.93,3));
        saturdayLessons.add( new Lesson("Week 7","Body Blitz","Saturday","Afternoon",20.74,4));
        saturdayLessons.add( new Lesson("Week 7","Yoga","Saturday","Evening",12.86,0));
        saturdayLessons.add( new Lesson("Week 8","Zumba","Saturday","Morning",15.78,1));
        saturdayLessons.add( new Lesson("Week 8","Box Fit","Saturday","Afternoon",17.93,2));
        saturdayLessons.add( new Lesson("Week 8","Body Blitz","Saturday","Evening",20.74,3));
        
        return saturdayLessons;
    }
    
    private ArrayList listofSundayLessons(){
        ArrayList<Lesson> sundayLessons = new ArrayList<Lesson>();
        sundayLessons.add( new Lesson("Week 1","Yoga","Sunday","Morning",12.86,4));
        sundayLessons.add( new Lesson("Week 1","Zumba","Sunday","Afternoon",15.78,0));
        sundayLessons.add( new Lesson("Week 1","Box Fit","Sunday","Evening",17.93,1));
        sundayLessons.add( new Lesson("Week 2","Body Blitz","Sunday","Morning",20.74,2));
        sundayLessons.add( new Lesson("Week 2","Yoga","Sunday","Afternoon",12.86,3));
        sundayLessons.add( new Lesson("Week 2","Zumba","Sunday","Evening",15.78,4));
        sundayLessons.add( new Lesson("Week 3","Box Fit","Sunday","Morning",17.93,0));
        sundayLessons.add( new Lesson("Week 3","Body Blitz","Sunday","Afternoon",20.74,1));
        sundayLessons.add( new Lesson("Week 3","Yoga","Sunday","Evening",12.86,2));
        sundayLessons.add( new Lesson("Week 4","Zumba","Sunday","Morning",15.78,3));
        sundayLessons.add( new Lesson("Week 4","Box Fit","Sunday","Afternoon",17.93,4));
        sundayLessons.add( new Lesson("Week 4","Body Blitz","Sunday","Evening",20.74,0));
        sundayLessons.add( new Lesson("Week 5","Yoga","Sunday","Morning",12.86,1));
        sundayLessons.add( new Lesson("Week 5","Zumba","Sunday","Afternoon",15.78,2));
        sundayLessons.add( new Lesson("Week 5","Box Fit","Sunday","Evening",17.93,3));
        sundayLessons.add( new Lesson("Week 6","Body Blitz","Sunday","Morning",20.74,4));
        sundayLessons.add( new Lesson("Week 6","Yoga","Sunday","Afternoon",12.86,0));
        sundayLessons.add( new Lesson("Week 6","Zumba","Sunday","Evening",15.78,1));
        sundayLessons.add( new Lesson("Week 7","Box Fit","Sunday","Morning",17.93,2));
        sundayLessons.add( new Lesson("Week 7","Body Blitz","Sunday","Afternoon",20.74,3));
        sundayLessons.add( new Lesson("Week 7","Yoga","Sunday","Evening",12.86,4));
        sundayLessons.add( new Lesson("Week 8","Zumba","Sunday","Morning",15.78,2));
        sundayLessons.add( new Lesson("Week 8","Box Fit","Sunday","Afternoon",17.93,3));
        sundayLessons.add( new Lesson("Week 8","Body Blitz","Sunday","Evening",20.74,1));
        
        return sundayLessons;
    }
    
    private ArrayList listofAllLessons(){
        ArrayList<Lesson> allLessons = new ArrayList<Lesson>();
        allLessons.addAll(saturdayLessons);
        allLessons.addAll(sundayLessons);
        
        return allLessons;
    }
    
    private ArrayList listofYogaLessons(){
        ArrayList<Lesson> yogaLessons = new ArrayList<Lesson>();
        yogaLessons.add( new Lesson("Week 1","Yoga","Saturday","Morning",12.86,0));
        yogaLessons.add( new Lesson("Week 2","Yoga","Saturday","Afternoon",12.86,4));
        yogaLessons.add( new Lesson("Week 3","Yoga","Saturday","Evening",12.86,3));
        yogaLessons.add( new Lesson("Week 5","Yoga","Saturday","Morning",12.86,2));
        yogaLessons.add( new Lesson("Week 6","Yoga","Saturday","Afternoon",12.86,1));
        yogaLessons.add( new Lesson("Week 7","Yoga","Saturday","Evening",12.86,0));
        yogaLessons.add( new Lesson("Week 1","Yoga","Sunday","Morning",12.86,4));
        yogaLessons.add( new Lesson("Week 2","Yoga","Sunday","Afternoon",12.86,3));
        yogaLessons.add( new Lesson("Week 3","Yoga","Sunday","Evening",12.86,2));
        yogaLessons.add( new Lesson("Week 5","Yoga","Sunday","Morning",12.86,1));
        yogaLessons.add( new Lesson("Week 6","Yoga","Sunday","Afternoon",12.86,0));
        yogaLessons.add( new Lesson("Week 7","Yoga","Sunday","Evening",12.86,4));
        
        return yogaLessons;
    }
    
    private ArrayList listofZumbaLessons(){
        ArrayList<Lesson> zumbaLessons = new ArrayList<Lesson>();
        zumbaLessons.add( new Lesson("Week 1","Zumba","Saturday","Afternoon",15.78,1));
        zumbaLessons.add( new Lesson("Week 2","Zumba","Saturday","Evening",15.78,0));
        zumbaLessons.add( new Lesson("Week 4","Zumba","Saturday","Morning",15.78,4));
        zumbaLessons.add( new Lesson("Week 5","Zumba","Saturday","Afternoon",15.78,3));
        zumbaLessons.add( new Lesson("Week 6","Zumba","Saturday","Evening",15.78,2));
        zumbaLessons.add( new Lesson("Week 8","Zumba","Saturday","Morning",15.78,1));
        zumbaLessons.add( new Lesson("Week 1","Zumba","Sunday","Afternoon",15.78,0));
        zumbaLessons.add( new Lesson("Week 2","Zumba","Sunday","Evening",15.78,4));
        zumbaLessons.add( new Lesson("Week 4","Zumba","Sunday","Morning",15.78,3));
        zumbaLessons.add( new Lesson("Week 5","Zumba","Sunday","Afternoon",15.78,2));
        zumbaLessons.add( new Lesson("Week 6","Zumba","Sunday","Evening",15.78,1));
        zumbaLessons.add( new Lesson("Week 8","Zumba","Sunday","Morning",15.78,2));
        
        return zumbaLessons;
    }
    
    private ArrayList listofBoxFitLessons(){
        ArrayList<Lesson> boxfitLessons = new ArrayList<Lesson>();
        boxfitLessons.add( new Lesson("Week 1","Box Fit","Saturday","Evening",17.93,2));
        boxfitLessons.add( new Lesson("Week 3","Box Fit","Saturday","Morning",17.93,1));
        boxfitLessons.add( new Lesson("Week 4","Box Fit","Saturday","Afternoon",17.93,0));
        boxfitLessons.add( new Lesson("Week 5","Box Fit","Saturday","Evening",17.93,4));
        boxfitLessons.add( new Lesson("Week 7","Box Fit","Saturday","Morning",17.93,3));
        boxfitLessons.add( new Lesson("Week 8","Box Fit","Saturday","Afternoon",17.93,2));
        boxfitLessons.add( new Lesson("Week 1","Box Fit","Sunday","Evening",17.93,1));
        boxfitLessons.add( new Lesson("Week 3","Box Fit","Sunday","Morning",17.93,0));
        boxfitLessons.add( new Lesson("Week 4","Box Fit","Sunday","Afternoon",17.93,4));
        boxfitLessons.add( new Lesson("Week 5","Box Fit","Sunday","Evening",17.93,3));
        boxfitLessons.add( new Lesson("Week 7","Box Fit","Sunday","Morning",17.93,2));
        boxfitLessons.add( new Lesson("Week 8","Box Fit","Sunday","Afternoon",17.93,3));
        
        return boxfitLessons;
    }
    
    private ArrayList listofBodyBlitzLessons(){
        ArrayList<Lesson> bodyblitzLessons = new ArrayList<Lesson>();
        bodyblitzLessons.add( new Lesson("Week 2","Body Blitz","Saturday","Morning",20.74,3));
        bodyblitzLessons.add( new Lesson("Week 3","Body Blitz","Saturday","Afternoon",20.74,2));
        bodyblitzLessons.add( new Lesson("Week 4","Body Blitz","Saturday","Evening",20.74,1));
        bodyblitzLessons.add( new Lesson("Week 6","Body Blitz","Saturday","Morning",20.74,0));
        bodyblitzLessons.add( new Lesson("Week 7","Body Blitz","Saturday","Afternoon",20.74,4));
        bodyblitzLessons.add( new Lesson("Week 8","Body Blitz","Saturday","Evening",20.74,3));
        bodyblitzLessons.add( new Lesson("Week 2","Body Blitz","Sunday","Morning",20.74,2));
        bodyblitzLessons.add( new Lesson("Week 3","Body Blitz","Sunday","Afternoon",20.74,1));
        bodyblitzLessons.add( new Lesson("Week 4","Body Blitz","Sunday","Evening",20.74,0));
        bodyblitzLessons.add( new Lesson("Week 6","Body Blitz","Sunday","Morning",20.74,4));
        bodyblitzLessons.add( new Lesson("Week 7","Body Blitz","Sunday","Afternoon",20.74,3));
        bodyblitzLessons.add( new Lesson("Week 8","Body Blitz","Sunday","Evening",20.74,1));
        
        return bodyblitzLessons;
    }
    
    private ArrayList listOfBookings(){
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        bookings.add( new Booking("BIYG001", 208947, "James", "Fox", 20, 'M', "Yoga", "Week 1", "Saturday", "Morning", "Attended", "Very Satisfied.", 5, 4, 12.86));
        bookings.add( new Booking("BIYG002", 208948, "John", "Doe", 21, 'M', "Yoga", "Week 1", "Saturday", "Morning", "Attended", "Lesson was Great.", 5, 4, 12.86));
        bookings.add( new Booking("BIYG003", 208949, "Sarah", "James", 19, 'F', "Yoga", "Week 1", "Saturday", "Morning", "Attended", "Very Satisfied.", 5, 4, 12.86));
        bookings.add( new Booking("BIYG004", 208950, "James", "Bull", 22, 'M', "Yoga", "Week 1", "Saturday", "Morning", "Attended", "Lesson was as expected.", 5, 4, 12.86));
        bookings.add( new Booking("BIZB001", 208951, "Michael", "Jones", 19, 'M', "Zumba", "Week 1", "Saturday", "Afternoon", "Attended", "Great.", 4, 4, 15.78));
        bookings.add( new Booking("BIZB002", 208952, "Ivan", "Rictish", 21, 'M', "Zumba", "Week 1", "Saturday", "Afternoon", "Attended", "Lesson was Great.", 5, 4, 15.78));
        bookings.add( new Booking("BIZB003", 208953, "Mary", "King", 19, 'F', "Zumba", "Week 1", "Saturday", "Afternoon", "Attended", "OK.", 4, 4, 15.78));
        bookings.add( new Booking("BIBF001", 208954, "Will", "Smith", 20, 'M', "Box Fit", "Week 1", "Saturday", "Evening", "Changed", "", 0, 0, 17.93));
        bookings.add( new Booking("BIBF002", 208955, "Vivian", "Jones", 19, 'F', "Box Fit", "Week 1", "Saturday", "Evening", "Attended", "The equipments were broken.", 2, 4, 17.93));
        bookings.add( new Booking("BIBB001", 208956, "Jane", "Jackson", 20, 'F', "Body Blitz", "Week 2", "Saturday", "Morning", "Attended", "Lesson was great but started a bit late.", 3, 4, 20.74));
        bookings.add( new Booking("BIZB004", 208957, "Elizaberth", "Brown", 20, 'F', "Zumba", "Week 2", "Saturday", "Evening", "Attended", "Very Satisfied.", 5, 4, 15.78));
        bookings.add( new Booking("BIZB005", 208958, "Christian", "Bill", 21, 'M', "Zumba", "Week 2", "Saturday", "Evening", "Attended", "Lesson was as expected.", 5, 4, 15.78));
        bookings.add( new Booking("BIZB006", 208959, "Sharon", "Stone", 19, 'F', "Zumba", "Week 2", "Saturday", "Evening", "Attended", "Lesson was Fun.", 5, 4, 15.78));
        bookings.add( new Booking("BIZB007", 208960, "Hipsy", "Cone", 22, 'F', "Zumba", "Week 2", "Saturday", "Evening", "Attended", "Was Great.", 4, 4, 15.78));
        bookings.add( new Booking("BIBF003", 208961, "Paul", "Walker", 19, 'M', "Box Fit", "Week 3", "Saturday", "Morning", "Attended", "Lesson was Great.", 5, 4, 17.93));
        bookings.add( new Booking("BIBF004", 208947, "James", "Fox", 20, 'M', "Box Fit", "Week 3", "Saturday", "Morning", "Attended", "The lesson wasn't as expected.", 1, 4, 17.93));
        bookings.add( new Booking("BIBF005", 208948, "John", "Doe", 21, 'M', "Box Fit", "Week 3", "Saturday", "Morning", "Attended", "Lesson was as expected.", 5, 4, 17.93));
        bookings.add( new Booking("BIBB002", 208949, "Sarah", "James", 19, 'F', "Body Blitz", "Week 3", "Saturday", "Afternoon", "Attended", "Lesson was Fun.", 5, 4, 20.74));
        bookings.add( new Booking("BIBB003", 208950, "James", "Bull", 22, 'M', "Body Blitz", "Week 3", "Saturday", "Afternoon", "Attended", "Inadequate equipments.", 2, 4, 20.74));
        bookings.add( new Booking("BIYG005", 208951, "Michael", "Jones", 19, 'M', "Yoga", "Week 3", "Saturday", "Evening", "Attended", "Lesson was as expected.", 5, 4, 12.86));
        bookings.add( new Booking("BIBF006", 208952, "Ivan", "Rictish", 21, 'M', "Box Fit", "Week 4", "Saturday", "Afternoon", "Attended", "Very Satisfied.", 5, 4, 17.93));
        bookings.add( new Booking("BIBF007", 208953, "Mary", "King", 19, 'F', "Box Fit", "Week 4", "Saturday", "Afternoon", "Attended", "Great.", 4, 4, 17.93));
        bookings.add( new Booking("BIBF008", 208954, "Will", "Smith", 20, 'M', "Box Fit", "Week 4", "Saturday", "Afternoon", "Changed", "", 0, 0, 17.93));
        bookings.add( new Booking("BIBF009", 208950, "James", "Bull", 22, 'M', "Box Fit", "Week 8", "Saturday", "Afternoon", "Cancelled", "", 0, 0, 17.93));
        bookings.add( new Booking("BIBF010", 208955, "Vivian", "Jones", 19, 'F', "Box Fit", "Week 4", "Saturday", "Afternoon", "Attended", "Very Satisfied.", 5, 4, 17.93));
        bookings.add( new Booking("BIBB004", 208956, "Jane", "Jackson", 20, 'F', "Body Blitz", "Week 4", "Saturday", "Evening", "Attended", "OK.", 4, 4, 20.74));
        bookings.add( new Booking("BIBB005", 208957, "Elizaberth", "Brown", 20, 'F', "Body Blitz", "Week 4", "Saturday", "Evening", "Attended", "Inadequate equipments.", 1, 4, 20.74));
        bookings.add( new Booking("BIBB006", 208958, "Christian", "Bill", 21, 'M', "Body Blitz", "Week 4", "Saturday", "Evening", "Attended", "Very Satisfied.", 5, 4, 20.74));
        bookings.add( new Booking("BIYG006", 208959, "Sharon", "Stone", 19, 'F', "Yoga", "Week 5", "Saturday", "Morning", "Attended", "Lesson was Great.", 5, 5, 12.86));
        bookings.add( new Booking("BIYG007", 208960, "Hipsy", "Cone", 22, 'F', "Yoga", "Week 5", "Saturday", "Morning", "Attended", "Lesson was OK but not to my expectations.", 3, 5, 12.86));
        bookings.add( new Booking("BIZB008", 208961, "Paul", "Walker", 19, 'M', "Zumba", "Week 5", "Saturday", "Afternoon", "Attended", "Lesson was as expected.", 5, 5, 15.78));
        bookings.add( new Booking("BIBB007", 208947, "James", "Fox", 20, 'M', "Body Blitz", "Week 6", "Saturday", "Morning", "Attended", "Lesson was as expected.", 5, 5, 20.74));
        bookings.add( new Booking("BIBB008", 208948, "John", "Doe", 21, 'M', "Body Blitz", "Week 6", "Saturday", "Morning", "Attended", "Lesson was Great.", 5, 5, 20.74));
        bookings.add( new Booking("BIBB009", 208951, "Michael", "Jones", 19, 'M', "Body Blitz", "Week 8", "Sunday", "Evening", "Cancelled", "", 0, 0, 20.74));
        bookings.add( new Booking("BIBB010", 208959, "Sharon", "Stone", 19, 'F', "Body Blitz", "Week 4", "Sunday", "Evening", "Cancelled", "", 0, 0, 20.74));
        bookings.add( new Booking("BIBB011", 208949, "Sarah", "James", 19, 'F', "Body Blitz", "Week 6", "Saturday", "Morning", "Attended", "Lesson was Fun.", 5, 5, 20.74));
        bookings.add( new Booking("BIBB012", 208950, "James", "Bull", 22, 'M', "Body Blitz", "Week 6", "Saturday", "Morning", "Attended", "Lesson was great but more room for improvements.", 3, 5, 20.74));
        bookings.add( new Booking("BIYG008", 208951, "Michael", "Jones", 19, 'M', "Yoga", "Week 6", "Saturday", "Afternoon", "Attended", "Lesson was as expected.", 5, 5, 12.86));
        bookings.add( new Booking("BIYG009", 208952, "Ivan", "Rictish", 21, 'M', "Yoga", "Week 6", "Saturday", "Afternoon", "Changed", "", 0, 0, 12.86));
        bookings.add( new Booking("BIYG010", 208953, "Mary", "King", 19, 'F', "Yoga", "Week 6", "Saturday", "Afternoon", "Attended", "The lesson wasn't as expected.", 2, 5, 12.86));
        bookings.add( new Booking("BIZB009", 208954, "Will", "Smith", 20, 'M', "Zumba", "Week 6", "Saturday", "Evening", "Attended", "OK.", 4, 5, 15.78));
        bookings.add( new Booking("BIZB010", 208955, "Vivian", "Jones", 19, 'F', "Zumba", "Week 6", "Saturday", "Evening", "Attended", "Lesson was Great.", 5, 5, 15.78));
        bookings.add( new Booking("BIBF011", 208956, "Jane", "Jackson", 20, 'F', "Box Fit", "Week 7", "Saturday", "Morning", "Attended", "Lesson was OK but not to my expectations.", 4, 5, 17.93));
        bookings.add( new Booking("BIYG011", 208957, "Elizaberth", "Brown", 20, 'F', "Yoga", "Week 7", "Saturday", "Evening", "Attended", "Lesson was Fun.", 5, 5, 12.86));
        bookings.add( new Booking("BIYG012", 208958, "Christian", "Bill", 21, 'M', "Yoga", "Week 7", "Saturday", "Evening", "Cancelled", "", 0, 0, 12.86));
        bookings.add( new Booking("BIYG013", 208958, "Christian", "Bill", 21, 'M', "Yoga", "Week 7", "Saturday", "Evening", "Attended", "Very Satisfied.", 5, 5, 12.86));
        bookings.add( new Booking("BIYG014", 208959, "Sharon", "Stone", 19, 'F', "Yoga", "Week 7", "Saturday", "Evening", "Attended", "Very Satisfied.", 5, 5, 12.86));
        bookings.add( new Booking("BIYG015", 208960, "Hipsy", "Cone", 22, 'F', "Yoga", "Week 7", "Saturday", "Evening", "Attended", "Lesson was Great.", 5, 5, 12.86));
        bookings.add( new Booking("BIZB011", 208961, "Paul", "Walker", 19, 'M', "Zumba", "Week 8", "Saturday", "Morning", "Attended", "Great.", 4, 5, 15.78));
        bookings.add( new Booking("BIZB012", 208947, "James", "Fox", 20, 'M', "Zumba", "Week 8", "Saturday", "Morning", "Attended", "Lesson was Great.", 5, 5, 15.78));
        bookings.add( new Booking("BIZB013", 208948, "John", "Doe", 21, 'M', "Zumba", "Week 8", "Saturday", "Morning", "Attended", "Very Satisfied.", 5, 5, 15.78));
        bookings.add( new Booking("BIBF012", 208949, "Sarah", "James", 19, 'F', "Box Fit", "Week 8", "Saturday", "Afternoon", "Attended", "Lesson started late.", 1, 5, 17.93));
        bookings.add( new Booking("BIBF013", 208950, "James", "Bull", 22, 'M', "Box Fit", "Week 8", "Saturday", "Afternoon", "Attended", "Lesson was as expected.", 5, 5, 17.93));
        bookings.add( new Booking("BIBB013", 208953, "Mary", "King", 19, 'F', "Body Blitz", "Week 3", "Sunday", "Afternoon", "Cancelled", "", 0, 0, 20.74));
        bookings.add( new Booking("BIBB014", 208951, "Michael", "Jones", 19, 'M', "Body Blitz", "Week 8", "Saturday", "Evening", "Attended", "Lesson was Great.", 5, 5, 20.74));
        bookings.add( new Booking("BIZB015", 208952, "Ivan", "Rictish", 21, 'M', "Zumba", "Week 1", "Sunday", "Afternoon", "Attended", "I will rate a 5 star if a specialised trainee is hired to assist us.", 3, 4, 15.78));
        bookings.add( new Booking("BIZB014", 208952, "Ivan", "Rictish", 21, 'M', "Zumba", "Week 1", "Sunday", "Afternoon", "Cancelled", "", 0, 0, 15.78));
        bookings.add( new Booking("BIZB016", 208953, "Mary", "King", 19, 'F', "Zumba", "Week 1", "Sunday", "Afternoon", "Attended", "Lesson was Fun.", 5, 4, 15.78));
        bookings.add( new Booking("BIZB017", 208954, "Will", "Smith", 20, 'M', "Zumba", "Week 1", "Sunday", "Afternoon", "Attended", "OK.", 4, 4, 15.78));
        bookings.add( new Booking("BIZB018", 208955, "Vivian", "Jones", 19, 'F', "Zumba", "Week 1", "Sunday", "Afternoon", "Attended", "Lesson was Great.", 5, 4, 15.78));
        bookings.add( new Booking("BIBF014", 208956, "Jane", "Jackson", 20, 'F', "Box Fit", "Week 1", "Sunday", "Evening", "Attended", "Lesson was as expected.", 5, 4, 17.93));
        bookings.add( new Booking("BIBF015", 208957, "Elizaberth", "Brown", 20, 'F', "Box Fit", "Week 1", "Sunday", "Evening", "Changed", "", 0, 0, 17.93));
        bookings.add( new Booking("BIBF016", 208958, "Christian", "Bill", 21, 'M', "Box Fit", "Week 1", "Sunday", "Evening", "Attended", "Very Satisfied.", 5, 4, 17.93));
        bookings.add( new Booking("BIBB015", 208959, "Sharon", "Stone", 19, 'F', "Body Blitz", "Week 2", "Sunday", "Morning", "Attended", "Lesson was Great.", 5, 4, 20.74));
        bookings.add( new Booking("BIBB016", 208960, "Hipsy", "Cone", 22, 'F', "Body Blitz", "Week 2", "Sunday", "Morning", "Attended", "Great.", 4, 4, 20.74));
        bookings.add( new Booking("BIYG016", 208961, "Paul", "Walker", 19, 'M', "Yoga", "Week 2", "Sunday", "Afternoon", "Attended", "Very Satisfied.", 5, 4, 12.86));
        bookings.add( new Booking("BIBF017", 208960, "Hipsy", "Cone", 22, 'F', "Box Fit", "Week 7", "Sunday", "Morning", "Cancelled", "", 0, 0, 17.93));
        bookings.add( new Booking("BIBF018", 208947, "James", "Fox", 20, 'M', "Box Fit", "Week 3", "Sunday", "Morning", "Attended", "The equipments were broken.", 1, 4, 17.93));
        bookings.add( new Booking("BIBF019", 208948, "John", "Doe", 21, 'M', "Box Fit", "Week 3", "Sunday", "Morning", "Booked", "", 0, 0, 17.93));
        bookings.add( new Booking("BIBF020", 208959, "Sharon", "Stone", 19, 'F', "Box Fit", "Week 7", "Sunday", "Morning", "Cancelled", "", 0, 0, 17.93));
        bookings.add( new Booking("BIBF021", 208949, "Sarah", "James", 19, 'F', "Box Fit", "Week 3", "Sunday", "Morning", "Attended", "Lesson was Fun.", 5, 4, 17.93));
        bookings.add( new Booking("BIBF022", 208950, "James", "Bull", 22, 'M', "Box Fit", "Week 3", "Sunday", "Morning", "Attended", "Lesson was Great.", 5, 4, 17.93));
        bookings.add( new Booking("BIBB017", 208951, "Michael", "Jones", 19, 'M', "Body Blitz", "Week 3", "Sunday", "Afternoon", "Attended", "Lesson was OK but not to my expectations.", 3, 4, 20.74));
        bookings.add( new Booking("BIBB018", 208952, "Ivan", "Rictish", 21, 'M', "Body Blitz", "Week 3", "Sunday", "Afternoon", "Attended", "Lesson was Fun.", 5, 4, 20.74));
        bookings.add( new Booking("BIBB019", 208953, "Mary", "King", 19, 'F', "Body Blitz", "Week 3", "Sunday", "Afternoon", "Attended", "Lesson was Fun.", 5, 4, 20.74));
        bookings.add( new Booking("BIYG017", 208954, "Will", "Smith", 20, 'M', "Yoga", "Week 3", "Sunday", "Evening", "Attended", "Great.", 4, 4, 12.86));
        bookings.add( new Booking("BIYG018", 208955, "Vivian", "Jones", 19, 'F', "Yoga", "Week 3", "Sunday", "Evening", "Attended", "Lesson started late.", 2, 4, 12.86));
        bookings.add( new Booking("BIZB019", 208956, "Jane", "Jackson", 20, 'F', "Zumba", "Week 4", "Sunday", "Morning", "Attended", "Lesson was as expected.", 5, 4, 15.78));
        bookings.add( new Booking("BIBB020", 208957, "Elizaberth", "Brown", 20, 'F', "Body Blitz", "Week 4", "Sunday", "Evening", "Attended", "OK.", 4, 4, 20.74));
        bookings.add( new Booking("BIBB021", 208958, "Christian", "Bill", 21, 'M', "Body Blitz", "Week 4", "Sunday", "Evening", "Attended", "Very Satisfied.", 5, 4, 20.74));
        bookings.add( new Booking("BIBB022", 208959, "Sharon", "Stone", 19, 'F', "Body Blitz", "Week 4", "Sunday", "Evening", "Booked", "", 0, 0, 20.74));
        bookings.add( new Booking("BIBB023", 208960, "Hipsy", "Cone", 22, 'F', "Body Blitz", "Week 4", "Sunday", "Evening", "Attended", "Lesson was Great.", 5, 4, 20.74));
        bookings.add( new Booking("BIYG019", 208961, "Paul", "Walker", 19, 'M', "Yoga", "Week 5", "Sunday", "Morning", "Booked", "", 0, 0, 12.86));
        bookings.add( new Booking("BIYG020", 208947, "James", "Fox", 20, 'M', "Yoga", "Week 5", "Sunday", "Morning", "Attended", "Lesson was great but started a bit late.", 3, 5, 12.86));
        bookings.add( new Booking("BIYG021", 208948, "John", "Doe", 21, 'M', "Yoga", "Week 5", "Sunday", "Morning", "Attended", "Lesson was Fun.", 5, 5, 12.86));
        bookings.add( new Booking("BIZB020", 208949, "Sarah", "James", 19, 'F', "Zumba", "Week 5", "Sunday", "Afternoon", "Cancelled", "", 0, 0, 15.78));
        bookings.add( new Booking("BIZB021", 208949, "Sarah", "James", 19, 'F', "Zumba", "Week 5", "Sunday", "Afternoon", "Attended", "The lesson wasn't as expected.", 2, 5, 15.78));
        bookings.add( new Booking("BIZB022", 208950, "James", "Bull", 22, 'M', "Zumba", "Week 5", "Sunday", "Afternoon", "Booked", "", 0, 0, 15.78));
        bookings.add( new Booking("BIBF023", 208951, "Michael", "Jones", 19, 'M', "Box Fit", "Week 5", "Sunday", "Evening", "Attended", "Very Satisfied.", 5, 5, 17.93));
        bookings.add( new Booking("BIYG022", 208952, "Ivan", "Rictish", 21, 'M', "Yoga", "Week 6", "Sunday", "Afternoon", "Changed", "", 0, 0, 12.86));
        bookings.add( new Booking("BIYG023", 208953, "Mary", "King", 19, 'F', "Yoga", "Week 6", "Sunday", "Afternoon", "Attended", "Lesson was as expected.", 5, 5, 12.86));
        bookings.add( new Booking("BIYG024", 208954, "Will", "Smith", 20, 'M', "Yoga", "Week 6", "Sunday", "Afternoon", "Booked", "", 0, 0, 12.86));
        bookings.add( new Booking("BIYG025", 208955, "Vivian", "Jones", 19, 'F', "Yoga", "Week 6", "Sunday", "Afternoon", "Cancelled", "", 0, 0, 12.86));
        bookings.add( new Booking("BIYG026", 208955, "Vivian", "Jones", 19, 'F', "Yoga", "Week 6", "Sunday", "Afternoon", "Booked", "", 0, 0, 12.86));
        bookings.add( new Booking("BIZB023", 208956, "Jane", "Jackson", 20, 'F', "Zumba", "Week 6", "Sunday", "Evening", "Attended", "Lesson was great but more room for improvements.", 3, 5, 15.78));
        bookings.add( new Booking("BIZB024", 208957, "Elizaberth", "Brown", 20, 'F', "Zumba", "Week 6", "Sunday", "Evening", "Attended", "Lesson was Fun.", 5, 5, 15.78));
        bookings.add( new Booking("BIZB025", 208958, "Christian", "Bill", 21, 'M', "Zumba", "Week 6", "Sunday", "Evening", "Booked", "", 0, 0, 15.78));
        bookings.add( new Booking("BIBF024", 208959, "Sharon", "Stone", 19, 'F', "Box Fit", "Week 7", "Sunday", "Morning", "Attended", "Lesson was Great.", 5, 5, 17.93));
        bookings.add( new Booking("BIBF025", 208960, "Hipsy", "Cone", 22, 'F', "Box Fit", "Week 7", "Sunday", "Morning", "Booked", "", 0, 0, 17.93));
        bookings.add( new Booking("BIBB024", 208961, "Paul", "Walker", 19, 'M', "Body Blitz", "Week 7", "Sunday", "Afternoon", "Booked", "", 0, 0, 20.74));
        bookings.add( new Booking("BIZB026", 208947, "James", "Fox", 20, 'M', "Zumba", "Week 8", "Sunday", "Morning", "Attended", "Great.", 4, 5, 15.78));
        bookings.add( new Booking("BIZB027", 208948, "John", "Doe", 21, 'M', "Zumba", "Week 8", "Sunday", "Morning", "Booked", "", 0, 0, 15.78));
        bookings.add( new Booking("BIBF026", 208949, "Sarah", "James", 19, 'F', "Box Fit", "Week 8", "Sunday", "Afternoon", "Booked", "", 0, 0, 17.93));
        bookings.add( new Booking("BIBB025", 208950, "James", "Bull", 22, 'M', "Body Blitz", "Week 8", "Sunday", "Evening", "Attended", "Lesson was Great.", 5, 5, 20.74));
        bookings.add( new Booking("BIBB026", 208951, "Michael", "Jones", 19, 'M', "Body Blitz", "Week 8", "Sunday", "Evening", "Booked", "", 0, 0, 20.74));
        bookings.add( new Booking("BIBB027", 208952, "Ivan", "Rictish", 21, 'M', "Body Blitz", "Week 8", "Sunday", "Evening", "Attended", "Very Satisfied.", 5, 5, 20.74));

        return bookings;
    }
    
    ArrayList<Students> student = listOfStudents();
    ArrayList<Lesson> saturdayLessons = listOfSaturdayLessons();
    ArrayList<Lesson> sundayLessons = listofSundayLessons();
    ArrayList<Lesson> yogaLessons = listofYogaLessons();
    ArrayList<Lesson> zumbaLessons = listofZumbaLessons();
    ArrayList<Lesson> bodyblitzLessons = listofBodyBlitzLessons();
    ArrayList<Lesson> boxfitLessons = listofBoxFitLessons();
    ArrayList<Lesson> allLessons = listofAllLessons();
    ArrayList<Booking> bookings = listOfBookings();
    ArrayList<Booking> bookingYoga = new ArrayList<Booking>();
    ArrayList<Booking> bookingZumba = new ArrayList<Booking>();
    ArrayList<Booking> bookingBoxFit = new ArrayList<Booking>();
    ArrayList<Booking> bookingBodyBlitz = new ArrayList<Booking>();
    
    
    private void addRowToSaturdayTable(){
        
        jtSaturday.setDefaultRenderer(Object.class, new Render());
        JButton btn1 = new JButton("Book");
        btn1.setName("b");
        
        DefaultTableModel modelSaturday = (DefaultTableModel) jtSaturday.getModel();
        Object rowData[] = new Object[saturdayLessons.size()];
        for (int i = 0; i < saturdayLessons.size(); i++){
            rowData[0] = saturdayLessons.get(i).getWeek();
            rowData[1] = saturdayLessons.get(i).getName();
            rowData[2] = saturdayLessons.get(i).getPeriod();
            rowData[3] = saturdayLessons.get(i).getPrice();
            rowData[4] = saturdayLessons.get(i).getSlot();
            rowData[5] = btn1;  
            
            modelSaturday.addRow(rowData);
        }
        
        jtSaturday.setRowHeight(30);
    }
    
    private void addRowToSundayTable(){
        
        jtSunday.setDefaultRenderer(Object.class, new Render());
        JButton btn1 = new JButton("Book");
        btn1.setName("b");
        
        DefaultTableModel modelSunday = (DefaultTableModel) jtSunday.getModel();
        Object rowData[] = new Object[sundayLessons.size()];
        for (int i = 0; i < sundayLessons.size(); i++){
            rowData[0] = sundayLessons.get(i).getWeek();
            rowData[1] = sundayLessons.get(i).getName();
            rowData[2] = sundayLessons.get(i).getPeriod();
            rowData[3] = sundayLessons.get(i).getPrice();
            rowData[4] = sundayLessons.get(i).getSlot();
            rowData[5] = btn1;  
            
            modelSunday.addRow(rowData);
        }
        
        jtSunday.setRowHeight(30);
    }
    
    private void addRowToAllLessonsTable(){
        jtAllTimeTable.setDefaultRenderer(Object.class, new Render());
        JButton btnzy = new JButton("Book");
        btnzy.setName("b");
        
        DefaultTableModel modelAllLessons = (DefaultTableModel) jtAllTimeTable.getModel();
        Object rowData[] = new Object[allLessons.size()];
        for (int i = 0; i < allLessons.size(); i++){
            rowData[0] = allLessons.get(i).getWeek();
            rowData[1] = allLessons.get(i).getDay();
            rowData[2] = allLessons.get(i).getPeriod();
            rowData[3] = allLessons.get(i).getName();
            rowData[4] = allLessons.get(i).getPrice();
            rowData[5] = allLessons.get(i).getSlot();
            rowData[6] = btnzy;
            
            modelAllLessons.addRow(rowData);
        }
        
        jtAllTimeTable.setRowHeight(30);
    }
    
    private void addRowToYogaTable(){
        
        jtYoga.setDefaultRenderer(Object.class, new Render());
        JButton btn1 = new JButton("Book");
        btn1.setName("b");
        
        DefaultTableModel modelYoga = (DefaultTableModel) jtYoga.getModel();
        Object rowData[] = new Object[yogaLessons.size()];
        for (int i = 0; i < yogaLessons.size(); i++){
            rowData[0] = yogaLessons.get(i).getWeek();
            rowData[1] = yogaLessons.get(i).getDay();
            rowData[2] = yogaLessons.get(i).getPeriod();
            rowData[3] = yogaLessons.get(i).getPrice();
            rowData[4] = yogaLessons.get(i).getSlot();
            rowData[5] = btn1;  
            
            modelYoga.addRow(rowData);
        }
        
        jtYoga.setRowHeight(30);
    }
    
    private void addRowToZumbaTable(){
        
        jtZumba.setDefaultRenderer(Object.class, new Render());
        JButton btn1 = new JButton("Book");
        btn1.setName("b");
        
        DefaultTableModel modelZumba = (DefaultTableModel) jtZumba.getModel();
        Object rowData[] = new Object[zumbaLessons.size()];
        for (int i = 0; i < zumbaLessons.size(); i++){
            rowData[0] = zumbaLessons.get(i).getWeek();
            rowData[1] = zumbaLessons.get(i).getDay();
            rowData[2] = zumbaLessons.get(i).getPeriod();
            rowData[3] = zumbaLessons.get(i).getPrice();
            rowData[4] = zumbaLessons.get(i).getSlot();
            rowData[5] = btn1;  
            
            modelZumba.addRow(rowData);
        }
        
        jtZumba.setRowHeight(30);
    }
    
    private void addRowToBoxFitTable(){
        
        jtBoxFit.setDefaultRenderer(Object.class, new Render());
        JButton btn1 = new JButton("Book");
        btn1.setName("b");
        
        DefaultTableModel modelBoxFit = (DefaultTableModel) jtBoxFit.getModel();
        Object rowData[] = new Object[boxfitLessons.size()];
        for (int i = 0; i < boxfitLessons.size(); i++){
            rowData[0] = boxfitLessons.get(i).getWeek();
            rowData[1] = boxfitLessons.get(i).getDay();
            rowData[2] = boxfitLessons.get(i).getPeriod();
            rowData[3] = boxfitLessons.get(i).getPrice();
            rowData[4] = boxfitLessons.get(i).getSlot();
            rowData[5] = btn1;  
            
            modelBoxFit.addRow(rowData);
        }
        
        jtBoxFit.setRowHeight(30);
    }
    
    private void addRowToBodyBlitzTable(){
        
        jtBodyBlitz.setDefaultRenderer(Object.class, new Render());
        JButton btn1 = new JButton("Book");
        btn1.setName("b");
        
        DefaultTableModel modelBodyBlitz = (DefaultTableModel) jtBodyBlitz.getModel();
        Object rowData[] = new Object[bodyblitzLessons.size()];
        for (int i = 0; i < bodyblitzLessons.size(); i++){
            rowData[0] = bodyblitzLessons.get(i).getWeek();
            rowData[1] = bodyblitzLessons.get(i).getDay();
            rowData[2] = bodyblitzLessons.get(i).getPeriod();
            rowData[3] = bodyblitzLessons.get(i).getPrice();
            rowData[4] = bodyblitzLessons.get(i).getSlot();
            rowData[5] = btn1;  
            
            modelBodyBlitz.addRow(rowData);
        }
        
        jtBodyBlitz.setRowHeight(30);
    }
    
    private void addRowToBooked(){
        jtAttend.setDefaultRenderer(Object.class, new Render());
        JButton btn2 = new JButton("Attend");
        btn2.setName("at");
        
        JButton btn3 = new JButton("Change");
        btn3.setName("ch");
        
        JButton btn4 = new JButton("Cancel");
        btn4.setName("x");
        
        DefaultTableModel modelBook = (DefaultTableModel) jtAttend.getModel();
        Object rowData[] = new Object[bookings.size()];
        for (int i = 0; i < bookings.size(); i++){
            rowData[0] = bookings.get(i).getBookingID();
            rowData[1] = bookings.get(i).getLessonName();
            rowData[2] = bookings.get(i).getLessonWeek();
            rowData[3] = bookings.get(i).getLessonDay();
            rowData[4] = bookings.get(i).getLessonPeriod();
            rowData[5] = bookings.get(i).getLessonStatus();
            
            if (bookings.get(i).getLessonStatus() == "Attended"){
                    rowData[6] = "";
                    rowData[7] = "";
                    rowData[8] = "";

                }else if (bookings.get(i).getLessonStatus() == "Cancelled"){
                    rowData[6] = "";
                    rowData[7] = "";
                    rowData[8] = "";

                }else{
                    rowData[6] = btn2;
                    rowData[7] = btn3;
                    rowData[8] = btn4;
                }
            
            modelBook.addRow(rowData);
        }
        jtAttend.setRowHeight(30);
        
    }
    
    private void addRowToBookingHistory(){
        DefaultTableModel modelHistory = (DefaultTableModel) jtBookings.getModel();
        Object rowHistoryData[] = new Object[bookings.size()];
        for (int i = 0; i < bookings.size(); i++){
            rowHistoryData[0] = bookings.get(i).getBookingID();
            rowHistoryData[1] = bookings.get(i).getStudentID();
            rowHistoryData[2] = bookings.get(i).getStudentFName() + " " + bookings.get(i).getStudentLName();
            rowHistoryData[3] = bookings.get(i).getLessonName();
            rowHistoryData[4] = bookings.get(i).getLessonWeek();
            rowHistoryData[5] = bookings.get(i).getLessonDay();
            rowHistoryData[6] = bookings.get(i).getLessonPeriod();
            rowHistoryData[7] = bookings.get(i).getLessonStatus();
            
            modelHistory.addRow(rowHistoryData);
        }
        jtBookings.setRowHeight(30);
    }
    
    private void addRowToStudents(){
        DefaultTableModel modelStudents = (DefaultTableModel) jtStudents.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        
        jtStudents.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jtStudents.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        jtStudents.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        Object rowStudentData[] = new Object[student.size()];
        for (int i = 0; i < student.size(); i++){
            rowStudentData[0] = i + 1;
            rowStudentData[1] = student.get(i).getStudenID();
            rowStudentData[2] = student.get(i).getStudentFName();
            rowStudentData[3] = student.get(i).getStudentLName();
            rowStudentData[4] = student.get(i).getStudentAge();
            rowStudentData[5] = student.get(i).getStudentSex();
            
            modelStudents.addRow(rowStudentData);
        }
        jtStudents.setRowHeight(30);
    }
    
    private void bookClicked(){
        
        //Panel color
        resetPanelColor(btnDashboard);
        setPanelColor(btnBook);
        resetPanelColor(btnAttend);
        resetPanelColor(btnBooking);
        resetPanelColor(btnLessonReport);
        resetPanelColor(btnExerciseReport);
        resetPanelColor(btnStudents);
        
        //pages
        pgSaturday.setVisible(false);
        pgDashboard.setVisible(false);
        pgAttend.setVisible(false);
        pgBookings.setVisible(false);
        pgLessonReport.setVisible(false);
        pgExerciseReport.setVisible(false);
        pgStudents.setVisible(false);
        pgYoga.setVisible(false);
        pgSunday.setVisible(false);
        pgZumba.setVisible(false);
        pgBoxFit.setVisible(false);
        pgBodyBlitz.setVisible(false);
        pgAllTimeTable.setVisible(false);
        
        //Dialog
        String[] responses = {"By Day", "By Lesson"};
        int ans = JOptionPane.showOptionDialog(rootPane, "How do you want to check the timetable?", "Check Timetable", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, responses, 0);
        
        if (ans == 0){
            String[] responses1 = {"Saturday", "Sunday"};
            int ans1 = JOptionPane.showOptionDialog(rootPane, "Select Day", "Check Timetable", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses1, 0);
            
            if (ans1 == 0){
                pgSaturday.setVisible(true);
                pgDashboard.setVisible(false);
                pgAttend.setVisible(false);
                pgBookings.setVisible(false);
                pgLessonReport.setVisible(false);
                pgExerciseReport.setVisible(false);
                pgStudents.setVisible(false);
                pgYoga.setVisible(false);
                pgSunday.setVisible(false);
                pgAllTimeTable.setVisible(false);
                
            }else if (ans1 == 1){
                pgSaturday.setVisible(false);
                pgDashboard.setVisible(false);
                pgAttend.setVisible(false);
                pgBookings.setVisible(false);
                pgLessonReport.setVisible(false);
                pgExerciseReport.setVisible(false);
                pgStudents.setVisible(false);
                pgYoga.setVisible(false);
                pgSunday.setVisible(true);
                pgAllTimeTable.setVisible(false);
                
            }
            
        }else if(ans == 1){
            String[] responses2 = {"Yoga", "Zumba", "Box Fit", "Body Blitz"};
            int ans2 = JOptionPane.showOptionDialog(rootPane, "Select Lesson", "Check Timetable", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses2, 0);
            
            if (ans2 == 0){
                
                pgSaturday.setVisible(false);
                pgDashboard.setVisible(false);
                pgAttend.setVisible(false);
                pgBookings.setVisible(false);
                pgLessonReport.setVisible(false);
                pgExerciseReport.setVisible(false);
                pgStudents.setVisible(false);
                pgYoga.setVisible(true);
                pgSunday.setVisible(false);
                pgZumba.setVisible(false);
                pgBoxFit.setVisible(false);
                pgBodyBlitz.setVisible(false);
                pgAllTimeTable.setVisible(false);
            }else if (ans2 == 1){
                pgSaturday.setVisible(false);
                pgDashboard.setVisible(false);
                pgAttend.setVisible(false);
                pgBookings.setVisible(false);
                pgLessonReport.setVisible(false);
                pgExerciseReport.setVisible(false);
                pgStudents.setVisible(false);
                pgYoga.setVisible(false);
                pgSunday.setVisible(false);
                pgZumba.setVisible(true);
                pgBoxFit.setVisible(false);
                pgBodyBlitz.setVisible(false);
                pgAllTimeTable.setVisible(false);
            }else if (ans2 == 2){
                pgSaturday.setVisible(false);
                pgDashboard.setVisible(false);
                pgAttend.setVisible(false);
                pgBookings.setVisible(false);
                pgLessonReport.setVisible(false);
                pgExerciseReport.setVisible(false);
                pgStudents.setVisible(false);
                pgYoga.setVisible(false);
                pgSunday.setVisible(false);
                pgZumba.setVisible(false);
                pgBoxFit.setVisible(true);
                pgBodyBlitz.setVisible(false);
                pgAllTimeTable.setVisible(false);
            }else if (ans2 == 3){
                pgSaturday.setVisible(false);
                pgDashboard.setVisible(false);
                pgAttend.setVisible(false);
                pgBookings.setVisible(false);
                pgLessonReport.setVisible(false);
                pgExerciseReport.setVisible(false);
                pgStudents.setVisible(false);
                pgYoga.setVisible(false);
                pgSunday.setVisible(false);
                pgZumba.setVisible(false);
                pgBoxFit.setVisible(false);
                pgBodyBlitz.setVisible(true);
                pgAllTimeTable.setVisible(false);
            }
        }
    }
    
    private void manageBookingsClicked(){
        
        //Panel color
        resetPanelColor(btnDashboard);
        resetPanelColor(btnBook);
        setPanelColor(btnAttend);
        resetPanelColor(btnBooking);
        resetPanelColor(btnLessonReport);
        resetPanelColor(btnExerciseReport);
        resetPanelColor(btnStudents);
        
        //pages
        pgSaturday.setVisible(false);
        pgDashboard.setVisible(false);
        pgAttend.setVisible(true);
        pgBookings.setVisible(false);
        pgLessonReport.setVisible(false);
        pgExerciseReport.setVisible(false);
        pgStudents.setVisible(false);
        pgYoga.setVisible(false);
        pgSunday.setVisible(false);
        pgZumba.setVisible(false);
        pgBoxFit.setVisible(false);
        pgBodyBlitz.setVisible(false);
        pgAllTimeTable.setVisible(false);
    }
    
    private void bookingHistoryClicked(){
        
        //Panel color
        resetPanelColor(btnDashboard);
        resetPanelColor(btnBook);
        resetPanelColor(btnAttend);
        setPanelColor(btnBooking);
        resetPanelColor(btnLessonReport);
        resetPanelColor(btnExerciseReport);
        resetPanelColor(btnStudents);
        
        //pages
        pgAllTimeTable.setVisible(false);
        pgSaturday.setVisible(false);
        pgDashboard.setVisible(false);
        pgAttend.setVisible(false);
        pgBookings.setVisible(true);
        pgLessonReport.setVisible(false);
        pgExerciseReport.setVisible(false);
        pgStudents.setVisible(false);
        pgYoga.setVisible(false);
        pgSunday.setVisible(false);
        pgZumba.setVisible(false);
        pgBoxFit.setVisible(false);
        pgBodyBlitz.setVisible(false);
    }
    
    private void lessonReportClicked(){
        
        //Panel color
        resetPanelColor(btnDashboard);
        resetPanelColor(btnBook);
        resetPanelColor(btnAttend);
        resetPanelColor(btnBooking);
        setPanelColor(btnLessonReport);
        resetPanelColor(btnStudents);
        resetPanelColor(btnExerciseReport);
        
        //pages
        pgAllTimeTable.setVisible(false);
        pgSaturday.setVisible(false);
        pgDashboard.setVisible(false);
        pgAttend.setVisible(false);
        pgBookings.setVisible(false);
        pgLessonReport.setVisible(false);
        pgExerciseReport.setVisible(false);
        pgStudents.setVisible(false);
        pgYoga.setVisible(false);
        pgSunday.setVisible(false);
        pgZumba.setVisible(false);
        pgBoxFit.setVisible(false);
        pgBodyBlitz.setVisible(false);
        
        //Select Month
        String mon = "";
        String[] rate = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String resMonth = (String) JOptionPane.showInputDialog(rootPane, "Please select a numerical month.", "Select a Month", JOptionPane.QUESTION_MESSAGE, null, rate, rate[0]);
        //int Month = Integer.valueOf(resMonth);
        if(resMonth == "1"){
            mon = "January";
        }else if(resMonth == "2"){
            mon = "February";
        }else if(resMonth == "3"){
            mon = "March";
        }else if(resMonth == "4"){
            mon = "April";
        }else if(resMonth == "5"){
            mon = "May";
        }else if(resMonth == "6"){
            mon = "June";
        }else if(resMonth == "7"){
            mon = "July";
        }else if(resMonth == "8"){
            mon = "August";
        }else if(resMonth == "9"){
            mon = "September";
        }else if(resMonth == "10"){
            mon = "October";
        }else if(resMonth == "11"){
            mon = "November";
        }else if(resMonth == "12"){
            mon = "December";
        }else{
            return;
        }
        
        int m = Integer.parseInt(resMonth);
        
        monthlyReport(m);
        
        lblReport.setText(mon + " Lesson Report");
        pgLessonReport.setVisible(true);
        
    }
    
    private void championExerciseReportClicked(){
        
        //Panel color
        resetPanelColor(btnDashboard);
        resetPanelColor(btnBook);
        resetPanelColor(btnAttend);
        resetPanelColor(btnBooking);
        resetPanelColor(btnLessonReport);
        resetPanelColor(btnStudents);
        setPanelColor(btnExerciseReport);
        
        //pages
        pgAllTimeTable.setVisible(false);
        pgSaturday.setVisible(false);
        pgDashboard.setVisible(false);
        pgAttend.setVisible(false);
        pgBookings.setVisible(false);
        pgLessonReport.setVisible(false);
        pgExerciseReport.setVisible(false);
        pgStudents.setVisible(false);
        pgYoga.setVisible(false);
        pgSunday.setVisible(false);
        pgZumba.setVisible(false);
        pgBoxFit.setVisible(false);
        pgBodyBlitz.setVisible(false);
        
        //Select Month
        String mon = "";
        String[] rate = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String resMonth = (String) JOptionPane.showInputDialog(rootPane, "Please select a numerical month.", "Select a Month", JOptionPane.QUESTION_MESSAGE, null, rate, rate[0]);
        //int Month = Integer.valueOf(resMonth);
        if(resMonth == "1"){
            mon = "January";
        }else if(resMonth == "2"){
            mon = "February";
        }else if(resMonth == "3"){
            mon = "March";
        }else if(resMonth == "4"){
            mon = "April";
        }else if(resMonth == "5"){
            mon = "May";
        }else if(resMonth == "6"){
            mon = "June";
        }else if(resMonth == "7"){
            mon = "July";
        }else if(resMonth == "8"){
            mon = "August";
        }else if(resMonth == "9"){
            mon = "September";
        }else if(resMonth == "10"){
            mon = "October";
        }else if(resMonth == "11"){
            mon = "November";
        }else if(resMonth == "12"){
            mon = "December";
        }else{
            return;
        }
        
        int m = Integer.parseInt(resMonth);
        
        championExercise(m);
        
        lblExeReport.setText(mon + " Champion Exercise Report");
        pgExerciseReport.setVisible(true);
        
    }
    
    private void studentsRecordsClicked(){
        
        //Panel color
        resetPanelColor(btnDashboard);
        resetPanelColor(btnBook);
        resetPanelColor(btnAttend);
        resetPanelColor(btnBooking);
        resetPanelColor(btnLessonReport);
        resetPanelColor(btnExerciseReport);
        setPanelColor(btnStudents);
        
        //pages
        pgAllTimeTable.setVisible(false);
        pgSaturday.setVisible(false);
        pgDashboard.setVisible(false);
        pgAttend.setVisible(false);
        pgBookings.setVisible(false);
        pgLessonReport.setVisible(false);
        pgExerciseReport.setVisible(false);
        pgStudents.setVisible(true);
        pgYoga.setVisible(false);
        pgSunday.setVisible(false);
        pgZumba.setVisible(false);
        pgBoxFit.setVisible(false);
        pgBodyBlitz.setVisible(false);
    }
    
    private boolean isStudent(int StudentID){
        
        for (Students s : student){
            if(s.getStudenID() == StudentID){
                return true;
            }
        }
        return false;
    }
    
    private boolean canBookLesson(int StudentID, String LessonName, String LessonWeek, String LessonPeriod, String LessonDay){
        
        for (Booking b : bookings){
            if(b.getStudentID() == StudentID && b.getLessonName() == LessonName && b.getLessonWeek() == LessonWeek && b.getLessonPeriod() == LessonPeriod && b.getLessonDay() == LessonDay){
                return false;
            }
        }
        return true;
    }
    
    private boolean isStudentFree(int StudentID, String LessonWeek, String LessonPeriod, String LessonDay){
        
        for(Booking b : bookings){
            if(b.getStudentID() == StudentID && b.getLessonWeek() == LessonWeek && b.getLessonDay() == LessonDay && b.getLessonPeriod() == LessonPeriod && b.getLessonStatus() == "Booked"){
                return false;
            }
        }
        
        return true;
    }
    
    private void attendLesson(int a){
        int opt = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to attend " + bookings.get(a).getLessonPeriod() + " " + bookings.get(a).getLessonName() + " Lesson?", "Attend Lesson", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(opt == 0){
            String userReview = JOptionPane.showInputDialog(rootPane, bookings.get(a).getLessonPeriod() + " " + bookings.get(a).getLessonName() + " Lesson has been attended Sucessfuly. Please leave a review.", "Lesson attended successfuly.", JOptionPane.INFORMATION_MESSAGE);
            
            String[] rate = {"", "1", "2", "3", "4", "5"};
            String ratings = (String) JOptionPane.showInputDialog(rootPane, "Please select a numerical ratings for the lesson. \n 1: Very dissatisfied  \n 2: Dissatisfied \n 3: Ok \n 4: Satisfied \n 5: Very Satisfied \n", "Lesson Ratings", JOptionPane.QUESTION_MESSAGE, null, rate, rate[0]);
            int rating = Integer.valueOf(ratings);
            
            bookings.get(a).setLessonStatus("Attended");
            bookings.get(a).setLessonReview(userReview);
            bookings.get(a).setLessonRating(rating);
            
            DefaultTableModel modelBook = (DefaultTableModel) jtAttend.getModel();
            modelBook.setRowCount(0);
            jtAttend.setDefaultRenderer(Object.class, new Render());
            JButton btn2 = new JButton("Attend");
            btn2.setName("at");

            JButton btn3 = new JButton("Change");
            btn3.setName("ch");

            JButton btn4 = new JButton("Cancel");
            btn4.setName("x");


            Object rowBookData[] = new Object[bookings.size()];
            for (int k = 0; k < bookings.size(); k++){
                rowBookData[0] = bookings.get(k).getBookingID();
                rowBookData[1] = bookings.get(k).getLessonName();
                rowBookData[2] = bookings.get(k).getLessonWeek();
                rowBookData[3] = bookings.get(k).getLessonDay();
                rowBookData[4] = bookings.get(k).getLessonPeriod();
                rowBookData[5] = bookings.get(k).getLessonStatus();

                if (bookings.get(k).getLessonStatus() == "Attended"){
                    rowBookData[6] = "";
                    rowBookData[7] = "";
                    rowBookData[8] = "";

                }else if (bookings.get(k).getLessonStatus() == "Cancelled"){
                    rowBookData[6] = "";
                    rowBookData[7] = "";
                    rowBookData[8] = "";

                }else{
                    rowBookData[6] = btn2;
                    rowBookData[7] = btn3;
                    rowBookData[8] = btn4;
                }



                modelBook.addRow(rowBookData);
            }

            JOptionPane.showMessageDialog(rootPane, bookings.get(a).getLessonPeriod() + " " + bookings.get(a).getLessonName() + " Lesson Attended Successfully", "Lesson Attended", JOptionPane.INFORMATION_MESSAGE);

                        
        }else{
            return;
        }
    }
        
    private void changeLesson(int a, int remSlot, String bkID){
        if(remSlot <= 4 && remSlot != 0){
            String LesName, LesWeek, LesPeriod, LesDay, LName = "", LDay = "", LWeek = "", LPeriod = "";
            int studentID = 0;
            JTable jt = jtAllTimeTable, jt2 = jt; 
            ArrayList<Lesson> listArray = allLessons, listArray2 = listArray;
            LesName = allLessons.get(a).getName();
            LesWeek = allLessons.get(a).getWeek();
            LesDay = allLessons.get(a).getDay();
            LesPeriod = allLessons.get(a).getPeriod();
            
            for (Booking b : bookings){
                if(b.getBookingID() == bkID){
                    studentID = b.getStudentID();
                    LName = b.getLessonName();
                    LDay = b.getLessonDay();
                    LWeek = b.getLessonWeek();
                    LPeriod = b.getLessonPeriod();
                }
            }
            
            if(canBookLesson(studentID, LesName, LesWeek, LesPeriod, LesDay)){
                if(isStudentFree(studentID, LesWeek, LesPeriod, LesDay)){
                    int opt1 = JOptionPane.showConfirmDialog(rootPane, "Do you want to change Booking with ID: " + bkID + " to " + allLessons.get(a).getPeriod() + " " + allLessons.get(a).getName() + " Lessons @ £" + allLessons.get(a).getPrice() + "?", "Confirm Booking", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(opt1 == 0){
                        for (Booking bk : bookings){
                            if(bk.getBookingID() == bkID){
                                bk.setLessonWeek(LesWeek);
                                bk.setLessonDay(LesDay);
                                bk.setLessonPeriod(LesPeriod);
                                bk.setLessonName(LesName);
                                bk.setLessonStatus("Changed");
                            }
                        }
                        
                        if(LesName == "Yoga" && LesDay == "Saturday"){
                            decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                            decreaseSlot(yogaLessons, LesName, LesDay, LesWeek, LesPeriod);
                        }else if(LesName == "Yoga" && LesDay == "Sunday"){
                            decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                            decreaseSlot(yogaLessons, LesName, LesDay, LesWeek, LesPeriod);
                        }else if(LesName == "Zumba" && LesDay == "Saturday"){
                            decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                            decreaseSlot(zumbaLessons, LesName, LesDay, LesWeek, LesPeriod);
                        }else if(LesName == "Zumba" && LesDay == "Sunday"){
                            decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                            decreaseSlot(zumbaLessons, LesName, LesDay, LesWeek, LesPeriod);
                        }else if(LesName == "Body Blitz" && LesDay == "Saturday"){
                            decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                            decreaseSlot(bodyblitzLessons, LesName, LesDay, LesWeek, LesPeriod);
                        }else if(LesName == "Body Blitz" && LesDay == "Sunday"){
                            decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                            decreaseSlot(bodyblitzLessons, LesName, LesDay, LesWeek, LesPeriod);
                        }else if(LesName == "Box Fit" && LesDay == "Saturday"){
                            decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                            decreaseSlot(boxfitLessons, LesName, LesDay, LesWeek, LesPeriod);
                        }else if(LesName == "Box Fit" && LesDay == "Sunday"){
                            decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                            decreaseSlot(boxfitLessons, LesName, LesDay, LesWeek, LesPeriod);
                        }
                        
                        
                        if(LName == "Yoga" && LDay == "Saturday"){
                            increaseSlot(saturdayLessons, LName, LDay, LWeek, LPeriod);
                            increaseSlot(yogaLessons, LName, LDay, LWeek, LPeriod);
                            jt = jtSaturday;
                            jt2 = jtYoga;
                            listArray = saturdayLessons;
                            listArray2 = yogaLessons;
                        }else if(LName == "Yoga" && LDay == "Sunday"){
                            increaseSlot(sundayLessons, LName, LDay, LWeek, LPeriod);
                            increaseSlot(yogaLessons, LName, LDay, LWeek, LPeriod);
                            jt = jtSunday;
                            jt2 = jtYoga;
                            listArray = sundayLessons;
                            listArray2 = yogaLessons;
                        }else if(LName == "Zumba" && LDay == "Saturday"){
                            increaseSlot(saturdayLessons, LName, LDay, LWeek, LPeriod);
                            increaseSlot(zumbaLessons, LName, LDay, LWeek, LPeriod);
                            jt = jtSaturday;
                            jt2 = jtZumba;
                            listArray = saturdayLessons;
                            listArray2 = zumbaLessons;
                        }else if(LName == "Zumba" && LDay == "Sunday"){
                            increaseSlot(sundayLessons, LName, LDay, LWeek, LPeriod);
                            increaseSlot(zumbaLessons, LName, LDay, LWeek, LPeriod);
                            jt = jtSunday;
                            jt2 = jtZumba;
                            listArray = sundayLessons;
                            listArray2 = zumbaLessons;
                        }else if(LName == "Body Blitz" && LDay == "Saturday"){
                            increaseSlot(saturdayLessons, LName, LDay, LWeek, LPeriod);
                            increaseSlot(bodyblitzLessons, LName, LDay, LWeek, LPeriod);
                            jt = jtSaturday;
                            jt2 = jtBodyBlitz;
                            listArray = saturdayLessons;
                            listArray2 = bodyblitzLessons;
                        }else if(LName == "Body Blitz" && LDay == "Sunday"){
                            increaseSlot(sundayLessons, LName, LDay, LWeek, LPeriod);
                            increaseSlot(bodyblitzLessons, LName, LDay, LWeek, LPeriod);
                            jt = jtSunday;
                            jt2 = jtBodyBlitz;
                            listArray = sundayLessons;
                            listArray2 = bodyblitzLessons;
                        }else if(LName == "Box Fit" && LDay == "Saturday"){
                            increaseSlot(saturdayLessons, LName, LDay, LWeek, LPeriod);
                            increaseSlot(boxfitLessons, LName, LDay, LWeek, LPeriod);
                            jt = jtSaturday;
                            jt2 = jtBoxFit;
                            listArray = saturdayLessons;
                            listArray2 = boxfitLessons;
                        }else if(LName == "Box Fit" && LDay == "Sunday"){
                            increaseSlot(sundayLessons, LName, LDay, LWeek, LPeriod);
                            increaseSlot(boxfitLessons, LName, LDay, LWeek, LPeriod);
                            jt = jtSunday;
                            jt2 = jtBoxFit;
                            listArray = sundayLessons;
                            listArray2 = boxfitLessons;
                        }
                        
                        DefaultTableModel model = (DefaultTableModel) jt.getModel();
                        model.setRowCount(0);
                        jt.setDefaultRenderer(Object.class, new Render());
                        JButton btn1 = new JButton("Book");
                        btn1.setName("b");

                        Object[] rowData = new Object[listArray.size()];
                        for (int j = 0; j < listArray.size(); j++){
                            rowData[0] = listArray.get(j).getWeek();
                            rowData[1] = listArray.get(j).getName();                            
                            rowData[2] = listArray.get(j).getPeriod();
                            rowData[3] = listArray.get(j).getPrice();
                            rowData[4] = listArray.get(j).getSlot();
                            rowData[5] = btn1;  

                            model.addRow(rowData);
                        }

                        DefaultTableModel model2 = (DefaultTableModel) jt2.getModel();
                        model2.setRowCount(0);
                        jt2.setDefaultRenderer(Object.class, new Render());
                        JButton btn1a = new JButton("Book");
                        btn1a.setName("b");

                        Object[] rowData2 = new Object[listArray2.size()];
                        for (int m = 0; m < listArray2.size(); m++){
                            rowData2[0] = listArray2.get(m).getWeek();
                            rowData2[1] = listArray2.get(m).getDay();
                            rowData2[2] = listArray2.get(m).getPeriod();
                            rowData2[3] = listArray2.get(m).getPrice();
                            rowData2[4] = listArray2.get(m).getSlot();
                            rowData2[5] = btn1a;  

                            model2.addRow(rowData2);
                        }
                        
                        DefaultTableModel modelHistory = (DefaultTableModel) jtBookings.getModel();
                        Object rowHistoryData[] = new Object[bookings.size()];
                        for (int i = 0; i < bookings.size(); i++){
                            rowHistoryData[0] = bookings.get(i).getBookingID();
                            rowHistoryData[1] = bookings.get(i).getStudentID();
                            rowHistoryData[2] = bookings.get(i).getStudentFName() + " " + bookings.get(i).getStudentLName();
                            rowHistoryData[3] = bookings.get(i).getLessonName();
                            rowHistoryData[4] = bookings.get(i).getLessonWeek();
                            rowHistoryData[5] = bookings.get(i).getLessonDay();
                            rowHistoryData[6] = bookings.get(i).getLessonPeriod();
                            rowHistoryData[7] = bookings.get(i).getLessonStatus();

                            modelHistory.addRow(rowHistoryData);
                        }

                        DefaultTableModel modelAllLessons = (DefaultTableModel) jtAllTimeTable.getModel();            
                        modelAllLessons.setRowCount(0);
                        jtAllTimeTable.setDefaultRenderer(Object.class, new Render());
                        JButton btnzy = new JButton("Book");
                        btnzy.setName("b");

                        Object[] rowData3 = new Object[allLessons.size()];
                        for (int i = 0; i < allLessons.size(); i++){
                            rowData3[0] = allLessons.get(i).getWeek();
                            rowData3[1] = allLessons.get(i).getDay();
                            rowData3[2] = allLessons.get(i).getPeriod();
                            rowData3[3] = allLessons.get(i).getName();
                            rowData3[4] = allLessons.get(i).getPrice();
                            rowData3[5] = allLessons.get(i).getSlot();
                            rowData3[6] = btnzy;

                            modelAllLessons.addRow(rowData3);
                        }

                        DefaultTableModel modelBook = (DefaultTableModel) jtAttend.getModel();
                        modelBook.setRowCount(0);
                        jtAttend.setDefaultRenderer(Object.class, new Render());
                        JButton btn2 = new JButton("Attend");
                        btn2.setName("at");

                        JButton btn3 = new JButton("Change");
                        btn3.setName("ch");

                        JButton btn4 = new JButton("Cancel");
                        btn4.setName("x");


                        Object rowBookData[] = new Object[bookings.size()];
                        for (int k = 0; k < bookings.size(); k++){
                            rowBookData[0] = bookings.get(k).getBookingID();
                            rowBookData[1] = bookings.get(k).getLessonName();
                            rowBookData[2] = bookings.get(k).getLessonWeek();
                            rowBookData[3] = bookings.get(k).getLessonDay();
                            rowBookData[4] = bookings.get(k).getLessonPeriod();
                            rowBookData[5] = bookings.get(k).getLessonStatus();

                            if (bookings.get(k).getLessonStatus() == "Attended"){
                                rowBookData[6] = "";
                                rowBookData[7] = "";
                                rowBookData[8] = "";

                            }else if (bookings.get(k).getLessonStatus() == "Cancelled"){
                                rowBookData[6] = "";
                                rowBookData[7] = "";
                                rowBookData[8] = "";

                            }else{
                                rowBookData[6] = btn2;
                                rowBookData[7] = btn3;
                                rowBookData[8] = btn4;
                            }



                            modelBook.addRow(rowBookData);
                        }

                        JOptionPane.showMessageDialog(rootPane, "Booking with ID: " + bkID + " was Changed from " + LPeriod + " " + LName + " Lesson" + " to " + LesPeriod + " " + LesName + " Lesson Successfully", "Booking Changed", JOptionPane.INFORMATION_MESSAGE);
                        pgAllTimeTable.setVisible(false);
                        pgAttend.setVisible(true);
                        pgSaturday.setVisible(false);
                        pgDashboard.setVisible(false);
                        pgBookings.setVisible(false);
                        pgLessonReport.setVisible(false);
                        pgExerciseReport.setVisible(false);
                        pgStudents.setVisible(false);
                        pgYoga.setVisible(false);
                        pgSunday.setVisible(false);
                        pgZumba.setVisible(false);
                        pgBoxFit.setVisible(false);
                        pgBodyBlitz.setVisible(false);
                        
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Sorry, Student with Student ID: " + studentID + " has a Lesson already booked at this particular period.", "Student not Free", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Sorry, Student with Student ID: " + studentID + " has already booked this lesson.", "Lesson already booked", JOptionPane.ERROR_MESSAGE);
            }
            
        }else if(remSlot <= 0){
            JOptionPane.showMessageDialog(rootPane, "Sorry, This Lesson has no slot available at this Week and Period.", "Slot Fully Booked", JOptionPane.ERROR_MESSAGE);
        }
        
    }
        
    private void cancelLesson(int a){
        int opt = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to cancel " + bookings.get(a).getLessonPeriod() + " " + bookings.get(a).getLessonName() + " Booking?", "Cancel Bookings", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(opt == 0){
            JTable jt = jtAttend, jt2 = jt; 
            ArrayList<Lesson> listArray = yogaLessons, listArray2 = listArray;
            String LesName = bookings.get(a).getLessonName();
            String LesDay = bookings.get(a).getLessonDay();
            String LesPeriod = bookings.get(a).getLessonPeriod();
            String LesWeek = bookings.get(a).getLessonWeek();
            
            bookings.get(a).setLessonStatus("Cancelled");
            increaseSlot(allLessons, LesName, LesDay, LesWeek, LesPeriod);
            
            if(LesName == "Yoga" && LesDay == "Saturday"){
                //increaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                increaseSlot(yogaLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = jtSaturday;
                jt2 = jtYoga;
                listArray = saturdayLessons;
                listArray2 = yogaLessons;
            }else if(LesName == "Yoga" && LesDay == "Sunday"){
                //increaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                increaseSlot(yogaLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = jtSunday;
                jt2 = jtYoga;
                listArray = sundayLessons;
                listArray2 = yogaLessons;
            }else if(LesName == "Zumba" && LesDay == "Saturday"){
                //increaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                increaseSlot(zumbaLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = jtSaturday;
                jt2 = jtZumba;
                listArray = saturdayLessons;
                listArray2 = zumbaLessons;
            }else if(LesName == "Zumba" && LesDay == "Sunday"){
                //increaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                increaseSlot(zumbaLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = jtSunday;
                jt2 = jtZumba;
                listArray = sundayLessons;
                listArray2 = zumbaLessons;
            }else if(LesName == "Body Blitz" && LesDay == "Saturday"){
                //increaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                increaseSlot(bodyblitzLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = jtSaturday;
                jt2 = jtBodyBlitz;
                listArray = saturdayLessons;
                listArray2 = bodyblitzLessons;
            }else if(LesName == "Body Blitz" && LesDay == "Sunday"){
                //increaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                increaseSlot(bodyblitzLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = jtSunday;
                jt2 = jtBodyBlitz;
                listArray = sundayLessons;
                listArray2 = bodyblitzLessons;
            }else if(LesName == "Box Fit" && LesDay == "Saturday"){
                //increaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                increaseSlot(boxfitLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = jtSaturday;
                jt2 = jtBoxFit;
                listArray = saturdayLessons;
                listArray2 = boxfitLessons;
            }else if(LesName == "Box Fit" && LesDay == "Sunday"){
                //increaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                increaseSlot(boxfitLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = jtSunday;
                jt2 = jtBoxFit;
                listArray = sundayLessons;
                listArray2 = boxfitLessons;
            }
            
            DefaultTableModel model = (DefaultTableModel) jt.getModel();
            model.setRowCount(0);
            jt.setDefaultRenderer(Object.class, new Render());
            JButton btn1 = new JButton("Book");
            btn1.setName("b");

            Object[] rowData = new Object[listArray.size()];
            for (int j = 0; j < listArray.size(); j++){
                rowData[0] = listArray.get(j).getWeek();
                rowData[1] = listArray.get(j).getName();                            
                rowData[2] = listArray.get(j).getPeriod();
                rowData[3] = listArray.get(j).getPrice();
                rowData[4] = listArray.get(j).getSlot();
                rowData[5] = btn1;  

                model.addRow(rowData);
            }

            DefaultTableModel model2 = (DefaultTableModel) jt2.getModel();
            model2.setRowCount(0);
            jt2.setDefaultRenderer(Object.class, new Render());
            JButton btn1a = new JButton("Book");
            btn1a.setName("b");

            Object[] rowData2 = new Object[listArray2.size()];
            for (int m = 0; m < listArray2.size(); m++){
                rowData2[0] = listArray2.get(m).getWeek();
                rowData2[1] = listArray2.get(m).getDay();
                rowData2[2] = listArray2.get(m).getPeriod();
                rowData2[3] = listArray2.get(m).getPrice();
                rowData2[4] = listArray2.get(m).getSlot();
                rowData2[5] = btn1a;  

                model2.addRow(rowData2);
            }
            
            DefaultTableModel modelHistory = (DefaultTableModel) jtBookings.getModel();
            Object rowHistoryData[] = new Object[bookings.size()];
            for (int i = 0; i < bookings.size(); i++){
                rowHistoryData[0] = bookings.get(i).getBookingID();
                rowHistoryData[1] = bookings.get(i).getStudentID();
                rowHistoryData[2] = bookings.get(i).getStudentFName() + " " + bookings.get(i).getStudentLName();
                rowHistoryData[3] = bookings.get(i).getLessonName();
                rowHistoryData[4] = bookings.get(i).getLessonWeek();
                rowHistoryData[5] = bookings.get(i).getLessonDay();
                rowHistoryData[6] = bookings.get(i).getLessonPeriod();
                rowHistoryData[7] = bookings.get(i).getLessonStatus();

                modelHistory.addRow(rowHistoryData);
            }
            
            DefaultTableModel modelAllLessons = (DefaultTableModel) jtAllTimeTable.getModel();            
            modelAllLessons.setRowCount(0);
            jtAllTimeTable.setDefaultRenderer(Object.class, new Render());
            JButton btnzy = new JButton("Book");
            btnzy.setName("b");

            Object[] rowData3 = new Object[allLessons.size()];
            for (int i = 0; i < allLessons.size(); i++){
                rowData3[0] = allLessons.get(i).getWeek();
                rowData3[1] = allLessons.get(i).getDay();
                rowData3[2] = allLessons.get(i).getPeriod();
                rowData3[3] = allLessons.get(i).getName();
                rowData3[4] = allLessons.get(i).getPrice();
                rowData3[5] = allLessons.get(i).getSlot();
                rowData3[6] = btnzy;

                modelAllLessons.addRow(rowData3);
            }

            DefaultTableModel modelBook = (DefaultTableModel) jtAttend.getModel();
            modelBook.setRowCount(0);
            jtAttend.setDefaultRenderer(Object.class, new Render());
            JButton btn2 = new JButton("Attend");
            btn2.setName("at");

            JButton btn3 = new JButton("Change");
            btn3.setName("ch");

            JButton btn4 = new JButton("Cancel");
            btn4.setName("x");


            Object rowBookData[] = new Object[bookings.size()];
            for (int k = 0; k < bookings.size(); k++){
                rowBookData[0] = bookings.get(k).getBookingID();
                rowBookData[1] = bookings.get(k).getLessonName();
                rowBookData[2] = bookings.get(k).getLessonWeek();
                rowBookData[3] = bookings.get(k).getLessonDay();
                rowBookData[4] = bookings.get(k).getLessonPeriod();
                rowBookData[5] = bookings.get(k).getLessonStatus();

                if (bookings.get(k).getLessonStatus() == "Attended"){
                    rowBookData[6] = "";
                    rowBookData[7] = "";
                    rowBookData[8] = "";

                }else if (bookings.get(k).getLessonStatus() == "Cancelled"){
                    rowBookData[6] = "";
                    rowBookData[7] = "";
                    rowBookData[8] = "";

                }else{
                    rowBookData[6] = btn2;
                    rowBookData[7] = btn3;
                    rowBookData[8] = btn4;
                }



                modelBook.addRow(rowBookData);
            }

            JOptionPane.showMessageDialog(rootPane, bookings.get(a).getLessonPeriod() + " " + bookings.get(a).getLessonName() + " Lesson has being Cancelled Successfully", "Booking Cancelled", JOptionPane.INFORMATION_MESSAGE);
            
            pgAllTimeTable.setVisible(false);
            pgSaturday.setVisible(false);
            pgDashboard.setVisible(false);
            pgAttend.setVisible(true);
            pgBookings.setVisible(false);
            pgLessonReport.setVisible(false);
            pgExerciseReport.setVisible(false);
            pgStudents.setVisible(false);
            pgYoga.setVisible(false);
            pgSunday.setVisible(false);
            pgZumba.setVisible(false);
            pgBoxFit.setVisible(false);
            pgBodyBlitz.setVisible(false);
            
        }else{
            return;
        }
    }
    
    private void mayBook(int a, int remSlot, JTable jt, ArrayList<Lesson> listArray, String LesDay ){
        if(remSlot <= 4 && remSlot != 0){
        //Validate Student with student's ID
        String sid = JOptionPane.showInputDialog(rootPane, "Please enter the student's ID.", "Input Student ID", JOptionPane.QUESTION_MESSAGE);
        int studentID = Integer.parseInt(sid);
        String FName = null, LName = null, LesName, LesWeek, LesPeriod, lastBook, lastBookName, curBookID, bookID;
        double LesPrice;
        int lastBookID, Age = 0, bok;
        char Sex = 0;
        LesName = listArray.get(a).getName();
        LesWeek = listArray.get(a).getWeek();
        LesPeriod = listArray.get(a).getPeriod();
        LesPrice = listArray.get(a).getPrice();
        lastBookID = 0;
        lastBookName = "";

        if (isStudent(studentID)){
            if (canBookLesson(studentID, LesName, LesWeek, LesPeriod, LesDay)){
                if(isStudentFree(studentID, LesWeek, LesPeriod, LesDay)){
                    int opt1 = JOptionPane.showConfirmDialog(rootPane, "Do you want to book " + listArray.get(a).getPeriod() + " " + listArray.get(a).getName() + " Lessons @ £" + listArray.get(a).getPrice() + "?", "Confirm Booking", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (opt1 == 0){
                        for (Students s : student){
                            if(s.getStudenID() == studentID){
                                FName = s.getStudentFName();
                                LName = s.getStudentLName();
                                Age = s.getStudentAge();
                                Sex = s.getStudentSex();
                            }
                        }

                        //Generating Booking ID                                  
                        for (int b = 0; b < bookings.size(); b++){
                            if (bookings.get(b).getLessonName() == "Yoga"){
                                bookingYoga.add( new Booking(bookings.get(b).getBookingID(), bookings.get(b).getStudentID(), bookings.get(b).getStudentFName(), bookings.get(b).getStudentLName(), bookings.get(b).getStudentAge(), bookings.get(b).getStudentSex(), bookings.get(b).getLessonName(), bookings.get(b).getLessonWeek(), bookings.get(b).getLessonDay(), bookings.get(b).getLessonPeriod(), bookings.get(b).getLessonStatus(), bookings.get(b).getLessonReview(), bookings.get(b).getLessonRating(), bookings.get(b).getBookingMonth(), bookings.get(b).getLessonPrice()));

                            }else if (bookings.get(b).getLessonName() == "Zumba"){
                                bookingZumba.add( new Booking(bookings.get(b).getBookingID(), bookings.get(b).getStudentID(), bookings.get(b).getStudentFName(), bookings.get(b).getStudentLName(), bookings.get(b).getStudentAge(), bookings.get(b).getStudentSex(), bookings.get(b).getLessonName(), bookings.get(b).getLessonWeek(), bookings.get(b).getLessonDay(), bookings.get(b).getLessonPeriod(), bookings.get(b).getLessonStatus(), bookings.get(b).getLessonReview(), bookings.get(b).getLessonRating(), bookings.get(b).getBookingMonth(), bookings.get(b).getLessonPrice()));

                            }else if (bookings.get(b).getLessonName() == "Box Fit"){
                                bookingBoxFit.add( new Booking(bookings.get(b).getBookingID(), bookings.get(b).getStudentID(), bookings.get(b).getStudentFName(), bookings.get(b).getStudentLName(), bookings.get(b).getStudentAge(), bookings.get(b).getStudentSex(), bookings.get(b).getLessonName(), bookings.get(b).getLessonWeek(), bookings.get(b).getLessonDay(), bookings.get(b).getLessonPeriod(), bookings.get(b).getLessonStatus(), bookings.get(b).getLessonReview(), bookings.get(b).getLessonRating(), bookings.get(b).getBookingMonth(), bookings.get(b).getLessonPrice()));

                            }else if (bookings.get(b).getLessonName() == "Body Blitz"){
                                bookingBodyBlitz.add( new Booking(bookings.get(b).getBookingID(), bookings.get(b).getStudentID(), bookings.get(b).getStudentFName(), bookings.get(b).getStudentLName(), bookings.get(b).getStudentAge(), bookings.get(b).getStudentSex(), bookings.get(b).getLessonName(), bookings.get(b).getLessonWeek(), bookings.get(b).getLessonDay(), bookings.get(b).getLessonPeriod(), bookings.get(b).getLessonStatus(), bookings.get(b).getLessonReview(), bookings.get(b).getLessonRating(), bookings.get(b).getBookingMonth(), bookings.get(b).getLessonPrice()));

                            }
                        }    

                        if (LesName == "Yoga"){
                            bok = bookingYoga.size();
                            lastBook = bookingYoga.get(bok -1).getBookingID();
                            lastBookID = Integer.parseInt(lastBook.substring(4));
                            lastBookName = "BIYG";

                        }else if (LesName == "Zumba"){
                            bok = bookingZumba.size();
                            lastBook = bookingZumba.get(bok -1).getBookingID();
                            lastBookID = Integer.parseInt(lastBook.substring(4));
                            lastBookName = "BIZB";

                        }else if (LesName == "Box Fit"){
                            bok = bookingBoxFit.size();
                            lastBook = bookingBoxFit.get(bok -1).getBookingID();
                            lastBookID = Integer.parseInt(lastBook.substring(4));
                            lastBookName = "BIBF";

                        }else if (LesName == "Body Blitz"){
                            bok = bookingBodyBlitz.size();
                            lastBook = bookingBodyBlitz.get(bok -1).getBookingID();
                            lastBookID = Integer.parseInt(lastBook.substring(4));
                            lastBookName = "BIBB";

                        }

                        lastBookID = lastBookID + 1;
                        curBookID = String.valueOf(lastBookID);

                        if (curBookID.length() == 1){
                            curBookID = "00" + curBookID;
                        }else if (curBookID.length() == 2){
                            curBookID = "0" + curBookID;
                        }else{
                            curBookID = curBookID;
                        }

                        bookID = lastBookName + curBookID;


                        bookings.add(new Booking(bookID, studentID, FName, LName, Age, Sex, LesName, LesWeek, LesDay, LesPeriod, "Booked", "", 0, 9, LesPrice));

                        JTable jt2 = jt; 
                        ArrayList<Lesson> listArray2 = listArray;
                        
                        if(listArray == saturdayLessons || listArray == sundayLessons){
                            
                            if(LesName == "Yoga" && LesDay == "Saturday"){
                                decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(yogaLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtYoga;
                                listArray2 = yogaLessons;
                            }else if(LesName == "Yoga" && LesDay == "Sunday"){
                                decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(yogaLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtYoga;
                                listArray2 = yogaLessons;
                            }else if(LesName == "Zumba" && LesDay == "Saturday"){
                                decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(zumbaLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtZumba;
                                listArray2 = zumbaLessons;
                            }else if(LesName == "Zumba" && LesDay == "Sunday"){
                                decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(zumbaLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtZumba;
                                listArray2 = zumbaLessons;
                            }else if(LesName == "Body Blitz" && LesDay == "Saturday"){
                                decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(bodyblitzLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtBodyBlitz;
                                listArray2 = bodyblitzLessons;
                            }else if(LesName == "Body Blitz" && LesDay == "Sunday"){
                                decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(bodyblitzLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtBodyBlitz;
                                listArray2 = bodyblitzLessons;
                            }else if(LesName == "Box Fit" && LesDay == "Saturday"){
                                decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(boxfitLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtBoxFit;
                                listArray2 = boxfitLessons;
                            }else if(LesName == "Box Fit" && LesDay == "Sunday"){
                                decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(boxfitLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtBoxFit;
                                listArray2 = boxfitLessons;
                            }
                            
                        }else if(listArray == yogaLessons || listArray == zumbaLessons || listArray == bodyblitzLessons || listArray == boxfitLessons){
                            if(LesName == "Yoga" && LesDay == "Saturday"){
                                decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(yogaLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtSaturday;
                                listArray2 = saturdayLessons;
                            }else if(LesName == "Yoga" && LesDay == "Sunday"){
                                decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(yogaLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtSunday;
                                listArray2 = sundayLessons;
                            }else if(LesName == "Zumba" && LesDay == "Saturday"){
                                decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(zumbaLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtSaturday;
                                listArray2 = saturdayLessons;
                            }else if(LesName == "Zumba" && LesDay == "Sunday"){
                                decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(zumbaLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtSunday;
                                listArray2 = sundayLessons;
                            }else if(LesName == "Body Blitz" && LesDay == "Saturday"){
                                decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(bodyblitzLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtSaturday;
                                listArray2 = saturdayLessons;
                            }else if(LesName == "Body Blitz" && LesDay == "Sunday"){
                                decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(bodyblitzLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtSunday;
                                listArray2 = sundayLessons;
                            }else if(LesName == "Box Fit" && LesDay == "Saturday"){
                                decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(boxfitLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtSaturday;
                                listArray2 = saturdayLessons;
                            }else if(LesName == "Box Fit" && LesDay == "Sunday"){
                                decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
                                decreaseSlot(boxfitLessons, LesName, LesDay, LesWeek, LesPeriod);
                                jt2 = jtSunday;
                                listArray2 = sundayLessons;
                            }
                        }
                        
                                                
                        DefaultTableModel model = (DefaultTableModel) jt.getModel();
                        model.setRowCount(0);
                        jt.setDefaultRenderer(Object.class, new Render());
                        JButton btn1 = new JButton("Book");
                        btn1.setName("b");

                        Object[] rowData = new Object[listArray.size()];
                        for (int j = 0; j < listArray.size(); j++){
                            rowData[0] = listArray.get(j).getWeek();
                            if(jt == jtSaturday || jt == jtSunday){
                                rowData[1] = listArray.get(j).getName();
                            }else{
                                rowData[1] = listArray.get(j).getDay();
                            }                            
                            rowData[2] = listArray.get(j).getPeriod();
                            rowData[3] = listArray.get(j).getPrice();
                            rowData[4] = listArray.get(j).getSlot();
                            rowData[5] = btn1;  

                            model.addRow(rowData);
                        }
                        
                        DefaultTableModel model2 = (DefaultTableModel) jt2.getModel();
                        model2.setRowCount(0);
                        jt2.setDefaultRenderer(Object.class, new Render());
                        JButton btn1a = new JButton("Book");
                        btn1a.setName("b");

                        Object[] rowData2 = new Object[listArray2.size()];
                        for (int m = 0; m < listArray2.size(); m++){
                            rowData2[0] = listArray2.get(m).getWeek();
                            if(jt2 == jtSaturday || jt2 == jtSunday){
                                rowData2[1] = listArray2.get(m).getName();
                            }else{
                                rowData2[1] = listArray2.get(m).getDay();
                            }
                            rowData2[2] = listArray2.get(m).getPeriod();
                            rowData2[3] = listArray2.get(m).getPrice();
                            rowData2[4] = listArray2.get(m).getSlot();
                            rowData2[5] = btn1a;  

                            model2.addRow(rowData2);
                        }

                        DefaultTableModel modelAllLessons = (DefaultTableModel) jtAllTimeTable.getModel();            
                        modelAllLessons.setRowCount(0);
                        jtAllTimeTable.setDefaultRenderer(Object.class, new Render());
                        JButton btnzy = new JButton("Book");
                        btnzy.setName("b");

                        Object[] rowData3 = new Object[allLessons.size()];
                        for (int i = 0; i < allLessons.size(); i++){
                            rowData3[0] = allLessons.get(i).getWeek();
                            rowData3[1] = allLessons.get(i).getDay();
                            rowData3[2] = allLessons.get(i).getPeriod();
                            rowData3[3] = allLessons.get(i).getName();
                            rowData3[4] = allLessons.get(i).getPrice();
                            rowData3[5] = allLessons.get(i).getSlot();
                            rowData3[6] = btnzy;

                            modelAllLessons.addRow(rowData3);
                        }
                        
                        DefaultTableModel modelHistory = (DefaultTableModel) jtBookings.getModel();
                        Object rowHistoryData[] = new Object[bookings.size()];
                        for (int i = 0; i < bookings.size(); i++){
                            rowHistoryData[0] = bookings.get(i).getBookingID();
                            rowHistoryData[1] = bookings.get(i).getStudentID();
                            rowHistoryData[2] = bookings.get(i).getStudentFName() + " " + bookings.get(i).getStudentLName();
                            rowHistoryData[3] = bookings.get(i).getLessonName();
                            rowHistoryData[4] = bookings.get(i).getLessonWeek();
                            rowHistoryData[5] = bookings.get(i).getLessonDay();
                            rowHistoryData[6] = bookings.get(i).getLessonPeriod();
                            rowHistoryData[7] = bookings.get(i).getLessonStatus();

                            modelHistory.addRow(rowHistoryData);
                        }

                        DefaultTableModel modelBook = (DefaultTableModel) jtAttend.getModel();
                        modelBook.setRowCount(0);
                        jtAttend.setDefaultRenderer(Object.class, new Render());
                        JButton btn2 = new JButton("Attend");
                        btn2.setName("at");

                        JButton btn3 = new JButton("Change");
                        btn3.setName("ch");

                        JButton btn4 = new JButton("Cancel");
                        btn4.setName("x");


                        Object rowBookData[] = new Object[bookings.size()];
                        for (int k = 0; k < bookings.size(); k++){
                            rowBookData[0] = bookings.get(k).getBookingID();
                            rowBookData[1] = bookings.get(k).getLessonName();
                            rowBookData[2] = bookings.get(k).getLessonWeek();
                            rowBookData[3] = bookings.get(k).getLessonDay();
                            rowBookData[4] = bookings.get(k).getLessonPeriod();
                            rowBookData[5] = bookings.get(k).getLessonStatus();

                            if (bookings.get(k).getLessonStatus() == "Attended"){
                                rowBookData[6] = "";
                                rowBookData[7] = "";
                                rowBookData[8] = "";

                            }else if (bookings.get(k).getLessonStatus() == "Cancelled"){
                                rowBookData[6] = "";
                                rowBookData[7] = "";
                                rowBookData[8] = "";

                            }else{
                                rowBookData[6] = btn2;
                                rowBookData[7] = btn3;
                                rowBookData[8] = btn4;
                            }
                            
                            modelBook.addRow(rowBookData);
                        }

                        JOptionPane.showMessageDialog(rootPane, listArray.get(a).getPeriod() + " " + listArray.get(a).getName() + " Lesson has being booked Successfully", "Booking Completed", JOptionPane.INFORMATION_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Sorry, Student with Student ID: " + studentID + " has a Lesson already booked at this particular period.", "Student not Free", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Sorry, Student with Student ID: " + studentID + " has already booked this lesson.", "Lesson already booked", JOptionPane.ERROR_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(rootPane, "Sorry, Student with Student ID: " + studentID + " not found.", "Student Not Found", JOptionPane.ERROR_MESSAGE);
        }       

    }else if(remSlot == 0){
        JOptionPane.showMessageDialog(rootPane, "Sorry, This Lesson has no slot available at this Week and Period.", "Slot Fully Booked", JOptionPane.ERROR_MESSAGE);
    }
        
    }
        
    private void increaseSlot(ArrayList<Lesson> listArray, String LesName, String LesDay, String LesWeek, String LesPeriod){
        
        for(Lesson l : listArray){
            if(l.getName() == LesName && l.getWeek() == LesWeek && l.getDay() == LesDay && l.getPeriod() == LesPeriod){
                int remslot = l.getSlot();
                remslot = remslot + 1;
                l.setSlot(remslot);
                
            }
        }        
    }
    
    private void decreaseSlot(ArrayList<Lesson> listArray, String LesName, String LesDay, String LesWeek, String LesPeriod){
        
        for(Lesson l : listArray){
            if(l.getName() == LesName && l.getWeek() == LesWeek && l.getDay() == LesDay && l.getPeriod() == LesPeriod){
                int remslot = l.getSlot();
                remslot = remslot - 1;
                l.setSlot(remslot);
                
            }
        }
    }
    
    private static final DecimalFormat df = new DecimalFormat("0.0");
    
    private static final DecimalFormat df2 = new DecimalFormat("0.00");
    
    private void monthlyReport(int m){
        
        double averageYoga = 0;
        int countYoga = 0;
        double averageZumba = 0;
        int countZumba = 0;
        double averageBoxFit = 0;
        int countBoxFit = 0;
        double averageBodyBlitz = 0;
        int countBodyBlitz = 0;
        double averageTotal = 0;
        
        for(Booking b : bookings){
            if(b.getLessonStatus() == "Attended" && b.getBookingMonth() == m){
                if(b.getLessonName() == "Yoga"){
                    averageYoga += b.getLessonRating();
                    countYoga = countYoga + 1;
                }else if(b.getLessonName() == "Zumba"){
                    averageZumba += b.getLessonRating();
                    countZumba = countZumba + 1;
                }else if(b.getLessonName() == "Box Fit"){
                    averageBoxFit += b.getLessonRating();
                    countBoxFit = countBoxFit + 1;
                }else if(b.getLessonName() == "Body Blitz"){
                    averageBodyBlitz += b.getLessonRating();
                    countBodyBlitz = countBodyBlitz + 1;
                }
            } 
         }
        
        averageTotal = (averageBodyBlitz + averageBoxFit + averageYoga + averageZumba) / (countBodyBlitz + countBoxFit + countYoga + countZumba);
        averageBodyBlitz = averageBodyBlitz / countBodyBlitz;
        averageBoxFit = averageBoxFit / countBoxFit;
        averageYoga = averageYoga / countYoga;
        averageZumba = averageZumba / countZumba;
        
        if(String.valueOf(averageBodyBlitz) == "NaN"){
            averageBodyBlitz = 0;
        }
        if(String.valueOf(averageBoxFit) == "NaN"){
            averageBoxFit = 0;
        }
        if(String.valueOf(averageYoga) == "NaN"){
            averageYoga = 0;
        }
        if(String.valueOf(averageZumba) == "NaN"){
            averageZumba = 0;
        }
        if(String.valueOf(averageTotal) == "NaN"){
            averageTotal = 0;
        }
        
        
        
        DefaultTableModel model = (DefaultTableModel) jtReport.getModel();        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        
        jtReport.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jtReport.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jtReport.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        
        jtReport.setValueAt(countBodyBlitz, 0, 2);
        jtReport.setValueAt(df.format(averageBodyBlitz), 0, 3);
        jtReport.setValueAt(countBoxFit, 1, 2);
        jtReport.setValueAt(df.format(averageBoxFit), 1, 3);
        jtReport.setValueAt(countYoga, 2, 2);
        jtReport.setValueAt(df.format(averageYoga), 2, 3);
        jtReport.setValueAt(countZumba, 3, 2);
        jtReport.setValueAt(df.format(averageZumba), 3, 3);
        jtReport.setValueAt(countBodyBlitz + countBoxFit + countYoga + countZumba, 4, 2);
        jtReport.setValueAt(df.format(averageTotal), 4, 3);
        
    }
    
    private void championExercise(int m){
        
        double incomeYoga = 0;
        int countYoga = 0;
        double incomeZumba = 0;
        int countZumba = 0;
        double incomeBoxFit = 0;
        int countBoxFit = 0;
        double incomeBodyBlitz = 0;
        int countBodyBlitz = 0;
        
        for(Booking b : bookings){
            if(b.getLessonStatus() == "Attended" && b.getBookingMonth() == m){
                if(b.getLessonName() == "Yoga"){
                    countYoga = countYoga + 1;
                    //incomeYoga += b.getLessonPrice();
                }else if(b.getLessonName() == "Zumba"){
                    countZumba = countZumba + 1;
                    //incomeZumba += b.getLessonPrice();
                }else if(b.getLessonName() == "Box Fit"){
                    countBoxFit = countBoxFit + 1;
                    //incomeBoxFit += b.getLessonPrice();
                }else if(b.getLessonName() == "Body Blitz"){
                    countBodyBlitz = countBodyBlitz + 1;
                    //incomeBodyBlitz += b.getLessonPrice();
                }
            }
         }
        
        incomeYoga = countYoga * 12.86;
        incomeZumba = countZumba * 15.78;
        incomeBoxFit = countBoxFit * 17.93;
        incomeBodyBlitz = countBodyBlitz * 20.74;
        
        DefaultTableModel model = (DefaultTableModel) jtExeReport.getModel();        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        
        jtExeReport.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jtExeReport.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jtExeReport.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jtExeReport.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        
        if (incomeYoga > incomeZumba && incomeYoga > incomeBoxFit && incomeYoga > incomeBodyBlitz){
            model.setRowCount(0);
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            jtExeReport.setValueAt("1.", 0, 0);
            jtExeReport.setValueAt("Yoga", 0, 1);
            jtExeReport.setValueAt(countYoga, 0, 2);
            jtExeReport.setValueAt(12.86, 0, 3);
            jtExeReport.setValueAt(df2.format(incomeYoga), 0, 4);
            
        }else if (incomeZumba > incomeYoga && incomeZumba > incomeBoxFit && incomeZumba > incomeBodyBlitz){
            //DefaultTableModel model = (DefaultTableModel) jtExeReport.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            jtExeReport.setValueAt("1.", 0, 0);
            jtExeReport.setValueAt("Zumba", 0, 1);
            jtExeReport.setValueAt(countZumba, 0, 2);
            jtExeReport.setValueAt(15.78, 0, 3);
            jtExeReport.setValueAt(df2.format(incomeZumba), 0, 4);
            
        }else if (incomeBoxFit > incomeYoga && incomeBoxFit > incomeZumba && incomeBoxFit > incomeBodyBlitz){
            //DefaultTableModel model = (DefaultTableModel) jtExeReport.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            jtExeReport.setValueAt("1.", 0, 0);
            jtExeReport.setValueAt("Box Fit", 0, 1);
            jtExeReport.setValueAt(countBoxFit, 0, 2);
            jtExeReport.setValueAt(17.93, 0, 3);
            jtExeReport.setValueAt(df2.format(incomeBoxFit), 0, 4);
            
        }else if (incomeBodyBlitz > incomeYoga && incomeBodyBlitz > incomeZumba && incomeBodyBlitz > incomeBoxFit){
            //DefaultTableModel model = (DefaultTableModel) jtExeReport.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            jtExeReport.setValueAt("1.", 0, 0);
            jtExeReport.setValueAt("Body Blitz", 0, 1);
            jtExeReport.setValueAt(countBodyBlitz, 0, 2);
            jtExeReport.setValueAt(20.74, 0, 3);
            jtExeReport.setValueAt(df2.format(incomeBodyBlitz), 0, 4);
            
        }else if (incomeYoga == incomeZumba && incomeYoga > incomeBoxFit && incomeYoga > incomeBodyBlitz){
            //DefaultTableModel model = (DefaultTableModel) jtExeReport.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            
            jtExeReport.setValueAt("1.", 0, 0);
            jtExeReport.setValueAt("Yoga", 0, 1);
            jtExeReport.setValueAt(countYoga, 0, 2);
            jtExeReport.setValueAt(12.86, 0, 3);
            jtExeReport.setValueAt(df2.format(incomeYoga), 0, 4);
            
            jtExeReport.setValueAt("2.", 1, 0);
            jtExeReport.setValueAt("Zumba", 1, 1);
            jtExeReport.setValueAt(countZumba, 1, 2);
            jtExeReport.setValueAt(15.78, 1, 3);
            jtExeReport.setValueAt(df2.format(incomeZumba), 1, 4);
            
        }else if (incomeYoga > incomeZumba && incomeYoga == incomeBoxFit && incomeYoga > incomeBodyBlitz){
            //DefaultTableModel model = (DefaultTableModel) jtExeReport.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            
            jtExeReport.setValueAt("1.", 0, 0);
            jtExeReport.setValueAt("Yoga", 0, 1);
            jtExeReport.setValueAt(countYoga, 0, 2);
            jtExeReport.setValueAt(12.86, 0, 3);
            jtExeReport.setValueAt(df2.format(incomeYoga), 0, 4);
            
            jtExeReport.setValueAt("2.", 1, 0);
            jtExeReport.setValueAt("Box Fit", 1, 1);
            jtExeReport.setValueAt(countBoxFit, 1, 2);
            jtExeReport.setValueAt(17.93, 1, 3);
            jtExeReport.setValueAt(df2.format(incomeBoxFit), 1, 4);
            
        }else if (incomeYoga > incomeZumba && incomeYoga > incomeBoxFit && incomeYoga == incomeBodyBlitz){
            //DefaultTableModel model = (DefaultTableModel) jtExeReport.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            
            jtExeReport.setValueAt("1.", 0, 0);
            jtExeReport.setValueAt("Yoga", 0, 1);
            jtExeReport.setValueAt(countYoga, 0, 2);
            jtExeReport.setValueAt(12.86, 0, 3);
            jtExeReport.setValueAt(df2.format(incomeYoga), 0, 4);
            
            jtExeReport.setValueAt("2.", 1, 0);
            jtExeReport.setValueAt("Body Blitz", 1, 1);
            jtExeReport.setValueAt(countBodyBlitz, 1, 2);
            jtExeReport.setValueAt(20.74, 1, 3);
            jtExeReport.setValueAt(df2.format(incomeBodyBlitz), 1, 4);
            
        }else if (incomeZumba == incomeBoxFit && incomeZumba > incomeBodyBlitz && incomeZumba > incomeYoga){
            //DefaultTableModel model = (DefaultTableModel) jtExeReport.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            
            jtExeReport.setValueAt("1.", 0, 0);
            jtExeReport.setValueAt("Zumba", 0, 1);
            jtExeReport.setValueAt(countZumba, 0, 2);
            jtExeReport.setValueAt(15.78, 0, 3);
            jtExeReport.setValueAt(df2.format(incomeZumba), 0, 4);
            
            jtExeReport.setValueAt("2.", 1, 0);
            jtExeReport.setValueAt("Box Fit", 1, 1);
            jtExeReport.setValueAt(countBoxFit, 1, 2);
            jtExeReport.setValueAt(17.93, 1, 3);
            jtExeReport.setValueAt(df2.format(incomeBoxFit), 1, 4);
            
        }else if (incomeZumba > incomeBoxFit && incomeZumba == incomeBodyBlitz && incomeZumba > incomeYoga){
            //DefaultTableModel model = (DefaultTableModel) jtExeReport.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            
            jtExeReport.setValueAt("1.", 0, 0);
            jtExeReport.setValueAt("Zumba", 0, 1);
            jtExeReport.setValueAt(countZumba, 0, 2);
            jtExeReport.setValueAt(15.78, 0, 3);
            jtExeReport.setValueAt(df2.format(incomeZumba), 0, 4);
            
            jtExeReport.setValueAt("2.", 1, 0);
            jtExeReport.setValueAt("Body Blitz", 1, 1);
            jtExeReport.setValueAt(countBodyBlitz, 1, 2);
            jtExeReport.setValueAt(20.74, 1, 3);
            jtExeReport.setValueAt(df2.format(incomeBodyBlitz), 1, 4);
            
        }else if (incomeBoxFit > incomeYoga && incomeBoxFit == incomeBodyBlitz && incomeBoxFit > incomeZumba){
            //DefaultTableModel model = (DefaultTableModel) jtExeReport.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            
            jtExeReport.setValueAt("1.", 0, 0);
            jtExeReport.setValueAt("Box Fit", 0, 1);
            jtExeReport.setValueAt(countBoxFit, 0, 2);
            jtExeReport.setValueAt(17.93, 0, 3);
            jtExeReport.setValueAt(df2.format(incomeBoxFit), 0, 4);
            
            jtExeReport.setValueAt("2.", 1, 0);
            jtExeReport.setValueAt("Body Blitz", 1, 1);
            jtExeReport.setValueAt(countBodyBlitz, 1, 2);
            jtExeReport.setValueAt(20.74, 1, 3);
            jtExeReport.setValueAt(df2.format(incomeBodyBlitz), 1, 4);
            
        }else if (incomeYoga == incomeZumba && incomeYoga == incomeBoxFit && incomeYoga > incomeBodyBlitz){
            //DefaultTableModel model = (DefaultTableModel) jtExeReport.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            
            jtExeReport.setValueAt("1.", 0, 0);
            jtExeReport.setValueAt("Yoga", 0, 1);
            jtExeReport.setValueAt(countYoga, 0, 2);
            jtExeReport.setValueAt(12.86, 0, 3);
            jtExeReport.setValueAt(df2.format(incomeYoga), 0, 4);
            
            jtExeReport.setValueAt("2.", 1, 0);
            jtExeReport.setValueAt("Zumba", 1, 1);
            jtExeReport.setValueAt(countZumba, 1, 2);
            jtExeReport.setValueAt(15.78, 1, 3);
            jtExeReport.setValueAt(df2.format(incomeZumba), 1, 4);
            
            jtExeReport.setValueAt("3.", 2, 0);
            jtExeReport.setValueAt("Box Fit", 2, 1);
            jtExeReport.setValueAt(countBoxFit, 2, 2);
            jtExeReport.setValueAt(17.93, 2, 3);
            jtExeReport.setValueAt(df2.format(incomeBoxFit), 2, 4);
            
        }else if (incomeYoga > incomeZumba && incomeYoga == incomeBoxFit && incomeYoga == incomeBodyBlitz){
            //DefaultTableModel model = (DefaultTableModel) jtExeReport.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            
            jtExeReport.setValueAt("1.", 0, 0);
            jtExeReport.setValueAt("Yoga", 0, 1);
            jtExeReport.setValueAt(countYoga, 0, 2);
            jtExeReport.setValueAt(12.86, 0, 3);
            jtExeReport.setValueAt(df2.format(incomeYoga), 0, 4);
            
            jtExeReport.setValueAt("2.", 1, 0);
            jtExeReport.setValueAt("Box Fit", 1, 1);
            jtExeReport.setValueAt(countBoxFit, 1, 2);
            jtExeReport.setValueAt(17.93, 1, 3);
            jtExeReport.setValueAt(df2.format(incomeBoxFit), 1, 4);
            
            jtExeReport.setValueAt("3.", 2, 0);
            jtExeReport.setValueAt("Body Blitz", 2, 1);
            jtExeReport.setValueAt(countBodyBlitz, 2, 2);
            jtExeReport.setValueAt(20.74, 2, 3);
            jtExeReport.setValueAt(df2.format(incomeBodyBlitz), 2, 4);
            
        }else if (incomeYoga == incomeZumba && incomeYoga == incomeBoxFit && incomeYoga == incomeBodyBlitz && incomeYoga != 0){
            //DefaultTableModel model = (DefaultTableModel) jtExeReport.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            
            jtExeReport.setValueAt("1.", 0, 0);
            jtExeReport.setValueAt("Yoga", 0, 1);
            jtExeReport.setValueAt(countYoga, 0, 2);
            jtExeReport.setValueAt(12.86, 0, 3);
            jtExeReport.setValueAt(df2.format(incomeYoga), 0, 4);
            
            jtExeReport.setValueAt("2.", 1, 0);
            jtExeReport.setValueAt("Box Fit", 1, 1);
            jtExeReport.setValueAt(countBoxFit, 1, 2);
            jtExeReport.setValueAt(17.93, 1, 3);
            jtExeReport.setValueAt(df2.format(incomeBoxFit), 1, 4);
            
            jtExeReport.setValueAt("3.", 2, 0);
            jtExeReport.setValueAt("Body Blitz", 2, 1);
            jtExeReport.setValueAt(countBodyBlitz, 2, 2);
            jtExeReport.setValueAt(20.74, 2, 3);
            jtExeReport.setValueAt(df2.format(incomeBodyBlitz), 2, 4);
            
            jtExeReport.setValueAt("4.", 3, 0);
            jtExeReport.setValueAt("Zumba", 3, 1);
            jtExeReport.setValueAt(countZumba, 3, 2);
            jtExeReport.setValueAt(15.78, 3, 3);
            jtExeReport.setValueAt(df2.format(incomeZumba), 3, 4);
            
        }else if (incomeYoga == incomeZumba && incomeYoga == incomeBoxFit && incomeYoga == incomeBodyBlitz && incomeYoga == 0){
            //DefaultTableModel model = (DefaultTableModel) jtExeReport.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3", "Column 2", "Column 3"});
            
            jtExeReport.setValueAt("", 0, 0);
            jtExeReport.setValueAt("", 0, 1);
            jtExeReport.setValueAt("", 0, 2);
            jtExeReport.setValueAt("", 0, 3);
            jtExeReport.setValueAt("", 0, 4);
            
        }
        
    }
    
    private void newStudent(){
        
        JTextField sFirstName = new JTextField();
        JTextField sLastName = new JTextField();
        JTextField sAge = new JTextField();
        String sSex = "";
        //JTextField sSex = new JTextField();
        
        Object[] fields = {
            "First Name: ", sFirstName,
            "Last Name: ", sLastName,
            "Age: ", sAge
        };
        
        int newStudentID = student.get(student.size() - 1).getStudenID() + 1;
        
        String[] responses = {"Next", "Cancel"};
        String[] responses2 = {"Add New", "Cancel"};
        String[] stuSex = {"", "M", "F"};
        int ans = JOptionPane.showOptionDialog(rootPane, fields, "Add New Student", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, responses, 0);
        if (ans == 0){
            sSex = (String) JOptionPane.showInputDialog(rootPane, "Please select Gender of Student.", "Select a Gender", JOptionPane.QUESTION_MESSAGE, null, stuSex, stuSex[0]);
            
            student.add(new Students(newStudentID, Integer.parseInt(sAge.getText()), sFirstName.getText(), sLastName.getText(), sSex.charAt(0)));
            
        }else{
            return;
        }
        
        DefaultTableModel modelStudents = (DefaultTableModel) jtStudents.getModel();
        modelStudents.setRowCount(0);        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        
        jtStudents.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jtStudents.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        jtStudents.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        Object[] rowStudentData = new Object[student.size()];
        for (int i = 0; i < student.size(); i++){
            rowStudentData[0] = i + 1;
            rowStudentData[1] = student.get(i).getStudenID();
            rowStudentData[2] = student.get(i).getStudentFName();
            rowStudentData[3] = student.get(i).getStudentLName();
            rowStudentData[4] = student.get(i).getStudentAge();
            rowStudentData[5] = student.get(i).getStudentSex();
            
            modelStudents.addRow(rowStudentData);
        }
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpSidebar = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        btnBook = new javax.swing.JPanel();
        lblBook = new javax.swing.JLabel();
        btnAttend = new javax.swing.JPanel();
        lblAttend = new javax.swing.JLabel();
        btnBooking = new javax.swing.JPanel();
        lblBooking = new javax.swing.JLabel();
        btnLessonReport = new javax.swing.JPanel();
        lblLessonReport = new javax.swing.JLabel();
        btnExerciseReport = new javax.swing.JPanel();
        lblExerciseReport = new javax.swing.JLabel();
        btnStudents = new javax.swing.JPanel();
        lblStudents = new javax.swing.JLabel();
        pgDashboard = new javax.swing.JPanel();
        jpDate = new javax.swing.JPanel();
        lblDateTime = new javax.swing.JLabel();
        btnBookingHistory = new javax.swing.JButton();
        btnBookLesson = new javax.swing.JButton();
        btnManageBookings = new javax.swing.JButton();
        btnLesReport = new javax.swing.JButton();
        btnChampReport = new javax.swing.JButton();
        btnRecords = new javax.swing.JButton();
        jpTitle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pgAttend = new javax.swing.JPanel();
        jpDate2 = new javax.swing.JPanel();
        lblDateTime2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtAttend = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        pgAllTimeTable = new javax.swing.JPanel();
        jpDate13 = new javax.swing.JPanel();
        lblDateTime13 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtAllTimeTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        lblBKID = new javax.swing.JLabel();
        pgBookings = new javax.swing.JPanel();
        jpDate3 = new javax.swing.JPanel();
        lblDateTime3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtBookings = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        pgLessonReport = new javax.swing.JPanel();
        jpDate4 = new javax.swing.JPanel();
        lblDateTime4 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtReport = new javax.swing.JTable();
        lblReport = new javax.swing.JLabel();
        pgExerciseReport = new javax.swing.JPanel();
        jpDate5 = new javax.swing.JPanel();
        lblDateTime5 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jtExeReport = new javax.swing.JTable();
        lblExeReport = new javax.swing.JLabel();
        pgStudents = new javax.swing.JPanel();
        jpDate6 = new javax.swing.JPanel();
        lblDateTime6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAddStudent = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jtStudents = new javax.swing.JTable();
        pgYoga = new javax.swing.JPanel();
        jpDate7 = new javax.swing.JPanel();
        lblDateTime7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtYoga = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        pgSaturday = new javax.swing.JPanel();
        jpDate8 = new javax.swing.JPanel();
        lblDateTime8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtSaturday = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pgSunday = new javax.swing.JPanel();
        jpDate9 = new javax.swing.JPanel();
        lblDateTime9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtSunday = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        pgZumba = new javax.swing.JPanel();
        jpDate10 = new javax.swing.JPanel();
        lblDateTime10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtZumba = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        pgBoxFit = new javax.swing.JPanel();
        jpDate11 = new javax.swing.JPanel();
        lblDateTime11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtBoxFit = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        pgBodyBlitz = new javax.swing.JPanel();
        jpDate12 = new javax.swing.JPanel();
        lblDateTime12 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtBodyBlitz = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booking System");
        setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSidebar.setBackground(new java.awt.Color(54, 33, 89));

        btnDashboard.setBackground(new java.awt.Color(122, 72, 221));
        btnDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDashboard.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        lblDashboard.setText("Dashboard");
        lblDashboard.setToolTipText("Dashboard");
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });
        btnDashboard.add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 275, 50));

        btnBook.setBackground(new java.awt.Color(54, 33, 89));
        btnBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBook.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblBook.setForeground(new java.awt.Color(255, 255, 255));
        lblBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        lblBook.setText("Book a Lesson");
        lblBook.setToolTipText("Book a Lesson");
        lblBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBookMouseClicked(evt);
            }
        });
        btnBook.add(lblBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 275, 50));

        btnAttend.setBackground(new java.awt.Color(54, 33, 89));
        btnAttend.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAttend.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblAttend.setForeground(new java.awt.Color(255, 255, 255));
        lblAttend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/attend.png"))); // NOI18N
        lblAttend.setText("Manage Bookings");
        lblAttend.setToolTipText("Manage Bookings");
        lblAttend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAttendMouseClicked(evt);
            }
        });
        btnAttend.add(lblAttend, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 275, 50));

        btnBooking.setBackground(new java.awt.Color(54, 33, 89));
        btnBooking.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBooking.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblBooking.setForeground(new java.awt.Color(255, 255, 255));
        lblBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manage.png"))); // NOI18N
        lblBooking.setText("Bookings History");
        lblBooking.setToolTipText("Bookings History");
        lblBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBookingMouseClicked(evt);
            }
        });
        btnBooking.add(lblBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 275, 50));

        btnLessonReport.setBackground(new java.awt.Color(54, 33, 89));
        btnLessonReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLessonReport.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblLessonReport.setForeground(new java.awt.Color(255, 255, 255));
        lblLessonReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lesson.png"))); // NOI18N
        lblLessonReport.setText("Lesson Report");
        lblLessonReport.setToolTipText("Lesson Report");
        lblLessonReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLessonReportMouseClicked(evt);
            }
        });
        btnLessonReport.add(lblLessonReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 275, 50));

        btnExerciseReport.setBackground(new java.awt.Color(54, 33, 89));
        btnExerciseReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblExerciseReport.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblExerciseReport.setForeground(new java.awt.Color(255, 255, 255));
        lblExerciseReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exercise.png"))); // NOI18N
        lblExerciseReport.setText("Champion Exercise Report");
        lblExerciseReport.setToolTipText("Champion Exercise Report");
        lblExerciseReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExerciseReportMouseClicked(evt);
            }
        });
        btnExerciseReport.add(lblExerciseReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 275, 50));

        btnStudents.setBackground(new java.awt.Color(54, 33, 89));
        btnStudents.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStudents.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblStudents.setForeground(new java.awt.Color(255, 255, 255));
        lblStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/users.png"))); // NOI18N
        lblStudents.setText("Students");
        lblStudents.setToolTipText("Students");
        lblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStudentsMouseClicked(evt);
            }
        });
        btnStudents.add(lblStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 275, 50));

        javax.swing.GroupLayout jpSidebarLayout = new javax.swing.GroupLayout(jpSidebar);
        jpSidebar.setLayout(jpSidebarLayout);
        jpSidebarLayout.setHorizontalGroup(
            jpSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAttend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnLessonReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnExerciseReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpSidebarLayout.setVerticalGroup(
            jpSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSidebarLayout.createSequentialGroup()
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnAttend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnLessonReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnExerciseReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 252, Short.MAX_VALUE))
        );

        jPanel1.add(jpSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 620));

        pgDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDate.setBackground(new java.awt.Color(122, 72, 221));
        jpDate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate.add(lblDateTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgDashboard.add(jpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        btnBookingHistory.setBackground(new java.awt.Color(122, 72, 221));
        btnBookingHistory.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnBookingHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnBookingHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manage200.png"))); // NOI18N
        btnBookingHistory.setText("Booking History");
        btnBookingHistory.setToolTipText("Booking History");
        btnBookingHistory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBookingHistory.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBookingHistory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBookingHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookingHistoryMouseClicked(evt);
            }
        });
        pgDashboard.add(btnBookingHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 320, 270));

        btnBookLesson.setBackground(new java.awt.Color(122, 72, 221));
        btnBookLesson.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnBookLesson.setForeground(new java.awt.Color(255, 255, 255));
        btnBookLesson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addlist200.png"))); // NOI18N
        btnBookLesson.setText("Book a Lesson");
        btnBookLesson.setToolTipText("Book a Lesson");
        btnBookLesson.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBookLesson.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBookLesson.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBookLesson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookLessonMouseClicked(evt);
            }
        });
        pgDashboard.add(btnBookLesson, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 270));

        btnManageBookings.setBackground(new java.awt.Color(122, 72, 221));
        btnManageBookings.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnManageBookings.setForeground(new java.awt.Color(255, 255, 255));
        btnManageBookings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/attend200.png"))); // NOI18N
        btnManageBookings.setText("Manage Bookings");
        btnManageBookings.setToolTipText("Manage Bookings");
        btnManageBookings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnManageBookings.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnManageBookings.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnManageBookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageBookingsMouseClicked(evt);
            }
        });
        pgDashboard.add(btnManageBookings, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 320, 270));

        btnLesReport.setBackground(new java.awt.Color(122, 72, 221));
        btnLesReport.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnLesReport.setForeground(new java.awt.Color(255, 255, 255));
        btnLesReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/report200.png"))); // NOI18N
        btnLesReport.setText("Lesson Report");
        btnLesReport.setToolTipText("Lesson Report");
        btnLesReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLesReport.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnLesReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLesReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLesReportMouseClicked(evt);
            }
        });
        pgDashboard.add(btnLesReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 320, 270));

        btnChampReport.setBackground(new java.awt.Color(122, 72, 221));
        btnChampReport.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnChampReport.setForeground(new java.awt.Color(255, 255, 255));
        btnChampReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/report200.png"))); // NOI18N
        btnChampReport.setText("Champion Report");
        btnChampReport.setToolTipText("Champion Report");
        btnChampReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChampReport.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnChampReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChampReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChampReportMouseClicked(evt);
            }
        });
        pgDashboard.add(btnChampReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 320, 270));

        btnRecords.setBackground(new java.awt.Color(122, 72, 221));
        btnRecords.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnRecords.setForeground(new java.awt.Color(255, 255, 255));
        btnRecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user200.png"))); // NOI18N
        btnRecords.setText("Student's Records");
        btnRecords.setToolTipText("Student's Records");
        btnRecords.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRecords.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRecords.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRecordsMouseClicked(evt);
            }
        });
        pgDashboard.add(btnRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 320, 270));

        jPanel1.add(pgDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        jpTitle.setBackground(new java.awt.Color(122, 72, 221));
        jpTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 3, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N
        jLabel2.setText(" UNIVERSITY SPORTS CENTER BOOKING SYSTEM");
        jpTitle.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 100));

        jPanel1.add(jpTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 100));

        pgAttend.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDate2.setBackground(new java.awt.Color(122, 72, 221));
        jpDate2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime2.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate2.add(lblDateTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgAttend.add(jpDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jtAttend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking ID", "Lesson", "Week", "Day", "Period", "Status", "Attend", "Change", "Cancel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAttend.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtAttend.setRequestFocusEnabled(false);
        jtAttend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAttendMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtAttend);
        if (jtAttend.getColumnModel().getColumnCount() > 0) {
            jtAttend.getColumnModel().getColumn(0).setResizable(false);
            jtAttend.getColumnModel().getColumn(0).setPreferredWidth(150);
            jtAttend.getColumnModel().getColumn(1).setResizable(false);
            jtAttend.getColumnModel().getColumn(1).setPreferredWidth(200);
            jtAttend.getColumnModel().getColumn(2).setResizable(false);
            jtAttend.getColumnModel().getColumn(2).setPreferredWidth(100);
            jtAttend.getColumnModel().getColumn(3).setResizable(false);
            jtAttend.getColumnModel().getColumn(3).setPreferredWidth(150);
            jtAttend.getColumnModel().getColumn(4).setResizable(false);
            jtAttend.getColumnModel().getColumn(4).setPreferredWidth(150);
            jtAttend.getColumnModel().getColumn(5).setResizable(false);
            jtAttend.getColumnModel().getColumn(5).setPreferredWidth(120);
            jtAttend.getColumnModel().getColumn(6).setResizable(false);
            jtAttend.getColumnModel().getColumn(6).setPreferredWidth(120);
            jtAttend.getColumnModel().getColumn(7).setResizable(false);
            jtAttend.getColumnModel().getColumn(7).setPreferredWidth(150);
            jtAttend.getColumnModel().getColumn(8).setResizable(false);
            jtAttend.getColumnModel().getColumn(8).setPreferredWidth(120);
        }

        pgAttend.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 490));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Manage Bookings");
        pgAttend.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 50));

        jPanel1.add(pgAttend, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgAllTimeTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDate13.setBackground(new java.awt.Color(122, 72, 221));
        jpDate13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime13.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate13.add(lblDateTime13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgAllTimeTable.add(jpDate13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jtAllTimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Weeks", "Day", "Period", "Lesson", "Price", "Slot", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAllTimeTable.getTableHeader().setReorderingAllowed(false);
        jtAllTimeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAllTimeTableMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jtAllTimeTable);
        if (jtAllTimeTable.getColumnModel().getColumnCount() > 0) {
            jtAllTimeTable.getColumnModel().getColumn(0).setResizable(false);
            jtAllTimeTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            jtAllTimeTable.getColumnModel().getColumn(1).setResizable(false);
            jtAllTimeTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            jtAllTimeTable.getColumnModel().getColumn(2).setResizable(false);
            jtAllTimeTable.getColumnModel().getColumn(2).setPreferredWidth(220);
            jtAllTimeTable.getColumnModel().getColumn(3).setResizable(false);
            jtAllTimeTable.getColumnModel().getColumn(3).setPreferredWidth(220);
            jtAllTimeTable.getColumnModel().getColumn(4).setResizable(false);
            jtAllTimeTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtAllTimeTable.getColumnModel().getColumn(5).setResizable(false);
            jtAllTimeTable.getColumnModel().getColumn(5).setPreferredWidth(70);
            jtAllTimeTable.getColumnModel().getColumn(6).setResizable(false);
            jtAllTimeTable.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        pgAllTimeTable.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 490));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("General Time Table");
        pgAllTimeTable.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 50));

        lblBKID.setForeground(new java.awt.Color(240, 240, 240));
        lblBKID.setAutoscrolls(true);
        pgAllTimeTable.add(lblBKID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        jPanel1.add(pgAllTimeTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgBookings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDate3.setBackground(new java.awt.Color(122, 72, 221));
        jpDate3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime3.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate3.add(lblDateTime3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgBookings.add(jpDate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jtBookings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking ID", "Student ID", "Student Name", "Lesson", "Week", "Day", "Period", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtBookings.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtBookings.setEnabled(false);
        jScrollPane2.setViewportView(jtBookings);
        if (jtBookings.getColumnModel().getColumnCount() > 0) {
            jtBookings.getColumnModel().getColumn(0).setResizable(false);
            jtBookings.getColumnModel().getColumn(0).setPreferredWidth(150);
            jtBookings.getColumnModel().getColumn(1).setResizable(false);
            jtBookings.getColumnModel().getColumn(1).setPreferredWidth(150);
            jtBookings.getColumnModel().getColumn(2).setResizable(false);
            jtBookings.getColumnModel().getColumn(2).setPreferredWidth(250);
            jtBookings.getColumnModel().getColumn(3).setResizable(false);
            jtBookings.getColumnModel().getColumn(3).setPreferredWidth(180);
            jtBookings.getColumnModel().getColumn(4).setResizable(false);
            jtBookings.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtBookings.getColumnModel().getColumn(5).setResizable(false);
            jtBookings.getColumnModel().getColumn(5).setPreferredWidth(150);
            jtBookings.getColumnModel().getColumn(6).setResizable(false);
            jtBookings.getColumnModel().getColumn(6).setPreferredWidth(150);
            jtBookings.getColumnModel().getColumn(7).setResizable(false);
            jtBookings.getColumnModel().getColumn(7).setPreferredWidth(150);
        }

        pgBookings.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 490));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Booking History");
        pgBookings.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 50));

        jPanel1.add(pgBookings, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgLessonReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDate4.setBackground(new java.awt.Color(122, 72, 221));
        jpDate4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime4.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate4.add(lblDateTime4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgLessonReport.add(jpDate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jtReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1.", "Body Blitz", null, null},
                {"2.", "Box Fit", null, null},
                {"3.", "Yoga", null, null},
                {"4.", "Zumba", null, null},
                {null, "Total", null, null}
            },
            new String [] {
                "S/N.", "Lessons", "No. of Students", "Average Ratings"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtReport.setRowHeight(45);
        jtReport.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(jtReport);
        if (jtReport.getColumnModel().getColumnCount() > 0) {
            jtReport.getColumnModel().getColumn(0).setResizable(false);
            jtReport.getColumnModel().getColumn(0).setPreferredWidth(80);
            jtReport.getColumnModel().getColumn(1).setResizable(false);
            jtReport.getColumnModel().getColumn(1).setPreferredWidth(250);
            jtReport.getColumnModel().getColumn(2).setResizable(false);
            jtReport.getColumnModel().getColumn(2).setPreferredWidth(250);
            jtReport.getColumnModel().getColumn(3).setResizable(false);
            jtReport.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        pgLessonReport.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 490));

        lblReport.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pgLessonReport.add(lblReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 50));

        jPanel1.add(pgLessonReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgExerciseReport.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        pgExerciseReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDate5.setBackground(new java.awt.Color(122, 72, 221));
        jpDate5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime5.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate5.add(lblDateTime5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgExerciseReport.add(jpDate5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jtExeReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", null, null, null}
            },
            new String [] {
                "S/N.", "Lessons", "No. of Students", "Lesson Price", "Total Income"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtExeReport.setRowHeight(45);
        jtExeReport.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(jtExeReport);
        if (jtExeReport.getColumnModel().getColumnCount() > 0) {
            jtExeReport.getColumnModel().getColumn(0).setResizable(false);
            jtExeReport.getColumnModel().getColumn(0).setPreferredWidth(80);
            jtExeReport.getColumnModel().getColumn(1).setResizable(false);
            jtExeReport.getColumnModel().getColumn(1).setPreferredWidth(250);
            jtExeReport.getColumnModel().getColumn(2).setResizable(false);
            jtExeReport.getColumnModel().getColumn(2).setPreferredWidth(250);
            jtExeReport.getColumnModel().getColumn(3).setResizable(false);
            jtExeReport.getColumnModel().getColumn(3).setPreferredWidth(200);
            jtExeReport.getColumnModel().getColumn(4).setResizable(false);
            jtExeReport.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        pgExerciseReport.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 490));

        lblExeReport.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblExeReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pgExerciseReport.add(lblExeReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 50));

        jPanel1.add(pgExerciseReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgStudents.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        pgStudents.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDate6.setBackground(new java.awt.Color(122, 72, 221));
        jpDate6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime6.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate6.add(lblDateTime6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgStudents.add(jpDate6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("List of Students.");
        pgStudents.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 50));

        btnAddStudent.setBackground(new java.awt.Color(122, 72, 221));
        btnAddStudent.setFont(new java.awt.Font("Times New Roman", 0, 27)); // NOI18N
        btnAddStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_user.png"))); // NOI18N
        btnAddStudent.setText(" Add New");
        btnAddStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddStudentMouseClicked(evt);
            }
        });
        pgStudents.add(btnAddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        jtStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S/N.", "Student ID", "First Name", "Last Name", "Age", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(jtStudents);
        if (jtStudents.getColumnModel().getColumnCount() > 0) {
            jtStudents.getColumnModel().getColumn(0).setResizable(false);
            jtStudents.getColumnModel().getColumn(0).setPreferredWidth(80);
            jtStudents.getColumnModel().getColumn(1).setResizable(false);
            jtStudents.getColumnModel().getColumn(1).setPreferredWidth(150);
            jtStudents.getColumnModel().getColumn(2).setResizable(false);
            jtStudents.getColumnModel().getColumn(2).setPreferredWidth(250);
            jtStudents.getColumnModel().getColumn(3).setResizable(false);
            jtStudents.getColumnModel().getColumn(3).setPreferredWidth(250);
            jtStudents.getColumnModel().getColumn(4).setResizable(false);
            jtStudents.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtStudents.getColumnModel().getColumn(5).setResizable(false);
            jtStudents.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        pgStudents.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 490));

        jPanel1.add(pgStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgYoga.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        pgYoga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDate7.setBackground(new java.awt.Color(122, 72, 221));
        jpDate7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime7.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate7.add(lblDateTime7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgYoga.add(jpDate7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jtYoga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Week", "Day", "Period", "Price", "Slot", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtYoga.getTableHeader().setReorderingAllowed(false);
        jtYoga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtYogaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtYoga);
        if (jtYoga.getColumnModel().getColumnCount() > 0) {
            jtYoga.getColumnModel().getColumn(0).setResizable(false);
            jtYoga.getColumnModel().getColumn(0).setPreferredWidth(170);
            jtYoga.getColumnModel().getColumn(1).setResizable(false);
            jtYoga.getColumnModel().getColumn(1).setPreferredWidth(270);
            jtYoga.getColumnModel().getColumn(2).setResizable(false);
            jtYoga.getColumnModel().getColumn(2).setPreferredWidth(270);
            jtYoga.getColumnModel().getColumn(3).setResizable(false);
            jtYoga.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtYoga.getColumnModel().getColumn(4).setResizable(false);
            jtYoga.getColumnModel().getColumn(4).setPreferredWidth(70);
            jtYoga.getColumnModel().getColumn(5).setResizable(false);
            jtYoga.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        pgYoga.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 490));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Yoga Lessons");
        pgYoga.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 50));

        jPanel1.add(pgYoga, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgSaturday.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        pgSaturday.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDate8.setBackground(new java.awt.Color(122, 72, 221));
        jpDate8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime8.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate8.add(lblDateTime8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgSaturday.add(jpDate8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jtSaturday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Weeks", "Lesson", "Period", "Price", "Slot", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtSaturday.getTableHeader().setReorderingAllowed(false);
        jtSaturday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtSaturdayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtSaturday);
        if (jtSaturday.getColumnModel().getColumnCount() > 0) {
            jtSaturday.getColumnModel().getColumn(0).setResizable(false);
            jtSaturday.getColumnModel().getColumn(0).setPreferredWidth(120);
            jtSaturday.getColumnModel().getColumn(1).setResizable(false);
            jtSaturday.getColumnModel().getColumn(1).setPreferredWidth(220);
            jtSaturday.getColumnModel().getColumn(2).setResizable(false);
            jtSaturday.getColumnModel().getColumn(2).setPreferredWidth(220);
            jtSaturday.getColumnModel().getColumn(3).setResizable(false);
            jtSaturday.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtSaturday.getColumnModel().getColumn(4).setResizable(false);
            jtSaturday.getColumnModel().getColumn(4).setPreferredWidth(70);
            jtSaturday.getColumnModel().getColumn(5).setResizable(false);
            jtSaturday.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        pgSaturday.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 490));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lessons on Saturdays");
        pgSaturday.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 50));

        jPanel1.add(pgSaturday, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgSunday.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        pgSunday.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDate9.setBackground(new java.awt.Color(122, 72, 221));
        jpDate9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime9.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate9.add(lblDateTime9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgSunday.add(jpDate9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jtSunday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Weeks", "Lesson", "Period", "Price", "Slot", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtSunday.getTableHeader().setReorderingAllowed(false);
        jtSunday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtSundayMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtSunday);
        if (jtSunday.getColumnModel().getColumnCount() > 0) {
            jtSunday.getColumnModel().getColumn(0).setResizable(false);
            jtSunday.getColumnModel().getColumn(0).setPreferredWidth(170);
            jtSunday.getColumnModel().getColumn(1).setResizable(false);
            jtSunday.getColumnModel().getColumn(1).setPreferredWidth(270);
            jtSunday.getColumnModel().getColumn(2).setResizable(false);
            jtSunday.getColumnModel().getColumn(2).setPreferredWidth(270);
            jtSunday.getColumnModel().getColumn(3).setResizable(false);
            jtSunday.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtSunday.getColumnModel().getColumn(4).setResizable(false);
            jtSunday.getColumnModel().getColumn(4).setPreferredWidth(70);
            jtSunday.getColumnModel().getColumn(5).setResizable(false);
            jtSunday.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        pgSunday.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 490));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lessons on Sundays");
        pgSunday.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 50));

        jPanel1.add(pgSunday, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgZumba.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        pgZumba.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDate10.setBackground(new java.awt.Color(122, 72, 221));
        jpDate10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime10.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate10.add(lblDateTime10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgZumba.add(jpDate10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jtZumba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Week", "Day", "Period", "Price", "Slot", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtZumba.getTableHeader().setReorderingAllowed(false);
        jtZumba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtZumbaMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jtZumba);
        if (jtZumba.getColumnModel().getColumnCount() > 0) {
            jtZumba.getColumnModel().getColumn(0).setResizable(false);
            jtZumba.getColumnModel().getColumn(0).setPreferredWidth(170);
            jtZumba.getColumnModel().getColumn(1).setResizable(false);
            jtZumba.getColumnModel().getColumn(1).setPreferredWidth(270);
            jtZumba.getColumnModel().getColumn(2).setResizable(false);
            jtZumba.getColumnModel().getColumn(2).setPreferredWidth(270);
            jtZumba.getColumnModel().getColumn(3).setResizable(false);
            jtZumba.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtZumba.getColumnModel().getColumn(4).setResizable(false);
            jtZumba.getColumnModel().getColumn(4).setPreferredWidth(70);
            jtZumba.getColumnModel().getColumn(5).setResizable(false);
            jtZumba.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        pgZumba.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 490));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Zumba Lessons");
        jLabel5.setToolTipText("Zumba Lessons");
        pgZumba.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 50));

        jPanel1.add(pgZumba, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgBoxFit.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        pgBoxFit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDate11.setBackground(new java.awt.Color(122, 72, 221));
        jpDate11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime11.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate11.add(lblDateTime11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgBoxFit.add(jpDate11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jtBoxFit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Week", "Day", "Period", "Price", "Slot", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtBoxFit.getTableHeader().setReorderingAllowed(false);
        jtBoxFit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBoxFitMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jtBoxFit);
        if (jtBoxFit.getColumnModel().getColumnCount() > 0) {
            jtBoxFit.getColumnModel().getColumn(0).setResizable(false);
            jtBoxFit.getColumnModel().getColumn(0).setPreferredWidth(170);
            jtBoxFit.getColumnModel().getColumn(1).setResizable(false);
            jtBoxFit.getColumnModel().getColumn(1).setPreferredWidth(270);
            jtBoxFit.getColumnModel().getColumn(2).setResizable(false);
            jtBoxFit.getColumnModel().getColumn(2).setPreferredWidth(270);
            jtBoxFit.getColumnModel().getColumn(3).setResizable(false);
            jtBoxFit.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtBoxFit.getColumnModel().getColumn(4).setResizable(false);
            jtBoxFit.getColumnModel().getColumn(4).setPreferredWidth(70);
            jtBoxFit.getColumnModel().getColumn(5).setResizable(false);
            jtBoxFit.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        pgBoxFit.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 490));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Box Fit Lessons");
        jLabel6.setToolTipText("Box Fit Lessons");
        pgBoxFit.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 50));

        jPanel1.add(pgBoxFit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgBodyBlitz.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        pgBodyBlitz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDate12.setBackground(new java.awt.Color(122, 72, 221));
        jpDate12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime12.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate12.add(lblDateTime12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgBodyBlitz.add(jpDate12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jtBodyBlitz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Week", "Day", "Period", "Price", "Slot", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtBodyBlitz.setRowHeight(40);
        jtBodyBlitz.getTableHeader().setReorderingAllowed(false);
        jtBodyBlitz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBodyBlitzMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jtBodyBlitz);
        if (jtBodyBlitz.getColumnModel().getColumnCount() > 0) {
            jtBodyBlitz.getColumnModel().getColumn(0).setResizable(false);
            jtBodyBlitz.getColumnModel().getColumn(0).setPreferredWidth(170);
            jtBodyBlitz.getColumnModel().getColumn(1).setResizable(false);
            jtBodyBlitz.getColumnModel().getColumn(1).setPreferredWidth(270);
            jtBodyBlitz.getColumnModel().getColumn(2).setResizable(false);
            jtBodyBlitz.getColumnModel().getColumn(2).setPreferredWidth(270);
            jtBodyBlitz.getColumnModel().getColumn(3).setResizable(false);
            jtBodyBlitz.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtBodyBlitz.getColumnModel().getColumn(4).setResizable(false);
            jtBodyBlitz.getColumnModel().getColumn(4).setPreferredWidth(70);
            jtBodyBlitz.getColumnModel().getColumn(5).setResizable(false);
            jtBodyBlitz.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        pgBodyBlitz.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 490));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Body Blitz Lessons");
        jLabel7.setToolTipText("Body Blitz Lessons");
        pgBodyBlitz.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 50));

        jPanel1.add(pgBodyBlitz, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        // TODO add your handling code here:
        //Panel color
        setPanelColor(btnDashboard);
        resetPanelColor(btnBook);
        resetPanelColor(btnAttend);
        resetPanelColor(btnBooking);
        resetPanelColor(btnLessonReport);
        resetPanelColor(btnExerciseReport);
        resetPanelColor(btnStudents);
        
        //pages
        pgAllTimeTable.setVisible(false);
        pgSaturday.setVisible(false);
        pgDashboard.setVisible(true);
        pgAttend.setVisible(false);
        pgBookings.setVisible(false);
        pgLessonReport.setVisible(false);
        pgExerciseReport.setVisible(false);
        pgStudents.setVisible(false);
        pgYoga.setVisible(false);
        pgSunday.setVisible(false);
        pgZumba.setVisible(false);
        pgBoxFit.setVisible(false);
        pgBodyBlitz.setVisible(false);
        
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lblBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookMouseClicked
        // TODO add your handling code here:
        bookClicked();
    }//GEN-LAST:event_lblBookMouseClicked

    private void lblAttendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAttendMouseClicked
        // TODO add your handling code here:
        manageBookingsClicked();
    }//GEN-LAST:event_lblAttendMouseClicked

    private void lblBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookingMouseClicked
        // TODO add your handling code here:
        bookingHistoryClicked();
    }//GEN-LAST:event_lblBookingMouseClicked

    private void lblLessonReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLessonReportMouseClicked
        // TODO add your handling code here:
        lessonReportClicked();
    }//GEN-LAST:event_lblLessonReportMouseClicked

    private void lblExerciseReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExerciseReportMouseClicked
        // TODO add your handling code here:
        championExerciseReportClicked();
    }//GEN-LAST:event_lblExerciseReportMouseClicked

    private void jtSaturdayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtSaturdayMouseClicked
        // TODO add your handling code here:
        int column = jtSaturday.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jtSaturday.getRowHeight();
        
        if(row < jtSaturday.getRowCount() && row >= 0 && column < jtSaturday.getColumnCount() && column >= 0){
            Object value = jtSaturday.getValueAt(row, column);
            
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton botn = (JButton) value;
                
                if(botn.getName().equals("b")){
                    int a = jtSaturday.getSelectedRow();
                    int remSlot = saturdayLessons.get(a).getSlot();
                    mayBook(a, remSlot, jtSaturday, saturdayLessons, "Saturday");
                    
                }
            }
        }
    }//GEN-LAST:event_jtSaturdayMouseClicked

    private void jtYogaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtYogaMouseClicked
        // TODO add your handling code here:
        int column = jtYoga.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jtYoga.getRowHeight();
        
        if(row < jtYoga.getRowCount() && row >= 0 && column < jtYoga.getColumnCount() && column >= 0){
            Object value = jtYoga.getValueAt(row, column);
            
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton botn = (JButton) value;
                
                if(botn.getName().equals("b")){
                    int a = jtYoga.getSelectedRow();
                    int remSlot = yogaLessons.get(a).getSlot();
                    String LesDay = yogaLessons.get(a).getDay();
                    
                    mayBook(a, remSlot, jtYoga, yogaLessons, LesDay);
                    
                }
            }
        }
    }//GEN-LAST:event_jtYogaMouseClicked

    private void jtSundayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtSundayMouseClicked
        // TODO add your handling code here:
        int column = jtSunday.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jtSunday.getRowHeight();
        
        if(row < jtSunday.getRowCount() && row >= 0 && column < jtSunday.getColumnCount() && column >= 0){
            Object value = jtSunday.getValueAt(row, column);
            
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton botn = (JButton) value;
                
                if(botn.getName().equals("b")){
                    int a = jtSunday.getSelectedRow();
                    int remSlot = sundayLessons.get(a).getSlot();
                    String LesDay = sundayLessons.get(a).getDay();
                    
                    mayBook(a, remSlot, jtSunday, sundayLessons, LesDay);
                    
                }
            }
        }
        
    }//GEN-LAST:event_jtSundayMouseClicked

    private void jtZumbaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtZumbaMouseClicked
        // TODO add your handling code here:
        int column = jtZumba.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jtZumba.getRowHeight();
        
        if(row < jtZumba.getRowCount() && row >= 0 && column < jtZumba.getColumnCount() && column >= 0){
            Object value = jtZumba.getValueAt(row, column);
            
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton botn = (JButton) value;
                
                if(botn.getName().equals("b")){
                    int a = jtZumba.getSelectedRow();
                    int remSlot = zumbaLessons.get(a).getSlot();
                    String LesDay = zumbaLessons.get(a).getDay();
                    
                    mayBook(a, remSlot, jtZumba, zumbaLessons, LesDay);
                    
                }
            }
        }
    }//GEN-LAST:event_jtZumbaMouseClicked

    private void jtBoxFitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBoxFitMouseClicked
        // TODO add your handling code here:
        int column = jtBoxFit.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jtBoxFit.getRowHeight();
        
        if(row < jtBoxFit.getRowCount() && row >= 0 && column < jtBoxFit.getColumnCount() && column >= 0){
            Object value = jtBoxFit.getValueAt(row, column);
            
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton botn = (JButton) value;
                
                if(botn.getName().equals("b")){
                    int a = jtBoxFit.getSelectedRow();
                    int remSlot = boxfitLessons.get(a).getSlot();
                    String LesDay = boxfitLessons.get(a).getDay();
                    
                    mayBook(a, remSlot, jtBoxFit, boxfitLessons, LesDay);
                    
                }
            }
        }
    }//GEN-LAST:event_jtBoxFitMouseClicked

    private void jtBodyBlitzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBodyBlitzMouseClicked
        // TODO add your handling code here:
        int column = jtBodyBlitz.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jtBodyBlitz.getRowHeight();
        
        if(row < jtBodyBlitz.getRowCount() && row >= 0 && column < jtBodyBlitz.getColumnCount() && column >= 0){
            Object value = jtBodyBlitz.getValueAt(row, column);
            
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton botn = (JButton) value;
                
                if(botn.getName().equals("b")){
                    int a = jtBodyBlitz.getSelectedRow();
                    int remSlot = bodyblitzLessons.get(a).getSlot();
                    String LesDay = bodyblitzLessons.get(a).getDay();
                    
                    mayBook(a, remSlot, jtBodyBlitz, bodyblitzLessons, LesDay);
                    
                }
            }
        }
    }//GEN-LAST:event_jtBodyBlitzMouseClicked

    private void jtAttendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAttendMouseClicked
        // TODO add your handling code here:
        int column = jtAttend.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jtAttend.getRowHeight();
        
        if(row < jtAttend.getRowCount() && row >= 0 && column < jtAttend.getColumnCount() && column >= 0){
            Object value = jtAttend.getValueAt(row, column);
            
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton botn = (JButton) value;
                
                if(botn.getName().equals("at")){
                    int a = jtAttend.getSelectedRow();
                    attendLesson(a);
                    
                }else if(botn.getName().equals("ch")){
                    int a = jtAttend.getSelectedRow();
                    String bkID = bookings.get(a).getBookingID();
                    int opt = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to change " + bookings.get(a).getLessonPeriod() + " " + bookings.get(a).getLessonName() + " Lesson?", "Change Lesson", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(opt == 0){
                        pgAllTimeTable.setVisible(true);
                        pgAttend.setVisible(false);
                        pgSaturday.setVisible(false);
                        pgDashboard.setVisible(false);
                        pgAttend.setVisible(false);
                        pgBookings.setVisible(false);
                        pgLessonReport.setVisible(false);
                        pgExerciseReport.setVisible(false);
                        pgStudents.setVisible(false);
                        pgYoga.setVisible(false);
                        pgSunday.setVisible(false);
                        pgZumba.setVisible(false);
                        pgBoxFit.setVisible(false);
                        pgBodyBlitz.setVisible(false);
                        
                        lblBKID.setText(bkID);

                    }else{
                        return;
                    }
                    
                }else if(botn.getName().equals("x")){
                    int a = jtAttend.getSelectedRow();
                    cancelLesson(a);
                    
                }
            }
        }
    }//GEN-LAST:event_jtAttendMouseClicked

    private void jtAllTimeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAllTimeTableMouseClicked
        // TODO add your handling code here:
        int column = jtAllTimeTable.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jtAllTimeTable.getRowHeight();
        
        if(row < jtAllTimeTable.getRowCount() && row >= 0 && column < jtAllTimeTable.getColumnCount() && column >=0){
            Object value = jtAllTimeTable.getValueAt(row, column);
            
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton botn = (JButton) value;
                
                if(botn.getName().equals("b")){
                    int a = jtAllTimeTable.getSelectedRow();
                    int remSlot = allLessons.get(a).getSlot();
                    String bkID = lblBKID.getText();
                    changeLesson(a, remSlot, bkID);
                }
            }
        }
    }//GEN-LAST:event_jtAllTimeTableMouseClicked

    private void lblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStudentsMouseClicked
        // TODO add your handling code here:
        studentsRecordsClicked();
    }//GEN-LAST:event_lblStudentsMouseClicked

    private void btnAddStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddStudentMouseClicked
        // TODO add your handling code here:       
        newStudent();
    }//GEN-LAST:event_btnAddStudentMouseClicked

    private void btnBookLessonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookLessonMouseClicked
        // TODO add your handling code here:
        bookClicked();
    }//GEN-LAST:event_btnBookLessonMouseClicked

    private void btnManageBookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageBookingsMouseClicked
        // TODO add your handling code here:
        manageBookingsClicked();
    }//GEN-LAST:event_btnManageBookingsMouseClicked

    private void btnBookingHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingHistoryMouseClicked
        // TODO add your handling code here:
        bookingHistoryClicked();
    }//GEN-LAST:event_btnBookingHistoryMouseClicked

    private void btnLesReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLesReportMouseClicked
        // TODO add your handling code here:
        lessonReportClicked();
    }//GEN-LAST:event_btnLesReportMouseClicked

    private void btnChampReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChampReportMouseClicked
        // TODO add your handling code here:
        championExerciseReportClicked();
    }//GEN-LAST:event_btnChampReportMouseClicked

    private void btnRecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecordsMouseClicked
        // TODO add your handling code here:
        studentsRecordsClicked();
    }//GEN-LAST:event_btnRecordsMouseClicked

    
    //Set Colour
    public void setPanelColor(JPanel panel){
        panel.setBackground(new java.awt.Color(122,72,221));
    }
    
    public void resetPanelColor(JPanel panel){
        panel.setBackground(new java.awt.Color(54,33,89));
    }
    
    Timer t;
    public void dt(){
        t = new Timer(0, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                SimpleDateFormat st = new SimpleDateFormat("hh:mm:ss a");
                String dd = sdf.format(d);
                String tt = st.format(d);
                String dst = dd + ".  " + tt;
                lblDateTime.setText(dst);
                lblDateTime2.setText(dst);
                lblDateTime3.setText(dst);
                lblDateTime4.setText(dst);
                lblDateTime5.setText(dst);
                lblDateTime6.setText(dst);
                lblDateTime7.setText(dst);
                lblDateTime8.setText(dst);
                lblDateTime9.setText(dst);
                lblDateTime10.setText(dst);
                lblDateTime11.setText(dst);
                lblDateTime12.setText(dst);
                lblDateTime13.setText(dst);
            }
        });
        
        t.start();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JPanel btnAttend;
    private javax.swing.JPanel btnBook;
    private javax.swing.JButton btnBookLesson;
    private javax.swing.JPanel btnBooking;
    private javax.swing.JButton btnBookingHistory;
    private javax.swing.JButton btnChampReport;
    private javax.swing.JPanel btnDashboard;
    private javax.swing.JPanel btnExerciseReport;
    private javax.swing.JButton btnLesReport;
    private javax.swing.JPanel btnLessonReport;
    private javax.swing.JButton btnManageBookings;
    private javax.swing.JButton btnRecords;
    private javax.swing.JPanel btnStudents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel jpDate;
    private javax.swing.JPanel jpDate10;
    private javax.swing.JPanel jpDate11;
    private javax.swing.JPanel jpDate12;
    private javax.swing.JPanel jpDate13;
    private javax.swing.JPanel jpDate2;
    private javax.swing.JPanel jpDate3;
    private javax.swing.JPanel jpDate4;
    private javax.swing.JPanel jpDate5;
    private javax.swing.JPanel jpDate6;
    private javax.swing.JPanel jpDate7;
    private javax.swing.JPanel jpDate8;
    private javax.swing.JPanel jpDate9;
    private javax.swing.JPanel jpSidebar;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JTable jtAllTimeTable;
    private javax.swing.JTable jtAttend;
    private javax.swing.JTable jtBodyBlitz;
    private javax.swing.JTable jtBookings;
    private javax.swing.JTable jtBoxFit;
    private javax.swing.JTable jtExeReport;
    private javax.swing.JTable jtReport;
    private javax.swing.JTable jtSaturday;
    private javax.swing.JTable jtStudents;
    private javax.swing.JTable jtSunday;
    private javax.swing.JTable jtYoga;
    private javax.swing.JTable jtZumba;
    private javax.swing.JLabel lblAttend;
    private javax.swing.JLabel lblBKID;
    private javax.swing.JLabel lblBook;
    private javax.swing.JLabel lblBooking;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblDateTime;
    private javax.swing.JLabel lblDateTime10;
    private javax.swing.JLabel lblDateTime11;
    private javax.swing.JLabel lblDateTime12;
    private javax.swing.JLabel lblDateTime13;
    private javax.swing.JLabel lblDateTime2;
    private javax.swing.JLabel lblDateTime3;
    private javax.swing.JLabel lblDateTime4;
    private javax.swing.JLabel lblDateTime5;
    private javax.swing.JLabel lblDateTime6;
    private javax.swing.JLabel lblDateTime7;
    private javax.swing.JLabel lblDateTime8;
    private javax.swing.JLabel lblDateTime9;
    private javax.swing.JLabel lblExeReport;
    private javax.swing.JLabel lblExerciseReport;
    private javax.swing.JLabel lblLessonReport;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel lblStudents;
    private javax.swing.JPanel pgAllTimeTable;
    private javax.swing.JPanel pgAttend;
    private javax.swing.JPanel pgBodyBlitz;
    private javax.swing.JPanel pgBookings;
    private javax.swing.JPanel pgBoxFit;
    private javax.swing.JPanel pgDashboard;
    private javax.swing.JPanel pgExerciseReport;
    private javax.swing.JPanel pgLessonReport;
    private javax.swing.JPanel pgSaturday;
    private javax.swing.JPanel pgStudents;
    private javax.swing.JPanel pgSunday;
    private javax.swing.JPanel pgYoga;
    private javax.swing.JPanel pgZumba;
    // End of variables declaration//GEN-END:variables
}
