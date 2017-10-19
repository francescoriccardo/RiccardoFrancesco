
#Create Database Phone
drop database if exists Rubrica;

create database Rubrica
  default character set utf8
  default collate utf8_unicode_ci;

use Rubrica;
    
#Create table country


create table country (
	code varchar(2) not null,
    name varchar(32) ,
    primary key(code)
);

#Create table Brand

create table brand (
	id int auto_increment,
    name varchar(32) not null,
    country varchar(2) not null,
    
    primary key(id),
    FOREIGN KEY (country) REFERENCES country(code)
);

#Create table opsys


create table  opsys (
	id int(11) not null auto_increment,
    description varchar(64) not null,
    company varchar(64) not null,
    openSource tinyint(1),
    primary key(id)
);

#Create table contatto

create table contatto(
  cf varchar(15) not null,
  nome varchar(20) not null,
  cognome varchar(20) not null,
  email varchar(30),
  indirizzo varchar(20)not null,
  
  primary key(cf)
);


#Create table smartphone


create table  smartphone(
	id int(11) not null auto_increment,
    name varchar(64) not null,
    ram varchar(5)not null,
    cpu varchar(64)not null,
    displayPpi int (11)not null,
    displaySize varchar(12)not null,
    displayResolution varchar(64)not null,
    size varchar(64)not null,
    weight int(4) not null,
    notes varchar(1024) not null,
    brand int(11) not null,
    opSys int(11) not null,
    contatto varchar(15) not null,
    numero varchar(10)not null,
    
    primary key(id),
    FOREIGN KEY (brand) REFERENCES Brand(id),
	FOREIGN KEY (opSys) REFERENCES opsys(id),
    FOREIGN KEY (contatto) REFERENCES contatto(cf)
);

