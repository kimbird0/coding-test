import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());

        LinkedList<Character> linkedList = new LinkedList<Character>();
        for (int i = 0; i < str.length(); i++){
            linkedList.add(str.charAt(i));
        }
        int curs = str.length();

        ListIterator<Character> iter = linkedList.listIterator();
        while (iter.hasNext()){
            iter.next();
        }


        for (int i = 0; i < N ; i++){
            /**
             * 로직 시작
             */
            String command = br.readLine();
            Character c = command.charAt(0);
            switch (c){
                case 'L':
                    if (iter.hasPrevious()){
                        iter.previous();
                    }
                    break;
                case 'D':
                    if (iter.hasNext()){
                        iter.next();
                    }
                    break;
                case 'B':
                    if (iter.hasPrevious()){
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':

                    iter.add(command.charAt(2));
                    break;
                default:
                    break;
            }

            /**
             * 로직 끝
             */
        }
        for (Character chr : linkedList){
            sb.append(chr);
        }
        System.out.println(sb);


    }
}

/**
 * 시간 초과 코드 - linkedList
 */
//            String command = br.readLine();
//            char c = command.charAt(0);
//            switch (c){
//                case 'L':
//                    if(curs != 0){
//                        curs = curs-1;
//                    }
//                    break;
//                case 'D':
//                    if(curs != str.length()){
//                        curs = curs+1;
//                    }
//                    break;
//                case 'B':
//                    if(curs != 0){
//                        linkedList.remove(curs - 1);
//                        curs = curs-1;
//                    }
//                    break;
//                case 'P':
//                    char t = command.charAt(2);
//                    linkedList.add(curs, t);
//                    curs++;
//                    break;
//            }
