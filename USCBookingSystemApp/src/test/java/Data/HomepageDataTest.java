/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import UI.Homepage;
import UI.Lesson;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gnamu
 */
public class HomepageDataTest {
    
    public HomepageDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isStudent method, of class HomepageData.
     */
    @Test
    public void testIsStudent() {
        System.out.println("isStudent");
        int StudentID = 208980;
        Homepage homepage = null;
        HomepageData instance = new HomepageData();
        boolean expResult = false;
        boolean result = instance.isStudent(StudentID, homepage);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of canBookLesson method, of class HomepageData.
     */
    @Test
    public void testCanBookLesson() {
        System.out.println("canBookLesson");
        int StudentID = 208960;
        String LessonName = "Hellen";
        String LessonWeek = "Johnson";
        String LessonPeriod = "Morning";
        String LessonDay = "Saturday";
        Homepage homepage = null;
        HomepageData instance = new HomepageData();
        boolean expResult = true;
        boolean result = instance.canBookLesson(StudentID, LessonName, LessonWeek, LessonPeriod, LessonDay, homepage);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isStudentFree method, of class HomepageData.
     */
    @Test
    public void testIsStudentFree() {
        System.out.println("isStudentFree");
        int StudentID = 208970;
        String LessonWeek = "Week 1";
        String LessonPeriod = "Morning";
        String LessonDay = "Saturday";
        Homepage homepage = null;
        HomepageData instance = new HomepageData();
        boolean expResult = true;
        boolean result = instance.isStudentFree(StudentID, LessonWeek, LessonPeriod, LessonDay, homepage);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of increaseSlot method, of class HomepageData.
     */
    @Test
    public void testIncreaseSlot() {
        System.out.println("increaseSlot");
        String LesName = "Zumba";
        String LesDay = "Sunday";
        String LesWeek = "Week 6";
        String LesPeriod = "Evening";
        HomepageData instance = new HomepageData();
        ArrayList<Lesson> listArray = instance.zumbaLessons;
        
        int expResult = 2, result = 0;        
        instance.increaseSlot(listArray, LesName, LesDay, LesWeek, LesPeriod);
        
        for (Lesson l : listArray) {
            if (l.getName() == LesName && l.getWeek() == LesWeek && l.getDay() == LesDay && l.getPeriod() == LesPeriod) {
                result = l.getSlot();
            }
        }
        
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of decreaseSlot method, of class HomepageData.
     */
    @Test
    public void testDecreaseSlot() {
        System.out.println("decreaseSlot");
        String LesName = "Yoga";
        String LesDay = "Sunday";
        String LesWeek = "Week 7";
        String LesPeriod = "Evening";
        HomepageData instance = new HomepageData();
        ArrayList<Lesson> listArray = instance.yogaLessons;
        
        int expResult = 3, result = 0;
        instance.decreaseSlot(listArray, LesName, LesDay, LesWeek, LesPeriod);
        
        for (Lesson l : listArray) {
            if (l.getName() == LesName && l.getWeek() == LesWeek && l.getDay() == LesDay && l.getPeriod() == LesPeriod) {
                result = l.getSlot();
            }
        }
        
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of newStudent method, of class HomepageData.
     */
    @Test
    public void testNewStudent() {
        System.out.println("newStudent");
        int studentID = 208963;
        int studentAge = 20;
        String FName = "Rebecca";
        String LName = "Chai";
        char studentSex = 'F';
        Homepage homepage = null;
        HomepageData instance = new HomepageData();
        int expResult = instance.student.size() + 1;
        instance.newStudent(studentID, studentAge, FName, LName, studentSex, homepage);
        
        int result = instance.student.size();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of newBooking method, of class HomepageData.
     */
    @Test
    public void testNewBooking() {
        System.out.println("newBooking");
        String bookID = "BIYG027";
        int studentID = 208949;
        String FName = "Sarah";
        String LName = "James";
        int Age = 19;
        char Sex = 'F';
        String LesName = "Yoga";
        String LesWeek = "Week 3";
        String LesDay = "Saturday";
        String LesPeriod = "Morning";
        String LesStatus = "";
        String LesReview = "";
        int LesRatings = 5;
        int LesMonth = 0;
        double LesPrice = 12.86;
        Homepage homepage = null;
        HomepageData instance = new HomepageData();
        int expResult = instance.bookings.size() + 1;
        instance.newBooking(bookID, studentID, FName, LName, Age, Sex, LesName, LesWeek, LesDay, LesPeriod, LesStatus, LesReview, LesRatings, LesMonth, LesPrice, homepage);
        int result = instance.bookings.size();
        
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of lessonAttended method, of class HomepageData.
     */
    @Test
    public void testLessonAttended() {
        System.out.println("lessonAttended");
        String bookID = "BIYG027";
        int studentID = 208949;
        String FName = "Sarah";
        String LName = "James";
        int Age = 19;
        char Sex = 'F';
        String LesName = "Yoga";
        String LesWeek = "Week 3";
        String LesDay = "Saturday";
        String LesPeriod = "Morning";
        String LesStatus = "";
        String LesReview = "";
        int LesRatings = 5;
        int LesMonth = 0;
        double LesPrice = 12.86;
        HomepageData instance = new HomepageData();
        Homepage homepage = null;
        instance.newBooking(bookID, studentID, FName, LName, Age, Sex, LesName, LesWeek, LesDay, LesPeriod, LesStatus, LesReview, LesRatings, LesMonth, LesPrice, homepage);
        
        int a = instance.bookings.size() - 1;
        String userReview = "Very Satisfied";
        int userRatings = 5;
        instance.lessonAttended(a, userReview, userRatings);
        String expResult = "Attended";
        String result = instance.bookings.get(a).getLessonStatus();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of lessonCancelled method, of class HomepageData.
     */
    @Test
    public void testLessonCancelled() {
        System.out.println("lessonCancelled");
        String bookID = "BIYG027";
        int studentID = 208949;
        String FName = "Sarah";
        String LName = "James";
        int Age = 19;
        char Sex = 'F';
        String LesName = "Yoga";
        String LesWeek = "Week 3";
        String LesDay = "Saturday";
        String LesPeriod = "Morning";
        String LesStatus = "";
        String LesReview = "";
        Homepage homepage = null;
        HomepageData instance = new HomepageData();
        
        instance.newBooking(bookID, studentID, FName, LName, Age, Sex, LesName, LesWeek, LesDay, LesPeriod, LesStatus, LesReview, Age, studentID, Sex, homepage);
        int a = instance.bookings.size() - 1;
        
        instance.lessonCancelled(a, LesName, LesDay, LesWeek, LesPeriod);
        
        String expResult = "Cancelled";
        String result = instance.bookings.get(a).getLessonStatus();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of lessonChanged method, of class HomepageData.
     */
    @Test
    public void testLessonChanged() {
        System.out.println("lessonChanged");
        String bookID = "BIYG027";
        int studentID = 208949;
        String FName = "Sarah";
        String LName = "James";
        int Age = 19;
        char Sex = 'F';
        String LesName = "Yoga";
        String LesWeek = "Week 6";
        String LesDay = "Saturday";
        String LesPeriod = "Afternoon";
        String LesStatus = "";
        String LesReview = "";
        Homepage homepage = null;
        HomepageData instance = new HomepageData();
        
        instance.newBooking(bookID, studentID, FName, LName, Age, Sex, LesName, LesWeek, LesDay, LesPeriod, LesStatus, LesReview, Age, studentID, Sex, homepage);
        int a = instance.bookings.size() - 1;
        
        String LWeek = instance.bookings.get(a).getLessonWeek();
        String LPeriod = instance.bookings.get(a).getLessonPeriod();
        String LDay = instance.bookings.get(a).getLessonDay();
        String bkID = bookID;
        
        LesName = "Zumba";
        LesWeek = "Week 6";
        LesPeriod = "Evening";
        LesDay = "Saturday";
        
        instance.lessonChanged(LesName, LesWeek, LesPeriod, LesDay, LName, LWeek, LPeriod, LDay, bkID);
        
        String expResultLessonName = "Zumba";
        String resultLessonName = instance.bookings.get(a).getLessonName();
        String expResultLessonStatus = "Changed";
        String resultLessonStatus = instance.bookings.get(a).getLessonStatus();
        
        assertEquals(expResultLessonName, resultLessonName);
        assertEquals(expResultLessonStatus, resultLessonStatus);
       
    }
    
}
