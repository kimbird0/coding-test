#프로그래머스 고득점 kit hash
#완주하지 못한 선수
def solution(participant, completion): 
    #처음 작성 코드 : 효율성 테스트 실패
    #hash는 시간 복잡도가 O(n)으로 매우 낮기 때문에 여기서 hash를 사용해야됨을 인지 가능
    answer = ''
    tmp = []
    for i in participant:
        if i in completion:
            completion.remove(i)
        else:
            answer = i
    return answer

#새로 작성한 코드
def solution(participant, completion):
    answer = ''
    tmp = {}
    for i in participant:
        if i not in tmp:
            tmp[i] = 1
        elif i in tmp:
            tmp[i] += 1
    for j in completion:
        tmp[j] -= 1
    for k in tmp:
        if tmp[k] != 0:
            answer = k

    return answer

