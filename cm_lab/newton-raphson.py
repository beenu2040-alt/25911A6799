from math import *
import numpy as np
import sympy as sp
import matplotlib.pyplot as plt


def f(x):
    return eval(function)


def dif(x):
    return eval(derivative)


function = input("Enter function: ")

x = sp.Symbol('x')

df = sp.diff(sp.sympify(function), x)
derivative = str(df)

a = float(input("Enter lower limit: "))
b = float(input("Enter upper limit: "))
tolerance = float(input("Enter tolerance: "))

if f(a) * f(b) > 0:
    print("Invalid interval: f(a) and f(b) must have opposite signs")

else:
    x0 = (a + b) / 2

    while True:
        x1 = x0 - f(x0) / dif(x0)

        if abs(x1 - x0) < tolerance:
            print("Approximate root =", round(x1, 6))
            break
        else:
            x0 = x1

    # Plot
    plt.axhline(0, color="black")
    plt.axvline(0, color="black")
    plt.grid(True)

    plt.xlabel("x")
    plt.ylabel("f(x)")
    plt.title("Newton-Raphson Method")

    left = max(0.001, x1 - 5)
    x_values = np.linspace(left, x1 + 5)
    y_values = [f(i) for i in x_values]

    plt.plot(x_values, y_values, label="f(x)")
    plt.scatter(
        x1,
        f(x1),
        color="red",
        label="Approximate root"
    )

    plt.legend()
    plt.show()