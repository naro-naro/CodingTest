def solution(myString, pat):
    if myString.upper().find(pat.upper()) == -1:
        answer = 0
    else:
        answer = 1
    return answer