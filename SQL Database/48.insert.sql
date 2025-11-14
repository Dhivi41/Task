use sla;
CREATE TABLE orders (
  id INT,
  product_name VARCHAR(50),
  quantity INT,
  price DECIMAL(10,2)
);
DESC orders;

INSERT INTO orders (id, product_name, quantity, price)
VALUES
(1, 'Laptop', 2, 75000.00),
(2, 'Mouse', 5, 500.00),
(3, 'Keyboard', 3, 900.00),
(4, 'Monitor', 1, 12000.00),
(5, 'Headphones', 4, 1500.00);
SELECT*FROM orders;