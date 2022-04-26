/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import UI.Booking;
import UI.Lesson;
import UI.Students;
import java.util.ArrayList;

/**
 *
 * @author gnamu
 */
public class LessonData {

    public ArrayList listofZumbaLessons() {
        ArrayList<Lesson> zumbaLessons = new ArrayList<Lesson>();
        zumbaLessons.add(new Lesson("Week 1", "Zumba", "Saturday", "Afternoon", 15.78, 1));
        zumbaLessons.add(new Lesson("Week 2", "Zumba", "Saturday", "Evening", 15.78, 0));
        zumbaLessons.add(new Lesson("Week 4", "Zumba", "Saturday", "Morning", 15.78, 4));
        zumbaLessons.add(new Lesson("Week 5", "Zumba", "Saturday", "Afternoon", 15.78, 3));
        zumbaLessons.add(new Lesson("Week 6", "Zumba", "Saturday", "Evening", 15.78, 2));
        zumbaLessons.add(new Lesson("Week 8", "Zumba", "Saturday", "Morning", 15.78, 1));
        zumbaLessons.add(new Lesson("Week 1", "Zumba", "Sunday", "Afternoon", 15.78, 0));
        zumbaLessons.add(new Lesson("Week 2", "Zumba", "Sunday", "Evening", 15.78, 4));
        zumbaLessons.add(new Lesson("Week 4", "Zumba", "Sunday", "Morning", 15.78, 3));
        zumbaLessons.add(new Lesson("Week 5", "Zumba", "Sunday", "Afternoon", 15.78, 2));
        zumbaLessons.add(new Lesson("Week 6", "Zumba", "Sunday", "Evening", 15.78, 1));
        zumbaLessons.add(new Lesson("Week 8", "Zumba", "Sunday", "Morning", 15.78, 2));
        return zumbaLessons;
    }

    public ArrayList listofYogaLessons() {
        ArrayList<Lesson> yogaLessons = new ArrayList<Lesson>();
        yogaLessons.add(new Lesson("Week 1", "Yoga", "Saturday", "Morning", 12.86, 0));
        yogaLessons.add(new Lesson("Week 2", "Yoga", "Saturday", "Afternoon", 12.86, 4));
        yogaLessons.add(new Lesson("Week 3", "Yoga", "Saturday", "Evening", 12.86, 3));
        yogaLessons.add(new Lesson("Week 5", "Yoga", "Saturday", "Morning", 12.86, 2));
        yogaLessons.add(new Lesson("Week 6", "Yoga", "Saturday", "Afternoon", 12.86, 1));
        yogaLessons.add(new Lesson("Week 7", "Yoga", "Saturday", "Evening", 12.86, 0));
        yogaLessons.add(new Lesson("Week 1", "Yoga", "Sunday", "Morning", 12.86, 4));
        yogaLessons.add(new Lesson("Week 2", "Yoga", "Sunday", "Afternoon", 12.86, 3));
        yogaLessons.add(new Lesson("Week 3", "Yoga", "Sunday", "Evening", 12.86, 2));
        yogaLessons.add(new Lesson("Week 5", "Yoga", "Sunday", "Morning", 12.86, 1));
        yogaLessons.add(new Lesson("Week 6", "Yoga", "Sunday", "Afternoon", 12.86, 0));
        yogaLessons.add(new Lesson("Week 7", "Yoga", "Sunday", "Evening", 12.86, 4));
        return yogaLessons;
    }

