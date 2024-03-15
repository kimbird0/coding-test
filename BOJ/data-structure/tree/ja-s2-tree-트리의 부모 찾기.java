import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] parent = new int[N + 1];
        ArrayList<Integer>[] adj = new ArrayList[N+1];
        for (int i = 1; i <= N; i++){
            adj[i] = new ArrayList<>();
        }
        boolean[] visited = new boolean[N+1];
        StringTokenizer st;

        for (int i = 1; i < N; i++) {
            /**
             * 로직 시작
             */
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
            /**
             * 로직 끝
             */

        }
        /**
         * 로직 시작
         */
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        visited[1] = true;
        while (!queue.isEmpty()){
            int cur = queue.poll();
            for (int next : adj[cur]){
                if (visited[next]){
                    continue;
                }
                visited[next] = true;
                queue.add(next);
                parent[next] = cur;
            }
        }
        for (int i = 2; i <= N; i++){
            System.out.println(parent[i]);
        }



    }



}

