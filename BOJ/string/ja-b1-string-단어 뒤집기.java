import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N ; i++){
            String[] strArr = br.readLine().split(" ");

            for(String str : strArr){
                StringBuilder sb = new StringBuilder(str);
                System.out.print(sb.reverse().toString() + " ");

            }
            System.out.println();
        }

    }
}
