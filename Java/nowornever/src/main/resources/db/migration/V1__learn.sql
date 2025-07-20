CREATE TABLE IF NOT EXISTS users (
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS orders (
    id BIGSERIAL PRIMARY KEY,
    product VARCHAR(255) NOT NULL,
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

INSERT INTO "users" (username)
VALUES
    ('john_doe'),
    ('jane_smith'),
    ('alex_wilson'),
    ('maria_garcia'),
    ('robert_brown');

INSERT INTO orders (product, user_id)
VALUES
    ('Laptop', 1),
    ('Smartphone', 2),
    ('Headphones', 3),
    ('Tablet', 4),
    ('Smartwatch', 5),
    ('Keyboard', 1),
    ('Monitor', 2),
    ('Wireless Mouse', 3),
    ('Camera', 4),
    ('Speaker', 5);