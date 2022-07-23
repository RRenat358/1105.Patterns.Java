class NewClass:
    pass


obj = NewClass()
obj()


class NewClass:
    def __call__(self, *args, **kwargs):
        pass


obj = NewClass()
obj()
