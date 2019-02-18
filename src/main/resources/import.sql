drop table if exists `city`;
drop table if exists `hotel`;

create table `city` (`id` int primary key auto_increment, `name` varchar(50), `state` varchar(50), `country` varchar(50));
create table `hotel` (`city` int, `name` varchar(50), `address` varchar(50), `zip` varchar(50));

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');
insert into hotel(city, name, address, zip) values (1, 'Conrad Treasury Place', 'William & George Streets', '4001');