#comp = [''.join(l) for i in range(len(x)) for l in combinations(x, i+2)]
T = int(input())
for _ in range(T):
	N = int(input())
	s = input()
	pos_one = 0
	got_one = False
	count = 0
	for index, i in enumerate(s):
		
		if(i == '1'):
			got_one = True
			pos_one = index
			
			
		elif(i == '0' and (not got_one)):
			continue
		else:
			count += pos_one + 1
	print(count)