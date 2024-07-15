def solution(s):
    answer = 1
    if s[0] == '-':
        answer *= -int(s[1:])
    else:
        answer *= int(s)
    return answer