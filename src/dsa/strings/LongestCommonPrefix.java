package dsa.strings;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] s1 = {"flower", "flow","fly"};
        System.out.println("The longest common prefix is: " + longestCommonPrefix(s1));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return " The String array is empty";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
