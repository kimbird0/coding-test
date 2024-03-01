import java.util.*;


class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int row = 0;
        int col = 0;
        for(int i = 0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
        }
        for(int j = 0; j < sizes.length; j++){

            if(row < sizes[j][0]){
                row = sizes[j][0];
            }
            if(col < sizes[j][1]){
                col = sizes[j][1];
            }

        }
        answer = col*row;
        return answer;
    }
}