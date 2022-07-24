from time import time


class Decorator:
    """Класс-декоратор"""

    def __call__(self, func):
        def wrapper(*args, **kwargs):
            start = time()
            func()
            end = time()
            print(
                f'Время выполнения исходной ф-ции: {round(end - start, 5)} секунд')

        return wrapper


#@Decorator()
def get_wp():
    print('Выполняем расчет')


get_wp()
