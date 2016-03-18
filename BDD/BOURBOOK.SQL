
# -----------------------------------------------------------------------------
#       TABLE : USER
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS USER
 (
   ID INT NOT NULL AUTO_INCREMENT   ,
   LOGIN VARCHAR(32) NULL  ,
   PASSWORD VARCHAR(32) NULL  ,
   NAME VARCHAR(50) NULL  ,
   FIRSTNAME VARCHAR(50) NULL  ,
   PHONE CHAR(10) NULL  ,
   MAIL VARCHAR(150) NULL  ,
   SERVICE VARCHAR(50) NULL  
   , PRIMARY KEY (ID) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : ADMIN
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS ADMIN
 (
   ID INT NOT NULL AUTO_INCREMENT   ,
   ID_USER INT NOT NULL
   , PRIMARY KEY (ID) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : LOAN
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS LOAN
 (
   ID INT NOT NULL AUTO_INCREMENT   ,
   ID_USER INT NOT NULL  ,
   ID_COPY INT NOT NULL  ,
   STARTDATE DATE NULL  ,
   ENDDATE DATE NULL  ,
   WAITING BOOLEAN NULL  
   , PRIMARY KEY (ID) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : AUTHOR
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS AUTHOR
 (
   ID INT NOT NULL AUTO_INCREMENT   ,
   NAME VARCHAR(50) NULL  ,
   FIRSTNAME VARCHAR(50) NULL  
   , PRIMARY KEY (ID) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : COPY
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS COPY
 (
   ID INT NOT NULL AUTO_INCREMENT   ,
   ID_BOOK INT NOT NULL  
   , PRIMARY KEY (ID) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : CATEGORY
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS CATEGORY
 (
   ID INT NOT NULL AUTO_INCREMENT   ,
   LABEL VARCHAR(150) NULL  
   , PRIMARY KEY (ID) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : BOOK
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS BOOK
 (
   ID INT NOT NULL AUTO_INCREMENT   ,
   ID_AUTHOR INT NOT NULL  ,
   ID_CATEGORY INT NOT NULL  ,
   RESUME TEXT NULL  ,
   ISBN VARCHAR(8) NULL  ,
   TITLE VARCHAR(50) NULL  ,
   NBPAGES INT(4) NULL  
   , PRIMARY KEY (ID) 
 ) 
 comment = "";


# -----------------------------------------------------------------------------
#       CREATION DES REFERENCES DE TABLE
# -----------------------------------------------------------------------------


ALTER TABLE LOAN 
  ADD FOREIGN KEY FK_LOAN_USER (ID_USER)
      REFERENCES USER (ID) ON DELETE CASCADE;
      

ALTER TABLE ADMIN 
  ADD FOREIGN KEY FK_ADMIN_USER (ID_USER)
      REFERENCES USER (ID) ON DELETE CASCADE;


ALTER TABLE LOAN 
  ADD FOREIGN KEY FK_LOAN_COPY (ID_COPY)
      REFERENCES COPY (ID) ON DELETE CASCADE ;


ALTER TABLE COPY 
  ADD FOREIGN KEY FK_COPY_BOOK (ID_BOOK)
      REFERENCES BOOK (ID) ON DELETE CASCADE ;


ALTER TABLE BOOK 
  ADD FOREIGN KEY FK_BOOK_AUTHOR (ID_AUTHOR)
      REFERENCES AUTHOR (ID) ON DELETE CASCADE;


ALTER TABLE BOOK 
  ADD FOREIGN KEY FK_BOOK_CATEGORY (ID_CATEGORY)
      REFERENCES CATEGORY (ID) ON DELETE CASCADE;

