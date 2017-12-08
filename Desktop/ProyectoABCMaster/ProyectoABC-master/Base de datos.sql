DROP TABLE IF EXISTS Administradores CASCADE;
CREATE TABLE Administradores (

	usuario VARCHAR(20) NOT NULL PRIMARY KEY,
	contrasena VARCHAR(20) NOT NULL
);

INSERT INTO Administradores (usuario, contrasena) 
VALUES ('admin', '12345678');


DROP TABLE IF EXISTS Operadores CASCADE;
CREATE TABLE Operadores (

	cedula_op VARCHAR(10) NOT NULL PRIMARY KEY,
	primer_nombre VARCHAR(20) NOT NULL,
  	segundo_nombre VARCHAR(20),
  	primer_apellido VARCHAR(20) NOT NULL,
  	segundo_apellido VARCHAR(20),
  	fecha_nacimiento DATE NOT NULL,
  	email VARCHAR(30),
  	telefono VARCHAR(10),
  	celular VARCHAR(10) NOT NULL,
  	estado VARCHAR(10) NOT NULL,
  	contrasena VARCHAR(20) NOT NULL,
  	pregunta VARCHAR(50) NOT NULL,
  	respuesta VARCHAR(20) NOT NULL
);

INSERT INTO Operadores (cedula_op, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1010059777', 'Ivan', 'Mauricio', 'Toro', 'Cifuentes', '1998-03-16', 'ivan.toro@hotmail.com', '568402', '3164875865', 'Activo', '87654321', '¿Scorpion?', 'Hanzo Hasashi');

INSERT INTO Operadores (cedula_op, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, email, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1012034621', 'Jhon', 'Alejandro', 'Orobio', 'Arce', '1990-06-05', 'jhaloraro@gmail.com', '3204759210', 'Activo', '11111111', '¿Vivienda?', 'Palmira');

INSERT INTO Operadores (cedula_op, primer_nombre, primer_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1010059779', 'Andrea', 'Bernal', '1997-11-26', 'andrea@gmail.com', '562035', '3014875400', 'Activo', '67891011', '¿Deporte?', 'Voleyball');

INSERT INTO Operadores (cedula_op, primer_nombre, primer_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1011200933', 'Javier', 'Palacios', '1999-09-04', 'palacios@outlook.com', '063489', '3125978043', 'Inactivo', 'apple12345', '¿Transporte?', 'Uber');

INSERT INTO Operadores (cedula_op, primer_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, email, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1010144900', 'Alexandra', 'Lopez', 'Obando', '1997-08-14', 'lopez.obando@hotmail.com', '3157225490', 'Activo', '666777888', '¿Arbol?', 'Almendro');

INSERT INTO Operadores (cedula_op, primer_nombre, primer_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1020067983', 'Carlos', 'Tovar', '1996-03-17', 'code@gmail.com', '983712', '3208935468', 'Activo', 'balonbalon', '¿Alterego?', 'Mickey Mouse');

INSERT INTO Operadores (cedula_op, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1019965328', 'Paula', 'Andrea', 'Rodriguez', 'Gutierrez', '1998-05-25', 'paula.rodriguez@gmail.com', '007632', '3153986590', 'Activo', '90807060', '¿Universidad?', 'UAO');

INSERT INTO Operadores (cedula_op, primer_nombre, segundo_nombre, primer_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1030706620', 'Jhon', 'Hadder', 'Diaz', '1995-12-24', 'hadderinc@outlook.com', '094512', '3214996372', 'Activo', 'xboxhalo', '¿Comida?', 'Combo namber 1');

INSERT INTO Operadores (cedula_op, primer_nombre, primer_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1032254856', 'Jose', 'Vargas', '1998-11-18', 'mamian.jose@hotmail.com', '657432', '3085876591', 'Activo', '012343210', '¿Dinastia?', 'Mamian');

INSERT INTO Operadores (cedula_op, primer_nombre, primer_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1065482475', 'Fabian', 'Trujillo', '1998-11-18', 'mamian.fabo@hotmail.com', '657432', '3085876591', 'Activo', 'motoscarros', '¿Internet?', 'Olx');


DROP TABLE IF EXISTS Gerentes CASCADE;
CREATE TABLE Gerentes (

	cedula_ge VARCHAR(10) NOT NULL PRIMARY KEY,
	primer_nombre VARCHAR(20) NOT NULL,
	segundo_nombre VARCHAR(20),
	primer_apellido VARCHAR(20) NOT NULL,
	segundo_apellido VARCHAR(20),
	fecha_nacimiento DATE NOT NULL,
	email VARCHAR(30),
	telefono VARCHAR(10) ,
	celular VARCHAR(10) NOT NULL,
	estado VARCHAR(10) NOT NULL,
	contrasena VARCHAR(20) NOT NULL,
	pregunta VARCHAR(50) NOT NULL,
	respuesta VARCHAR(20) NOT NULL
);

INSERT INTO Gerentes (cedula_ge, primer_nombre, primer_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1010059775', 'Daniela', 'Sarria', '1996-10-02', 'sarria.daniela@outlook.com', '325478', '3204355710', 'Activo', '19876543', '¿Color?', 'Rojo');

INSERT INTO Gerentes (cedula_ge, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1010059773', 'Claudia', 'Lorena', 'Alzate', 'Lopez', '1999-04-20', 'cllo@gmail.com', '996482', '308254291', 'Activo', '135791113', '¿Animal?', 'Gato');

INSERT INTO Gerentes (cedula_ge, primer_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1010059333', 'Sofia', 'Toro', 'Cifuentes', '1999-05-18', 'sofi.toro@gmail.com', '092742', '3205831638', 'Activo', '11223344', '¿Hobbie?', 'Bailar');

INSERT INTO Gerentes (cedula_ge, primer_nombre, segundo_nombre, primer_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1020043972', 'Annie', 'Sofia', 'Rivera', '1995-01-23', 'annie@outlook.com', '963472', '3109234943', 'Activo', '44332211', '¿Dia?', 'Sabado');

INSERT INTO Gerentes (cedula_ge, primer_nombre, primer_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1030145229', 'Sara', 'Lopez', '1995-06-22', 'lopezs@gmail.com', '998877', '3201243876', 'Inactivo', '777666555', '¿Cabello?', 'Corto');

INSERT INTO Gerentes (cedula_ge, primer_nombre, primer_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1011059723', 'Mateo', 'Ruiz', '1997-02-17', 'mateoruiz@hotmail.com', '008822', '3213678397', 'Activo', '22222222', '¿Color?', 'Amarillo');

INSERT INTO Gerentes (cedula_ge, primer_nombre, primer_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1056326787', 'Bruno', 'Vasquez', '1995-12-31', 'bruno@gmail.com', '876543', '3213450976', 'Inactivo', '12345678', '¿Musica?', 'Pop');

INSERT INTO Gerentes (cedula_ge, primer_nombre, primer_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1090087543', 'Maria', 'Torres', '1997-10-21', 'torres@outlook.com', '986532', '3109886543', 'Activo', '000999111', '¿Ajedrez?', 'Torre');

INSERT INTO Gerentes (cedula_ge, primer_nombre, primer_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1020076123', 'Paola', 'Alarcon', '1999-03-12', 'alarcon@gmail.com', '986532', '3004543251', 'Inactivo', '98765432', '¿Animal?', 'Alcon');

INSERT INTO Gerentes (cedula_ge, primer_nombre, primer_apellido, fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1012087964', 'Alejandra', 'Valencia', '1997-12-12', 'valencia@gmail.com', '112244', '3103465789', 'Activo', '12356790', '¿Presidente?', 'Uribe');


DROP TABLE IF EXISTS Eventos CASCADE;
CREATE TABLE Eventos (

	id_evento VARCHAR(20) NOT NULL PRIMARY KEY,
	nombre_evento VARCHAR(30) NOT NULL,
	fecha DATE NOT NULL,
	precio INTEGER NOT NULL,
	lugar  VARCHAR(30) NOT NULL,
	duracion VARCHAR(10),
	tema VARCHAR(30),
	cupos INTEGER NOT NULL,
	cedula_ge VARCHAR(10) NOT NULL
);

INSERT INTO Eventos (id_evento, nombre_evento, fecha, precio, lugar, duracion, tema, cupos, cedula_ge)
VALUES ('100', 'Tomorrowland', '2017-12-10', 1000000, 'Bogota', '10:00:00', 'Musica', 1000, '1010059773');

INSERT INTO Eventos (id_evento, nombre_evento, fecha, precio, lugar, duracion, tema, cupos, cedula_ge)
VALUES ('101', 'CaliDev', '2017-12-27', 50000, 'Cali', '10:15:00', 'Programacion', 200, '1010059333');

INSERT INTO Eventos (id_evento, nombre_evento, fecha, precio, lugar, cupos, cedula_ge)
VALUES ('102', 'OktoberFest', '2018-10-01', 20000, 'Popayan', 500, '1020043972');

INSERT INTO Eventos (id_evento, nombre_evento, fecha, precio, lugar, duracion, tema, cupos, cedula_ge)
VALUES ('103', 'FoodFest', '2018-03-21', 150000, 'Medellin', '15:30:00', 'Comida', 1000, '1056326787');

INSERT INTO Eventos (id_evento, nombre_evento, fecha, precio, lugar, duracion, tema, cupos, cedula_ge)
VALUES ('104', 'Esgrima artistica', '2017-11-26', 10000, 'Cartagena', '05:00:00', 'Arte', 150, '1012087964');

INSERT INTO Eventos (id_evento, nombre_evento, fecha, precio, lugar, cupos, cedula_ge)
VALUES ('105', 'Comic plus', '2018-06-17', 200000, 'Barranquilla', 2000, '1020076123');

INSERT INTO Eventos (id_evento, nombre_evento, fecha, precio, lugar, duracion, tema, cupos, cedula_ge)
VALUES ('106', 'E3', '2018-05-10', 300000, 'San Francisco', '15:00:00', 'Videojuegos', 2000, '1020076123');

INSERT INTO Eventos (id_evento, nombre_evento, fecha, precio, lugar, cupos, cedula_ge)
VALUES ('107', 'Feria de la salsa', '2019-01-12', 50000, 'New York', 200, '1010059775');

INSERT INTO Eventos (id_evento, nombre_evento, fecha, precio, lugar, cupos, cedula_ge)
VALUES ('108', 'Google', '2018-07-27', 200000, 'San Jose', 500, '1010059773');

INSERT INTO Eventos (id_evento, nombre_evento, fecha, precio, lugar, cupos, cedula_ge)
VALUES ('109', 'Crossfit time', '2018-02-10', 40000, 'Miami', 300, '1056326787');


DROP TABLE IF EXISTS Sedes CASCADE;
CREATE TABLE Sedes (

	id_sede VARCHAR(20) NOT NULL PRIMARY KEY,
	nombre_sede VARCHAR(30) NOT NULL,
	ciudad VARCHAR(20) NOT NULL,
	calle VARCHAR(10) NOT NULL,
	carrera  VARCHAR(10) NOT NULL,
	barrio VARCHAR(20),
	telefono VARCHAR(10) NOT NULL,
	cedula_ge VARCHAR(10) NOT NULL
);

INSERT INTO Sedes (id_sede, nombre_sede, ciudad, calle, carrera, barrio, telefono, cedula_ge)
VALUES ('001', 'ABC Cali', 'Cali', 'Calle 5', 'Carrera 92', 'El Ingenio', '235489', '1010059775');

INSERT INTO Sedes (id_sede, nombre_sede, ciudad, calle, carrera, barrio, telefono, cedula_ge)
VALUES ('002', 'ABC Medellin', 'Medellin', 'Calle 9', 'Carrera 12', 'Poblado', '436790', '1010059773');

INSERT INTO Sedes (id_sede, nombre_sede, ciudad, calle, carrera, telefono, cedula_ge)
VALUES ('003', 'ABC Bogota', 'Bogota', 'Calle 20', 'Carrera 8', '952845', '1010059333');

INSERT INTO Sedes (id_sede, nombre_sede, ciudad, calle, carrera, barrio, telefono, cedula_ge)
VALUES ('004', 'ABC Miami', 'Miami', 'Calle 10', 'Carrera 21', 'Miami Beach', '017623', '1030145229');

INSERT INTO Sedes (id_sede, nombre_sede, ciudad, calle, carrera, barrio, telefono, cedula_ge)
VALUES ('005', 'ABC San Francisco', 'San Francisco', 'Calle 50', 'Carrera 93', 'Mountain View', '347690', '1020043972');


DROP TABLE IF EXISTS Participantes CASCADE;
CREATE TABLE Participantes (

	cedula_pa VARCHAR(10) NOT NULL PRIMARY KEY,
	primer_nombre VARCHAR(20) NOT NULL,
	segundo_nombre VARCHAR(20),
	primer_apellido VARCHAR(20) NOT NULL,
	segundo_apellido VARCHAR(20),
	fecha_nacimiento DATE,
	telefono VARCHAR(10) NOT NULL,
	email VARCHAR(30)
);

INSERT INTO Participantes (cedula_pa, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, telefono, email) 
VALUES ('1234567890', 'Luis', 'Hernando', 'Granja', 'Montano', '1996-01-12', '3163125498', 'luis.granja@gmail.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, telefono, email)
VALUES ('0987654321', 'Carlona', 'Dorado', 'Ruiz', '1997-01-03', '3183618498', 'caro.doradod@outlook.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, segundo_nombre, primer_apellido, fecha_nacimiento, telefono, email) 
VALUES ('1234509876', 'Jhoan', 'Sebastian', 'Villegas', '1996-11-29', '3113120088', 'jhoan.villegas@gmail.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, telefono, email) 
VALUES ('0965213478', 'Juan', 'Jose', 'Vargas', 'Vargas', '1999-12-10', '3040725378', 'vargas.vargas@gmail.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, telefono, email) 
VALUES ('1020304050', 'Juan', 'David', 'Torres', 'Canon', '1995-03-12', '3086247619', 'kraken.torres@hotmail.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, fecha_nacimiento, telefono, email) 
VALUES ('1020301020', 'Diana', 'Garcia', '1997-07-02', '3104985217', 'digar@outlook.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, fecha_nacimiento, telefono, email) 
VALUES ('1002003004', 'Camilo', 'Diaz', '1995-09-21', '3049654328', 'diazcamilo@hotmail.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, telefono, email) 
VALUES ('1012023039', 'Deiferson', 'Bocanegra', 'Duque', '1997-02-18', '3039876543', 'bocanegra@gmail.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, telefono, email) 
VALUES ('1009007003', 'Julian', 'Ruiz', 'Cuervo', '1996-01-14', '3116981124', 'cuervo.ruiz@gmail.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, fecha_nacimiento, telefono, email) 
VALUES ('1112223334', 'Claudia', 'Perez', '1995-03-09', '3077980066', 'claudia.perez@outlook.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, fecha_nacimiento, telefono, email) 
VALUES ('1122304455', 'Monica', 'Perez', '1997-11-08', '3020908070', 'monica.perez@gmail.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, fecha_nacimiento, telefono, email) 
VALUES ('5008004442', 'Harrison', 'Acosta', '1996-08-10', '3008435561', 'acostaharri@gmail.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, fecha_nacimiento, telefono, email) 
VALUES ('5114223334', 'Alexis', 'Restrepo', '1994-12-01', '3123547698', 'alexrestre@hotmail.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, fecha_nacimiento, telefono, email) 
VALUES ('9887665443', 'Fernanda', 'Lopez', '1998-03-31', '3217986432', 'fer.lop@outlook.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, fecha_nacimiento, telefono, email) 
VALUES ('5437658952', 'Daniela', 'Grisales', '1997-06-06', '3067534211', 'danielagrisales@gmail.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, fecha_nacimiento, telefono, email) 
VALUES ('6007744221', 'Melissa', 'Millares', '1996-04-08', '3100653491', 'millares@gmail.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, fecha_nacimiento, telefono, email) 
VALUES ('2347650981', 'Melissa', 'Sarmiento', '1998-01-21', '3123547698', 'meli.sarmi@hotmail.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, telefono, email) 
VALUES ('8765876591', 'Daniela', 'Lopez', 'Gomez', '1997-12-15', '3009875612', 'dalogo@outlook.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, telefono, email) 
VALUES ('9089786755', 'Jazmin', 'Sanchez', 'Ceballos', '1994-08-11', '3087654321', 'jazmin.sanchez@gmail.com');

INSERT INTO Participantes (cedula_pa, primer_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, telefono, email) 
VALUES ('3450982176', 'Santiago', 'Fonseca', 'Vaca', '1990-12-12', '3257897687', 'fonseca.vaca@gmail.com');


DROP TABLE IF EXISTS Participantes_Eventos CASCADE;
CREATE TABLE Participantes_Eventos (

	id_participante VARCHAR(10) NOT NULL,
	id_evento VARCHAR(20) NOT NULL,
	estado_pago VARCHAR(10) NOT NULL,
	cedula_op VARCHAR(10) NOT NULL,
	PRIMARY KEY (id_participante, id_evento),
	FOREIGN KEY (id_participante) REFERENCES Participantes (cedula_pa) ON UPDATE CASCADE,
	FOREIGN KEY (id_evento) REFERENCES Eventos (id_evento) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1234567890', '100', 'Valido', '1010059777');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1234567890', '103', 'Valido', '1012034621');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1234567890', '107', 'Invalido', '1010059779');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('0987654321', '102', 'Valido', '1020067983');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('0987654321', '104', 'Valido', '1012034621');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('0987654321', '107', 'Valido', '1010059779');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1234509876', '109', 'Invalido', '1010059777');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1234509876', '105', 'Valido', '1012034621');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1234509876', '104', 'Invalido', '1010059779');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('0965213478', '102', 'Invalido', '1011200933');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('0965213478', '103', 'Valido', '1010144900');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('0965213478', '106', 'Valido', '1020067983');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1020304050', '107', 'Invalido', '1011200933');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1020304050', '104', 'Valido', '1010144900');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1020304050', '105', 'Valido', '1020067983');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1020301020', '106', 'Invalido', '1019965328');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1020301020', '103', 'Valido', '1030706620');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1020301020', '101', 'Valido', '1032254856');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1002003004', '109', 'Valido', '1019965328');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1002003004', '108', 'Valido', '1030706620');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1012023039', '102', 'Invalido', '1065482475');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1009007003', '106', 'Valido', '1030706620');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1112223334', '100', 'Valido', '1019965328');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1112223334', '104', 'Invalido', '1011200933');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1112223334', '109', 'Valido', '1010059777');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('1122304455', '104', 'Valido', '1011200933');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('5008004442', '107', 'Valido', '1030706620');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('5114223334', '102', 'Invalido', '1020067983');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('5114223334', '105', 'Valido', '1010059777');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('9887665443', '104', 'Valido', '1020067983');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('9887665443', '108', 'Valido', '1010059777');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('5437658952', '105', 'Invalido', '1012034621');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('5437658952', '108', 'Valido', '1012034621');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('6007744221', '103', 'Valido', '1011200933');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('2347650981', '108', 'Valido', '1012034621');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('8765876591', '102', 'Valido', '1011200933');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('8765876591', '104', 'Valido', '1010059777');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('9089786755', '107', 'Valido', '1010144900');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('3450982176', '108', 'Invalido', '1010144900');

INSERT INTO Participantes_Eventos (id_participante, id_evento, estado_pago, cedula_op)
VALUES ('3450982176', '109', 'Valido', '1010144900');
