from adapter import SocketWriter
from file_socket import log

SERV_SOCK = SocketWriter(8888, 7777)

try:
    while True:
        MSG, ADDR = SERV_SOCK.socket.recvfrom(1024)
        print(MSG.decode('utf-8'))
        ANS = 'Привет, клиент'
        log(ANS, SERV_SOCK)
finally:
    SERV_SOCK.socket.close()