    public ArrayList listOfBookings() {
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        bookings.add(new Booking("BIYG001", 208947, "James", "Fox", 20, 'M', "Yoga", "Week 1", "Saturday", "Morning", "Attended", "Very Satisfied.", 5, 4, 12.86));
        bookings.add(new Booking("BIYG002", 208948, "John", "Doe", 21, 'M', "Yoga", "Week 1", "Saturday", "Morning", "Attended", "Lesson was Great.", 5, 4, 12.86));
        bookings.add(new Booking("BIYG003", 208949, "Sarah", "James", 19, 'F', "Yoga", "Week 1", "Saturday", "Morning", "Attended", "Very Satisfied.", 5, 4, 12.86));
        bookings.add(new Booking("BIYG004", 208950, "James", "Bull", 22, 'M', "Yoga", "Week 1", "Saturday", "Morning", "Attended", "Lesson was as expected.", 5, 4, 12.86));
        bookings.add(new Booking("BIZB001", 208951, "Michael", "Jones", 19, 'M', "Zumba", "Week 1", "Saturday", "Afternoon", "Attended", "Great.", 4, 4, 15.78));
        bookings.add(new Booking("BIZB002", 208952, "Ivan", "Rictish", 21, 'M', "Zumba", "Week 1", "Saturday", "Afternoon", "Attended", "Lesson was Great.", 5, 4, 15.78));
        bookings.add(new Booking("BIZB003", 208953, "Mary", "King", 19, 'F', "Zumba", "Week 1", "Saturday", "Afternoon", "Attended", "OK.", 4, 4, 15.78));
        bookings.add(new Booking("BIBF001", 208954, "Will", "Smith", 20, 'M', "Box Fit", "Week 1", "Saturday", "Evening", "Changed", "", 0, 0, 17.93));
        bookings.add(new Booking("BIBF002", 208955, "Vivian", "Jones", 19, 'F', "Box Fit", "Week 1", "Saturday", "Evening", "Attended", "The equipments were broken.", 2, 4, 17.93));
        bookings.add(new Booking("BIBB001", 208956, "Jane", "Jackson", 20, 'F', "Body Blitz", "Week 2", "Saturday", "Morning", "Attended", "Lesson was great but started a bit late.", 3, 4, 20.74));
        bookings.add(new Booking("BIZB004", 208957, "Elizaberth", "Brown", 20, 'F', "Zumba", "Week 2", "Saturday", "Evening", "Attended", "Very Satisfied.", 5, 4, 15.78));
        bookings.add(new Booking("BIZB005", 208958, "Christian", "Bill", 21, 'M', "Zumba", "Week 2", "Saturday", "Evening", "Attended", "Lesson was as expected.", 5, 4, 15.78));
        bookings.add(new Booking("BIZB006", 208959, "Sharon", "Stone", 19, 'F', "Zumba", "Week 2", "Saturday", "Evening", "Attended", "Lesson was Fun.", 5, 4, 15.78));
        bookings.add(new Booking("BIZB007", 208960, "Hipsy", "Cone", 22, 'F', "Zumba", "Week 2", "Saturday", "Evening", "Attended", "Was Great.", 4, 4, 15.78));
        bookings.add(new Booking("BIBF003", 208961, "Paul", "Walker", 19, 'M', "Box Fit", "Week 3", "Saturday", "Morning", "Attended", "Lesson was Great.", 5, 4, 17.93));
        bookings.add(new Booking("BIBF004", 208947, "James", "Fox", 20, 'M', "Box Fit", "Week 3", "Saturday", "Morning", "Attended", "The lesson wasn't as expected.", 1, 4, 17.93));
        bookings.add(new Booking("BIBF005", 208948, "John", "Doe", 21, 'M', "Box Fit", "Week 3", "Saturday", "Morning", "Attended", "Lesson was as expected.", 5, 4, 17.93));
        bookings.add(new Booking("BIBB002", 208949, "Sarah", "James", 19, 'F', "Body Blitz", "Week 3", "Saturday", "Afternoon", "Attended", "Lesson was Fun.", 5, 4, 20.74));
        bookings.add(new Booking("BIBB003", 208950, "James", "Bull", 22, 'M', "Body Blitz", "Week 3", "Saturday", "Afternoon", "Attended", "Inadequate equipments.", 2, 4, 20.74));
        bookings.add(new Booking("BIYG005", 208951, "Michael", "Jones", 19, 'M', "Yoga", "Week 3", "Saturday", "Evening", "Attended", "Lesson was as expected.", 5, 4, 12.86));
        bookings.add(new Booking("BIBF006", 208952, "Ivan", "Rictish", 21, 'M', "Box Fit", "Week 4", "Saturday", "Afternoon", "Attended", "Very Satisfied.", 5, 4, 17.93));
        bookings.add(new Booking("BIBF007", 208953, "Mary", "King", 19, 'F', "Box Fit", "Week 4", "Saturday", "Afternoon", "Attended", "Great.", 4, 4, 17.93));
        bookings.add(new Booking("BIBF008", 208954, "Will", "Smith", 20, 'M', "Box Fit", "Week 4", "Saturday", "Afternoon", "Changed", "", 0, 0, 17.93));
        bookings.add(new Booking("BIBF009", 208950, "James", "Bull", 22, 'M', "Box Fit", "Week 8", "Saturday", "Afternoon", "Cancelled", "", 0, 0, 17.93));
        bookings.add(new Booking("BIBF010", 208955, "Vivian", "Jones", 19, 'F', "Box Fit", "Week 4", "Saturday", "Afternoon", "Attended", "Very Satisfied.", 5, 4, 17.93));
        bookings.add(new Booking("BIBB004", 208956, "Jane", "Jackson", 20, 'F', "Body Blitz", "Week 4", "Saturday", "Evening", "Attended", "OK.", 4, 4, 20.74));
        bookings.add(new Booking("BIBB005", 208957, "Elizaberth", "Brown", 20, 'F', "Body Blitz", "Week 4", "Saturday", "Evening", "Attended", "Inadequate equipments.", 1, 4, 20.74));
        bookings.add(new Booking("BIBB006", 208958, "Christian", "Bill", 21, 'M', "Body Blitz", "Week 4", "Saturday", "Evening", "Attended", "Very Satisfied.", 5, 4, 20.74));
        bookings.add(new Booking("BIYG006", 208959, "Sharon", "Stone", 19, 'F', "Yoga", "Week 5", "Saturday", "Morning", "Attended", "Lesson was Great.", 5, 5, 12.86));
        bookings.add(new Booking("BIYG007", 208960, "Hipsy", "Cone", 22, 'F', "Yoga", "Week 5", "Saturday", "Morning", "Attended", "Lesson was OK but not to my expectations.", 3, 5, 12.86));
        bookings.add(new Booking("BIZB008", 208961, "Paul", "Walker", 19, 'M', "Zumba", "Week 5", "Saturday", "Afternoon", "Attended", "Lesson was as expected.", 5, 5, 15.78));
        bookings.add(new Booking("BIBB007", 208947, "James", "Fox", 20, 'M', "Body Blitz", "Week 6", "Saturday", "Morning", "Attended", "Lesson was as expected.", 5, 5, 20.74));
        bookings.add(new Booking("BIBB008", 208948, "John", "Doe", 21, 'M', "Body Blitz", "Week 6", "Saturday", "Morning", "Attended", "Lesson was Great.", 5, 5, 20.74));
        bookings.add(new Booking("BIBB009", 208951, "Michael", "Jones", 19, 'M', "Body Blitz", "Week 8", "Sunday", "Evening", "Cancelled", "", 0, 0, 20.74));
        bookings.add(new Booking("BIBB010", 208959, "Sharon", "Stone", 19, 'F', "Body Blitz", "Week 4", "Sunday", "Evening", "Cancelled", "", 0, 0, 20.74));
        bookings.add(new Booking("BIBB011", 208949, "Sarah", "James", 19, 'F', "Body Blitz", "Week 6", "Saturday", "Morning", "Attended", "Lesson was Fun.", 5, 5, 20.74));
        bookings.add(new Booking("BIBB012", 208950, "James", "Bull", 22, 'M', "Body Blitz", "Week 6", "Saturday", "Morning", "Attended", "Lesson was great but more room for improvements.", 3, 5, 20.74));
        bookings.add(new Booking("BIYG008", 208951, "Michael", "Jones", 19, 'M', "Yoga", "Week 6", "Saturday", "Afternoon", "Attended", "Lesson was as expected.", 5, 5, 12.86));
        bookings.add(new Booking("BIYG009", 208952, "Ivan", "Rictish", 21, 'M', "Yoga", "Week 6", "Saturday", "Afternoon", "Changed", "", 0, 0, 12.86));
        bookings.add(new Booking("BIYG010", 208953, "Mary", "King", 19, 'F', "Yoga", "Week 6", "Saturday", "Afternoon", "Attended", "The lesson wasn't as expected.", 2, 5, 12.86));
        bookings.add(new Booking("BIZB009", 208954, "Will", "Smith", 20, 'M', "Zumba", "Week 6", "Saturday", "Evening", "Attended", "OK.", 4, 5, 15.78));
        bookings.add(new Booking("BIZB010", 208955, "Vivian", "Jones", 19, 'F', "Zumba", "Week 6", "Saturday", "Evening", "Attended", "Lesson was Great.", 5, 5, 15.78));
        bookings.add(new Booking("BIBF011", 208956, "Jane", "Jackson", 20, 'F', "Box Fit", "Week 7", "Saturday", "Morning", "Attended", "Lesson was OK but not to my expectations.", 4, 5, 17.93));
        bookings.add(new Booking("BIYG011", 208957, "Elizaberth", "Brown", 20, 'F', "Yoga", "Week 7", "Saturday", "Evening", "Attended", "Lesson was Fun.", 5, 5, 12.86));
        bookings.add(new Booking("BIYG012", 208958, "Christian", "Bill", 21, 'M', "Yoga", "Week 7", "Saturday", "Evening", "Cancelled", "", 0, 0, 12.86));
        bookings.add(new Booking("BIYG013", 208958, "Christian", "Bill", 21, 'M', "Yoga", "Week 7", "Saturday", "Evening", "Attended", "Very Satisfied.", 5, 5, 12.86));
        bookings.add(new Booking("BIYG014", 208959, "Sharon", "Stone", 19, 'F', "Yoga", "Week 7", "Saturday", "Evening", "Attended", "Very Satisfied.", 5, 5, 12.86));
        bookings.add(new Booking("BIYG015", 208960, "Hipsy", "Cone", 22, 'F', "Yoga", "Week 7", "Saturday", "Evening", "Attended", "Lesson was Great.", 5, 5, 12.86));
        bookings.add(new Booking("BIZB011", 208961, "Paul", "Walker", 19, 'M', "Zumba", "Week 8", "Saturday", "Morning", "Attended", "Great.", 4, 5, 15.78));
        bookings.add(new Booking("BIZB012", 208947, "James", "Fox", 20, 'M', "Zumba", "Week 8", "Saturday", "Morning", "Attended", "Lesson was Great.", 5, 5, 15.78));
        bookings.add(new Booking("BIZB013", 208948, "John", "Doe", 21, 'M', "Zumba", "Week 8", "Saturday", "Morning", "Attended", "Very Satisfied.", 5, 5, 15.78));
        bookings.add(new Booking("BIBF012", 208949, "Sarah", "James", 19, 'F', "Box Fit", "Week 8", "Saturday", "Afternoon", "Attended", "Lesson started late.", 1, 5, 17.93));
        bookings.add(new Booking("BIBF013", 208950, "James", "Bull", 22, 'M', "Box Fit", "Week 8", "Saturday", "Afternoon", "Attended", "Lesson was as expected.", 5, 5, 17.93));
        bookings.add(new Booking("BIBB013", 208953, "Mary", "King", 19, 'F', "Body Blitz", "Week 3", "Sunday", "Afternoon", "Cancelled", "", 0, 0, 20.74));
        bookings.add(new Booking("BIBB014", 208951, "Michael", "Jones", 19, 'M', "Body Blitz", "Week 8", "Saturday", "Evening", "Attended", "Lesson was Great.", 5, 5, 20.74));
        bookings.add(new Booking("BIZB015", 208952, "Ivan", "Rictish", 21, 'M', "Zumba", "Week 1", "Sunday", "Afternoon", "Attended", "I will rate a 5 star if a specialised trainee is hired to assist us.", 3, 4, 15.78));
        bookings.add(new Booking("BIZB014", 208952, "Ivan", "Rictish", 21, 'M', "Zumba", "Week 1", "Sunday", "Afternoon", "Cancelled", "", 0, 0, 15.78));
        bookings.add(new Booking("BIZB016", 208953, "Mary", "King", 19, 'F', "Zumba", "Week 1", "Sunday", "Afternoon", "Attended", "Lesson was Fun.", 5, 4, 15.78));
        bookings.add(new Booking("BIZB017", 208954, "Will", "Smith", 20, 'M', "Zumba", "Week 1", "Sunday", "Afternoon", "Attended", "OK.", 4, 4, 15.78));
        bookings.add(new Booking("BIZB018", 208955, "Vivian", "Jones", 19, 'F', "Zumba", "Week 1", "Sunday", "Afternoon", "Attended", "Lesson was Great.", 5, 4, 15.78));
        bookings.add(new Booking("BIBF014", 208956, "Jane", "Jackson", 20, 'F', "Box Fit", "Week 1", "Sunday", "Evening", "Attended", "Lesson was as expected.", 5, 4, 17.93));
        bookings.add(new Booking("BIBF015", 208957, "Elizaberth", "Brown", 20, 'F', "Box Fit", "Week 1", "Sunday", "Evening", "Changed", "", 0, 0, 17.93));
        bookings.add(new Booking("BIBF016", 208958, "Christian", "Bill", 21, 'M', "Box Fit", "Week 1", "Sunday", "Evening", "Attended", "Very Satisfied.", 5, 4, 17.93));
        bookings.add(new Booking("BIBB015", 208959, "Sharon", "Stone", 19, 'F', "Body Blitz", "Week 2", "Sunday", "Morning", "Attended", "Lesson was Great.", 5, 4, 20.74));
        bookings.add(new Booking("BIBB016", 208960, "Hipsy", "Cone", 22, 'F', "Body Blitz", "Week 2", "Sunday", "Morning", "Attended", "Great.", 4, 4, 20.74));
        bookings.add(new Booking("BIYG016", 208961, "Paul", "Walker", 19, 'M', "Yoga", "Week 2", "Sunday", "Afternoon", "Attended", "Very Satisfied.", 5, 4, 12.86));
        bookings.add(new Booking("BIBF017", 208960, "Hipsy", "Cone", 22, 'F', "Box Fit", "Week 7", "Sunday", "Morning", "Cancelled", "", 0, 0, 17.93));
        bookings.add(new Booking("BIBF018", 208947, "James", "Fox", 20, 'M', "Box Fit", "Week 3", "Sunday", "Morning", "Attended", "The equipments were broken.", 1, 4, 17.93));
        bookings.add(new Booking("BIBF019", 208948, "John", "Doe", 21, 'M', "Box Fit", "Week 3", "Sunday", "Morning", "Booked", "", 0, 0, 17.93));
        bookings.add(new Booking("BIBF020", 208959, "Sharon", "Stone", 19, 'F', "Box Fit", "Week 7", "Sunday", "Morning", "Cancelled", "", 0, 0, 17.93));
        bookings.add(new Booking("BIBF021", 208949, "Sarah", "James", 19, 'F', "Box Fit", "Week 3", "Sunday", "Morning", "Attended", "Lesson was Fun.", 5, 4, 17.93));
        bookings.add(new Booking("BIBF022", 208950, "James", "Bull", 22, 'M', "Box Fit", "Week 3", "Sunday", "Morning", "Attended", "Lesson was Great.", 5, 4, 17.93));
        bookings.add(new Booking("BIBB017", 208951, "Michael", "Jones", 19, 'M', "Body Blitz", "Week 3", "Sunday", "Afternoon", "Attended", "Lesson was OK but not to my expectations.", 3, 4, 20.74));
        bookings.add(new Booking("BIBB018", 208952, "Ivan", "Rictish", 21, 'M', "Body Blitz", "Week 3", "Sunday", "Afternoon", "Attended", "Lesson was Fun.", 5, 4, 20.74));
        bookings.add(new Booking("BIBB019", 208953, "Mary", "King", 19, 'F', "Body Blitz", "Week 3", "Sunday", "Afternoon", "Attended", "Lesson was Fun.", 5, 4, 20.74));
        bookings.add(new Booking("BIYG017", 208954, "Will", "Smith", 20, 'M', "Yoga", "Week 3", "Sunday", "Evening", "Attended", "Great.", 4, 4, 12.86));
        bookings.add(new Booking("BIYG018", 208955, "Vivian", "Jones", 19, 'F', "Yoga", "Week 3", "Sunday", "Evening", "Attended", "Lesson started late.", 2, 4, 12.86));
        bookings.add(new Booking("BIZB019", 208956, "Jane", "Jackson", 20, 'F', "Zumba", "Week 4", "Sunday", "Morning", "Attended", "Lesson was as expected.", 5, 4, 15.78));
        bookings.add(new Booking("BIBB020", 208957, "Elizaberth", "Brown", 20, 'F', "Body Blitz", "Week 4", "Sunday", "Evening", "Attended", "OK.", 4, 4, 20.74));
        bookings.add(new Booking("BIBB021", 208958, "Christian", "Bill", 21, 'M', "Body Blitz", "Week 4", "Sunday", "Evening", "Attended", "Very Satisfied.", 5, 4, 20.74));
        bookings.add(new Booking("BIBB022", 208959, "Sharon", "Stone", 19, 'F', "Body Blitz", "Week 4", "Sunday", "Evening", "Booked", "", 0, 0, 20.74));
        bookings.add(new Booking("BIBB023", 208960, "Hipsy", "Cone", 22, 'F', "Body Blitz", "Week 4", "Sunday", "Evening", "Attended", "Lesson was Great.", 5, 4, 20.74));
        bookings.add(new Booking("BIYG019", 208961, "Paul", "Walker", 19, 'M', "Yoga", "Week 5", "Sunday", "Morning", "Booked", "", 0, 0, 12.86));
        bookings.add(new Booking("BIYG020", 208947, "James", "Fox", 20, 'M', "Yoga", "Week 5", "Sunday", "Morning", "Attended", "Lesson was great but started a bit late.", 3, 5, 12.86));
        bookings.add(new Booking("BIYG021", 208948, "John", "Doe", 21, 'M', "Yoga", "Week 5", "Sunday", "Morning", "Attended", "Lesson was Fun.", 5, 5, 12.86));
        bookings.add(new Booking("BIZB020", 208949, "Sarah", "James", 19, 'F', "Zumba", "Week 5", "Sunday", "Afternoon", "Cancelled", "", 0, 0, 15.78));
        bookings.add(new Booking("BIZB021", 208949, "Sarah", "James", 19, 'F', "Zumba", "Week 5", "Sunday", "Afternoon", "Attended", "The lesson wasn't as expected.", 2, 5, 15.78));
        bookings.add(new Booking("BIZB022", 208950, "James", "Bull", 22, 'M', "Zumba", "Week 5", "Sunday", "Afternoon", "Booked", "", 0, 0, 15.78));
        bookings.add(new Booking("BIBF023", 208951, "Michael", "Jones", 19, 'M', "Box Fit", "Week 5", "Sunday", "Evening", "Attended", "Very Satisfied.", 5, 5, 17.93));
        bookings.add(new Booking("BIYG022", 208952, "Ivan", "Rictish", 21, 'M', "Yoga", "Week 6", "Sunday", "Afternoon", "Changed", "", 0, 0, 12.86));
        bookings.add(new Booking("BIYG023", 208953, "Mary", "King", 19, 'F', "Yoga", "Week 6", "Sunday", "Afternoon", "Attended", "Lesson was as expected.", 5, 5, 12.86));
        bookings.add(new Booking("BIYG024", 208954, "Will", "Smith", 20, 'M', "Yoga", "Week 6", "Sunday", "Afternoon", "Booked", "", 0, 0, 12.86));
        bookings.add(new Booking("BIYG025", 208955, "Vivian", "Jones", 19, 'F', "Yoga", "Week 6", "Sunday", "Afternoon", "Cancelled", "", 0, 0, 12.86));
        bookings.add(new Booking("BIYG026", 208955, "Vivian", "Jones", 19, 'F', "Yoga", "Week 6", "Sunday", "Afternoon", "Booked", "", 0, 0, 12.86));
        bookings.add(new Booking("BIZB023", 208956, "Jane", "Jackson", 20, 'F', "Zumba", "Week 6", "Sunday", "Evening", "Attended", "Lesson was great but more room for improvements.", 3, 5, 15.78));
        bookings.add(new Booking("BIZB024", 208957, "Elizaberth", "Brown", 20, 'F', "Zumba", "Week 6", "Sunday", "Evening", "Attended", "Lesson was Fun.", 5, 5, 15.78));
        bookings.add(new Booking("BIZB025", 208958, "Christian", "Bill", 21, 'M', "Zumba", "Week 6", "Sunday", "Evening", "Booked", "", 0, 0, 15.78));
        bookings.add(new Booking("BIBF024", 208959, "Sharon", "Stone", 19, 'F', "Box Fit", "Week 7", "Sunday", "Morning", "Attended", "Lesson was Great.", 5, 5, 17.93));
        bookings.add(new Booking("BIBF025", 208960, "Hipsy", "Cone", 22, 'F', "Box Fit", "Week 7", "Sunday", "Morning", "Booked", "", 0, 0, 17.93));
        bookings.add(new Booking("BIBB024", 208961, "Paul", "Walker", 19, 'M', "Body Blitz", "Week 7", "Sunday", "Afternoon", "Booked", "", 0, 0, 20.74));
        bookings.add(new Booking("BIZB026", 208947, "James", "Fox", 20, 'M', "Zumba", "Week 8", "Sunday", "Morning", "Attended", "Great.", 4, 5, 15.78));
        bookings.add(new Booking("BIZB027", 208948, "John", "Doe", 21, 'M', "Zumba", "Week 8", "Sunday", "Morning", "Booked", "", 0, 0, 15.78));
        bookings.add(new Booking("BIBF026", 208949, "Sarah", "James", 19, 'F', "Box Fit", "Week 8", "Sunday", "Afternoon", "Booked", "", 0, 0, 17.93));
        bookings.add(new Booking("BIBB025", 208950, "James", "Bull", 22, 'M', "Body Blitz", "Week 8", "Sunday", "Evening", "Attended", "Lesson was Great.", 5, 5, 20.74));
        bookings.add(new Booking("BIBB026", 208951, "Michael", "Jones", 19, 'M', "Body Blitz", "Week 8", "Sunday", "Evening", "Booked", "", 0, 0, 20.74));
        bookings.add(new Booking("BIBB027", 208952, "Ivan", "Rictish", 21, 'M', "Body Blitz", "Week 8", "Sunday", "Evening", "Attended", "Very Satisfied.", 5, 5, 20.74));
        return bookings;
    }

