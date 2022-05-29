package Revision;
import java.util.*;
public class nCr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int val = scn.nextInt();
            ar.add(val);
        }
        combinations(ar,"");
    }
    public static void combinations(ArrayList<Integer> ar, String str){
        if(str.length() == 3){
            System.out.println(str);
            return;
        }
        if(ar.size() == 0) return;
        while(ar.size() > 0){
            int val =ar.remove(0);
            System.out.println(str+"-->"+ar);
            combinations(ar,str+val);
        }
    }
}
