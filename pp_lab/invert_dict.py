import ast
def swap_dict(old_dict):
    return { value : key for key ,value in old_dict.items() }

old_dict =input(">")
old_dict=ast.literal_eval(old_dict)
print(swap_dict(old_dict))