    public ArrayList listOfStudents() {
        ArrayList<Students> student = new ArrayList<Students>();
        student.add(new Students(208947, 20, "James", "Fox", 'M'));
        student.add(new Students(208948, 21, "John", "Doe", 'M'));
        student.add(new Students(208949, 19, "Sarah", "James", 'F'));
        student.add(new Students(208950, 22, "James", "Bull", 'M'));
        student.add(new Students(208951, 19, "Michael", "Jones", 'M'));
        student.add(new Students(208952, 21, "Ivan", "Rictish", 'M'));
        student.add(new Students(208953, 19, "Mary", "King", 'F'));
        student.add(new Students(208954, 20, "Will", "Smith", 'M'));
        student.add(new Students(208955, 19, "Vivian", "Jones", 'F'));
        student.add(new Students(208956, 20, "Jane", "Jackson", 'F'));
        student.add(new Students(208957, 20, "Elizaberth", "Brown", 'F'));
        student.add(new Students(208958, 21, "Christian", "Bill", 'M'));
        student.add(new Students(208959, 19, "Sharon", "Stone", 'F'));
        student.add(new Students(208960, 22, "Hipsy", "Cone", 'F'));
        student.add(new Students(208961, 19, "Paul", "Walker", 'M'));
        return student;
    }

