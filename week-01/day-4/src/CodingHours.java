public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int day = 6;
        int week = 5 * day;
        int semester = 17 * week;
        int average = 52;
        int semester2 = 17 * average;
        double percentage = ((double)semester2 / semester) * 100;

        System.out.println(semester);
        System.out.println(percentage);
    }
}