#프로그래머스 고득점 kit 스택/큐
#프로세스

def solution(priorities, location):
    array1 = [c for c in range(len(priorities))]
    array2 = priorities.copy()
    i = 0
    
    while True:        
        if array2[i] < max(array2[i+1:]):
            array1.append(array1.pop(i))
            array2.append(array2.pop(i))
        else:
            i+=1
            
        if array2 == sorted(array2, reverse = True):
            break
    return array1.index(location) + 1



#deque를 이용하는게 약 절반정도 빠름(pop,push)
def solution(priorities, location):
  answer = 0
  from collections import deque

  d = deque([(v,i) for i,v in enumerate(priorities)])

  while len(d):
      item = d.popleft()
      if d and max(d)[0] > item[0]: #d 를 붙이는 이유는 d안의 원소가 없으면 에러가 나기 때문
          d.append(item)
      else:
          answer += 1
          if item[1] == location:
              break
  return answer