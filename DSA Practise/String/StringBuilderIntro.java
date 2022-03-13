// import java.util.*;
public class StringBuilderIntro {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        sb.append('e');
        sb.append('b');
        System.out.println(sb);

        char ch = sb.charAt(4);
        System.out.println(ch);

        sb.setCharAt(5, '4');
        System.out.println(sb);

        sb.deleteCharAt(5);
        System.out.println(sb);

        sb.insert(0, '8');
        System.out.println(sb);

        int len = sb.length();
        System.out.println(len);

    }
}
