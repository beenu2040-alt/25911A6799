def is_sorted(userlist):
    new_list = sorted(userlist)
    if new_list == userlist:
        return True
    else:
        return False

userlist=[n for n in input("input a list of numbers:").split()]
print(is_sorted(userlist))