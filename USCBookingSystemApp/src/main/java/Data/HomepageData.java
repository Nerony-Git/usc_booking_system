/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


import UI.Booking;
import UI.Homepage;
import UI.Lesson;
import UI.Render;
import UI.Students;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gnamu
 */
public class HomepageData {
    
    LessonData lData = new LessonData();
    
    public static final DecimalFormat df = new DecimalFormat("0.0");
    public static final DecimalFormat df2 = new DecimalFormat("0.00");
    public ArrayList<Booking> bookingYoga = new ArrayList<Booking>();
    public ArrayList<Lesson> yogaLessons = lData.listofYogaLessons();
    public ArrayList<Booking> bookings = lData.listOfBookings();
    public ArrayList<Lesson> bodyblitzLessons = lData.listofBodyBlitzLessons();
    public ArrayList<Booking> bookingZumba = new ArrayList<Booking>();
    public ArrayList<Booking> bookingBodyBlitz = new ArrayList<Booking>();
    public ArrayList<Lesson> sundayLessons = lData.listofSundayLessons();
    public ArrayList<Lesson> saturdayLessons = lData.listOfSaturdayLessons();
    public ArrayList<Booking> bookingBoxFit = new ArrayList<Booking>();
    public ArrayList<Lesson> boxfitLessons = lData.listofBoxFitLessons();
    public ArrayList<Students> student = lData.listOfStudents();
    public ArrayList<Lesson> zumbaLessons = lData.listofZumbaLessons();
    public ArrayList<Lesson> allLessons = lData.listofAllLessons(this);

    //Set Colour
    public void setPanelColor(JPanel panel) {
        panel.setBackground(new Color(122, 72, 221));
    }

    public void resetPanelColor(JPanel panel) {
        panel.setBackground(new Color(54, 33, 89));
    }
    
    public boolean isStudent(int StudentID, Homepage homepage) {
        for (Students s : student) {
            if (s.getStudenID() == StudentID) {
                return true;
            }
        }
        return false;
    }

    public boolean canBookLesson(int StudentID, String LessonName, String LessonWeek, String LessonPeriod, String LessonDay, Homepage homepage) {
        for (Booking b : bookings) {
            if (b.getStudentID() == StudentID && b.getLessonName() == LessonName && b.getLessonWeek() == LessonWeek && b.getLessonPeriod() == LessonPeriod && b.getLessonDay() == LessonDay) {
                return false;
            }
        }
        return true;
    }

    public boolean isStudentFree(int StudentID, String LessonWeek, String LessonPeriod, String LessonDay, Homepage homepage) {
        for (Booking b : bookings) {
            if (b.getStudentID() == StudentID && b.getLessonWeek() == LessonWeek && b.getLessonDay() == LessonDay && b.getLessonPeriod() == LessonPeriod && b.getLessonStatus() == "Booked") {
                return false;
            }
        }
        return true;
    }

    public void increaseSlot(ArrayList<Lesson> listArray, String LesName, String LesDay, String LesWeek, String LesPeriod) {
        for (Lesson l : listArray) {
            if (l.getName() == LesName && l.getWeek() == LesWeek && l.getDay() == LesDay && l.getPeriod() == LesPeriod) {
                int remslot = l.getSlot();
                remslot = remslot + 1;
                l.setSlot(remslot);
            }
        }
    }

    public void decreaseSlot(ArrayList<Lesson> listArray, String LesName, String LesDay, String LesWeek, String LesPeriod) {
        for (Lesson l : listArray) {
            if (l.getName() == LesName && l.getWeek() == LesWeek && l.getDay() == LesDay && l.getPeriod() == LesPeriod) {
                int remslot = l.getSlot();
                remslot = remslot - 1;
                l.setSlot(remslot);
            }
        }
    }

    public void newStudent(int studentID, int studentAge, String FName, String LName, char studentSex, Homepage homepage) {
        student.add(new Students(studentID, studentAge, FName, LName, studentSex));
    }

