def binary(length,binary_string):
    if len(binary_string)==length:
        print(binary_string)
        return
    binary(length,binary_string + '0')
    binary(length,binary_string + '1')


n=int(input(">"))
print("binary numbers are")
binary(n,'')