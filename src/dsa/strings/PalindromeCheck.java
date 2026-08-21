package dsa.strings;

public class PalindromeCheck {

    // Using two pointers
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println("Is the string a palindrome? : " + isPalindrome(str));
    }

    // Reverse words in a given string / Palindrome check
    public static boolean isPalindrome(String s){
        String str = s.toLowerCase();
        int l=0, r=str.length()-1;
        while(l<r){
            if(!Character.isLetterOrDigit(str.charAt(l)))
                l++;
            else if(!Character.isLetterOrDigit(str.charAt(r)))
                r--;
            else if(str.charAt(l)!=str.charAt(r))
                return false;
            else {
                r--;
                l++;
            }

        }
        return true;
    }
}
