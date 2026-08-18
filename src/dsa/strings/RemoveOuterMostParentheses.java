package dsa.strings;

public class RemoveOuterMostParentheses {


    public static void main(String[] args) {
        String s = "(()())(())(())";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s){
        int cnt =0;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ')'){
                cnt--;
            }
            if(cnt>0){
                str.append(s.charAt(i));
            }
            if(s.charAt(i) == '('){
                cnt++;
            }
        }
        return str.toString();
    }

}
