CREATE DATABASE restapi;
USE restapi;
CREATE TABLE BOOK (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  isbn INT,
  title VARCHAR(200) NOT NULL,
  author VARCHAR(200) NOT NULL,
  descritpion VARCHAR(200) NOT NULL
);