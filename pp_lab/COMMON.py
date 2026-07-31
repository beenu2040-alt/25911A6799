import numpy as np

array1= np.array([1,2,3,4,5])
array2= np.array([1,2,7,5,8])
print("array 1: ",array1)
print("array 2: ",array2)
print("common values amoung arrays: ",np.intersect1d(array1,array2))