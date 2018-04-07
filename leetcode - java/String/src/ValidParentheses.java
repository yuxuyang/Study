import java.util.Stack;

public class ValidParentheses {
    /*
    Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
     determine if the input string is valid.

     The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     */
    public static boolean isValid(String s){
        if ((s.length() % 2) == 1) return false;
        Stack<Character> test = new Stack<Character>();
        for (char a : s.toCharArray() ){
            if (a == '(') {
                test.push(')');
            } else if (a == '[') {
                test.push(']');
            } else if (a == '{'){
                test.push('}');
            } else if ((test.isEmpty()) || a != test.pop()){
                return false;
            }
        }
        return test.isEmpty();
    }

    public static boolean isValid1(String s){
        char [] test = new char[s.length()];
        int head = 0;
        for (char a : s.toCharArray()){
            switch(a)
            {
                case '{':
                case '(':
                case '[':
                    test[head++] = a;
                    break;
                case '}':
                    if (head == 0 || (test[--head] != '{')){
                        return false;
                    }
                    break;
                case ')' :
                    if (head == 0 || (test[--head] != '(')) {
                        return false;
                    }
                    break;
                case ']':
                    if (head == 0 || (test[--head] != '[')){
                        return false;
                    }
                    break;
            }
        }
        return head == 0;
    }
}
