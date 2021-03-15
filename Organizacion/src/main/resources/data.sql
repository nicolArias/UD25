DROP TABLE IF EXISTS Departamentos;
DROP TABLE IF EXISTS Empleados;

CREATE TABLE Departamentos(
codigo INT PRIMARY KEY,
nombre VARCHAR(100),
presupuesto INT);

CREATE TABLE Empleados(
dni VARCHAR(8) PRIMARY KEY,
nombre VARCHAR(100),
apellidos VARCHAR(100),
departamento_cod INT,
CONSTRAINT departamento_fk
FOREIGN KEY (departamento_cod)
REFERENCES Departamentos(codigo)
ON DELETE NO ACTION
ON UPDATE CASCADE);


INSERT INTO Departamentos VALUES(1,'IT',60000);
INSERT INTO Departamentos VALUES(2,'Test',23000);
INSERT INTO Departamentos VALUES(3,'Account Manager',30000);
INSERT INTO Departamentos VALUES(4,'Centro de Control',60000);
INSERT INTO Departamentos VALUES(5,'Administracion',80000);

INSERT INTO Empleados VALUES('5548756Z','Nicol','Arias Lebro',1);
INSERT INTO Empleados VALUES('2148756A','Paola','Lopez Pelaez',2);
INSERT INTO Empleados VALUES('2548756F','Juan','Muñoz',3);
INSERT INTO Empleados VALUES('3348556T','Miguel','Castillo Perez',4);
INSERT INTO Empleados VALUES('5548554H','Luna','Gomez Lebro',5);


