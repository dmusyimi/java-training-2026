-- mysql
create table if not exists students
(
    id int not null auto_increment primary key,
    registration_number varchar(50) unique,
    first_name varchar(50) not null,
    last_name varchar(50),
    email varchar(50) unique,
    password varchar(50)
);

--postgres
create table if not exists students
(
    id  serial primary key,
    registration_number varchar(50) unique,
    first_name varchar(50) not null,
    last_name varchar(50),
    email varchar(50) unique,
    password varchar(50)
    );
update students set firstName=? where registration_number=?
insert into students(registration_number,first_name,last_name,email,password) values ( '003','Stephanie','Njeri','stephanie@gmail.com','test@qwerty')