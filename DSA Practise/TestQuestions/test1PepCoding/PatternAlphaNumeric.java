//Pattern Alpha Numeric
/* for n =  5;
A       1
B       2       C       3
D       4       E       5       F       6
G       7       H       8       I       9       J       10
K       11      L       12      M       13      N       14      O       15 */

package TestQuestions.test1PepCoding;
import java.util.*;
public class PatternAlphaNumeric {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int Alpha = 65;
    int num = 1;
    for(int row = 1; row <= n; row++){
        for(int i = 1; i <=row; i++){
            System.out.print((char)Alpha + "\t" +num + "\t");
            Alpha++; num++;
        }
        System.out.println();

    }
    scn.close();
}
}
