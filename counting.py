def counting(filename):
	txt_file = open(filename , "r")
	no_of_vowels = 0
	no_of_words = 1
	no_of_lines = 1
	no_of_spaces = 0
	no_of_uppercase = 0
	no_of_lowercase = 0
	no_of_digits = 0
	# Make a vowels list
	vowels_list = ['a','e','i','o','u','A','E','I','O','U']
	# Iterate over the characters present in file
	for ch in txt_file.read():
		if ch == "\n" or ch == ' ':
			no_of_words = no_of_words + 1
		if ch == ' ':
			no_of_spaces = no_of_spaces + 1
		if ch in vowels_list:
			no_of_vowels = no_of_vowels + 1
		if ch == "\n":
			no_of_lines = no_of_lines + 1
		if(ord(ch) >= 97 and ord(ch) <= 122):
			no_of_lowercase = no_of_lowercase + 1
		if(ord(ch) >= 65 and ord(ch) <= 90):
			no_of_uppercase = no_of_uppercase + 1
		if(ord(ch) >= 48 and ord(ch) <= 57):
			no_of_digits = no_of_digits + 1
	# Print the desired output on the console.
	print(" Number of vowels = ", no_of_vowels)
	print(" Number of words = " , no_of_words)
	print(" Number of Blank spaces = " , no_of_spaces)
	print(" New Lines = " , no_of_lines)
	print(" Number of lower case characters in = " , no_of_lowercase)
	print(" Number of upper case characters = " , no_of_uppercase)
	print(" Number of digits = " , no_of_digits)
# Driver Code
filename = input(" Enter text file name = ")
counting(filename)
