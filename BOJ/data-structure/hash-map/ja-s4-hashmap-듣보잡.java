import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();


        for (int i = 0; i < N; i++) {
            String key = br.readLine();
            map.put(key, 0);
        }
        for (int i = 0; i < M; i++){
            String key = br.readLine();
            if (map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }
        }
        int count = 0;
        for (int val : map.values()){
            if (val >= 1){
                count ++;
            }
        }
        sb.append(count).append('\n');
        Map<String, Integer> sortedMap = new TreeMap<>(map);
        for (String val : sortedMap.keySet()){
            if (sortedMap.get(val) == 1){
                sb.append(val).append("\n");
            }
        }
        System.out.println(sb);


    }



}


