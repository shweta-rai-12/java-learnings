package blind_75;

public class D5LongestPalindromeSubString {

    public static String longestPalindrome(String str) {
        if(str==null || str.length()<2){
            return str;
        }

        int start =0, end=0;

        for(int i=0;i<str.length();i++){
            int len1 = expand(str,i,i);
            int len2 = expand(str, i, i+1);
            int len = Math.max(len1,len2);

            if(len > end-start+1){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }

        return str.substring(start,end+1);
    }

    public static int expand(String s,int left,int right){
        while(left >=0 &&
                right <s.length() &&
                s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right-left-1;
    }

    public static void main(String[] args) {
        String s = "badadadpe";
        System.out.println("The longest palindromic substring in \"" + s + "\" is: " + longestPalindrome(s));
    }
}
