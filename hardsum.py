#Hard Sum
N = int(input())
arr = []
for i in range(1,N+1):
	arr.append(i)
n = len(arr)
def pairAndSum(arr, n) : 
	ans = 0
	for i in range(0,n) : 
		for j in range((i+1),n) :

			ans  = ans +(((arr[i] | arr[j]) + (arr[j] | arr[i]) + (arr[j] | arr[j]) + (arr[i] | arr[i]))%(10**9+7))
			

	return ans
print(pairAndSum(arr, n)) 

