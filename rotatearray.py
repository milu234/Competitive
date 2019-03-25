firstLineNumbers = list(map(int , input().split()))

N = firstLineNumbers[0]
D = firstLineNumbers[1]

arr = list(map(int , input().split()))

temp_arr = arr[:]


for i in range(0,N):
	new_index = i -D
	if new_index < 0:
		new_index = N + new_index
	temp_arr[new_index] = arr[i]

	

print(" ".join(str(x) for x in temp_arr))