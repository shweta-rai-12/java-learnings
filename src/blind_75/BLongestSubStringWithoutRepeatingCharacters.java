package blind_75;

import java.util.HashSet;

public class BLongestSubStringWithoutRepeatingCharacters {

    // Sliding window
    public static int longestSubstring(String str) {
        int n = str.length();
        int l=0, r=0, lenght = 0;
        HashSet<Character> set = new HashSet<>();
        while(r<n){
            char c = str.charAt(r);
            if(set.contains(c)){
                set.remove(str.charAt(l));
                l++;
            }else{
                set.add(c);
                lenght = Math.max(lenght,r-l+1);
                r++;
            }
        }
        return lenght;
    }

    // Brute force
    public static int longestSubstring2(String str) {
        int n = str.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            String current = "";

            for (int j = i; j < n; j++) {
                char c = str.charAt(j);

                if (current.indexOf(c) != -1) {
                    break; // duplicate found
                }

                current += c;
                maxLen = Math.max(maxLen, current.length());
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println("The length of the longest substring without repeating characters in \"" + s + "\" is: " + longestSubstring(s));
        System.out.println("The length of the longest substring without repeating characters in \"" + s + "\" is: " + longestSubstring2(s));
    }
}
