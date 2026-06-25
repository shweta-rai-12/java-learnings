package blind_75;

public class G125ValidPalindrome {
    public static boolean isPalindrome(String str) {
        String s = str.toLowerCase();
        int l=0,r=s.length()-1;
        while(l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }else if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            else if(s.charAt(l)!=s.charAt(r)){
                return false;
            }else{
                r--;
                l++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println("Is the given text a palindrome? " + isPalindrome(str));
    }
}
