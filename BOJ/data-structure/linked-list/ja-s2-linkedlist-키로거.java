import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int curs = 0;


        for (int i = 0; i < N; i++) {
            /**
             * 로직 시작
             */
            LinkedList<Character> linkedList = new LinkedList<>();
            ListIterator<Character> list = linkedList.listIterator();
            String strs = br.readLine();

            for (int j = 0; j < strs.length(); j++){
                char c = strs.charAt(j);
                if (c == '<'){
                    if (list.hasPrevious()){
                        list.previous();
                    }

                } else if (c == '>'){
                    if (list.hasNext()){
                        list.next();
                    }

                } else if (c == '-') {
                    if (list.hasPrevious()){
                        list.previous();
                        list.remove();
                    }
                } else {
                    list.add(c);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char c : linkedList){
                sb.append(c);
            }
            System.out.println(sb);

            /**
             * 로직 끝
             */

        }



    }



}

