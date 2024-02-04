package DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDemo {
    public static void main(String[] args) {
        // Create a Date object representing the current date and time
        Date currentDate = new Date();

        // Create a SimpleDateFormat object to format the date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Format the date and time using the SimpleDateFormat
        String formattedDateTime = dateFormat.format(currentDate);

        // Display the formatted date and time
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
} 
