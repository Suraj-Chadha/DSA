// Pattern
// for n = 4
// 4	4	4	4	4	4	4	
// 4	3	3	3	3	3	4	
// 4	3	2	2	2	3	4	
// 4	3	2	1	2	3	4	
// 4	3	2	2	2	3	4	
// 4	3	3	3	3	3	4	
// 4	4	4	4	4	4	4	



import java.util.*;

public class Main {

  public static void main(String[] args) {
    // Write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int num;
    int dec = 0, cons = (2*n -1), inc = 0; 
    for(int row = 1; row <= 2*n - 1; row++){
      num = n;
      for(int i = 0; i < dec; i++){
        System.out.print(num + "\t");
        num--;
      }
      for(int i = 0; i < cons; i++){
        System.out.print(num + "\t");
      }
      for(int i = 0; i < inc; i++){
        num++;
        System.out.print(num + "\t");
      }
      System.out.println();
      if(row < n){
        dec++;
        inc++;
        cons-=2;
      }
      else{
        dec--;
        inc--;
        cons+=2;
      }
    }
  }
}