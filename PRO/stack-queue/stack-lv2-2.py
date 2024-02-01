#프로그래머스 고득점 kit 스택/큐
#올바른 괄호

def solution(s):
    answer = True
    tmp = []
    for i in s:
        if i == '(':            
            tmp.append(i)
                                    
        elif i == ')':
            if tmp == []:
                return False
            else:
                tmp.pop()
    #리턴 값을 이런식으로 생각하지 못해서 효율성의 문제가 있었음    
    return tmp==[]