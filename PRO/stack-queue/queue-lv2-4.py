#프로그래머스 고득점 kit 스택/큐
#주식 가격

#시간이 간당간당함
from collections import deque
def solution(prices):
    answer = []
    deq = deque(prices)
    
    while deq:
        i = deq.popleft()
        sec = 0
        
        for q in deq:
            sec +=1
            if i > q:
                break
            
        answer.append(sec)
    return answer



#stack으로 푸는 방법
def solution(prices):
    length = len(prices)
    
    # answer을 max값으로 초기화  ex) prices = [1, 2, 3, 2, 3, 1]일 경우 answer = [5, 4, 3, 2, 1, 0]
    answer = [ i for i in range (length - 1, -1, -1)]
    
    # 주식 가격이 떨어질 경우 찾기
    stack = [0]
    for i in range (1, length):
        while stack and prices[stack[-1]] > prices[i]:
            j = stack.pop()
            answer[j] = i - j
        stack.append(i)
    return answer