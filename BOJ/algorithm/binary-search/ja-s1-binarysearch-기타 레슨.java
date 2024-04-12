import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //int N = Integer.parseInt(st.nextToken());
        //int M = Integer.parseInt(st.nextToken());
        //HashMap<String, Integer> map = new HashMap<>();
        //HashSet<String> hashS = new HashSet<String>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] lessonList = new int[N];

        int min = 0;
        int max = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            lessonList[i] =Integer.parseInt(st.nextToken());
            max += lessonList[i];
            min = Math.max(min, lessonList[i]);
        }

        while (min <= max){
            int mid = (min + max) / 2;
            int sum = 0;
            int count = 0;

            for (int i= 0;i < N; i++){
                if(sum + lessonList[i] > mid){
                    sum = 0;
                    count++;
                }
                sum += lessonList[i];
            }

            if(sum!=0) count++;
            if(count <= M) max = mid-1;
            else min = mid+1;

        }
        System.out.println(min);

    }


}



