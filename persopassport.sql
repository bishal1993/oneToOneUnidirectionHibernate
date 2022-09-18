

create table passport(
id_number int not null auto_increment,
primary key (id_number)
);

create table person(
first_name varchar(20) not null,
last_name varchar(30) not null,
tax_number int not null auto_increment,
primary key(tax_number),
passport_id_number int default null,
constraint fk_detail foreign key(passport_id_number) references passport(id_number)
);
 
 