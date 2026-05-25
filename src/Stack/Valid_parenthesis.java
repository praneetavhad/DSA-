package Stack;

import java.util.Stack;

public class Valid_parenthesis {
    public static void main(String[] args) {
        String s = "]";

        char c[] = s.toCharArray();
        Stack<Character> st = new Stack<>();

        for(Character ch : c){
            //opening
            if(ch == '(' || ch =='{' || ch == '['){
                st.push(ch);
            }
            else if(!st.isEmpty() && ((ch == ')' && st.peek() == '(') ||
                    (ch == '}' && st.peek() == '{') ||
                    (ch == ']' && st.peek() == '[') )){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        System.out.println(st);
        if(st.isEmpty()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
