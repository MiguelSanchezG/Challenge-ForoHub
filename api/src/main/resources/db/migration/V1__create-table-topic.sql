create table topicos(

    id BIGSERIAL PRIMARY KEY,
    titulo varchar(100) not null,
    mensaje varchar(100) not null,
    nombre varchar(20) not null,
    email varchar(100) not null unique,
    materia varchar(100) not null

);