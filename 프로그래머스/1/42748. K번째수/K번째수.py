def solution(array, commands):
    answer = []
    final_answer = []
    for i in commands:
        answer.append(array[i[0]-1:i[1]])
    for j in range(len(answer)):
        answer[j].sort()
        final_answer.append(answer[j][commands[j][2]-1])
    return final_answer