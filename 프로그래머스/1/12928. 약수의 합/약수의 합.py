def solution(n):
    answer = 0
    yaksu = []
    i = 1
    while i<=n:
        if n%i == 0:
            yaksu.append(i)
        i += 1
    for j in yaksu:
        answer += j
    return answer