import java.io.*;

/**
 * Created by Andriano on 8.9.2015 ã..
 * Write a program to read a text file "Input.txt" holding a sequence of integer numbers,
 * each at a separate line. Print the sum of the numbers at the console.
 * Ensure you close correctly the file in case of exception or in case of normal execution.
 * In case of exception (e.g. the file is missing), print "Error" as a result.
 */
public class SumNumberFromATextFile {
    public static void main(String[] args)throws IOException{
        try {
            String pathName = "C:\\Users\\Andriano\\Desktop\\input.txt";

            FileReader fileReader = new FileReader(pathName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int sum = 0;

            String  line = bufferedReader.readLine();

            while (line != null){
                sum +=Integer.parseInt(line);
                line = bufferedReader.readLine();
            }
            System.out.println(sum);

            bufferedReader.close();
        }catch (FileNotFoundException exception){
            System.out.println("Error");
        }
    }
}
