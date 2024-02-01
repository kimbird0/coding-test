#프로그래머스 고득점 kit 정렬
#H-index

def solution(citations):
    answer = 0
    citations.sort()
    for i in citations:        
        if len(citations) - citations.index(i) <= i:
            return len(citations) - citations.index(i)
    return 0

