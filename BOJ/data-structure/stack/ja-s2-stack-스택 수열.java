import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack1 = new Stack<>();
        int start = 0;


        for (int i = 0; i < N ; i++){
            /**
             * 로직 시작
             */
            int num = Integer.parseInt(br.readLine());
            if(start < num){
                for (int j = start + 1; j <= num; j++){
                    stack1.push(j);
                    sb.append("+").append("\n");
                }
                start = num;
            } else if(stack1.peek() != num) {
                System.out.println("NO");
                return;		// 또는 System.exit(0); 으로 대체 해도 됨.
            }

            stack1.pop();
            sb.append('-').append('\n');

/**
 * 로직 끝
 */
        }
        System.out.println(sb);

    }
}
