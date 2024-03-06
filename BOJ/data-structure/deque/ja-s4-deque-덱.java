import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N ; i++){
            /**
             * 로직 시작
             */
            String[] command = br.readLine().split(" ");
            switch (command[0]){
                case "push_front":
                    deque.addFirst(Integer.parseInt(command[1]));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(command[1]));
                    break;
                case "pop_front":
                    if (deque.isEmpty()){
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.pollFirst());
                    }
                    break;
                case "pop_back":
                    if (deque.isEmpty()){
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.pollLast());
                    }
                    break;
                case "size":
                    int size = deque.size();
                    System.out.println(size);
                    break;
                case "empty":
                    if(deque.isEmpty()){
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if (deque.isEmpty()){
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekFirst());
                    }
                    break;
                case "back":
                    if (deque.isEmpty()){
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekLast());
                    }
                    break;

            }


            /**
             * 로직 끝
             */
        }




    }
}

