"""Простейший декоратор-функция с параметром"""

from time import time


def out(num):
    def decorator(func):
        """Декоратор"""

        def wrapper():
            """Дополненная функция"""
            res = 0
            for el in range(num):
                start = time()
                func()
                end = time()
                delta = round(end - start, 5)
                res += delta

            print(
                f'Среднее выполнения исходной ф-ции: {round(res / num, 5)} секунд')

        return wrapper

    return decorator


@out(10)
def get_wp():
    pass


get_wp()

get_wp = out(10)(get_wp)
get_wp()