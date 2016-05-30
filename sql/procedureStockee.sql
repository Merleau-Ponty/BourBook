DELIMITER $$                                               
CREATE PROCEDURE `create_book_with_author`(
	nom VARCHAR(80),
  prenom VARCHAR(80), 
	nbrePages INT,
  `resume` VARCHAR(500), 
  title VARCHAR(80), 
  ISBN VARCHAR(13)
)
BEGIN
	DECLARE authorId INTEGER;
	insert into bourbook.author (NAME, FIRSTNAME) values (nom, prenom);
  SET authorId = LAST_INSERT_ID();
  INSERT INTO bourbook.book (`TITLE`, `ID_AUTHOR`, `ISBN`, `NBPAGES`, `RESUME`) 
    VALUES (title, authorId, isbn, nbrePages, resume);
END $$
DELIMITER ;