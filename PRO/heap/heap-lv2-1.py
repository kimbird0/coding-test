#프로그래머스 고득점 kit heap 
#더 맵게

def solution(scoville, K):
    answer = 0
    while scoville:
        scoville.sort()        
        sco = scoville.pop(0)
        if sco >= K:
            break 
        if not scoville:
            return -1

        scoville[0] = scoville[0]*2 + sco
        answer += 1

            
    return answer


# heap을 사용하는 이유 : 일반적인 리스트와 달리 push(), pop() 이후 자동 정렬
# sort()는 O(nlogn) 의 시간
# heap을 사용하면 최소값을 찾는 데 O(1) 시간이 걸리고, 원소를 추가하거나 제거하는 데 O(logn) 시간 
import heapq

def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville) #O(n)
    while scoville:
        min1 = heapq.heappop(scoville)
        if min1 >= K:
            break
        if not scoville:
            return -1
        min2 = heapq.heappop(scoville)
        heapq.heappush(scoville, min1 + min2*2)
        answer += 1
    return answer