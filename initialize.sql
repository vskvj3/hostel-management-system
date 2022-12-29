-- create a new user hosteluser
CREATE USER 'hosteluser'@'localhost';

-- create database hostelDB
create database hostelDB;

-- give permissions to hosteluser
GRANT ALL PRIVILEGES ON hostelDB . * TO 'hosteluser'@'localhost';

-- database
use hostelDB;

-- create inmates table
create table inmates(
	admnno VARCHAR(20) PRIMARY KEY, 
	name VARCHAR(50), 
	semester VARCHAR(40)
);

-- create table attendence
create table attendence(
	admnno varchar(20), 
	month varchar(20), 
	count_no int,
	fine int,
	primary key(admnno, month)
);


-- create table expense
create table expense(
	month varchar(20) primary key, 
	total varchar(20), 
	less_revenue varchar(10), 
	net_total varchar(10), 
	est_fee varchar(10)
);
