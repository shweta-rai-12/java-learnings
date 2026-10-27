package dsa.strings;

public class IsIsomorphic {

    public static void main(String[] args) {
        String s1 = "bad";
        String s2 = "egg";

        if(isIsomorphic(s1,s2)){
            System.out.println("Strings are Isomorphic");
        } else{
            System.out.println("Strings are not Isomorphic");
        }
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] sTot = new int[256];
        int[] tTos = new int[256];

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char d = t.charAt(i);
            if(sTot[c] == 0 && tTos[d] == 0){
                sTot[c] = d;
                tTos[d] = c;
            } else if(sTot[c] != d || tTos[d] != c){
                return false;
            }
        }
        return true;
    }
}
