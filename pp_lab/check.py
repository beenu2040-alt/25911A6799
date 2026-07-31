def check(ch):
    if (ch>='A'and ch<='Z'):
        print(ch,"is a uppercase character",sep=" ")
    elif(ch>='a'and ch<='z'):
        print(ch,"is a lowercase character",sep=" ")
    elif(ch>='0' and ch<='9'):
        print(ch,"is a digit",sep=" ")
    else:
        print(ch,"is a special character",sep=" ")

n=input(">")
check(n)