    public void newBooking(String bookID, int studentID, String FName, String LName, int Age, char Sex, String LesName, String LesWeek, String LesDay, String LesPeriod, String LesStatus, String LesReview, int LesRatings, int LesMonth, double LesPrice, Homepage homepage) {
        bookings.add(new Booking(bookID, studentID, FName, LName, Age, Sex, LesName, LesWeek, LesDay, LesPeriod, LesStatus, LesReview, LesRatings, LesMonth, LesPrice));
    }

    public void lessonAttended(int a, String userReview, int userRatings) {
        bookings.get(a).setLessonStatus("Attended");
        bookings.get(a).setLessonReview(userReview);
        bookings.get(a).setLessonRating(userRatings);
    }

    public void lessonCancelled(int a, String LesName, String LesDay, String LesWeek, String LesPeriod) {
        bookings.get(a).setLessonStatus("Cancelled");
        increaseSlot(allLessons, LesName, LesDay, LesWeek, LesPeriod);
        if (LesName == "Yoga" && LesDay == "Saturday") {
            //increaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
            increaseSlot(yogaLessons, LesName, LesDay, LesWeek, LesPeriod);
        } else if (LesName == "Yoga" && LesDay == "Sunday") {
            //increaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
            increaseSlot(yogaLessons, LesName, LesDay, LesWeek, LesPeriod);
        } else if (LesName == "Zumba" && LesDay == "Saturday") {
            //increaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
            increaseSlot(zumbaLessons, LesName, LesDay, LesWeek, LesPeriod);
        } else if (LesName == "Zumba" && LesDay == "Sunday") {
            //increaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
            increaseSlot(zumbaLessons, LesName, LesDay, LesWeek, LesPeriod);
        } else if (LesName == "Body Blitz" && LesDay == "Saturday") {
            //increaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
            increaseSlot(bodyblitzLessons, LesName, LesDay, LesWeek, LesPeriod);
        } else if (LesName == "Body Blitz" && LesDay == "Sunday") {
            //increaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
            increaseSlot(bodyblitzLessons, LesName, LesDay, LesWeek, LesPeriod);
        } else if (LesName == "Box Fit" && LesDay == "Saturday") {
            //increaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
            increaseSlot(boxfitLessons, LesName, LesDay, LesWeek, LesPeriod);
        } else if (LesName == "Box Fit" && LesDay == "Sunday") {
            //increaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
            increaseSlot(boxfitLessons, LesName, LesDay, LesWeek, LesPeriod);
        }
    }

