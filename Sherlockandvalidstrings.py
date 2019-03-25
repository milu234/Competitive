import collections
s=input()
s = list(s)

char = dict(collections.Counter(s))
d= dict(collections.Counter(char.values()))

key = list(d.keys())
val = list(d.values())

count = dict()

if(len(key) == 1):
	print("YES")
elif(len(char) == 2):
	if(max(key) - min(key) == 1):
		print("YES")
	else:
		print("NO")
else:
	if(len(key) == 2 ):
		if(val[key.index(max(key))] > 1 and val[key.index(min(key))] > 1):
			print("NO")
		elif(val[key.index(max(key))]*max(key) == 1 or val[key.index(max(key))]*max(key)):
			print("YES")
		else:
			if(max(key) - min(key) == 1):
				print("YES")
			else:
				print("NO")
	else:
		print("NO")