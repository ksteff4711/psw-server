CREATE TABLE ppsuser
(
   id int PRIMARY KEY NOT NULL,
   username varchar(45),
   password varchar(45),
   email varchar(45),
   name  varchar(45),
   loginFailedCount int(64),
   active varchar(45),
   creationdate timestamp
)
;


CREATE TABLE userpasswords
(
   id int PRIMARY KEY NOT NULL,
   label text,
   password text,
   location text,
   comment text,
   creationdate text,
   owner_id int,
   website text,
   oldid text,
   login text,
   FOREIGN KEY (owner_id)  REFERENCES ppsuser(id)
)
;



INSERT INTO ppsuser (id,username,password,loginFailedCount,active,creationdate) VALUES (1,'steff','testme','0','true',Now());
INSERT INTO userpasswords (id,label,password,location,comment,creationdate,owner_id,website,oldid,login) VALUES (2,'UPLAY ksteff','usetme3','---','username: uname1','22:37.15 12.13.2013',1,'---','b1c56d22-f3c5-449a-8a18-9e83e16c5512','uste3@test.de');
INSERT INTO userpasswords (id,label,password,location,comment,creationdate,owner_id,website,oldid,login) VALUES (3,'world of sweets','utestme2','---','---','08:37.13 02.11.2013',1,'---','b58c2a3f-95d0-48f1-8ea9-76644a670adf','uste2@test.de');
INSERT INTO userpasswords (id,label,password,location,comment,creationdate,owner_id,website,oldid,login) VALUES (4,'city of ember','utestme','---','---','08:46.35 05.29.2019',1,'---','05e56d9a-d47d-492c-b3ce-0de5de1a331e','uste@test.de');

