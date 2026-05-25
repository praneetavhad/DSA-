package Stack;

import java.util.Stack;

public class Baseball {
    public static void main(String[] args) {


        String a[] = {"5","-2","4","C","D","9","+","+"};
        Stack<Integer> st = new Stack<>();
        for(String str : a){


            //5


            //C
            if(str.equals("C")){
                st.pop();
            }

            //D
            else if(str.equals("D")){
                st.push(st.peek() * 2);
            }

            // +
            else if(str.equals("+")){
                int previous_first = st.peek();
                st.pop();
                int previos_sec = st.peek();
                st.push(previous_first);
                int double_sum = previous_first + previos_sec;
                st.push(double_sum);
            }
            else{
                st.push(Integer.parseInt(str));
            }
        }

        System.out.println(st);

        int sum = 0;
        while(!st.isEmpty()){
            sum = sum + st.peek();
            st.pop();
        }

        System.out.println(sum);


    }
}
