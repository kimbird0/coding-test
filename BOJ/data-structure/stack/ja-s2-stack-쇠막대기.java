import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        String str = br.readLine();


        //      int N = Integer.parseInt(br.readLine());
        int result = 0;


        for (int i = 0; i < str.length(); i++) {
            /**
             * 로직 시작
             */
            if (str.charAt(i) == '('){
                stack.push(str.charAt(i));
                continue;
            }
            if (str.charAt(i) == ')') {
                stack.pop();

                if (str.charAt(i - 1) == '(') {
                    result += stack.size();
                } else {
                    result++;
                }
            }


            /**
             * 로직 끝
             */

        }
        System.out.println(result);

    }



}

