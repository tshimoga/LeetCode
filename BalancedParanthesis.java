/**
* Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
* The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/

import java.util.Stack;
public class BalancedParanthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()) {
            if(c=='(' || c=='{' || c=='[') {
                stack.push(c);
            } else {
                try {
                    char ch = stack.pop();
                    if(c==')' && ch!='(' || c=='}' && ch!='{' || c==']' && ch!='[') {
                        return false;
                    }
                }catch(Exception e) {
                    return false;
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
