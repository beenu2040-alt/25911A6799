import re
# Make a regular expression for validating an Email
regex = r'^\b[A-Za-z0-9._%+-]+[@]\w[A-Za-z]+[.]\w[A-Z|a-z]{2,5}$'
# Make a regular expression for validating a Phone Number
Pattern = '^\\+?[6-9][0-9]{9}$'
# Define a function for validating an Email
def is_check_email(email):
	if(re.fullmatch(regex,email)):
		print(" Valid Email - ID ")
	else:
		print(" Invalid Email - ID ")
# Define a function for validating a PHONE NUMBER
def is_check_Phone_number(mobile_no):
	if(re.search(Pattern,mobile_no)):
		print(" Valid Phone Number ")
	else:
		print(" Invalid Phone Number ")
# Driver Code
if __name__ == '__main__':
	email = input(" Enter your MAIL-ID = ")
	phone_number = input(" Enter your PHONE NUMBER = ")
	is_check_email(email)
	is_check_Phone_number(phone_number)


