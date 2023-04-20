#프로그래머스 고득점 kit hash
#위장

def solution(clothes):
    answer = 1
    clothes_dict = {}
    
    for i in clothes:
        key = i[1]
        value = i[0]
        if key in clothes_dict:
            clothes_dict[key] += 1 #밸류 +1
        else:
            clothes_dict[key] = 1 #밸류 1로 초기화

    for key in clothes_dict.keys(): #문법 기억
        answer = answer * (clothes_dict[key] + 1)
    
    return answer - 1


#먼저 2로 초기화 하는 방식 (clothes_dict[key] + 1)를 하지 않음
def solution(clothes):
    clothes_type = {}

    for c, t in clothes:
        if t not in clothes_type:
            clothes_type[t] = 2
        else:
            clothes_type[t] += 1

    cnt = 1
    for num in clothes_type.values():
        cnt *= num

    return cnt - 1
