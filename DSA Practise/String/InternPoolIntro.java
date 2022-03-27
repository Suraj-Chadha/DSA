package String;
import java.util.*;
public class InternPoolIntro {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println("s1: "+ s1+"\nS2: "+ s2+"\nS3: "+s3);
        if(s1 == s2){ //comparision by address
            System.out.println("yeah");
        }else{
            System.out.println("nah");
        }
        if(s2 == s3){ //comparision by address
            System.out.println("yeah");
        }else{
            System.out.println("nah");
        }
        if(s1.equals(s3)){
            System.out.println("yeah");
        }else{
            System.out.println("nah");
        }
    }
}
