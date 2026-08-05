package dsa.templates.slidingWindow;

import java.util.*;

public class MinimumWindowSubString {

    public static int minWindow(String str, String str2) {

        return 0;
    }

    public static void main(String[] args) {
        String str = "aabcbdbbabcddd";
        String str2 = "abc";
        int k = 3;
        int result = minWindow(str, str2)-minWindow(str, str2);
        System.out.println("The minimum window that contains " + k + " distinct characters is: " + result);
    }
}
