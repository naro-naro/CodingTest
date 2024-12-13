num = int(input())
num_list = []
for i in range(num):
    a = int(input())
    num_list.append(a)
if num_list.count(0) > num_list.count(1):
    print("Junhee is not cute!")
elif num_list.count(0) < num_list.count(1):
    print("Junhee is cute!")