    public ArrayList listofBodyBlitzLessons() {
        ArrayList<Lesson> bodyblitzLessons = new ArrayList<Lesson>();
        bodyblitzLessons.add(new Lesson("Week 2", "Body Blitz", "Saturday", "Morning", 20.74, 3));
        bodyblitzLessons.add(new Lesson("Week 3", "Body Blitz", "Saturday", "Afternoon", 20.74, 2));
        bodyblitzLessons.add(new Lesson("Week 4", "Body Blitz", "Saturday", "Evening", 20.74, 1));
        bodyblitzLessons.add(new Lesson("Week 6", "Body Blitz", "Saturday", "Morning", 20.74, 0));
        bodyblitzLessons.add(new Lesson("Week 7", "Body Blitz", "Saturday", "Afternoon", 20.74, 4));
        bodyblitzLessons.add(new Lesson("Week 8", "Body Blitz", "Saturday", "Evening", 20.74, 3));
        bodyblitzLessons.add(new Lesson("Week 2", "Body Blitz", "Sunday", "Morning", 20.74, 2));
        bodyblitzLessons.add(new Lesson("Week 3", "Body Blitz", "Sunday", "Afternoon", 20.74, 1));
        bodyblitzLessons.add(new Lesson("Week 4", "Body Blitz", "Sunday", "Evening", 20.74, 0));
        bodyblitzLessons.add(new Lesson("Week 6", "Body Blitz", "Sunday", "Morning", 20.74, 4));
        bodyblitzLessons.add(new Lesson("Week 7", "Body Blitz", "Sunday", "Afternoon", 20.74, 3));
        bodyblitzLessons.add(new Lesson("Week 8", "Body Blitz", "Sunday", "Evening", 20.74, 1));
        return bodyblitzLessons;
    }

