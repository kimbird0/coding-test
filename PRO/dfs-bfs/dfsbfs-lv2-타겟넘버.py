#프로그래머스 고득점 kit DFS/BFS
#타겟 넘버

#dfs(재귀함수)
def solution(numbers, target):
    global answer
    answer = 0
    def dfs(i, total):
        global answer
        if i == len(numbers):
            if total == target:
                
                answer += 1
            return
        else:
            dfs(i+1, total + numbers[i])
            dfs(i+1, total - numbers[i])

    dfs(0, 0)
    return answer


#bfs(데크)
#개인적으로 이게 더 어려움
from collections import deque
def solution(numbers, target):
    answer = 0
    queue = deque()
    queue.append([numbers[0],0])
    queue.append([-1*numbers[0],0])
    while queue:
        temp, idx = queue.popleft()
        idx += 1
        if idx < len(numbers):
            queue.append([temp+numbers[idx], idx])
            queue.append([temp-numbers[idx], idx])
        else:
            if temp == target:
                answer += 1
    return answer
