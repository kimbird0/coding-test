import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());



        for (int i = 0; i < N; i++) {
            /**
             * 로직 시작
             */
            int val = Integer.parseInt(br.readLine());

            if (val == 0){
                if(priorityQueue.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(priorityQueue.poll());
            }
            else
                priorityQueue.add(val);


            /**
             * 로직 끝
             */

        }


    }



}

