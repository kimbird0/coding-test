import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack1 = new Stack<>();
        int check = 0;


        for (int i = 0; i < N ; i++){
            /**
             * 로직 시작
             */

            String S = br.readLine();
            stack1.clear();

            for (int j = 0; j < S.length(); j++){
                if(S.charAt(j) == '('){
                    stack1.push(S.charAt(j));
                } else if (stack1.isEmpty() && (S.charAt(j) == ')')) {
                    stack1.push(S.charAt(j));
                    break;
                } else { //스택에 '(' 가 들어 있고 문자가')'일때
                    stack1.pop();
                }
            }

            if (stack1.empty()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
/**
 * 로직 끝
 */
        }

    }
}
