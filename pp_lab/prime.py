def primes_in(start,end):
    print("prime numbers between",start,end,sep=" ")
    for num in range(start,end):
        count=0
        for i in range(2,num):
            if (num%i==0):
                count+=1         
        if (count==0):
            print(num)   
    
       
s=int(input("start: "))
e=int(input("end: "))
primes_in(s,e)