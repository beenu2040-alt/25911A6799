def add(n1,n2):
    return n1+n2
def sub(n1,n2):
    return n1-n2
def mul(n1,n2):
    return n1*n2
def div(n1,n2):
    return n1/n2
def mod(n1,n2):
    return n1%n2

a=float(input(">"))
c=str(input(">"))
b=float(input(">"))
if c=='+':
    print(add(a,b))
elif c=='-':
    print(sub(a,b))
elif c=='*':
    print(mul(a,b))
elif c=='/':
    if b==0:
        print("division not possible") 
    else:
        print(div(a,b))
elif c=='%':
    print(mod(a,b))
else:
    print("invalid input")