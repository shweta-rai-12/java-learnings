package dsa.templates.slidingWindow;

import java.util.HashMap;

public class LongestSubStringWithAtMostKDistinctChars {

    public static int longestSubstring(String s, int k) {
        int max= Integer.MIN_VALUE;
        int l=0,r=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            if(map.size()>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "aabbccaaacbcbbb";
        int k = 2;
        System.out.println("Longest substring with at most " + k + " distinct characters: " + longestSubstring(s, k));
    }
}
