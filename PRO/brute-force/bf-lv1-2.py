#프로그래머스 고득점 kit 완전탐색
#모의고사
def solution(answers):
    answer = []
    a = [1,2,3,4,5]
    b = [2,1,2,3,2,4,2,5]
    c = [3,3,1,1,2,2,4,4,5,5]
    score= [0,0,0]
    count= 0
    #이부분도 enumerate로 가능
    for i in answers:
        if i == a[count%5]:
            score[0] += 1
        if i == b[count%8]:
            score[1] += 1
        if i == c[count%10]:
            score[2] += 1
        count +=1
    #이부분 주목 max함수에서 같은값이 있으면 제일 먼저 나온것 리턴
    for idx , j in enumerate(score):
        if j == max(score):
            answer.append(idx+1)

    return answer