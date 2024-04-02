import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //int N = Integer.parseInt(st.nextToken());
        //int M = Integer.parseInt(st.nextToken());
        //HashMap<String, Integer> map = new HashMap<>();
        //HashSet<String> hashS = new HashSet<String>();



        int M = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int count = 0;
        int answer = 0;
        for (int i = 1; i < M - 1; ){
            if (str.charAt(i) == 'O' && str.charAt(i+1) == 'I'){
                count ++;
                if (count == N){
                    if(str.charAt(i-(count*2-1)) == 'I'){
                        answer++;
                    }
                    count--;
                }
                i += 2;
            } else {
                count = 0;
                i++;
            }

        }
        System.out.println(answer);
    }
}


