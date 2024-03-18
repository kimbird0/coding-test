import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int num1 = Integer.parseInt(st.nextToken());
            if (map1.get(num1) == null){
                map1.put(num1, 1);
            } else {
                map1.put(num1, map1.get(num1)+1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++){
            int num2 = Integer.parseInt(st.nextToken());
            if(map1.get(num2) != null){
                sb.append(map1.get(num2));
                sb.append(" ");
            } else {
                sb.append(0);
                sb.append(" ");
            }
        }
        System.out.println(sb);

    }


}


