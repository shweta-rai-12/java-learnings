package dsa.strings;


import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String st = "()[{}()]";
        System.out.println("Is it a valid parenthesis? : " + isValid(st));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    if(stack.peek() == '(' && ch == ')'){
                        stack.pop();
                    }else if(stack.peek() == '[' && ch == ']'){
                        stack.pop();
                    }else if(stack.peek() == '{' && ch == '}'){
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
