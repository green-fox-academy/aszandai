public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int minute = 60;
        int hour = 60 * minute;
        int day = 24 * hour;

        int currentInSeconds = 42 + (34 * minute) + (14 * hour);

        System.out.println("Remaining time in seconds: " + (day - currentInSeconds));
    }
}