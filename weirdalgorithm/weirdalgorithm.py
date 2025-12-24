k = input()
while (int(k) != 1):
    k = int(k)
    print(k , end=" ")
    if k % 2 == 0:
        k = k / 2
    else:
        k = k * 3 + 1
print("1")