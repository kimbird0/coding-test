#프로그래머스 고득점 kit 완전탐색
#최소직사각형

def solution(sizes):
    answer = 0
    col = 0
    row = 0
    for i in sizes:
        i.sort()
        col = max(col, i[0])
        row = max(row, i[1])
    answer = col*row
    return answer