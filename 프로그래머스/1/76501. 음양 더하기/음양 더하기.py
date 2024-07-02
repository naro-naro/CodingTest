def solution(absolutes, signs):
    answer = 0
    for i in range(0, len(signs)):
        a = absolutes.pop()
        s = signs.pop()
        if s == True:
            answer += a
        else:
            answer -= a
    return answer