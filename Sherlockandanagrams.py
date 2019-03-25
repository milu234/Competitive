T = int(input().strip())
for a0 in range(T):
	s = input().strip()
	anagram_dict = {}
	count = 0
	for i in range(1 , len(s)):
		for j in range(len(s) - i + 1):
			current_sorted = str(sorted(s[j:j+i]))
			if current_sorted not in anagram_dict:
				anagram_dict[current_sorted] = 1
			else:
				count += anagram_dict[current_sorted]
				anagram_dict[current_sorted] += 1
	print(count)