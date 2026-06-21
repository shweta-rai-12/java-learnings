package strings;

import java.util.Arrays;

public class sample {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder();
        b.append("Hel");
        b.append("lo");
        System.out.println(b.reverse());

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.length());
        System.out.println(s1.indexOf(s2));
    }
}
