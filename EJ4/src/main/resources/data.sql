drop table if exists Salas;
drop table if exists Peliculas;

create table Peliculas(
id int auto_increment primary key,
nombre varchar(100) not null,
calificacion_edad int not null
);

create table Salas(
id int auto_increment primary key,
nombre varchar(100) not null,
id_pelicula int not null,
foreign key (id_pelicula) references Peliculas(id) on delete cascade on update cascade
);

insert into peliculas(nombre, calificacion_edad) values ('Los Increibles','7');
insert into peliculas(nombre, calificacion_edad) values ('Forzen','7');
insert into peliculas(nombre, calificacion_edad) values ('Terminator','16');
insert into peliculas(nombre, calificacion_edad) values ('Hankok','16');


insert into salas(nombre, id_pelicula) values ('Sala 1', 1);
insert into salas(nombre, id_pelicula) values ('Sala 2', 2);
insert into salas(nombre, id_pelicula) values ('Sala 3', 3);
insert into salas(nombre, id_pelicula) values ('Sala 4', 4);
