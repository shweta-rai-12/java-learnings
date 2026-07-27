package dsa.templates.slidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharReplacementWithK {

    public static int longestRepeatingCharReplacementWithK(String s, int k){
        if(s.length()<=0){
            return 0;
        }
        String str = s.toLowerCase();
        int left =0, right=0;
        int max = Integer.MIN_VALUE; int maxFreq = Integer.MIN_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        while(right<str.length()){
            map.put(str.charAt(right),map.getOrDefault(str.charAt(right),0)+1);
            maxFreq = Math.max(maxFreq,map.get(str.charAt(right)));
            int change = (right-left+1)-maxFreq;
            if(change<k){
                max = Math.max(max,right-left+1);
                right++;
            }else{
                map.put(str.charAt(left),map.getOrDefault(str.charAt(left),0)-1);
                left++;
            }

        }
        return max;
    }

    // Brute Force - TC -O(N^2) ; SC - O(26)
    public static int longestRepeatingCharReplacementWithK1(String s, int k){
        String str = s.toLowerCase();
        int max = 0;
        for(int i=0;i<=str.length()-k;i++){
            int[] hash = new int[26];
            int maxCharLength =0; int change = 0;
            for(int j=i;j<str.length();j++){
                hash[str.charAt(j)-'a']++;
                maxCharLength = Math.max(maxCharLength,hash[str.charAt(j)-'a']);
                change = j-i+1-maxCharLength;
                if(change<=k)
                    max = Math.max(max,j-i+1);
                else
                    break;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "BABAABBA";
        int k=2;
        System.out.println("Longest Repeating character with " + k + " replacement is " + longestRepeatingCharReplacementWithK(str,k));
        System.out.println("Longest Repeating character with " + k + " replacement is " + longestRepeatingCharReplacementWithK1(str,k));
    }
}
