package Stack;
import java.util.*;
public class client {
    public static void main(String[] args) throws Exception{

        // st.top(); throws Exception
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        stacks st = new stacks(n);
        st.push(5);
        scn.close();
        for(int i = 1; i <= n; i++){
            st.push(i*10);
        }
        // System.out.println(st.size());
        while(st.size() != 0){
            System.out.print(st.pop()+" ");
        }
        System.out.println();
    }

}
