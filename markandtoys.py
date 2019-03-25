n,k = map(int , input().split())
l = [int(i) for i in input().split()]
l = sorted(l)
c = 0
sum = 0

for i in l:
	sum += i
	if (sum > k):
		break
	c += 1
print(c)