//Pattern 101
// for n == 3
// * 
// * 1 *
// * 1 2 1 *
// * 1 2 3 2 1 *
// * 1 2 1 *
// * 1 *
// *
package PatternQuestions;
import java.util.*;
public class Pattern101 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cnum = -1;
        int num = 1;
        for(int row = 1; row <= 2*n + 1; row ++){
            System.out.print("* ");
            num = 1;
            for(int i = 1;i <= cnum; i++){
                System.out.print(num+" ");
                if(i <= cnum/2){
                    num++;
                }
                else{
                    num--;
                }
            }
            if(row !=1 && row != 2*n+1){
                System.out.print("* ");
            }
            if(row <= n){
                cnum+=2;
            }
            else{
                cnum-=2;
            }
            System.out.println();
        }
        scn.close();
    }
}
