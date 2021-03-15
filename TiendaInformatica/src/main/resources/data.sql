DROP TABLE IF EXISTS Fabricantes;
DROP TABLE IF EXISTS Articulos;

CREATE TABLE Fabricantes(
codigoF INT AUTO_INCREMENT PRIMARY KEY,
nombreF VARCHAR(100));

INSERT INTO Fabricantes(nombreF) VALUES('fabricante1');
INSERT INTO Fabricantes(nombreF) VALUES('fabricante2');
INSERT INTO Fabricantes(nombreF) VALUES('fabricante3');
INSERT INTO Fabricantes(nombreF) VALUES('fabricante4');
INSERT INTO Fabricantes(nombreF) VALUES('fabricante5');

CREATE TABLE Articulos(
codigoA INT AUTO_INCREMENT PRIMARY KEY,
nombreA VARCHAR(100),
precio INT,
fabricante_cod INT,
CONSTRAINT articulos_fk
FOREIGN KEY (fabricante_cod)
REFERENCES Fabricantes(codigo)
ON DELETE SET NULL
ON UPDATE CASCADE);



INSERT INTO Articulos(nombreA,precio,fabricante_cod) VALUES('ar1',100,1);
INSERT INTO Articulos(nombreA,precio,fabricante_cod) VALUES('ar2',75.S54,1);
INSERT INTO Articulos(nombreA,precio,fabricante_cod) VALUES('ar3',22.12,1);
INSERT INTO Articulos(nombreA,precio,fabricante_cod) VALUES('ar4',65.3,1);
INSERT INTO Articulos(nombreA,precio,fabricante_cod) VALUES('ar5',50,1);



