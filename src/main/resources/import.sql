/* Populate tables */

INSERT INTO roles (nombre) VALUES ('ADMIN');
INSERT INTO roles (nombre) VALUES ('USER');

INSERT INTO clientes (nombre, apellido, email, foto, create_at) VALUES('Antonio', 'Sudon', 'antonio@mail.com', '', '2022-08-28');
INSERT INTO clientes (nombre, apellido, email, foto, create_at) VALUES('Jorge', 'Parra', 'jorge@@mail.com', '','2022-08-28');
INSERT INTO clientes (nombre, apellido, email, foto, create_at) VALUES('Sergio', 'Matamoros', 'sergio@mail.com', '','2022-08-28');
INSERT INTO clientes (nombre, apellido, email, foto, create_at) VALUES('Eufemia', 'Do Sacramento', 'eufemia@mail.com', '','2022-08-28');
INSERT INTO clientes (nombre, apellido, email, foto, create_at) VALUES('Nahia', 'Fernandez', 'nahia@mail.com', '','2022-08-28');
INSERT INTO clientes (nombre, apellido, email, foto, create_at) VALUES('Rosendo', 'Trinidad', 'rosendo@mail.com', '','2022-08-28');
INSERT INTO clientes (nombre, apellido, email, foto, create_at) VALUES('Adrian', 'Rodriguez', 'adrian@mail.com', '','2022-08-28');
INSERT INTO clientes (nombre, apellido, email, foto, create_at) VALUES('Felipe Alejando', 'Borjas', 'felipe@mail.com', '','2022-08-28');


INSERT INTO productos (nombre, precio, create_at, descripcion, foto) VALUES('Stand Smartphone',3,'2023-03-01','Practico stand para colocar el smartphone en el escritorio, compatible con cable de carga.','');
INSERT INTO productos (nombre, precio, create_at, descripcion, foto) VALUES('Organizador Tornillos',14,'2023-03-01','Organizador para tornillos, tuercas, arandelas o lo que necesites.','');
INSERT INTO productos (nombre, precio, create_at, descripcion, foto) VALUES('Carcasa NES',30,'2023-03-01','Carcasa para proyecto Raspberry Pi de la NES','');
INSERT INTO productos (nombre, precio, create_at, descripcion, foto) VALUES('Hucha',10,'2023-03-01','Una hucha con forma de cerdo','');
INSERT INTO productos (nombre, precio, create_at, descripcion, foto) VALUES('Ajedrez',55,'2023-03-01','Piezas de ajedrez de estilo moderno, ¡Jaque Mate!','');
INSERT INTO productos (nombre, precio, create_at, descripcion, foto) VALUES('Baby Yoda',13,'2023-03-01','Figura de coleccion de la serie Mandalorian de StarWars','');
INSERT INTO productos (nombre, precio, create_at, descripcion, foto) VALUES('Macetero',25,'2023-03-01','Pequeño macetero de interior con autoriego','');

INSERT INTO facturas (descripcion, observaciones, cliente_id, create_at) VALUES('Factura de algunos Productos', null, 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(2, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 2);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 4);

INSERT INTO facturas (descripcion, observaciones, cliente_id, create_at) VALUES('Factura carcasa NES', null, 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 2, 3);