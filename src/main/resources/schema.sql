CREATE SCHEMA IF NOT EXISTS coalyard;
USE coalyard;

CREATE TABLE IF NOT EXISTS coalyard.beverages(
  	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  	name VARCHAR(45) NOT NULL,
  	description VARCHAR(200) NOT NULL,
  	beverage_type VARCHAR(15) NOT NULL,
  	price INT NOT NULL,
  	PRIMARY KEY (id));
  	
  CREATE TABLE IF NOT EXISTS coalyard.beverages_images(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	beverages_id INT UNSIGNED NOT NULL,
	content_type VARCHAR(45) NOT NULL,
	image BLOB NOT NULL,
	PRIMARY KEY(id));

CREATE TABLE IF NOT EXISTS coalyard.food(
  	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  	name VARCHAR(45) NOT NULL,
  	description VARCHAR(200) NOT NULL,
  	food_type VARCHAR(45) NOT NULL,
 	price INT NOT NULL,
	PRIMARY KEY (id));
	
CREATE TABLE IF NOT EXISTS coalyard.food_images(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	food_id INT UNSIGNED NOT NULL,
	content_type VARCHAR(45) NOT NULL,
	image BLOB NOT NULL,
	PRIMARY KEY(id));

CREATE TABLE IF NOT EXISTS coalyard.employees(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	first_name VARCHAR (45) NOT NULL,
	last_name VARCHAR (45) NOT NULL,
	nickname VARCHAR (45),
	bio VARCHAR (1000) NOT NULL,
	PRIMARY KEY (id));

CREATE TABLE IF NOT EXISTS coalyard.employees_image(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	employees_id INT UNSIGNED NOT NULL,
	content_type VARCHAR(45) NOT NULL,
    image BLOB NOT NULL,
    PRIMARY KEY (id));

CREATE TABLE IF NOT EXISTS coalyard.band(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL,
	musicians VARCHAR(45) NOT NULL,
	bio VARCHAR(1000) NOT NULL,
	description VARCHAR(200) NOT NULL,	
	PRIMARY KEY(id));
	
CREATE TABLE IF NOT EXISTS coalyard.band_images(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	band_id INT UNSIGNED NOT NULL,
	content_type VARCHAR(45) NOT NULL,
	image BLOB NOT NULL,
	PRIMARY KEY(id));

CREATE TABLE IF NOT EXISTS coalyard.artists(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(45) NOT NULL,
	last_name VARCHAR(45) NOT NULL,
	artist_name VARCHAR(45),
	website VARCHAR(100),
	facebook VARCHAR(100),
	twitter VARCHAR(100),
	instagram VARCHAR(100),
	bio VARCHAR(1000) NOT NULL,
	description VARCHAR(200) NOT NULL,
	PRIMARY KEY(id));
	
CREATE TABLE IF NOT EXISTS coalyard.artist_image(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	artists_id INT UNSIGNED NOT NULL,
	content_type VARCHAR(45) NOT NULL,
	image BLOB NOT NULL,
	PRIMARY KEY(id));
	
CREATE TABLE IF NOT EXISTS coalyard.art_work(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	artists_id INT UNSIGNED NOT NULL,
	price INT NOT NULL,
	description VARCHAR(200),
	content_type VARCHAR(45) NOT NULL,
	image BLOB NOT NULL,
	PRIMARY KEY(id));
)