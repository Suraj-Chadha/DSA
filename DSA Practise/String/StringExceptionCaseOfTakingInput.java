// study the exception case of String in java Why input fails the ideal scenario
import java.util.*;
public class StringExceptionCaseOfTakingInput {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt(); // input of Integer
        int n = Integer.parseInt(scn.nextLine()); // solution using Integer.parseInt to convert recieved input to integer
        // String str = scn.nextLine(); // Input the string
        String str = scn.nextLine(); // won't tale this input
        System.out.println( n+str);
        scn.close();
    }
}
// if taking input from user using nextLine() and if we have taken an input above without using nextLine() in that case nextLine() will take empty string "" as the input

// solution use nextLine() in all the above inputs and convert it to desirable datatype using wrapper class
