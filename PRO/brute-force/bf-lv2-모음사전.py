#프로그래머스 고득점 kit 완전탐색
#모음 사전

from collections import deque

def solution(a):
    vowels = ['A', 'E', 'I', 'O', 'U']
    queue = deque(vowels)
    words = []

    while queue:
        word = queue.popleft()
        words.append(word)

        if len(word) < 5:  # 단어의 길이가 5보다 작은 경우에만 새로운 단어 생성
            for vowel in vowels:
                queue.append(word + vowel)
                
    words.sort()
    return words.index(a)+1

#중복 순열을 이용해서 간단하게 풀 수 있다
from itertools import product
def solution(word):
    answer = []
    li = ['A', 'E', 'I', 'O', 'U']
    for i in range(1,6):
        for per in product(li,repeat = i):
            answer.append(''.join(per))
    answer.sort()
    return answer.index(word)+1