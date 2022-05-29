package Revision;
import java.util.*;
public class recursionAllSubsetswithSumN {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        allSubsets(n,"");
    }
    public static void allSubsets(int n, String res){
        if(n == 0){
            System.out.println(res);
            return;
        }else if(n < 0){
            return;
        }
        for(int i = 1; i <= n; i++){
            allSubsets(n-i, res+i);
        }
    }
}
