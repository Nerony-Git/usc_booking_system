/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


import UI.Booking;
import UI.Homepage;
import UI.Lesson;
import UI.Students;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JPanel;

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

    public void lessonAttended(int a, String userReview, int userRatings, Homepage homepage) {
        bookings.get(a).setLessonStatus("Attended");
        bookings.get(a).setLessonReview(userReview);
        bookings.get(a).setLessonRating(userRatings);
    }

    public void lessonChanged(String LesName, String LesWeek, String LesPeriod, String LesDay, String LName, String LWeek, String LPeriod, String LDay, Homepage homepage) {
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

    public void lessonCancelled(int a, String LesName, String LesDay, String LesWeek, String LesPeriod, Homepage homepage) {
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
    
}
