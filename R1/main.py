import math

def sum(a, b):
    return a + b

def mult(a, b):
    return a * b

def div(a, b):
    return a // b

def power(a, b):
	x = 1
	while b > 0:
		b -= 1
		x *= a
	return x

def minus(a, b):
	return a - b

def max(a, b):
	if a > b:
		return a
	return b

def min(a, b):
	if a < b:
		return a
	return b

def exponential(a):
	return math.exp(a)
