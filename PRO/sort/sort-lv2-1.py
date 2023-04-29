#프로그래머스 고득점 kit heap 
#가장 큰 수

#케이스 하나 통과 못한 코드
def solution(numbers):
    answer = ''
    mullist = list(map(str, numbers))
    
    mullist.sort(key = lambda x:x*3, reverse = True) #람다식 아이디어 주목
    answer = answer.join(mullist)
    return answer



def solution(numbers):
    numbers = list(map(str, numbers))
    numbers.sort(key=lambda x: x*3, reverse=True)
    return str(int(''.join(numbers))) #[0,0,0,0] 등의 특이 케이스를 위해 join한 값을 int로 바꿨다가 str로 다시 바꾼다
                                      #그럼 원하는 str 0이 나옴 (안하면 0000 나옴)