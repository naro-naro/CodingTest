def solution(arr):
    answer = []
    min = arr[0]
    for i in arr:
        if i < min:
            min = i
    for i in arr:
        if i == min:
            continue
        else:
            answer.append(i)
    if len(answer) == 0:
        answer.append(-1)
    return answer