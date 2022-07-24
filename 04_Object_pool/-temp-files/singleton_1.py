class Origin:
    pass


o1 = Origin()
o2 = Origin()
o3 = Origin()

print(o1)
print(o2)
print(o3)

print(o1 is o2)

a = []
b = a
print(a is b)

b = a.copy()
print(a is b)
