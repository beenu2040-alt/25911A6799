import numpy as np

# Create a simple 1D array
arr_1d = np.array([1, 2, 3, 4, 5])
print("1D Array:", arr_1d)

# Create a 2D array (matrix)
arr_2d = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
print("2D Array:\n", arr_2d)
a = np.array([10, 20, 30, 40])
b = np.array([1, 2, 3, 4])

# Element-wise addition
c = a + b
print("Addition:", c)

# Element-wise multiplication
d = a * b
print("Multiplication:", d)
arr = np.array([1, 2, 3, 4, 5])
mean_value = np.mean(arr)
print("Mean:", mean_value)

# Generate random numbers
random_array = np.random.rand(2, 2)
print("Random 2x2 Array:\n", random_array)
