CREATE DATABASE Task;
USE Task;
CREATE TABLE orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(100),
    quantity INT,
    price DECIMAL(10,2),
    event_name VARCHAR(100),
    event_date DATE
);

INSERT INTO orders (product_name, quantity, price, event_name, event_date) VALUES
('Apple Juice', 3, 150.00, 'Food Expo', '2025-01-12'),
('Banana Shake', 1, 80.00, 'Health Fair', '2025-02-10'),
('Almond Milk', 5, 450.00, 'Organic Meet', '2025-03-05'),
('Orange Soda', 2, 120.00, 'Summer Fest', '2025-04-18'),
('Avocado Salad', 4, 320.00, 'Nutrition Week', '2025-05-21');

SELECT *FROM orders WHERE quantity > 2;
SELECT *FROM orders WHERE price BETWEEN 100 AND 500;
SELECT *FROM orders WHERE product_name LIKE 'A%';
SELECT *FROM orders ORDER BY quantity DESC;

SELECT id,product_name,CONCAT(event_name, ' - ', event_date) AS event_details
FROM orders;