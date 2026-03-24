def remove_words(in_str,sub):
    my_list=in_str.split()
    for i in my_list:
        if i ==sub:
            del my_list[my_list.index(i)]
    final_string=' '
    for i in my_list :
        final_string=final_string+i+' '
    return final_string

str=input(">")
sub=input(">")
print(remove_words(str,sub))