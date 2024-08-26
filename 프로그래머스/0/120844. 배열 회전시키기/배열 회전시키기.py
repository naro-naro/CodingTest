def solution(numbers, direction):
    answer = []
    if direction == 'right':
        num = numbers[-1]
        del numbers[-1]
        numbers.insert(0, num)
    elif direction == 'left':
        num = numbers[0]
        del numbers[0]
        numbers.append(num)
    return numbers