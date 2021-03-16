DROP table IF EXISTS Cajas;
DROP TABLE IF EXISTS Almacenes;



create table Almacenes(
id int auto_increment primary key,
lugar varchar(100) not null,
capacidad int not null
);

create table Cajas(
numref char(5) primary key,
contenido varchar(100) not null,
valor int not null,
id_almacen int not null,
foreign key (id_almacen) references Almacenes(id) on delete cascade on update cascade
);


insert  into Almacenes(lugar, capacidad) values ('Tarragona',7);
insert  into Almacenes(lugar, capacidad) values ('Paris',15);
insert  into Almacenes(lugar, capacidad) values ('Londres',5);
insert  into Almacenes(lugar, capacidad) values ('Madrid',7);


insert into Cajas values('4DS5','Metal',200,1);
insert into Cajas values('4RT5','Plastico',26,2);
insert into Cajas values('4YU5','Aluminio',100,2);
insert into Cajas values('4IL5','Carbon',50,3);
insert into Cajas values('4BG5','Azucar',30,4);


