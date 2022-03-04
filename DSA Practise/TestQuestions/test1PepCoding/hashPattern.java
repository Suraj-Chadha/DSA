package TestQuestions.test1PepCoding;
import java.util.*;
public class hashPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int inc = 0;
        int dec = 0;
        int cons = 2*n - 1;
        for(int row = 1; row <= 2*n-1; row++){
            int num = n;
            for(int i = 1; i <= dec; i++){
                if(num % 2 == 0){
                    System.out.print(num + "\t");
                }else{
                    System.out.print("#\t");
                }
                num--;
            }
            for(int i = 1; i <= cons; i++){
                if(num%2 == 0){
                    System.out.print(num+"\t");
                }else{
                    System.out.print("#\t");
                }
            }
            for(int i = 1; i <= dec; i++){
                num++;
                if(num%2 == 0){
                    System.out.print(num+"\t");
                }else{
                    System.out.print("#\t");
                }
            }
            System.out.println();
            if(row < n){
                inc++;
                dec++;
                cons-=2;
            }else{
                dec--;
                inc--;
                cons+=2;
            }
        }
    }
}
