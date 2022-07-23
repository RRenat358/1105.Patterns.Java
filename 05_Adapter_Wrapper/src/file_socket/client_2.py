from adapter import SocketWriter
from file_socket import log


CLIENT_SOCK = SocketWriter(7777, 8888)

try:
    MES = 'Привет, сервер'
    log(MES, CLIENT_SOCK)
    MSG, ADDR = CLIENT_SOCK.socket.recvfrom(128)
    print(MSG.decode('utf-8'))
finally:
    CLIENT_SOCK.socket.close()