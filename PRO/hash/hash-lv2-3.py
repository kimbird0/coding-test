#프로그래머스 고득점 kit hash
#전화번호 목록

#hash 문제지만 hash가 아닌 정렬로 품
def solution(phone_book):
    answer = True
    phone_book = sorted(phone_book)
    for i in range(len(phone_book)-1):
        if phone_book[i] == phone_book[i+1][:len(phone_book[i])]:
            answer = False
    return answer


#hash로 푼 다른 사람 코드
def solution(phone_book):
    # 1. Hash map을 만든다
    hash_map = {}
    for phone_number in phone_book:
        hash_map[phone_number] = 1
    
    # 2. 접두어가 Hash map에 존재하는지 찾는다
    for phone_number in phone_book:
        jubdoo = ""
        for number in phone_number:
            jubdoo += number
            # 3. 접두어를 찾아야 한다 (기존 번호와 같은 경우 제외)
            if jubdoo in hash_map and jubdoo != phone_number:# 이부분을 주목
                                                             # 성능 저하를 제외하고 왜 딕셔너리를 썼는지 의문 
                                                             # in을 쓸때 리스트보다 딕셔너리를 쓰는게 성능이 훨씬 좋다
                return False
    return True
