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
        //int N = Integer.parseInt(st.nextToken());
        //int M = Integer.parseInt(st.nextToken());
        //HashMap<String, Integer> map = new HashMap<>();
        //HashSet<String> hashS = new HashSet<String>();

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] a = new int[N];
        Arrays.sort(a);
        int answer = 0;
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int b = 0;
        for (int i = 0; i < M; i++){
            b = Integer.parseInt(st2.nextToken());
            System.out.println(binarySearch(b, 0, N-1, a));
        }
    }
    static int binarySearch (int key, int low, int high, int[] arr){
        int mid;

        if (low <= high) {
            mid = (low + high) / 2;

            if (key == arr[mid]) {
                return 1;
            } else if (key < arr[mid]) {
                return binarySearch(key, low, mid - 1, arr);
            } else {
                return binarySearch(key, mid + 1, high, arr);
            }
        }
        return 0;
    }



}



