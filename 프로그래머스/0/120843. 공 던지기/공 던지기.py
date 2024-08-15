def solution(numbers, k):
    answer = 0
    ball_list = []
    while (k * 2) > len(ball_list):
        for i in numbers:
            ball_list.append(i)
    print(ball_list)
    for i in range(0, len(ball_list)+1):
        if i == k:
            answer = ball_list[(i-1)*2]
            break
        else:
            continue
    return answer