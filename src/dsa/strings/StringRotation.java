package dsa.strings;

public class StringRotation {

    public static void main(String[] args) {
        String s1 = "shweta";
        String s2 = "etashw";

        System.out.println("Check is string 2 is rotation of string 1 : " + rotateString(s1, s2));
    }

    // Check if one string is rotation of another
    public static boolean rotateString(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        String s3 = s1 + s1;
        if(s3.contains(s2)){
            return true;
        }
        return false;
    }
}
