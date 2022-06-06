package GenericTree;
import java.util.*;
public class testArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            arr.add(i);
        }
        System.out.println(arr);
       while(arr.size() > 0){
           System.out.println(arr.get(0));
           arr.remove(0);
       }
       System.out.println(arr);
    }
}
