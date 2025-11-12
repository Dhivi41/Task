use sla;
create table products(
id int,
name varchar(26),
price int);
desc products;
alter table products 
add stock int;
desc products;
alter table products
change price unit_price decimal(10,2);
desc products;
insert into products (id, name, unit_price, stock)
values
(1, 'laptop', 65000.00, 10),
(2, 'phone', 20000.00, 25),
(3, 'headphones',500.00, 50);
select*from products;

