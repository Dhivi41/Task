USE Task;
CREATE TABLE events (
    id INT AUTO_INCREMENT PRIMARY KEY,
    event_name VARCHAR(100),
    event_date DATE
);

INSERT INTO events (event_name, event_date) VALUES
('Music Festival', '2025-01-15'),
('Tech Conference', '2025-03-22'),
('Art Exhibition', '2025-05-10'),
('Food Carnival', '2025-08-05'),
('Sports Meet', '2025-11-19');

SELECT NOW() AS current_date_time;

SELECT event_name,DATE_FORMAT(event_date, '%W, %d %M %Y') AS formatted_date
FROM events;

SELECT event_name,YEAR(event_date) AS event_year,MONTH(event_date) AS event_month
FROM events;

SELECT id,CONCAT(event_name, ' - ', event_date) AS event_details
FROM events;