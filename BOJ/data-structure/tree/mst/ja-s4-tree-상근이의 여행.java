import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            /**
             * 로직 시작
             */
            StringTokenizer st = new StringTokenizer(br.readLine());
            int nodeNum = Integer.parseInt(st.nextToken());
            int airplaneNum = Integer.parseInt(st.nextToken());

            System.out.println(nodeNum-1);
            for (int j = 0; j < airplaneNum; j++){
                br.readLine();
            }



            /**
             * 로직 끝
             */
        }

    }

}

