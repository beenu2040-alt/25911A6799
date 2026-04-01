R=int(input("rows:"))
C=int(input("columns:"))
matrix=[]
print("enter the entries row-wise")
for i in range(R):
    a=[]
    for j in range(C):
        a.append(int(input(">")))
    matrix.append(a)
print()

print("matrix values are")
for i in range(R):
    for j in range(C):
        print(matrix[i][j],end=' ')
    print()