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
import java.util.ArrayList;
import javax.swing.JButton;
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
        addRowToTable();
        addRowToBooked();
        
    }
    
    public ArrayList listOfStudents(){
        ArrayList<Students> student = new ArrayList<Students>();
        student.add( new Students(208947, 20, "James", "Fox", 'M'));
        student.add( new Students(208948, 21, "John", "Doe", 'M'));
        student.add( new Students(208949, 19, "Sarah", "James", 'F'));
        student.add( new Students(208950, 22, "James", "Bull", 'M'));
        
        return student;
    }
    
    public ArrayList listOfLessons(){
        ArrayList<Lesson> lessons = new ArrayList<Lesson>();
        lessons.add( new Lesson("Week 1","Yoga","Saturday","Morning",40.23,4));
        lessons.add( new Lesson("Week 1","Yoga","Saturday","Afternoon",40.23,4));
        lessons.add( new Lesson("Week 1","Yoga","Saturday","Evening",40.23,2));
        lessons.add( new Lesson("Week 1","Yoga","Sunday","Morning",40.23,4));
        lessons.add( new Lesson("Week 1","Yoga","Sunday","Afternoon",40.23,3));
        lessons.add( new Lesson("Week 1","Yoga","Sunday","Evening",40.23,1));
        lessons.add( new Lesson("Week 1", "Box Fit", "Saturday", "Morning", 30.45, 3));
        lessons.add( new Lesson("Week 1", "Box Fit", "Saturday", "Afternoon", 30.45, 0));
        lessons.add( new Lesson("Week 1", "Box Fit", "Saturday", "Evening", 30.45, 0));
        lessons.add( new Lesson("Week 1","Zumba","Saturday","Morning",60.50,4));
        lessons.add( new Lesson("Week 1","Zumba","Saturday","Afternoon",60.50,4));
        lessons.add( new Lesson("Week 1","Zumba","Saturday","Evening",60.50,2));
        lessons.add( new Lesson("Week 1","Body Blitz","Sunday","Morning",20.73,4));
        lessons.add( new Lesson("Week 1","Body Blitz","Sunday","Afternoon",20.73,3));
        lessons.add( new Lesson("Week 1","Body Blitz","Sunday","Evening",20.73,1));
        lessons.add( new Lesson("Week 2", "Box Fit", "Saturday", "Evening", 30.45, 3));
        
        return lessons;
    }
    
    public ArrayList listOfBookings(){
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        bookings.add( new Booking("BIYG001", 208950, "James", "Bull", 22, 'M', "Yoga", "Week 1", "Sunday", "Morning", "Booked", "", 2, 9, 40.23));
        bookings.add( new Booking("BIYG002", 208949, "Sarah", "James", 19, 'F', "Yoga", "Week 1", "Sunday", "Morning", "Booked", "", 2, 9, 40.23));
        bookings.add( new Booking("BIYG003", 197890, "James", "Bull", 22, 'M', "Yoga", "Week 1", "Sunday", "Morning", "Booked", "", 2, 9, 40.23));
        bookings.add( new Booking("BIYG004", 208950, "James", "Bull", 22, 'M', "Yoga", "Week 2", "Sunday", "Morning", "Booked", "", 2, 9, 40.23));
        bookings.add( new Booking("BIYG005", 208949, "Sarah", "James", 19, 'F', "Yoga", "Week 2", "Sunday", "Morning", "Booked", "", 2, 9, 40.23));
        bookings.add( new Booking("BIYG006", 197890, "James", "Bull", 22, 'M', "Yoga", "Week 2", "Sunday", "Morning", "Booked", "", 2, 9, 40.23));
        bookings.add( new Booking("BIYG007", 208950, "James", "Bull", 22, 'M', "Yoga", "Week 3", "Sunday", "Morning", "Booked", "", 2, 9, 40.23));
        bookings.add( new Booking("BIYG008", 208949, "Sarah", "James", 19, 'F', "Yoga", "Week 3", "Sunday", "Morning", "Booked", "", 2, 9, 40.23));
        bookings.add( new Booking("BIYG009", 197890, "James", "Bull", 22, 'M', "Yoga", "Week 3", "Sunday", "Morning", "Booked", "", 2, 9, 40.23));
        bookings.add( new Booking("BIBF001", 208950, "James", "Bull", 22, 'M', "Box Fit", "Week 1", "Sunday", "Morning", "Booked", "", 2, 9, 30.45));
        bookings.add( new Booking("BIBF002", 208949, "Sarah", "James", 19, 'F', "Box Fit", "Week 1", "Sunday", "Morning", "Booked", "", 2, 9, 30.45));
        bookings.add( new Booking("BIBF003", 197890, "James", "Bull", 22, 'M', "Box Fit", "Week 1", "Sunday", "Morning", "Booked", "", 2, 9, 30.45));
        bookings.add( new Booking("BIZB001", 208950, "James", "Bull", 22, 'M', "Zumba", "Week 2", "Sunday", "Morning", "Booked", "", 2, 9, 60.50));
        bookings.add( new Booking("BIZB002", 208949, "Sarah", "James", 19, 'F', "Zumba", "Week 2", "Sunday", "Morning", "Booked", "", 2, 9, 60.50));
        bookings.add( new Booking("BIZB003", 197890, "James", "Bull", 22, 'M', "Zumba", "Week 2", "Sunday", "Morning", "Booked", "", 2, 9, 60.50));
        bookings.add( new Booking("BIBB001", 208950, "James", "Bull", 22, 'M', "Body Blitz", "Week 3", "Sunday", "Morning", "Booked", "", 2, 9, 20.73));
        bookings.add( new Booking("BIBB002", 208949, "Sarah", "James", 19, 'F', "Body Blitz", "Week 3", "Sunday", "Morning", "Booked", "", 2, 9, 20.73));
        bookings.add( new Booking("BIBB003", 197890, "James", "Bull", 22, 'M', "Body Blitz", "Week 3", "Sunday", "Morning", "Booked", "", 2, 9, 20.73));
        
        return bookings;
    }
    
    ArrayList<Students> student = listOfStudents();
    ArrayList<Lesson> lessons = listOfLessons();
    ArrayList<Booking> bookings = listOfBookings();
    ArrayList<Booking> bookingYoga = new ArrayList<Booking>();
    ArrayList<Booking> bookingZumba = new ArrayList<Booking>();
    ArrayList<Booking> bookingBoxFit = new ArrayList<Booking>();
    ArrayList<Booking> bookingBodyBlitz = new ArrayList<Booking>();
    
    
    public void addRowToTable(){
        
        jtSaturday.setDefaultRenderer(Object.class, new Render());
        JButton btn1 = new JButton("Book");
        btn1.setName("b");
        
        DefaultTableModel model = (DefaultTableModel) jtSaturday.getModel();
        Object rowData[] = new Object[lessons.size()];
        for (int i = 0; i < lessons.size(); i++){
            rowData[0] = lessons.get(i).getWeek();
            rowData[1] = lessons.get(i).getName();
            rowData[2] = lessons.get(i).getPeriod();
            rowData[3] = lessons.get(i).getPrice();
            rowData[4] = lessons.get(i).getSlot();
            rowData[5] = btn1;  
            
            model.addRow(rowData);
        }
        
        jtSaturday.setRowHeight(30);
    }
    
    public void addRowToBooked(){
        jtAttend.setDefaultRenderer(Object.class, new Render());
        JButton btn2 = new JButton("Attend");
        btn2.setName("at");
        
        JButton btn3 = new JButton("Change");
        btn3.setName("ch");
        
        JButton btn4 = new JButton("Cancel");
        btn3.setName("x");
        
        DefaultTableModel modelBook = (DefaultTableModel) jtAttend.getModel();
        Object rowData[] = new Object[bookings.size()];
        for (int i = 0; i < bookings.size(); i++){
            rowData[0] = bookings.get(i).getBookingID();
            rowData[1] = bookings.get(i).getLessonName();
            rowData[2] = bookings.get(i).getLessonWeek();
            rowData[3] = bookings.get(i).getLessonDay();
            rowData[4] = bookings.get(i).getLessonPeriod();
            rowData[5] = bookings.get(i).getLessonStatus();
            
            rowData[6] = btn2;
            rowData[7] = btn3;
            rowData[8] = btn4;
            
            modelBook.addRow(rowData);
        }
        jtAttend.setRowHeight(30);
        
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
        btnBook5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        pgDashboard = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jpDate = new javax.swing.JPanel();
        lblDateTime = new javax.swing.JLabel();
        jpTitle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pgBook = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jpDate1 = new javax.swing.JPanel();
        lblDateTime1 = new javax.swing.JLabel();
        pgAttend = new javax.swing.JPanel();
        jpDate2 = new javax.swing.JPanel();
        lblDateTime2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtAttend = new javax.swing.JTable();
        pgBookings = new javax.swing.JPanel();
        jpDate3 = new javax.swing.JPanel();
        lblDateTime3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtBookings = new javax.swing.JTable();
        pgLessonReport = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jpDate4 = new javax.swing.JPanel();
        lblDateTime4 = new javax.swing.JLabel();
        pgExerciseReport = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jpDate5 = new javax.swing.JPanel();
        lblDateTime5 = new javax.swing.JLabel();
        pgDashboard5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jpDate6 = new javax.swing.JPanel();
        lblDateTime6 = new javax.swing.JLabel();
        pgYoga = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jpDate7 = new javax.swing.JPanel();
        lblDateTime7 = new javax.swing.JLabel();
        pgSaturday = new javax.swing.JPanel();
        jpDate8 = new javax.swing.JPanel();
        lblDateTime8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtSaturday = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booking System");
        setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSidebar.setBackground(new java.awt.Color(54, 33, 89));

        btnDashboard.setBackground(new java.awt.Color(122, 72, 221));
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardMouseClicked(evt);
            }
        });
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
        btnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookMouseClicked(evt);
            }
        });
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

        btnBook5.setBackground(new java.awt.Color(54, 33, 89));
        btnBook5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new.png"))); // NOI18N
        jLabel18.setText("Attend Lesson");
        jLabel18.setToolTipText("Attend Lesson");
        btnBook5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 275, 50));

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
            .addComponent(btnBook5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btnBook5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 252, Short.MAX_VALUE))
        );

        jPanel1.add(jpSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 620));

        pgDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel13.setText("Dashboard");
        pgDashboard.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jpDate.setBackground(new java.awt.Color(122, 72, 221));
        jpDate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate.add(lblDateTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgDashboard.add(jpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jPanel1.add(pgDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        jpTitle.setBackground(new java.awt.Color(122, 72, 221));
        jpTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 3, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N
        jLabel2.setText(" UNIVERSITY SPORTS CENTER BOOKING SYSTEM");
        jpTitle.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        jPanel1.add(jpTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 100));

        pgBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel14.setText("Book a Lesson");
        pgBook.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jpDate1.setBackground(new java.awt.Color(122, 72, 221));
        jpDate1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime1.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate1.add(lblDateTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgBook.add(jpDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jPanel1.add(pgBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

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

        pgAttend.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 550));

        jPanel1.add(pgAttend, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

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
                "Booking ID", "Lesson", "Week", "Day", "Period", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtBookings);

        pgBookings.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 550));

        jPanel1.add(pgBookings, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgLessonReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel17.setText("Lesson Report");
        pgLessonReport.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jpDate4.setBackground(new java.awt.Color(122, 72, 221));
        jpDate4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime4.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate4.add(lblDateTime4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgLessonReport.add(jpDate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jPanel1.add(pgLessonReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgExerciseReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel19.setText("Exercise Report");
        pgExerciseReport.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jpDate5.setBackground(new java.awt.Color(122, 72, 221));
        jpDate5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime5.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate5.add(lblDateTime5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgExerciseReport.add(jpDate5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jPanel1.add(pgExerciseReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgDashboard5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel20.setText("Lesson Report");
        pgDashboard5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jpDate6.setBackground(new java.awt.Color(122, 72, 221));
        jpDate6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime6.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate6.add(lblDateTime6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgDashboard5.add(jpDate6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jPanel1.add(pgDashboard5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgYoga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel21.setText("Exercise Report");
        pgYoga.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jpDate7.setBackground(new java.awt.Color(122, 72, 221));
        jpDate7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime7.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate7.add(lblDateTime7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgYoga.add(jpDate7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jPanel1.add(pgYoga, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

        pgSaturday.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDate8.setBackground(new java.awt.Color(122, 72, 221));
        jpDate8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDateTime8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDateTime8.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jpDate8.add(lblDateTime8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        pgSaturday.add(jpDate8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 350, 50));

        jtSaturday.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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
            jtSaturday.getColumnModel().getColumn(0).setPreferredWidth(170);
            jtSaturday.getColumnModel().getColumn(1).setPreferredWidth(270);
            jtSaturday.getColumnModel().getColumn(2).setPreferredWidth(270);
            jtSaturday.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtSaturday.getColumnModel().getColumn(4).setPreferredWidth(70);
            jtSaturday.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        pgSaturday.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 490));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lessons on Saturdays");
        pgSaturday.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 50));

        jPanel1.add(pgSaturday, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1000, 620));

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

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void btnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBookMouseClicked

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        // TODO add your handling code here:
        //Panel color
        setPanelColor(btnDashboard);
        resetPanelColor(btnBook);
        resetPanelColor(btnAttend);
        resetPanelColor(btnBooking);
        resetPanelColor(btnLessonReport);
        resetPanelColor(btnExerciseReport);
        
        //pages
        pgDashboard.setVisible(true);
        pgBook.setVisible(false);
        pgAttend.setVisible(false);
        pgBookings.setVisible(false);
        pgLessonReport.setVisible(false);
        pgExerciseReport.setVisible(false);
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lblBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookMouseClicked
        // TODO add your handling code here:
        //Panel color
        resetPanelColor(btnDashboard);
        setPanelColor(btnBook);
        resetPanelColor(btnAttend);
        resetPanelColor(btnBooking);
        resetPanelColor(btnLessonReport);
        resetPanelColor(btnExerciseReport);
        
        //pages
        pgDashboard.setVisible(false);
        pgBook.setVisible(false);
        pgAttend.setVisible(false);
        pgBookings.setVisible(false);
        pgLessonReport.setVisible(false);
        pgExerciseReport.setVisible(false);
        
        //Dialog
        String[] responses = {"By Day", "By Lesson"};
        int ans = JOptionPane.showOptionDialog(rootPane, "How do you want to check the timetable?", "Check Timetable", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, responses, 0);
        
        if (ans == 0){
            String[] responses1 = {"Saturday", "Sunday"};
            int ans1 = JOptionPane.showOptionDialog(rootPane, "Select Day", "Check Timetable", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses1, 0);
            
            if (ans1 == 0){
                pgSaturday.setVisible(true);
                pgDashboard.setVisible(false);
                pgBook.setVisible(false);
                pgAttend.setVisible(false);
                pgBookings.setVisible(false);
                pgLessonReport.setVisible(false);
                pgExerciseReport.setVisible(false);
                pgDashboard5.setVisible(false);
                pgYoga.setVisible(false);
            }
            
        }else if(ans == 1){
            String[] responses2 = {"Yoga", "Zumba", "Box Fit", "Body Blitz"};
            int ans2 = JOptionPane.showOptionDialog(rootPane, "Select Lesson", "Check Timetable", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses2, 0);           
        }
        
    }//GEN-LAST:event_lblBookMouseClicked

    private void lblAttendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAttendMouseClicked
        // TODO add your handling code here:
        //Panel color
        resetPanelColor(btnDashboard);
        resetPanelColor(btnBook);
        setPanelColor(btnAttend);
        resetPanelColor(btnBooking);
        resetPanelColor(btnLessonReport);
        resetPanelColor(btnExerciseReport);
        
        //pages
        pgDashboard.setVisible(false);
        pgBook.setVisible(false);
        pgAttend.setVisible(true);
        pgBookings.setVisible(false);
        pgLessonReport.setVisible(false);
        pgExerciseReport.setVisible(false);
    }//GEN-LAST:event_lblAttendMouseClicked

    private void lblBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookingMouseClicked
        // TODO add your handling code here:
        //Panel color
        resetPanelColor(btnDashboard);
        resetPanelColor(btnBook);
        resetPanelColor(btnAttend);
        setPanelColor(btnBooking);
        resetPanelColor(btnLessonReport);
        resetPanelColor(btnExerciseReport);
        
        //pages
        pgDashboard.setVisible(false);
        pgBook.setVisible(false);
        pgAttend.setVisible(false);
        pgBookings.setVisible(true);
        pgLessonReport.setVisible(false);
        pgExerciseReport.setVisible(false);
    }//GEN-LAST:event_lblBookingMouseClicked

    private void lblLessonReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLessonReportMouseClicked
        // TODO add your handling code here:
        //Panel color
        resetPanelColor(btnDashboard);
        resetPanelColor(btnBook);
        resetPanelColor(btnAttend);
        resetPanelColor(btnBooking);
        setPanelColor(btnLessonReport);
        resetPanelColor(btnExerciseReport);
        
        //pages
        pgDashboard.setVisible(false);
        pgBook.setVisible(false);
        pgAttend.setVisible(false);
        pgBookings.setVisible(false);
        pgLessonReport.setVisible(true);
        pgExerciseReport.setVisible(false);
    }//GEN-LAST:event_lblLessonReportMouseClicked

    private void lblExerciseReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExerciseReportMouseClicked
        // TODO add your handling code here:
        //Panel color
        resetPanelColor(btnDashboard);
        resetPanelColor(btnBook);
        resetPanelColor(btnAttend);
        resetPanelColor(btnBooking);
        resetPanelColor(btnLessonReport);
        setPanelColor(btnExerciseReport);
        
        //pages
        pgDashboard.setVisible(false);
        pgBook.setVisible(false);
        pgAttend.setVisible(false);
        pgBookings.setVisible(false);
        pgLessonReport.setVisible(false);
        pgExerciseReport.setVisible(true);
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
                    int remSlot = lessons.get(a).getSlot();
                    System.out.println("Line = "+ a + " & value = " + remSlot);
                    
                    if(remSlot <= 4 && remSlot != 0){
                        //Validate Student with student's ID
                        String sid = JOptionPane.showInputDialog(rootPane, "Please enter the student's ID.", "Input Student ID", JOptionPane.QUESTION_MESSAGE);
                        int studentID = Integer.parseInt(sid);
                        String FName, LName, LesName, LesWeek, LesDay, LesPeriod, lastBook, lastBookName, curBookID, bookID;
                        double LesPrice;
                        int lastBookID;
                        LesName = lessons.get(a).getName();
                        LesWeek = lessons.get(a).getWeek();
                        LesDay = lessons.get(a).getDay();
                        LesPeriod = lessons.get(a).getPeriod();
                        LesPrice = lessons.get(a).getPrice();
                        lastBookID = 0;
                        lastBookName = "";
                        for (int i = 0; i < student.size(); i++){
                            for (int l = 0; l < bookings.size(); l++){
                                if(student.get(i).getStudenID() == studentID){
                                    if (bookings.get(l).getStudentID() == studentID && bookings.get(l).getLessonName() == LesName && bookings.get(l).getLessonWeek() == LesWeek && bookings.get(l).getLessonDay() == LesDay && bookings.get(l).getLessonPeriod() == LesPeriod){
                                        JOptionPane.showMessageDialog(rootPane, "Sorry, Student with Student ID: " + studentID + " has already booked this lesson.", "Lesson already booked", JOptionPane.ERROR_MESSAGE);
                                    }else{
                                        int opt1 = JOptionPane.showConfirmDialog(rootPane, "Do you want to book " + lessons.get(a).getPeriod() + " " + lessons.get(a).getName() + " Lessons @ £" + lessons.get(a).getPrice() + "?", "Confirm Booking", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                        if(opt1 == 0){
                                            int Age, bok;
                                            char Sex;
                                            FName = student.get(i).getStudentFName();
                                            LName = student.get(i).getStudentLName();
                                            Age = student.get(i).getStudentAge();
                                            Sex = student.get(i).getStudentSex();

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

                                            remSlot--;
                                            lessons.get(a).setSlot(remSlot);
                                            DefaultTableModel model = (DefaultTableModel) jtSaturday.getModel();
                                            model.setRowCount(0);
                                            jtSaturday.setDefaultRenderer(Object.class, new Render());
                                            JButton btn1 = new JButton("Book");
                                            btn1.setName("b");

                                            Object rowData[] = new Object[lessons.size()];
                                            for (int j = 0; j < lessons.size(); j++){
                                                rowData[0] = lessons.get(j).getWeek();
                                                rowData[1] = lessons.get(j).getName();
                                                rowData[2] = lessons.get(j).getPeriod();
                                                rowData[3] = lessons.get(j).getPrice();
                                                rowData[4] = lessons.get(j).getSlot();
                                                rowData[5] = btn1;  

                                                model.addRow(rowData);
                                            }

                                            DefaultTableModel modelBook = (DefaultTableModel) jtAttend.getModel();
                                            modelBook.setRowCount(0);
                                            jtAttend.setDefaultRenderer(Object.class, new Render());
                                            JButton btn2 = new JButton("Attend");
                                            btn2.setName("at");

                                            JButton btn3 = new JButton("Change");
                                            btn3.setName("ch");

                                            JButton btn4 = new JButton("Cancel");
                                            btn3.setName("x");

                                            Object rowBookData[] = new Object[bookings.size()];
                                            for (int k = 0; k < bookings.size(); k++){
                                                rowBookData[0] = bookings.get(k).getBookingID();
                                                rowBookData[1] = bookings.get(k).getLessonName();
                                                rowBookData[2] = bookings.get(k).getLessonWeek();
                                                rowBookData[3] = bookings.get(k).getLessonDay();
                                                rowBookData[4] = bookings.get(k).getLessonPeriod();
                                                rowBookData[5] = bookings.get(k).getLessonStatus();

                                                rowData[6] = btn2;
                                                rowData[7] = btn3;
                                                rowData[8] = btn4;

                                                modelBook.addRow(rowBookData);
                                            }

                                            JOptionPane.showMessageDialog(rootPane, lessons.get(a).getPeriod() + " " + lessons.get(a).getName() + " Lesson has being booked Successfully", "Booking Completed", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        //return;
                                    }

                                    return;
                                }
                            }
                            
                        }
                        JOptionPane.showMessageDialog(rootPane, "Sorry, Student with Student ID: " + studentID + " not found.", "Student Not Found", JOptionPane.ERROR_MESSAGE);
                            
                                                                        
                    }else if(remSlot == 0){
                        JOptionPane.showMessageDialog(rootPane, "Sorry, This Lesson has no slot available at this Week and Period.", "Slot Fully Booked", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    System.out.println(remSlot);
                }
            }
        }
    }//GEN-LAST:event_jtSaturdayMouseClicked

    
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
                lblDateTime1.setText(dst);
                lblDateTime2.setText(dst);
                lblDateTime3.setText(dst);
                lblDateTime4.setText(dst);
                lblDateTime5.setText(dst);
                lblDateTime6.setText(dst);
                lblDateTime8.setText(dst);
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
    private javax.swing.JPanel btnAttend;
    private javax.swing.JPanel btnBook;
    private javax.swing.JPanel btnBook5;
    private javax.swing.JPanel btnBooking;
    private javax.swing.JPanel btnDashboard;
    private javax.swing.JPanel btnExerciseReport;
    private javax.swing.JPanel btnLessonReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpDate;
    private javax.swing.JPanel jpDate1;
    private javax.swing.JPanel jpDate2;
    private javax.swing.JPanel jpDate3;
    private javax.swing.JPanel jpDate4;
    private javax.swing.JPanel jpDate5;
    private javax.swing.JPanel jpDate6;
    private javax.swing.JPanel jpDate7;
    private javax.swing.JPanel jpDate8;
    private javax.swing.JPanel jpSidebar;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JTable jtAttend;
    private javax.swing.JTable jtBookings;
    private javax.swing.JTable jtSaturday;
    private javax.swing.JLabel lblAttend;
    private javax.swing.JLabel lblBook;
    private javax.swing.JLabel lblBooking;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblDateTime;
    private javax.swing.JLabel lblDateTime1;
    private javax.swing.JLabel lblDateTime2;
    private javax.swing.JLabel lblDateTime3;
    private javax.swing.JLabel lblDateTime4;
    private javax.swing.JLabel lblDateTime5;
    private javax.swing.JLabel lblDateTime6;
    private javax.swing.JLabel lblDateTime7;
    private javax.swing.JLabel lblDateTime8;
    private javax.swing.JLabel lblExerciseReport;
    private javax.swing.JLabel lblLessonReport;
    private javax.swing.JPanel pgAttend;
    private javax.swing.JPanel pgBook;
    private javax.swing.JPanel pgBookings;
    private javax.swing.JPanel pgDashboard;
    private javax.swing.JPanel pgDashboard5;
    private javax.swing.JPanel pgExerciseReport;
    private javax.swing.JPanel pgLessonReport;
    private javax.swing.JPanel pgSaturday;
    private javax.swing.JPanel pgYoga;
    // End of variables declaration//GEN-END:variables
}
