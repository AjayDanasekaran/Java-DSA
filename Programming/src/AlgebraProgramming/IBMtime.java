package AlgebraProgramming;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class IBMtime {

    public static String interviewTime(String timeSetAt, int secondsGainedEveryFiveMinutes, int minutesEarly) {
        if (timeSetAt.length() != 4) {
            return "Invalid input";
        }

        SimpleDateFormat sdfInput = new SimpleDateFormat("HHmm");
        SimpleDateFormat sdfOutput = new SimpleDateFormat("HHmm");

        try {
            // Parse the input time to a Calendar object
            Calendar calendar = Calendar.getInstance();
            Date setTime = sdfInput.parse(timeSetAt);
            calendar.setTime(setTime);

            // Calculate the total minutes gained
            int totalMinutesGained = minutesEarly + (minutesEarly / 5) * (secondsGainedEveryFiveMinutes / 60);

            // Adjust the time by subtracting the gained minutes
            calendar.add(Calendar.MINUTE, -totalMinutesGained);

            // Return the adjusted time in HHmm format
            return sdfOutput.format(calendar.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
            return "Error parsing time";
        }
    }

    public static void main(String[] args) {
        // Example usage:
        String result = interviewTime("0600", 5, 10);
        System.out.println("X reached the interview venue at: " + result);
    }
}
