from socket import socket, AF_INET, SOCK_DGRAM


class SocketWriter:
    def __init__(self, port_from, port_to):
        self.socket = socket(AF_INET, SOCK_DGRAM)
        self.port_to = port_to

        self.socket.bind(('', port_from))

    def write(self, message):
        addr_to = ('127.0.0.1', self.port_to)
        self.socket.sendto(message.encode('utf-8'), addr_to)
