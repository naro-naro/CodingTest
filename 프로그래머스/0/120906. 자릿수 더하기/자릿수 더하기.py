def solution(n):
    list=[]
    answer = 0
    for i in str(n):
        list.append(i)
    for j in list:
        answer += int(j)
    return answer