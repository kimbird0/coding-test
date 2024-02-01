#프로그래머스 고득점 kit 완전탐색
#피로도

from itertools import permutations
​
def solution(k, dungeons):
    answer = 0
    
    for p in permutations(dungeons, len(dungeons)):
        tmp = k
        cnt = 0 
        
        for need, spend in p:
            if tmp >= need:
                tmp -= spend
                cnt += 1
        answer = max(answer, cnt)
    return answer