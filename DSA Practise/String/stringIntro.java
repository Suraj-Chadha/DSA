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
    
    System.out.println(str.substring(9,5)); //will not give error as when we have same indexes then end index is given higher priority , here (9,9) end index = 9, so we have to look for excluding 9 that is 8... and in this case 8 doesn't go out of scope, so we don't get an error but we get an empty string but for (10,10) on string pepcoding will give us error as there we would be looking for index 9 which doesn't exist in pepcoding

    // System.out.println(str.substring(10, 10));

    // System.out.println();
    scn.close();
   } 
}
