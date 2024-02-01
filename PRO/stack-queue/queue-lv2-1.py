#프로그래머스 고득점 kit 스택/큐
#기능개발

def solution(progresses, speeds):
    answer = []
    count = 0
    tmp = [] #완료까지 걸리는 일 수 저장 리스트
    num = 0
    for idx,pro in enumerate(progresses):
        while pro < 100:
            pro += speeds[idx]
            count += 1
        tmp.append(count)
        count = 0
    #이부분 구현에 애를먹음
    front = 0
    for idx in range(len(tmp)):
        if tmp[idx] > tmp[front]:  
            answer.append(idx - front)
            front = idx             
    answer.append(len(tmp) - front)  
        
    return answer

#같은 방식으로 math를 사용하면 더 간략히 풀 수 있다
import math
def solution(progresses, speeds):
    progresses = [math.ceil((100 - a) / b) for a, b in zip(progresses, speeds)]
    answer = []
    front = 0, 0

    for idx in range(len(progresses)):
        if progresses[idx] > progresses[front]:  
            answer.append(idx - front)
            front = idx 
    answer.append(len(progresses) - front)  

    return answer


#이 방식으로 푸는게 가장 좋음(스택/큐 활용)
#queue FIFO 
#입출력 순서에 대한 언급이 있다면, stack , queue 이라 간파하고 pop 으로 풀려고 해보자
def solution(progresses, speeds):
    answer = []
    time = 0
    count = 0
    
    while len(progresses)> 0:
        if (progresses[0] + time*speeds[0]) >= 100: 
            progresses.pop(0)
            speeds.pop(0)
            count += 1
            
        else:
            if count > 0:
                answer.append(count)
                count = 0
            time += 1
    answer.append(count)
    return answer
