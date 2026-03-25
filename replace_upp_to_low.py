def replace(str_in):
    x=list(str_in)
    i=0
    while i<len(x):
        if i==0:
            if ord(x[i])>=97 and ord(x[i])<=122:
                x[i]=chr(ord(x[i])-32)
        elif x[i]==' ':
            i+=1
            if ord(x[i])>=97 and ord(x[i])<=122:
                x[i]=chr(ord(x[i])-32)
        else:
            if ord(x[i])>=65 and ord(x[i])<=90:
                x[i]=chr(ord(x[i])+32)
       
        i+=1
    str_out=' '
    for j in x:
        str_out=str_out+j   
    return str_out

string=input(">")
print(replace(string))