def remove_dups(list):
    for k in list:
        if list.count(k)>1:
            del list[list.index(k)]
    
    
u_list=input(">").split()
print(u_list)
remove_dups(u_list)
print(u_list)












