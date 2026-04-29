file1 = open('one.txt','r')
content1 = file1.read()
file1.close()
# Open the source text file - 2
file2 = open('two.txt','r')
content2 = file2.read()
file2.close()
# Open the destination file to merge content
file3 = open('three.txt','w')
file3.write(content1 + content2 )
file3.close()
# Print merge text file
file3 = open('three.txt','r')
print(file3.read())
file3.close()
