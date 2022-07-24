from datetime import datetime


def log(message, f_obj):
    f_obj.write(f'[{datetime.now()}] - {message}')


f_obj = open("output_file.txt", 'w', encoding='utf-8')
log('Привет, как дела', f_obj)
