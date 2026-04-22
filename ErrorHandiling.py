
try:
    a=int(input("enter a value: "))
    b=int(input("enter a value: "))
    c=a/b
    print(c)
except ValueError:
    print("value error occured \n enter correct integer values")
except ZeroDivisionError:
    print("cant divide by zero")
else:
    print("no exception")
finally:
    print("program ends")