CREATE DATABASE IF NOT EXISTS jdbcTemplate;

CREATE TABLE book_table(
	book_id INT PRIMARY KEY,
	book_name VARCHAR(10),
	book_author VARCHAR(11)
)

SELECT book_id bid, book_name bname, book_author author  FROM book_table WHERE book_id = 1

CREATE TABLE account_table(
	user_id VARCHAR(10) PRIMARY KEY,
	user_name VARCHAR(10),
	money DOUBLE
)

INSERT INTO account_table VALUE(1,"join",1000),(2,"emma",1000);