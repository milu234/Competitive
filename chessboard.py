# import itertools 
# i , j , n = map(int , input().split())

# count = 0
# for _ in range(n):
# 	moves = list(itertools.product([i-1 , i+1], [j-2,j+2])) + list(itertools.product([i-2 , i+2], [j-1,j+1]))
# 	moves = [(i,j) for i,j in moves if i > 0 and j > 0 and i < 10  and j < 10]
# 	count += 1
# print(len(moves)*count)

def check(i , j):
	if((i>=0 and i<10) and (j>=0 and j<10)):
		return 1
	return 0

def knight(i , j , n):
	x = 0
	if(check(i , j) == 0 ):
		return 0


	if(n == 0):
		if(a[i][j] == 1):
			return 0

		a[i][j] = 1

		return 1
	x += knight(i-1, j-2, n-1)
	x += knight(i-2, j-1, n-1)
	x += knight(i-2, j+1, n-1)
	x += knight(i-1, j+2, n-1)
	x += knight(i+1, j-2, n-1)
	x += knight(i+2, j+1, n-1)
	x += knight(i+2, j-1, n-1)
	x += knight(i+1, j+2, n-1)
	return x;



i , j , n = map(int , input().split())
a = [[],[]]
for _i in range(i):
	for _j in range(j):
		a.append(0)



x = knight(i-1 ,j-1 ,n)
print(x)