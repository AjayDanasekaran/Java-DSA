package AlgebraProgramming;
public class InterviewTimeCalculator {

    public static String interviewTime(String timeSetAt, int secondsGainedEveryFiveMinutes, int minutesEarly) {
        // Convert timeSetAt to minutes
    	
        int initialTimeInMinutes = Integer.parseInt(timeSetAt.substring(0, 2)) * 60
                + Integer.parseInt(timeSetAt.substring(2));

        // Calculate total gain due to the faulty watch
        int totalGain = (minutesEarly * 60) + (minutesEarly / 5 * secondsGainedEveryFiveMinutes);

        // Calculate actual time in minutes
        int actualTimeInMinutes = initialTimeInMinutes + totalGain;

        // Convert actual time to HHMM format
        int hours = actualTimeInMinutes / 60;
        int minutes = actualTimeInMinutes % 60;

        return String.format("%02d%02d", hours, minutes);
    }

    public static void main(String[] args) {
        // Example usage:
        String result = interviewTime("0600", 5, 10);
        System.out.println("Actual time when X reached the interview venue: " + result);
    }
}