    public ArrayList listOfSaturdayLessons() {
        ArrayList<Lesson> saturdayLessons = new ArrayList<Lesson>();
        saturdayLessons.add(new Lesson("Week 1", "Yoga", "Saturday", "Morning", 12.86, 0));
        saturdayLessons.add(new Lesson("Week 1", "Zumba", "Saturday", "Afternoon", 15.78, 1));
        saturdayLessons.add(new Lesson("Week 1", "Box Fit", "Saturday", "Evening", 17.93, 2));
        saturdayLessons.add(new Lesson("Week 2", "Body Blitz", "Saturday", "Morning", 20.74, 3));
        saturdayLessons.add(new Lesson("Week 2", "Yoga", "Saturday", "Afternoon", 12.86, 4));
        saturdayLessons.add(new Lesson("Week 2", "Zumba", "Saturday", "Evening", 15.78, 0));
        saturdayLessons.add(new Lesson("Week 3", "Box Fit", "Saturday", "Morning", 17.93, 1));
        saturdayLessons.add(new Lesson("Week 3", "Body Blitz", "Saturday", "Afternoon", 20.74, 2));
        saturdayLessons.add(new Lesson("Week 3", "Yoga", "Saturday", "Evening", 12.86, 3));
        saturdayLessons.add(new Lesson("Week 4", "Zumba", "Saturday", "Morning", 15.78, 4));
        saturdayLessons.add(new Lesson("Week 4", "Box Fit", "Saturday", "Afternoon", 17.93, 0));
        saturdayLessons.add(new Lesson("Week 4", "Body Blitz", "Saturday", "Evening", 20.74, 1));
        saturdayLessons.add(new Lesson("Week 5", "Yoga", "Saturday", "Morning", 12.86, 2));
        saturdayLessons.add(new Lesson("Week 5", "Zumba", "Saturday", "Afternoon", 15.78, 3));
        saturdayLessons.add(new Lesson("Week 5", "Box Fit", "Saturday", "Evening", 17.93, 4));
        saturdayLessons.add(new Lesson("Week 6", "Body Blitz", "Saturday", "Morning", 20.74, 0));
        saturdayLessons.add(new Lesson("Week 6", "Yoga", "Saturday", "Afternoon", 12.86, 1));
        saturdayLessons.add(new Lesson("Week 6", "Zumba", "Saturday", "Evening", 15.78, 2));
        saturdayLessons.add(new Lesson("Week 7", "Box Fit", "Saturday", "Morning", 17.93, 3));
        saturdayLessons.add(new Lesson("Week 7", "Body Blitz", "Saturday", "Afternoon", 20.74, 4));
        saturdayLessons.add(new Lesson("Week 7", "Yoga", "Saturday", "Evening", 12.86, 0));
        saturdayLessons.add(new Lesson("Week 8", "Zumba", "Saturday", "Morning", 15.78, 1));
        saturdayLessons.add(new Lesson("Week 8", "Box Fit", "Saturday", "Afternoon", 17.93, 2));
        saturdayLessons.add(new Lesson("Week 8", "Body Blitz", "Saturday", "Evening", 20.74, 3));
        return saturdayLessons;
    }

