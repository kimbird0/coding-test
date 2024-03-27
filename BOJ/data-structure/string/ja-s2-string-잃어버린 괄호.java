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
        HashSet<String> hashS = new HashSet<String>();
        String str = br.readLine();
        int sum = 0;
        int answer = 0;

        String[] str1 = str.split("-");

        for (int j = 0; j < str1.length; j++) {
            String[] str2 = str1[j].split("\\+");
            for (int i = 0; i < str2.length; i++){
                sum += Integer.parseInt(str2[i]);
            }
            str1[j] = Integer.toString(sum);
            sum = 0;

        }

        for (int i = 1; i < str1.length; i++){
            answer -= Integer.parseInt(str1[i]);
        }
        answer += Integer.parseInt(str1[0]);
        System.out.println(answer);



    }




}


