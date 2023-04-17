#프로그래머스 고득점 kit 정렬
#k번째 수
def solution(array, commands):
    answer = []
    tmp = []
    for i in commands:
        tmp = array[i[0]-1:i[1]]
        tmp.sort()
        answer.append(tmp[i[2]-1])
    return answer


#다른 사람 풀이
def solution(array, commands):
    answer = []
    for command in commands:
        i,j,k = command
        answer.append(sorted(array[i-1:j])[k-1])
    return answer