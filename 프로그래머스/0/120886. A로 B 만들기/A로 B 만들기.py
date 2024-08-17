def solution(before, after):
    before_list = []
    after_list = []
    for i in range(len(after)):
        before_list.append(before[i])
        after_list.append(after[i])
    before_list.sort()
    after_list.sort()
    if before_list == after_list:
        answer = 1
    else:
        answer = 0
    return answer