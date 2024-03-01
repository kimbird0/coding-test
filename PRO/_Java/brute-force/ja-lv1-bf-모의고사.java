import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[] answer = new int[3];
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        for(int i = 0; i < answers.length; i++){
            if(a[i%5] == answers[i]){
                answer[0] += 1;
            }
            if(b[i%8] == answers[i]){
                answer[1] += 1;
            }
            if(c[i%10] == answers[i]){
                answer[2] += 1;
            }
        }
        int max = Math.max(Math.max(answer[0],answer[1]), answer[2]);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int j = 1; j <= answer.length; j++){
            if(max == answer[j-1]){
                result.add(j);
            }
        }
        return result;
    }
}