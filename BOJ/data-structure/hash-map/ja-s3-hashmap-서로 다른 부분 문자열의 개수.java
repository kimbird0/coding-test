import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //int N = Integer.parseInt(br.readLine());
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //int N = Integer.parseInt(st.nextToken());
        //int M = Integer.parseInt(st.nextToken());
        //HashMap<String, Integer> map = new HashMap<>();

        String S = br.readLine();

        HashSet<String> hashS = new HashSet<String>();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i+1; j <= S.length(); j++){
                hashS.add(S.substring(i,j));
            }
        }
        System.out.println(hashS.size());



    }



}


