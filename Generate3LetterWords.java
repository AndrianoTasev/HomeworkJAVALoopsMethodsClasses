import java.util.Scanner;

/**
 * Created by Andriano on 6.9.2015 ã..
 * Write a program to generate and print all 3-letter words consisting of given set of characters.
 * For example if we have the characters 'a' and 'b', all possible words will be
 * "aaa", "aab", "aba", "abb", "baa", "bab", "bba" and "bbb".
 * The input characters are given as string at the first line of the input.
 * Input characters are unique (there are no repeating characters).
 */
public class Generate3LetterWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        int length = input.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    System.out.print("" + input.charAt(i) + input.charAt(j) + input.charAt(k) + " ");
                }
            }
        }

    }
}
