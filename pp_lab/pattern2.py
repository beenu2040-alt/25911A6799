n=int(input(">"))
for i in range(n,0,-1):
    for j in range(i,n+1):
        print(i,end="")
    for k in range(0,(i-1)*2):
        print(" ",end="")
    for j in range(i,n+1):
        print(i,end="")
    print()
    