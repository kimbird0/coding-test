import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new LinkedList<>();
//        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int count = Integer.parseInt(input[1]);

        for (int j = 1; j <=N ; j++){
            deque.add(j);
        }

        sb.append("<");


        for (int i = 0; i < N-1 ; i++){

            /**
             * 로직 시작
             */
            for( int k = 0; k < count-1; k++){
                Integer poll = deque.poll();
                deque.add(poll);
            }
            sb.append(deque.poll());
            sb.append(", ");


            /**
             * 로직 끝
             */
        }
        sb.append(deque.poll());
        sb.append(">");
        System.out.println(sb);



    }
}

