def solution(t, p):
    list1 = []
    answer = 0
    for i in range(len(t) - len(p) + 1):
        list1.append(int(t[i:i+len(p)]))
    for j in list1:
        if j <= int(p):
            answer += 1
    return answer