    public ArrayList listofSundayLessons() {
        ArrayList<Lesson> sundayLessons = new ArrayList<Lesson>();
        sundayLessons.add(new Lesson("Week 1", "Yoga", "Sunday", "Morning", 12.86, 4));
        sundayLessons.add(new Lesson("Week 1", "Zumba", "Sunday", "Afternoon", 15.78, 0));
        sundayLessons.add(new Lesson("Week 1", "Box Fit", "Sunday", "Evening", 17.93, 1));
        sundayLessons.add(new Lesson("Week 2", "Body Blitz", "Sunday", "Morning", 20.74, 2));
        sundayLessons.add(new Lesson("Week 2", "Yoga", "Sunday", "Afternoon", 12.86, 3));
        sundayLessons.add(new Lesson("Week 2", "Zumba", "Sunday", "Evening", 15.78, 4));
        sundayLessons.add(new Lesson("Week 3", "Box Fit", "Sunday", "Morning", 17.93, 0));
        sundayLessons.add(new Lesson("Week 3", "Body Blitz", "Sunday", "Afternoon", 20.74, 1));
        sundayLessons.add(new Lesson("Week 3", "Yoga", "Sunday", "Evening", 12.86, 2));
        sundayLessons.add(new Lesson("Week 4", "Zumba", "Sunday", "Morning", 15.78, 3));
        sundayLessons.add(new Lesson("Week 4", "Box Fit", "Sunday", "Afternoon", 17.93, 4));
        sundayLessons.add(new Lesson("Week 4", "Body Blitz", "Sunday", "Evening", 20.74, 0));
        sundayLessons.add(new Lesson("Week 5", "Yoga", "Sunday", "Morning", 12.86, 1));
        sundayLessons.add(new Lesson("Week 5", "Zumba", "Sunday", "Afternoon", 15.78, 2));
        sundayLessons.add(new Lesson("Week 5", "Box Fit", "Sunday", "Evening", 17.93, 3));
        sundayLessons.add(new Lesson("Week 6", "Body Blitz", "Sunday", "Morning", 20.74, 4));
        sundayLessons.add(new Lesson("Week 6", "Yoga", "Sunday", "Afternoon", 12.86, 0));
        sundayLessons.add(new Lesson("Week 6", "Zumba", "Sunday", "Evening", 15.78, 1));
        sundayLessons.add(new Lesson("Week 7", "Box Fit", "Sunday", "Morning", 17.93, 2));
        sundayLessons.add(new Lesson("Week 7", "Body Blitz", "Sunday", "Afternoon", 20.74, 3));
        sundayLessons.add(new Lesson("Week 7", "Yoga", "Sunday", "Evening", 12.86, 4));
        sundayLessons.add(new Lesson("Week 8", "Zumba", "Sunday", "Morning", 15.78, 2));
        sundayLessons.add(new Lesson("Week 8", "Box Fit", "Sunday", "Afternoon", 17.93, 3));
        sundayLessons.add(new Lesson("Week 8", "Body Blitz", "Sunday", "Evening", 20.74, 1));
        return sundayLessons;
    }

