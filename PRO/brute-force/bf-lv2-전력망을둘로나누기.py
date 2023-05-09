#프로그래머스 고득점 kit 완전탐색
#전력망을 둘로 나누기

from collections import deque

def bfs(node, tree, visited, wire):
    
    cnt = 0
    queue = deque([node])
    visited[node] = True

    while queue:
        node = queue.popleft()
        cnt += 1

        for wire_num in tree[node]:
            if not ((node == wire[0] and wire_num == wire[1]) or (node == wire[1] and wire_num == wire[0])):
                if not visited[wire_num]:
                    visited[wire_num] = True
                    queue.append(wire_num)

    return cnt


def solution(n, wires):
    answer = float('inf')
    tree = [[] for _ in range(n + 1)]

    for wire in wires:
        a, b = wire
        tree[wire[0]].append(wire[1])
        tree[wire[1]].append(wire[0])

    for wire in wires:
        visited = [False] * (n + 1)
        temp = []
        for i in range(1, n + 1):
            if not visited[i]:
                cnt = bfs(i, tree, visited, wire)
                temp.append(cnt)
        answer = min(answer, abs(temp[0] - temp[1]))

    return answer