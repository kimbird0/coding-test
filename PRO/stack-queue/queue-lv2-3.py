#프로그래머스 고득점 kit 스택/큐
#다리를 지나는 트럭

from collections import deque
def solution(bridge_length, weight, truck_weights):
    answer = 0
    bridgeWeight = 0 #다리 위 트럭 무게
    bridge = deque([0 for _ in range(bridge_length)])
    truck_weights = deque(truck_weights) #건너지 못한 트럭 list > deque
    
    while len(truck_weights) or bridgeWeight: #대기 트럭이 있거나 , 다리 위에 트럭이 있으면 반복
        bridgeWeight -= bridge.popleft() #한번의 반복(1초)마다 나가는 트럭 무게를 빼줌, 없으면 0을 빼줌
        
        if len(truck_weights) and bridgeWeight + truck_weights[0] <= weight: #대기 트럭이 있고 다리 무게 + 다음 트럭 무게가 가능 무게보다 작으면
            tmp = truck_weights.popleft()
            bridgeWeight += tmp #다리무게에 트럭 한대 무게 더함
            bridge.append(tmp) #트럭 한대 올림
        else:
            bridge.append(0) #다리 길이 유지
        
        answer += 1
    return answer



#시간초과 코드 (deque 사용해야함)
from collections import deque
def solution(bridge_length, weight, truck_weights):
    answer = 0
    bridge = deque([0 for _ in range(bridge_length)])
    truck_weights = deque(truck_weights)
    while bridge:
        answer += 1
        bridge.popleft()
        
        if truck_weights:        
            if sum(bridge) + truck_weights[0] <= weight:
                tmp = truck_weights.popleft()
                bridge.append(tmp)
            else:
                bridge.append(0)
        
        
    return answer