def solution(n, t):
    for i in range(1,t+1): # t시간동안 즉, t번
        n+=n # 자기자신의 개수만큼 늘어난다
    return n
solution(2,10)
solution(7,15)
