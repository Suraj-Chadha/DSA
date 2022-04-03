package Recursion;
import java.util.*;
public class StairPath {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> totalPathsFromN = getStairPaths(n);
        System.out.println(totalPathsFromN);
    }
    public static ArrayList<String> getStairPaths(int n) {

        //base case
            //Positive base case
            if(n == 0){
                ArrayList<String> bres = new ArrayList<String>();
                bres.add("");
                return bres;
            }
            //Negative base case
            else if(n < 0){
                return new ArrayList<String>();
            }

        //faith to get paths for n-1 i.e 1 step
        ArrayList<String> pathsFromNm1 = getStairPaths(n-1);
        //faith to get paths for n-2 i.e 2 step
        ArrayList<String> pathsFromNm2 = getStairPaths(n-2);
        //faith to get paths for n-3 i.e 3 step
        ArrayList<String> pathsFromNm3 = getStairPaths(n-3);

        ArrayList<String> pathsFromN = new ArrayList<String>();
        
        //myWork add the step "1" to paths returned by n-1
        for(String pathFromNm1: pathsFromNm1){
            pathsFromN.add("1"+pathFromNm1);
        }
         //myWork add the step "2" to paths returned by n-2
        for(String pathFromNm2: pathsFromNm2){
            pathsFromN.add("2"+pathFromNm2);
        }
         //myWork add the step "1" to paths returned by n-1
        for(String pathFromNm3: pathsFromNm3){
            pathsFromN.add("3"+pathFromNm3);
        }

        return pathsFromN;
    }
}
