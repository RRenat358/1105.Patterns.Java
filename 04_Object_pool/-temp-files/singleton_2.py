class Singleton(type):

    def __init__(cls, name, bases, attrs):
        cls.__instance = None

    def __call__(cls, *args, **kwargs):
        if cls.__instance is None:
            cls.__instance = super().__call__(*args, **kwargs)
        return cls.__instance


class MySqlConnection(metaclass=Singleton):
    pass


sql_connection_1 = MySqlConnection()
sql_connection_2 = MySqlConnection()
sql_connection_3 = MySqlConnection()

print(sql_connection_1 is sql_connection_3)
