#프로그래머스 고득점 kit DFS/BFS
#네트워크

def dfs(computers, visited, v):
    if visited[v] == 0:
        visited[v] = 1
    for e in range(len(computers)):
        if computers[v][e] == 1 and visited[e] == 0:
            dfs(computers, visited, e)

def solution(n, computers):
    visited = [0] * n
    answer = 0
    while 0 in visited:
        for i in range(n):
            if visited[i] == 0:
                dfs(computers, visited, i)
                answer += 1
    return answer