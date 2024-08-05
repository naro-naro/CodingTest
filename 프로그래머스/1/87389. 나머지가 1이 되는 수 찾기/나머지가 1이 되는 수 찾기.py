def solution(n):
    minus1 = n - 1
    for i in range(2, n):
        if minus1 % i == 0:
            answer = i
            break
    return answer