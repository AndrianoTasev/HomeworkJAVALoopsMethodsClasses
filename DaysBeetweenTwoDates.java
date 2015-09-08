import com.sun.org.apache.xerces.internal.impl.dv.xs.DayDV;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Write a program to calculate the difference between two dates in number of days.
 * The dates are entered at two consecutive lines in format day-month-year.
 * Days are in range [1…31]. Months are in range [1…12]. Years are in range [1900…2100].
 */
public class DaysBeetweenTwoDates {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String startDateAsString = scanner.nextLine();

        if (startDateAsString.length() == 9) {
            startDateAsString = "0" + startDateAsString;
        }


        String endDateAsString = scanner.nextLine();
        if (endDateAsString.length() == 9) {
            endDateAsString = "0" + endDateAsString;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate startingDate = LocalDate.parse(startDateAsString, formatter);
        LocalDate endDate = LocalDate.parse(endDateAsString, formatter);

        long daysBetweenTheTwoDates = ChronoUnit.DAYS.between(startingDate, endDate);

        System.out.println(daysBetweenTheTwoDates);



    }
}
