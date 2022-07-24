from time import time


class Decorator:
    """Класс-декоратор"""
    def __init__(self, num):
        self.num = num

    def __call__(self, func):
        def wrapper(*args, **kwargs):
            res = 0
            for el in range(self.num):
                start = time()
                func()
                end = time()
                delta = round(end - start, 5)
                res += delta

            print(
                f'Среднее выполнения исходной ф-ции: {round(res / self.num, 5)} секунд')

        return wrapper


def get_wp():
    pass


res = Decorator(10)(get_wp)
res()