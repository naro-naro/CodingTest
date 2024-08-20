star = int(input())
for i in range(star):
    print(" " * i, end='')
    print('*' * ((star - i)*2 -1))
for i in range(star-2, 0-1, -1):
    print(' ' * i, end='')
    print('*' * ((star - i)*2 -1))