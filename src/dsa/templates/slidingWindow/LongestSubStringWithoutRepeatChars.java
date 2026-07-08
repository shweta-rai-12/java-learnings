package dsa.templates.slidingWindow;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatChars {

    public static String longestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        int len = s.length();
        int maxLen = 0;
        int start = 0; // start index of best window found so far
        int l = 0;
        HashSet<Character> set = new HashSet<>();

        for (int r = 0; r < len; r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            if (r - l + 1 > maxLen) {
                maxLen = r - l + 1;
                start = l;
            }
        }

        System.out.println("The length of the longest substring without repeating chars is: " + maxLen);
        return s.substring(start, start + maxLen);
    }

    public static int lengthOfLongestSubstring(String str) {

        int l=0;
        int r =0;
        int n= str.length();
        int maxLength =0;
        HashSet<Character> set = new HashSet<>();
        while(r<n){
            char c = str.charAt(r);
            if(set.contains(c)){
                set.remove(str.charAt(l));
                l++;
            }else{
                set.add(c);
                maxLength = Math.max(maxLength,r-l+1);
                r++;
            }
        }
        System.out.println("The length of the longest substring without repeating chars is: " + maxLength);
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcdeabcdefhatheru";
        System.out.print("The Longest substring without repeating chars from the given string " + str + " is: ");
        System.out.print(longestSubstring(str));
        System.out.println(" The method 2 answer is " + lengthOfLongestSubstring(str));
    }
}