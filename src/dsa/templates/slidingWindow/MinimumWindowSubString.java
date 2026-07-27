package dsa.templates.slidingWindow;

import java.util.*;

public class MinimumWindowSubString {

    public static int minWindow(String str, int k) {
        int l=0,r=0;
        int minLength = Integer.MAX_VALUE;
        int n = str.length();
        Set<Character> set = new HashSet<>();
        while (r<n){
            set.add(str.charAt(r));
            if(set.size()==k){
                minLength = Math.min(minLength,r-l+1);
            }else if(set.size()>k){
                set.remove(str.charAt(l));
                l++;
                continue;
            }
            r++;
        }
        return minLength;
    }

    public static void main(String[] args) {
        String str = "aabcbdbbabcddd"  ;
        int k = 3;
        System.out.println("The minimum window that contains " + k + " distinct characters is: " + minWindow(str, k));
    }
}
