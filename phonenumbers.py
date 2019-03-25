import itertools

letters_map = {
	'1':'-1',
	'2':'ABC',
	'3':'DEF',
	'4':'GHI',
	'5':'JKL',
	'6':'MNO',
	'7':'PQRS',
	'8':'TUV',
	'9':'WXYZ'
}


def possible_words(numbers):

	letters_to_combine = (letters_map[digit] for digit in numbers)
	for letters_group in itertools.product(*letters_to_combine):
		yield ''.join(letters_group)

T = input()
x = list(possible_words(T))
print(" ".join(str(i) for i in x))