    public void lessonChanged(String LesName, String LesWeek, String LesPeriod, String LesDay, String LName, String LWeek, String LPeriod, String LDay, String bkID) {
                
        for (Booking bk : bookings) {
            if (bk.getBookingID() == bkID) {
                bk.setLessonWeek(LesWeek);
                bk.setLessonDay(LesDay);
                bk.setLessonPeriod(LesPeriod);
                bk.setLessonName(LesName);
                bk.setLessonStatus("Changed");
            }
        }
        
        if (LesName == "Yoga" && LesDay == "Saturday") {
            decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
            decreaseSlot(yogaLessons, LesName, LesDay, LesWeek, LesPeriod);
        } else if (LesName == "Yoga" && LesDay == "Sunday") {
            decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
            decreaseSlot(yogaLessons, LesName, LesDay, LesWeek, LesPeriod);
        } else if (LesName == "Zumba" && LesDay == "Saturday") {
            decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
            decreaseSlot(zumbaLessons, LesName, LesDay, LesWeek, LesPeriod);
        } else if (LesName == "Zumba" && LesDay == "Sunday") {
            decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
            decreaseSlot(zumbaLessons, LesName, LesDay, LesWeek, LesPeriod);
        } else if (LesName == "Body Blitz" && LesDay == "Saturday") {
            decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
            decreaseSlot(bodyblitzLessons, LesName, LesDay, LesWeek, LesPeriod);
        } else if (LesName == "Body Blitz" && LesDay == "Sunday") {
            decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
            decreaseSlot(bodyblitzLessons, LesName, LesDay, LesWeek, LesPeriod);
        } else if (LesName == "Box Fit" && LesDay == "Saturday") {
            decreaseSlot(saturdayLessons, LesName, LesDay, LesWeek, LesPeriod);
            decreaseSlot(boxfitLessons, LesName, LesDay, LesWeek, LesPeriod);
        } else if (LesName == "Box Fit" && LesDay == "Sunday") {
            decreaseSlot(sundayLessons, LesName, LesDay, LesWeek, LesPeriod);
            decreaseSlot(boxfitLessons, LesName, LesDay, LesWeek, LesPeriod);
        }
        
        
        if (LName == "Yoga" && LDay == "Saturday") {
            increaseSlot(saturdayLessons, LName, LDay, LWeek, LPeriod);
            increaseSlot(yogaLessons, LName, LDay, LWeek, LPeriod);
        } else if (LName == "Yoga" && LDay == "Sunday") {
            increaseSlot(sundayLessons, LName, LDay, LWeek, LPeriod);
            increaseSlot(yogaLessons, LName, LDay, LWeek, LPeriod);
        } else if (LName == "Zumba" && LDay == "Saturday") {
            increaseSlot(saturdayLessons, LName, LDay, LWeek, LPeriod);
            increaseSlot(zumbaLessons, LName, LDay, LWeek, LPeriod);
        } else if (LName == "Zumba" && LDay == "Sunday") {
            increaseSlot(sundayLessons, LName, LDay, LWeek, LPeriod);
            increaseSlot(zumbaLessons, LName, LDay, LWeek, LPeriod);
        } else if (LName == "Body Blitz" && LDay == "Saturday") {
            increaseSlot(saturdayLessons, LName, LDay, LWeek, LPeriod);
            increaseSlot(bodyblitzLessons, LName, LDay, LWeek, LPeriod);
        } else if (LName == "Body Blitz" && LDay == "Sunday") {
            increaseSlot(sundayLessons, LName, LDay, LWeek, LPeriod);
            increaseSlot(bodyblitzLessons, LName, LDay, LWeek, LPeriod);
        } else if (LName == "Box Fit" && LDay == "Saturday") {
            increaseSlot(saturdayLessons, LName, LDay, LWeek, LPeriod);
            increaseSlot(boxfitLessons, LName, LDay, LWeek, LPeriod);
        } else if (LName == "Box Fit" && LDay == "Sunday") {
            increaseSlot(sundayLessons, LName, LDay, LWeek, LPeriod);
            increaseSlot(boxfitLessons, LName, LDay, LWeek, LPeriod);
        }
    }

