package dsa.strings;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(str));
        System.out.println(groupAnagrams2(str));
    }

    // Time taking
    public static List<List<String>> groupAnagrams(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            char[] arr = str[i].toCharArray();
            // Sorting is time consuming
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(str[i]);

        }
        return null;
    }

    // Optimal
    public static List<List<String>> groupAnagrams2(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char[] ch = s.toCharArray();
            int[] count = new int[26];
            for (char c : ch) {
                count[c - 'a']++;
            }
//            StringBuilder sb = new StringBuilder();
//            for (int i : count) {
//                sb.append("#");
//                sb.append(i);
//            }
//            String key = sb.toString();
            String key = Arrays.toString(count);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
