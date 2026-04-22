a=int(input("enter a value"))
b=int(input("enter a value"))
try:
    c=a/b
    print(c)
except:
    print("exception raised")
else:
    print("no exception")
finally:
    print("program ends")