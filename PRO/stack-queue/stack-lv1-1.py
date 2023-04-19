#프로그래머스 고득점 kit stack-queue
#같은 숫자는 싫어
def solution(arr):
    answer = []
    for i in arr:
        if answer == []:
            answer.append(i)
        if i != answer[-1]:
            answer.append(i)

    return answer

#흡사한 코드 좀 더 간결
def no_continuous(s):
    result = []
    for c in s:
        if len(result) == 0 or result[-1] != c:
            result.append(c)

    return result