from socket import socket, AF_INET, SOCK_DGRAM

CLIENT_SOCK = socket(AF_INET, SOCK_DGRAM)
CLIENT_SOCK.bind(('localhost', 7777))

try:
    MES = 'Привет, сервер'
    CLIENT_SOCK.sendto(MES.encode('utf-8'), ('localhost', 8888))
    MSG, ADDR = CLIENT_SOCK.recvfrom(128)
    print(MSG.decode('utf-8'))
finally:
    CLIENT_SOCK.close()
