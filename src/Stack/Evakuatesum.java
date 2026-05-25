package Stack;

import java.util.Stack;

public class Evakuatesum {
    public static void main(String[] args) {
        String str[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        Stack<Integer> st = new Stack<>();

        for(String s : str){
            if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*") ){
                String oper = s;
                int second = st.pop();
                System.out.println(second);
                int first = st.pop();
                System.out.println(first);
                switch (oper){
                    case "+": st.push(first + second);
                        break;
                    case "-": st.push(first - second);
                        break;
                    case "*": st.push(first * second);
                        break;
                    case "/":
                        if(second == 0){
                            st.push(0);
                        }else {
                            st.push(first / second);
                        }
                        break;
                }
            }else{
                int nos = Integer.parseInt(s);
                st.push(nos);
            }
        }

        System.out.println(st.pop());

    }
}
