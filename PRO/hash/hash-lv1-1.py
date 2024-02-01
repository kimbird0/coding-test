#프로그래머스 고득점 kit hash
#폰켓몬
#이게 왜 hash?
def solution(nums):
    answer = 0
    max_type = len(set(nums))
    
    if len(nums)/2 > max_type:
        answer = max_type
    else:
        answer = len(nums)/2
    return answer