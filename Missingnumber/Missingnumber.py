n = int(input())
numbers = list(map(int, input().split()))
s = sum(numbers)

k = n * (n + 1) // 2
print(k - s)
