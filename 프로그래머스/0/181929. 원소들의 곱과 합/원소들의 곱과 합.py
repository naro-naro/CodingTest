def solution(num_list):
    sum = 0
    mul = 1
    for i in num_list:
        sum += i
        mul *= i
    if mul<(sum**2):
        answer = 1
    else:
        answer = 0
    return answer