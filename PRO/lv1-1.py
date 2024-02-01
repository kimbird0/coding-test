#프로그래머스 2019 KAKAO BLIND RECRUITMENT
#실패율

def solution(N, stages):
    People = len(stages)
    faillist = {}
    for i in range(1, N + 1):
        if People != 0:
            faillist[i] = stages.count(i) / People
            People = People- stages.count(i)
        elif People == 0:
            faillist[i] = 0

    return sorted(faillist, key=faillist[i], reverse=True)