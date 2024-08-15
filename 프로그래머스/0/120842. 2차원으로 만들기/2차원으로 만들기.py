def solution(num_list, n):
    answer = []
    li_count = 0
    for i in range(int(len(num_list)/n)):
        li = []
        for j in range(n):
            li.append(num_list[li_count + j])
        li_count += n
        answer.append(li)
    return answer