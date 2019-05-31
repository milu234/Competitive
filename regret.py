a=[int(x) for x in input().split()]
b=[int(x) for x in input().split()]
a.sort()
ans = []
for j in a:
	for i in range(0,len(b)):
		if b[i] in a:
			ans.append(a.index(b[i]))
		else:
			ans.append(0)
print(list(set(ans)))