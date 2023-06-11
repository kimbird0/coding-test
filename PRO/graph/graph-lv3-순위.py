#프로그래머스 고득점 kit 그래프
#순위
def solution(n, results):
    answer = 0
    graph = [[set() for _ in range(2)] for _ in range(n+1)]

    for result in results:
        # 승자 테이블에 승리 기록
        graph[result[0]][0].add(result[1])
        # 패자 테이블에 패배 기록
        graph[result[1]][1].add(result[0])

    for i in range(1,n+1):
        for loser in graph[i][0]: # i 번째 선수에게 진 선수들
            graph[loser][1] |= graph[i][1] # i번째 선수에게 진 선수는 i 번째 선수가 진 선수한테 진다.
        for winner in graph[i][1]: # i번째 선수에게 이긴 선수들
            graph[winner][0] |= graph[i][0] # i번째 선수에게 이긴 선수는 i번째 선수가 이긴 선수도 이긴다.
    for i in range(1,n+1):
        if len(graph[i][0]) + len(graph[i][1]) == n-1:
            answer+=1
    return answer