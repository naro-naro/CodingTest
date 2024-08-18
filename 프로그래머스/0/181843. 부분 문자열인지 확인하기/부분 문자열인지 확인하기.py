def solution(my_string, target):
    answer = 1
    if my_string.find(target) == -1:
        answer = 0
    return answer