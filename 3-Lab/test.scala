val x = 5
f()
g()

def f() = {
	val x = 10
	h()
}

def g() = {
	val x = 15
	h()
}

def h() = {
	print(x)
}