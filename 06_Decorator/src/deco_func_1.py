"""Простейший декоратор-функция"""

from time import time


def decorator(func):
    """Декоратор"""
    def wrapper():
        """Дополненная функция"""
        start = time()
        func()
        end = time()
        print(f'Время выполнения исходной ф-ции: {round(end-start, 5)} секунд')
    return wrapper


def get_wp():
    print('Выполняем расчет')


res = decorator(get_wp)
print(res)

res()
