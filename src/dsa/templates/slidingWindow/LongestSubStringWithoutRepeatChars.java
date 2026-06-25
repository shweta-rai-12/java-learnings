package dsa.templates.slidingWindow;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatChars {


    public static String longestSubstring(String s){
        if(s==null|| s.isEmpty()){
            return "";
        }
        int len = s.length();
        int maxLen = Integer.MIN_VALUE;
        int l=0,r=0;
        HashSet<Character> set = new HashSet<>();
        while(r<len){
            if(set.contains(s.charAt(r))){
                set.remove(s.charAt(r));
                l++;
            }else{
                set.add(s.charAt(r));
                maxLen = Math.max(maxLen, r-l+1);
            }
        }
        System.out.println(" The length of the longest substring without repeating chars is: " + maxLen);
        return set.toString();
    }

    public static void main(String[] args) {
        String str = "abcdeabcdefhatheru";
        System.out.print("The Longest substring without repeating chars from the given string " + str + " is: ");
        System.out.print(longestSubstring(str));
    }
}
