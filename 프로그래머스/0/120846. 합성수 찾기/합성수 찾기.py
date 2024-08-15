def solution(n):
    answer = 0
    for i in range(1,n+1):
        composite = False
        for j in range(1, i+1):
            if j == 1:
                continue
            elif j == i:
                continue
            elif i % j == 0:
                composite = True
            else:
                continue
        if composite == True:
            answer += 1
    return answer