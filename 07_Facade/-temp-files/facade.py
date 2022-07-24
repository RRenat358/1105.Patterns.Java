class Drom:
    def russian_auto(self):
        print('prices of russian cars on site 1')

    def foreign_auto(self):
        print('prices of foreign cars on site 1')


class Auto:
    def russian_auto(self):
        print('prices of russian cars on site 2')

    def foreign_auto(self):
        print('prices of foreign cars on site 2')


class Avito:
    def russian_auto(self):
        print('prices of russian cars on site 2')

    def foreign_auto(self):
        print('prices of foreign cars on site 2')




"""
parser_1 = Drom()
parser_2 = Auto()
parser_3 = Avito()

parser_1.russian_auto()
parser_2.russian_auto()
parser_3.russian_auto()

parser_1.foreign_auto()
parser_2.foreign_auto()
parser_3.foreign_auto()

"""


class FacadeSiteChecker:
    def __init__(self):
        self._subsys_1 = Drom()
        self._subsys_2 = Auto()
        self._subsys_3 = Avito()

    def russian_auto(self):
        self._subsys_1.russian_auto()
        self._subsys_2.russian_auto()
        self._subsys_3.russian_auto()

    def foreign_auto(self):
        self._subsys_1.foreign_auto()
        self._subsys_2.foreign_auto()
        self._subsys_3.foreign_auto()


facade_site_checker = FacadeSiteChecker()
facade_site_checker.russian_auto()
facade_site_checker.foreign_auto()

#  - Django - веб-Django - user
# Flask