    public void attendLesson(int a, Homepage homepage) {
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure you want to attend " + bookings.get(a).getLessonPeriod() + " " + bookings.get(a).getLessonName() + " Lesson?", "Attend Lesson", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opt == 0) {
            String userReview = JOptionPane.showInputDialog(null, bookings.get(a).getLessonPeriod() + " " + bookings.get(a).getLessonName() + " Lesson has been attended Sucessfuly. Please leave a review.", "Lesson attended successfuly.", JOptionPane.INFORMATION_MESSAGE);
            String[] rate = {"", "1", "2", "3", "4", "5"};
            String ratings = (String) JOptionPane.showInputDialog(null, "Please select a numerical ratings for the lesson. \n 1: Very dissatisfied  \n 2: Dissatisfied \n 3: Ok \n 4: Satisfied \n 5: Very Satisfied \n", "Lesson Ratings", JOptionPane.QUESTION_MESSAGE, null, rate, rate[0]);
            int rating = Integer.valueOf(ratings);
            
            lessonAttended(a, userReview, rating);
            
            DefaultTableModel modelBook = (DefaultTableModel) homepage.getJtAttend().getModel();
            modelBook.setRowCount(0);
            homepage.getJtAttend().setDefaultRenderer(Object.class, new Render());
            JButton btn2 = new JButton("Attend");
            btn2.setName("at");
            JButton btn3 = new JButton("Change");
            btn3.setName("ch");
            JButton btn4 = new JButton("Cancel");
            btn4.setName("x");
            Object[] rowBookData = new Object[bookings.size()];
            for (int k = 0; k < bookings.size(); k++) {
                rowBookData[0] = k + 1;
                rowBookData[1] = bookings.get(k).getBookingID();
                rowBookData[2] = bookings.get(k).getLessonName();
                rowBookData[3] = bookings.get(k).getLessonWeek();
                rowBookData[4] = bookings.get(k).getLessonDay();
                rowBookData[5] = bookings.get(k).getLessonPeriod();
                rowBookData[6] = bookings.get(k).getLessonStatus();
                if (bookings.get(k).getLessonStatus() == "Attended") {
                    rowBookData[7] = "";
                    rowBookData[8] = "";
                    rowBookData[9] = "";
                } else if (bookings.get(k).getLessonStatus() == "Cancelled") {
                    rowBookData[7] = "";
                    rowBookData[8] = "";
                    rowBookData[9] = "";
                } else {
                    rowBookData[7] = btn2;
                    rowBookData[8] = btn3;
                    rowBookData[9] = btn4;
                }
                modelBook.addRow(rowBookData);
            }
            
            

            DefaultTableModel modelHistory = (DefaultTableModel) homepage.getJtBookings().getModel();
            modelHistory.setRowCount(0);
            Object rowHistoryData[] = new Object[bookings.size()];
            for (int i = 0; i < bookings.size(); i++){
                rowHistoryData[0] = i + 1;
                rowHistoryData[1] = bookings.get(i).getBookingID();
                rowHistoryData[2] = bookings.get(i).getStudentID();
                rowHistoryData[3] = bookings.get(i).getStudentFName() + " " + bookings.get(i).getStudentLName();
                rowHistoryData[4] = bookings.get(i).getLessonName();
                rowHistoryData[5] = bookings.get(i).getLessonWeek();
                rowHistoryData[6] = bookings.get(i).getLessonDay();
                rowHistoryData[7] = bookings.get(i).getLessonPeriod();
                rowHistoryData[8] = bookings.get(i).getLessonStatus();

                modelHistory.addRow(rowHistoryData);
            }
            
            JOptionPane.showMessageDialog(null, bookings.get(a).getLessonPeriod() + " " + bookings.get(a).getLessonName() + " Lesson Attended Successfully", "Lesson Attended", JOptionPane.INFORMATION_MESSAGE);
        } else {
            return;
        }
    }

    public void cancelLesson(int a, Homepage homepage) {
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel " + bookings.get(a).getLessonPeriod() + " " + bookings.get(a).getLessonName() + " Booking?", "Cancel Bookings", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opt == 0) {
            JTable jt = homepage.getJtAttend();
            JTable jt2 = jt;
            ArrayList<Lesson> listArray = yogaLessons;
            ArrayList<Lesson> listArray2 = listArray;
            String LesName = bookings.get(a).getLessonName();
            String LesDay = bookings.get(a).getLessonDay();
            String LesPeriod = bookings.get(a).getLessonPeriod();
            String LesWeek = bookings.get(a).getLessonWeek();
            
            lessonCancelled(a, LesName, LesDay, LesWeek, LesPeriod);
            
            if (LesName == "Yoga" && LesDay == "Saturday") {
                increaseSlot(yogaLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = homepage.getJtSaturday();
                jt2 = homepage.getJtYoga();
                listArray = saturdayLessons;
                listArray2 = yogaLessons;
            } else if (LesName == "Yoga" && LesDay == "Sunday") {
                increaseSlot(yogaLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = homepage.getJtSunday();
                jt2 = homepage.getJtYoga();
                listArray = sundayLessons;
                listArray2 = yogaLessons;
            } else if (LesName == "Zumba" && LesDay == "Saturday") {
                increaseSlot(zumbaLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = homepage.getJtSaturday();
                jt2 = homepage.getJtZumba();
                listArray = saturdayLessons;
                listArray2 = zumbaLessons;
            } else if (LesName == "Zumba" && LesDay == "Sunday") {
                increaseSlot(zumbaLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = homepage.getJtSunday();
                jt2 = homepage.getJtZumba();
                listArray = sundayLessons;
                listArray2 = zumbaLessons;
            } else if (LesName == "Body Blitz" && LesDay == "Saturday") {
                increaseSlot(bodyblitzLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = homepage.getJtSaturday();
                jt2 = homepage.getJtBodyBlitz();
                listArray = saturdayLessons;
                listArray2 = bodyblitzLessons;
            } else if (LesName == "Body Blitz" && LesDay == "Sunday") {
                increaseSlot(bodyblitzLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = homepage.getJtSunday();
                jt2 = homepage.getJtBodyBlitz();
                listArray = sundayLessons;
                listArray2 = bodyblitzLessons;
            } else if (LesName == "Box Fit" && LesDay == "Saturday") {
                increaseSlot(boxfitLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = homepage.getJtSaturday();
                jt2 = homepage.getJtBoxFit();
                listArray = saturdayLessons;
                listArray2 = boxfitLessons;
            } else if (LesName == "Box Fit" && LesDay == "Sunday") {
                increaseSlot(boxfitLessons, LesName, LesDay, LesWeek, LesPeriod);
                jt = homepage.getJtSunday();
                jt2 = homepage.getJtBoxFit();
                listArray = sundayLessons;
                listArray2 = boxfitLessons;
            }
            
            homepage.updateTables(jt, jt2, listArray, listArray2);
            JOptionPane.showMessageDialog(null, bookings.get(a).getLessonPeriod() + " " + bookings.get(a).getLessonName() + " Lesson has being Cancelled Successfully", "Booking Cancelled", JOptionPane.INFORMATION_MESSAGE);
            homepage.getPgAllTimeTable().setVisible(false);
            homepage.getPgSaturday().setVisible(false);
            homepage.getPgDashboard().setVisible(false);
            homepage.getPgAttend().setVisible(true);
            homepage.getPgBookings().setVisible(false);
            homepage.getPgLessonReport().setVisible(false);
            homepage.getPgExerciseReport().setVisible(false);
            homepage.getPgStudents().setVisible(false);
            homepage.getPgYoga().setVisible(false);
            homepage.getPgSunday().setVisible(false);
            homepage.getPgZumba().setVisible(false);
            homepage.getPgBoxFit().setVisible(false);
            homepage.getPgBodyBlitz().setVisible(false);
        } else {
            return;
        }
    }

    public void changeLesson(int a, int remSlot, String bkID, Homepage homepage) {
        if (remSlot <= 4 && remSlot != 0) {
            String LesName;
            String LesWeek;
            String LesPeriod;
            String LesDay;
            String LName = "";
            String LDay = "";
            String LWeek = "";
            String LPeriod = "";
            int studentID = 0;
            JTable jt = homepage.getJtAllTimeTable();
            JTable jt2 = jt;
            ArrayList<Lesson> listArray = allLessons;
            ArrayList<Lesson> listArray2 = listArray;
            LesName = allLessons.get(a).getName();
            LesWeek = allLessons.get(a).getWeek();
            LesDay = allLessons.get(a).getDay();
            LesPeriod = allLessons.get(a).getPeriod();
            for (Booking b : bookings) {
                if (b.getBookingID() == bkID) {
                    studentID = b.getStudentID();
                    LName = b.getLessonName();
                    LDay = b.getLessonDay();
                    LWeek = b.getLessonWeek();
                    LPeriod = b.getLessonPeriod();
                }
            }
            if (canBookLesson(studentID, LesName, LesWeek, LesPeriod, LesDay, homepage)) {
                if (isStudentFree(studentID, LesWeek, LesPeriod, LesDay, homepage)) {
                    int opt1 = JOptionPane.showConfirmDialog(null, "Do you want to change Booking with ID: " + bkID + " to " + allLessons.get(a).getPeriod() + " " + allLessons.get(a).getName() + " Lessons @ \u00a3" + allLessons.get(a).getPrice() + "?", "Confirm Booking", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (opt1 == 0) {
                        
                        lessonChanged(LesName, LesWeek, LesPeriod, LesDay, LName, LWeek, LPeriod, LDay, bkID);
                                                
                        if (LName == "Yoga" && LDay == "Saturday") {
                            jt = homepage.getJtSaturday();
                            jt2 = homepage.getJtYoga();
                            listArray = saturdayLessons;
                            listArray2 = yogaLessons;
                        } else if (LName == "Yoga" && LDay == "Sunday") {
                            jt = homepage.getJtSunday();
                            jt2 = homepage.getJtYoga();
                            listArray = sundayLessons;
                            listArray2 = yogaLessons;
                        } else if (LName == "Zumba" && LDay == "Saturday") {
                            jt = homepage.getJtSaturday();
                            jt2 = homepage.getJtZumba();
                            listArray = saturdayLessons;
                            listArray2 = zumbaLessons;
                        } else if (LName == "Zumba" && LDay == "Sunday") {
                            jt = homepage.getJtSunday();
                            jt2 = homepage.getJtZumba();
                            listArray = sundayLessons;
                            listArray2 = zumbaLessons;
                        } else if (LName == "Body Blitz" && LDay == "Saturday") {
                            jt = homepage.getJtSaturday();
                            jt2 = homepage.getJtBodyBlitz();
                            listArray = saturdayLessons;
                            listArray2 = bodyblitzLessons;
                        } else if (LName == "Body Blitz" && LDay == "Sunday") {
                            jt = homepage.getJtSunday();
                            jt2 = homepage.getJtBodyBlitz();
                            listArray = sundayLessons;
                            listArray2 = bodyblitzLessons;
                        } else if (LName == "Box Fit" && LDay == "Saturday") {
                            jt = homepage.getJtSaturday();
                            jt2 = homepage.getJtBoxFit();
                            listArray = saturdayLessons;
                            listArray2 = boxfitLessons;
                        } else if (LName == "Box Fit" && LDay == "Sunday") {
                            jt = homepage.getJtSunday();
                            jt2 = homepage.getJtBoxFit();
                            listArray = sundayLessons;
                            listArray2 = boxfitLessons;
                        }
                        homepage.updateTables(jt, jt2, listArray, listArray2);
                        JOptionPane.showMessageDialog(null, "Booking with ID: " + bkID + " was Changed from " + LPeriod + " " + LName + " Lesson" + " to " + LesPeriod + " " + LesName + " Lesson Successfully", "Booking Changed", JOptionPane.INFORMATION_MESSAGE);
                        homepage.getPgAllTimeTable().setVisible(false);
                        homepage.getPgAttend().setVisible(true);
                        homepage.getPgSaturday().setVisible(false);
                        homepage.getPgDashboard().setVisible(false);
                        homepage.getPgBookings().setVisible(false);
                        homepage.getPgLessonReport().setVisible(false);
                        homepage.getPgExerciseReport().setVisible(false);
                        homepage.getPgStudents().setVisible(false);
                        homepage.getPgYoga().setVisible(false);
                        homepage.getPgSunday().setVisible(false);
                        homepage.getPgZumba().setVisible(false);
                        homepage.getPgBoxFit().setVisible(false);
                        homepage.getPgBodyBlitz().setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry, Student with Student ID: " + studentID + " has a Lesson already booked at this particular period.", "Student not Free", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sorry, Student with Student ID: " + studentID + " has already booked this lesson.", "Lesson already booked", JOptionPane.ERROR_MESSAGE);
            }
        } else if (remSlot <= 0) {
            JOptionPane.showMessageDialog(null, "Sorry, This Lesson has no slot available at this Week and Period.", "Slot Fully Booked", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
