def palindrome(str):
    for i in range(0,int(len(str)/2)):
        if str[i]==str[len(str)-i-1]:
            return True
        else:
            return False
        


string =str(input(">"))
if palindrome(string):
    print("given string is palindrome")
else:
    print("given string is not palindrome")