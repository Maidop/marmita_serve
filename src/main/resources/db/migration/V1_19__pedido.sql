CREATE TABLE PEDIDO(
ID INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,
ID_CLIENTE INTEGER,
DATA Date NOT NULL,
CONSTRAINT FK_PEDIDO_CLIENTE FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTES (ID)
);

CREATE TABLE PEDIDO_TAMANHO(
ID INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,
ID_TAMANHO INTEGER NOT NULL,
ID_PEDIDO INTEGER NOT NULL,
QUANTIDADE INTEGER NOT NULL,
CONSTRAINT FK_PEDIDO_TAMANHO_TAMANHO FOREIGN KEY (ID_PEDIDO) REFERENCES PEDIDO (ID),
CONSTRAINT FK_PEDIDO_TAMANHO_PEDIDO FOREIGN KEY (ID_TAMANHO) REFERENCES TAMANHOS (ID)
);

