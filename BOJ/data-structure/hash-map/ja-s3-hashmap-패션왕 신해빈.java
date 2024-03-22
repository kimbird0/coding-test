import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());



        for (int i = 0; i < N; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int M = Integer.parseInt(br.readLine());
            for (int j = 0; j < M; j++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                String val = st.nextToken();
                String key = st.nextToken();

                if (map.containsKey(key)){
                    map.put(key, map.get(key)+1);
                } else {
                    map.put(key, 1);
                }
            }

            int result = 1;
            for (int val : map.values()){
                result *= (val+1);
            }
            sb.append(result-1).append("\n");
        }
        System.out.println(sb);

    }



}


