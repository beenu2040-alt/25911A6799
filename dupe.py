def has_duplicate(mylist):
    for k in mylist:
        if mylist.count(k)>1:
            return True ,k ,mylist.count(k)
    return False,None,0

user=[x for x in input("input a list :").split()]
flag ,item ,count=has_duplicate(user)
if flag:
    print("The list has duplicate items")
    print("The item is",item)
    print("The count is",count)
else:
    print("The list has no duplicate items")
