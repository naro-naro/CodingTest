def solution(my_string):
    answer = 0
    for i in range(0, len(my_string)):
      try:
        answer += int(my_string[i])
      except:
        continue
    return answer