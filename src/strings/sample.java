package strings;

import java.util.Arrays;

public class sample {
    public static void main(String[] args) {

        // I want to understand about Hash
        String s = "shweta";
//        int[] hey = new int[s.length()];
        for (int i = 0; i < s.length(); i++)  {
            Integer j = s.charAt(i)-'a';
//            hey[j]=i;
            System.out.println("Character: " + s.charAt(i) + ", HashCode: " + j);
        }
//        System.out.println(Arrays.stream(hey).toArray());
    }
}
