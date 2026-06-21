package dsa.templates.twoPointerPattern;

public class ValidPalindrome {
    public static void main(String args[])
    {
        String s = "ababababababababa";
        System.out.println("Is the given text a palindrome? " + isPalindrome(s));
    }

    //Normal String
    public static boolean isPalindrome(String str) {
       int left =0, right = str.length() - 1;
       String s = str.toLowerCase();
       while (left < right) {
           if(s.charAt(left) != s.charAt(right)) {
               return false;
           }else {
               left++;
               right--;
           }
       }
       return true;
    }

    // By removing non- alphabetic chars
    public static boolean isPalindrome2(String str) {
        int left =0, right = str.length() - 1;
        String s = str.toLowerCase();
        while (left < right) {
            if(!Character.isLetter(s.charAt(left))) {
                left++;
            }else if(!Character.isLetter(s.charAt(right))) {
                right--;
            }else if(s.charAt(left) != s.charAt(right)) {
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
     }


     // remove all alphanumeric chars
    public static boolean isPalindrome3(String str) {
        int left =0, right = str.length() - 1;
        String s = str.toLowerCase();
        while (left < right) {
            if(!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }else if(!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }else if(s.charAt(left) != s.charAt(right)) {
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
     }
}
