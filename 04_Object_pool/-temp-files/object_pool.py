class StandardReport:

    def __init__(self):
        self.is_filled = False

    def reset(self):
        self.is_filled = True


class ReportsPool:
    def __init__(self, size):
        self.reports = [StandardReport() for _ in range(size)]

    def acquire(self):
        if self.reports:
            return self.reports.pop()
        else:
            self.reports.append(MyClass())
            return self.reports.pop()

    def release(self, reusable):
        reusable.reset()
        self.reports.append(reusable)


pool = ReportsPool(3)
print(pool.reports)

"""
[<__main__.StandardReport object at 0x000000E23CD74748>, 
<__main__.StandardReport object at 0x000000E23CD74828>, 
<__main__.StandardReport object at 0x000000E23CD74710>]
"""

reusable = pool.acquire()
print(reusable.is_filled)  # -> False

print(pool.reports)
"""
[<__main__.StandardReport object at 0x000000E23CD74748>, 
<__main__.StandardReport object at 0x000000E23CD74828>]
"""

pool.release(reusable)
print(reusable.is_filled)  # -> True

print(pool.reports)

"""
[<__main__.StandardReport object at 0x000000E23CD74748>, 
<__main__.StandardReport object at 0x000000E23CD74828>,
 <__main__.StandardReport object at 0x000000E23CD74710>]

"""
