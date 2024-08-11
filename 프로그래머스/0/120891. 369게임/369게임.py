def solution(order):
    answer = 0
    for i in str(order):
        if i == '0':
            continue
        elif int(i) % 3 == 0:
            answer += 1  
    return answer