# A가 B보다 큰 경우에는 '>'를 출력한다.
#A가 B보다 작은 경우에는 '<'를 출력한다.
#A와 B가 같은 경우에는 '=='를 출력한다

num = input()
num_list = num.split()
a = int(num_list[0])
b = int(num_list[1])
if a>b:
    print(">")
elif a<b:
    print("<")
else:
    print("==")