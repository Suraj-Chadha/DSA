// given a String representing a sequence of decreasing and increasing and we have to find the smallest number which follows the sequence
// eg : "d"  one decreasing means awe need to have a number of size 2 to show the behaviour of decreasing so answer would be 2 1
// "i" -> 1 2 
// dddi -> 43215
// iidd - > 12543
// ddidiidd - > 321546987

// for this question we aassume its a sequence of d's separated by i's as i and string end will be used to popout all the values in a stack and give a result to us.
// if there are consequitive i's then assume there is a single zero d's in between them to make the visualization proper

package Stacks;

import java.util.*;
import java.io.*;

public class smallestNumberFollowingPatterns {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();
        String str = br.readLine();
        int digit = 1;
        StringBuilder ans = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == 'd') {
                st.push(digit++);
            } else {
                st.push(digit++);
                while (st.size() > 0) {
                    ans.append(st.pop());
                }
            }
        }
        st.push(digit);
        while (st.size() > 0) {
            ans.append(st.pop());
        }
        System.out.println(ans);
    }

}
