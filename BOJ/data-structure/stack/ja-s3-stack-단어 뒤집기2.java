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
        boolean flag= false;

        //      int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < str.length(); i++) {
            /**
             * 로직 시작
             */
            if (str.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                flag = true;
            }
            else if (str.charAt(i) == '>') {
                sb.append(str.charAt(i));
                flag = false;
                continue;
            }

            if (flag == true) {
                sb.append(str.charAt(i));
                // flag가 false일 경우, 괄호 이외의 문자를 처리
            } else if (flag == false){
                if (str.charAt(i) == ' '){
                    while (!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    stack.push(str.charAt(i));
                }

            }



            if (i == str.length() - 1) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                /**
                 * 로직 끝
                 */
            }

        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);



    }
}

