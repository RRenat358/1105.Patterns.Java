from socket import socket, AF_INET, SOCK_DGRAM

SERV_SOCK = socket(AF_INET, SOCK_DGRAM)
SERV_SOCK.bind(('localhost', 8888))

try:
    while True:
        MSG, ADDR = SERV_SOCK.recvfrom(1024)
        print(ADDR)
        print(MSG.decode('utf-8'))
        ANS = 'Привет, клиент'
        SERV_SOCK.sendto(ANS.encode('utf-8'), ADDR)
finally:
    SERV_SOCK.close()
