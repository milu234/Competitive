
def lcs(X, Y, m, n):
	vowels = 'aeiouAEIOU'
	L = [[0 for x in range(n+1)] for x in range(m+1)] 

	# Following steps build L[m+1][n+1] in bottom up fashion. Note 
	# that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] 
	for i in range(m+1): 
		for j in range(n+1): 
			if i == 0 or j == 0: 
				L[i][j] = 0
			elif X[i-1] == Y[j-1]: 
				L[i][j] = L[i-1][j-1] + 1
			else: 
				L[i][j] = max(L[i-1][j], L[i][j-1]) 

	# Following code is used to print LCS 
	index = L[m][n] 

	# Create a character array to store the lcs string 
	lcs = [""] * (index+1) 
	lcs[index] = "" 

	# Start from the right-most-bottom-most corner and 
	# one by one store characters in lcs[] 
	i = m 
	j = n 
	while i > 0 and j > 0: 

		# If current character in X[] and Y are same, then 
		# current character is part of LCS 
		if X[i-1] == Y[j-1]: 
			lcs[index-1] = X[i-1] 
			i-=1
			j-=1
			index-=1

		# If not same, then find the larger of two and 
		# go in the direction of larger value 
		elif L[i-1][j] > L[i][j-1]: 
			i-=1
		else: 
			j-=1
	x = list(filter(None , lcs))
	print(len(x))
	count = sum([1 for char in ''.join(x) if char in vowels])
	print(len(x) - count)
	#lcs = list(lcs)		
	# print ((len(lcs)-lcs.count('a' or 'e' or 'i' or 'o' or 'u' or 'A' or 'E' or 'I' or 'O' or 'U')))
	

# Driver program 
X , Y  = input().split(" ")


m = len(X) 
n = len(Y) 
lcs(X, Y, m, n)
 

# This code is contributed by BHAVYA JAIN 
