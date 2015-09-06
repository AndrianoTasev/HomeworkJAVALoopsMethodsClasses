import java.util.Scanner;

/**
 * Created by Andriano on 6.9.2015 ã..
 * Write a program to generate and print all symmetric numbers in given range
 * [start…end] (0 ? start ? end ? 999).
 * A number is symmetric if its digits are symmetric toward its middle.
 * For example, the numbers 101, 33, 989 and 5 are symmetric, but 102, 34 and 997 are not symmetric.
 */
public class SymmetricNumbersInRange {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();

        String[] numbers = input.split(" ");

        int startNumber = Integer.parseInt(numbers[0]);

        int endNumber = Integer.parseInt(numbers[1]);

        int array = 0;

        if (startNumber >=0 && startNumber <= endNumber && endNumber <= 999) {
            for (int i = startNumber; i <= endNumber; i++) {
                if (symmetricNumber(i)){
                    System.out.printf("%d ", i);
                }
            }
        }
        else {
            System.out.print("Start number and end number should be in given range \n(0<=start<=end<=999)");
        }

    }
    public static Boolean symmetricNumber(int number){
        boolean isSymmetric = false;

        String numberToString = Integer.toString(number);

        for (int i = 0; i < numberToString.length() / 2; i++) {
            if (numberToString.charAt(i) == numberToString.charAt(numberToString.length() -1- i)) {
                isSymmetric = true;
            }
            else {
                isSymmetric = false;
                break;
            }
        }

        return isSymmetric;
    }
}
