def solution(num_list, n):
    answer = num_list.count(n)
    if answer >= 1:
        answer = 1
    return answer