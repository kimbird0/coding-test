import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        HashSet<Integer> lostSet = new HashSet<>();
        HashSet<Integer> reserveSet = new HashSet<>();

        for (int i : reserve){
            reserveSet.add(i);
        }
        for (int i : lost) {
            if (reserveSet.contains(i)) {
                reserveSet.remove(i);
            } else {
                lostSet.add(i);
            }
        }
        answer = n - lostSet.size();

        for ( int i : lostSet){
            if(reserveSet.contains(i-1)){
                reserveSet.remove(i-1);
                answer++;
            } else if(reserveSet.contains(i+1)){
                reserveSet.remove(i+1);
                answer++;
            }
        }


        return answer;
    }
}

/**
 * 이전 정답 (반성용)
 */


//import java.util.*;
//
//class Solution {
//    public int solution(int n, int[] lost, int[] reserve) {
//        int answer = n;
//        answer = n - lost.length;
//        HashSet<Integer> lostSet = new HashSet<>();
//        HashSet<Integer> reserveSet = new HashSet<>();
//
//        for (int i : lost) {
//            if (reserveSet.contains(i)) {
//                reserveSet.remove(i);
//                answer--;  // 여분이 있던 학생이 체육복을 잃어버렸으므로, answer 감소는 하지 않음
//            } else {
//                lostSet.add(i);
//            }
//        }
//        for (int i : reserve){
//            reserveSet.add(i);
//        }
//
//        //
//
//        HashSet<Integer> tmpSet = new HashSet<>(reserveSet);
//
//
//        for (int i : tmpSet){
//            if (lostSet.contains(i)){
//                answer += 1;
//                lostSet.remove(i);
//                reserveSet.remove(i);
//            }
//        }
//
//        tmpSet = new HashSet<>(reserveSet);
//        for (int i : tmpSet){
//            if (lostSet.contains(i-1)){
//                answer += 1;
//                lostSet.remove(i-1);
//                reserveSet.remove(i);
//            }
//        }
//        tmpSet = new HashSet<>(reserveSet);
//        for (int i : tmpSet){
//            if (lostSet.contains(i+1)){
//                answer += 1;
//                lostSet.remove(i+1);
//                reserveSet.remove(i);
//            }
//        }
//
//
//        return answer;
//    }
//}