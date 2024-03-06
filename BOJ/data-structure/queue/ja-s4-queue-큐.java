import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> queue = new LinkedList();

        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N ; i++){
            String[] input = br.readLine().split(" ");
            String command = input[0];
            /**
             * 로직 시작
             */
            switch (command){
                case "push":
                    queue.add(Integer.parseInt(input[1]));

                    break;
                case "pop":
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    } else {
                        Integer poll = queue.poll();
                        System.out.println(poll);
                    }


                    break;
                case "size":
                    int size = queue.size();
                    System.out.println(size);

                    break;
                case "empty":
                    if(queue.isEmpty()){
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }

                    break;
                case "front":
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peek());
                    }

                    break;
                case "back":
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peekLast());
                    }


                    break;
            }



            /**
             * 로직 끝
             */
        }


    }
}

