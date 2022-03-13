// string is nothing but collection(array) of characters
import java.util.*;
public class stringIntro {
   public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
    //  String str = "pepcoding"; hardcoding the input
    // String str = scn.next(); // take input from user but next() will only take input till space is encoubntered
    String str = scn.nextLine();
    //  System.out.println(str.charAt(1));  To access characters ina String use ste.charAt(index);
    // for(int i = 0; i < str.length(); i++){
    //     System.out.print(str.charAt(i));
    // }
    System.out.println(str);
    // System.out.println();
   } 
}
