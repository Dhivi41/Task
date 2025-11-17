USE sla;
CREATE TABLE products (id INT PRIMARY KEY,name VARCHAR(100),price DECIMAL(10,2));
ALTER TABLE products 
ADD COLUMN stock INT;
ALTER TABLE products 
CHANGE COLUMN price unit_price DECIMAL(10,2);
INSERT INTO products (id, name, unit_price, stock) 
VALUES (1, 'Laptop', 55000.00, 10),
(2, 'Keyboard', 1200.00, 50),
(3, 'Mouse', 600.00, 40),
(4, 'Monitor', 8000.00, 15),
(5, 'Headphones', 1500.00, 25);
UPDATE products SET stock = 60 WHERE id = 3;
DELETE FROM products WHERE id = 5;
