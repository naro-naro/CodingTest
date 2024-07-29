def solution(num_list):
    odd, even = 0, 0
    for i in range(1, len(num_list)+1):
        if i%2 == 1:
            odd += num_list[i-1]
        else:
            even += num_list[i-1]
    if odd >= even:
        answer = odd
    else:
        answer = even
    return answer