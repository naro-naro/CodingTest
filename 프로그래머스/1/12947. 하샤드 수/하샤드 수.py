def solution(x):
    str_x = []
    num = 0
    for i in str(x):
        str_x.append(i)
    for j in str_x:
        num += int(j)
    if x % num == 0:
        answer = True
    else:
        answer = False
    return answer