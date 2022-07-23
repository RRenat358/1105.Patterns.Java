# Наследование vs Композиция


# Наследование
class Animal:
    def say(self):
        pass


class Cat(Animal):
    def say(self):
        pass


class Engine:
    def move(self):
        print('Move')


# Машина не является двигателем?
class Car:
    pass


car = Car()
car.move()


# Композиция
# Двигатель это часть машины
class Car:

    def __init__(self, engine):
        self.engine = engine

    def change_engine(self, engine):
        self.engine = engine


engine = Engine()
car = Car(engine)

car.engine.move()
