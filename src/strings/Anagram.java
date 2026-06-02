package strings;

import java.util.Arrays;

public class Anagram {

    /**
     * Anagram is if String A has the same letters as String B, though if the position of letters varies, then String A is anagram of B.
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }

    public static boolean isAnagram2(String s, String t){
        if(s.length() != t.length())
            return false;
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] != 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        System.out.println("Is the string t anagram of s : "+isAnagram(s,t));
        System.out.println("Is the string t anagram of s : "+isAnagram2(s,t));
    }
}
