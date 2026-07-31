def search_str(file_path):
	search_word = input(" Enter a word you want to search in file : ")
	with open(file_path , 'r') as file :
		# read all content of a file
		content = file.readlines()
		# check if string present in a file
		for word in content :
			if word.find(search_word) != -1:
				print('The search word exists in the file & available at line = ' ,content.index(word))
				break
			else :
				print(" string does not exist in a file ")
	file.close()

file = open("three.txt",'w')
Lines = ["Hai \n ","This is Python Programming \n ","Welcome to study glance \n "]
file.writelines(Lines)
file.close()
search_str('three.txt')