    public ArrayList listofAllLessons(HomepageData homepageData) {
        ArrayList<Lesson> allLessons = new ArrayList<Lesson>();
        allLessons.addAll(homepageData.saturdayLessons);
        allLessons.addAll(homepageData.sundayLessons);
        return allLessons;
    }

    public ArrayList listofBoxFitLessons() {
        ArrayList<Lesson> boxfitLessons = new ArrayList<Lesson>();
        boxfitLessons.add(new Lesson("Week 1", "Box Fit", "Saturday", "Evening", 17.93, 2));
        boxfitLessons.add(new Lesson("Week 3", "Box Fit", "Saturday", "Morning", 17.93, 1));
        boxfitLessons.add(new Lesson("Week 4", "Box Fit", "Saturday", "Afternoon", 17.93, 0));
        boxfitLessons.add(new Lesson("Week 5", "Box Fit", "Saturday", "Evening", 17.93, 4));
        boxfitLessons.add(new Lesson("Week 7", "Box Fit", "Saturday", "Morning", 17.93, 3));
        boxfitLessons.add(new Lesson("Week 8", "Box Fit", "Saturday", "Afternoon", 17.93, 2));
        boxfitLessons.add(new Lesson("Week 1", "Box Fit", "Sunday", "Evening", 17.93, 1));
        boxfitLessons.add(new Lesson("Week 3", "Box Fit", "Sunday", "Morning", 17.93, 0));
        boxfitLessons.add(new Lesson("Week 4", "Box Fit", "Sunday", "Afternoon", 17.93, 4));
        boxfitLessons.add(new Lesson("Week 5", "Box Fit", "Sunday", "Evening", 17.93, 3));
        boxfitLessons.add(new Lesson("Week 7", "Box Fit", "Sunday", "Morning", 17.93, 2));
        boxfitLessons.add(new Lesson("Week 8", "Box Fit", "Sunday", "Afternoon", 17.93, 3));
        return boxfitLessons;
    }
    
}
