def solution(my_string):
    answer = []
    answer = my_string.split()
    for i in answer:
        if i == "":
            answer.remove(i)
        
    return answer