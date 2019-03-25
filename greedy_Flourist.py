n , k = map(int , input().split())
c = [int(i) for i in input().split()]

c.sort(reverse=True)
l = len(c)

t = 0
for i in range(l):
	t += ((int(i/k)+1)*c[i])

print(t)