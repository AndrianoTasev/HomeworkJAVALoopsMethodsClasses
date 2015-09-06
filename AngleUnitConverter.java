import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

/**
 * Created by Andriano on 6.9.2015 ã..
 * Write a method to convert from degrees to radians.
 * Write a method to convert from radians to degrees.
 * You are given a number n and n queries for conversion.
 * Each conversion query will consist of a number + space + measure.
 * Measures are "deg" and "rad". Convert all radians to degrees and all degrees to radians.
 * Print the results as n lines, each holding a number + space + measure.
 * Format all numbers with 6 digit after the decimal point.
 */
public class AngleUnitConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int lineNumbers = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lineNumbers; i++) {
            String[] input = scanner.nextLine().split(" ");

            double number = Double.parseDouble(input[0]);

            String measure = input[1];

            if (measure.equals("deg")){
                fromDegreesToRadiants(number);
            }

            if (measure.equals("rad")){
                fromRadiantsToDegrees(number);
            }
        }
    }
    private static void fromDegreesToRadiants(double number){
        double numberInRadiants = Math.toRadians(number);
        System.out.printf("%.6f rad", numberInRadiants);
        System.out.println();
    }

    private static void fromRadiantsToDegrees(double number){
        double numberInDegrees = Math.toDegrees(number);
        System.out.printf("%.6f rad", numberInDegrees);
        System.out.println();

    }
}
