SELECT * FROM "Profile" ;

SELECT * FROM "User" ;

UPDATE "User" 
SET "userId" = 2 
WHERE "userId" = 1 ;

INSERT INTO "User" ("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified", "createdOn" )
VALUES ('Amy', 'Lee', 'amylee', '+1-555-9012', 'amylee@example.com', 'password789', true, NOW()),
('Tom', 'Jones', 'tomjones', '+1-555-3456', 'tomjones@example.com', 'passwordabc', false, NOW()),
('Diana', 'Hill', 'dianahill', '+1-632-3456', 'dianahill@example.com', 'password123', false, NOW()) ;

INSERT INTO "User" ("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified", "createdOn" ) 
VALUES ('Jessie', 'Doe', 'jessiedoe', '+1-555-1234', 'jessiedoe@example.com', 'password123', true, NOW()) ;



select * FROM "User"  
WHERE "emailVerified" = true 

INSERT INTO "User" ("firstName", "lastName", "username", "password", "phone", "emailId", "emailVerified", "createdOn")
VALUES 
('Clark', 'Kent', 'clarkkent', 'password123', '2345678901', 'clark.kent@example.com', true, NOW()),
('Maryl', 'Street', 'marylstreet', 'password123', '3456789012', 'maryl.street@example.com', false, NOW()),
('Toby', 'Maguire', 'tobymaguire', 'password123', '4567890123', 'toby.maguire@example.com', true, NOW()),
('Adam', 'Sandler', 'adamsandler', 'password123', '5678901234', 'adam.sandler@example.com', true, NOW());

UPDATE "User" 
SET "username" = 'randyjones'
WHERE "username" = 'tomjones'

SELECT * FROM "User" 
WHERE "username" = 'randyjones';

DELETE FROM "User" 
WHERE "username" = 'randyjones';

-- ;
('Jessie'),
('Diana');
(2, 'Wondergirl Amy!', 'My name is Amy and I am a super hero.', 'Toronto', 'Canada', 'https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg'),

INSERT INTO "Profile" ("userId", "headline", "bio", "city", "country", "picture")
VALUES 
(3, 'Hero Jessie', 'Jessie loves adventure and saving the day.', 'New York', 'USA', 'https://www.google.com/imgres?q=jessie%20super%20hero&imgurl=https%3A%2F%2Fstatic.wikia.nocookie.net%2Fp__%2Fimages%2Ff%2Ff8%2FSheriff_Jessie_TS4_edited-1.png%2Frevision%2Flatest%3Fcb%3D20240623195104%26path-prefix%3Dprotagonist&imgrefurl=https%3A%2F%2Fhero.fandom.com%2Fwiki%2FJessie_(Toy_Story)&docid=7QHFn56TGeGu7M&tbnid=Nxg-56I2JqmMYM&vet=12ahUKEwiZxIns85-HAxVCj4kEHYI9CjkQM3oECHIQAA..i&w=357&h=664&hcb=2&ved=2ahUKEwiZxIns85-HAxVCj4kEHYI9CjkQM3oECHIQAA'),
(4, 'Diana the Brave', 'Diana fights for justice and truth.', 'London', 'UK', 'https://www.google.com/imgres?q=diana%20uk%20superhero&imgurl=https%3A%2F%2Fwww.datocms-assets.com%2F39109%2F1618421001-wonder-woman-gal-gadot-princess-diana.jpeg%3Fauto%3Dformat%252Ccompress%26cs%3Dsrgb&imgrefurl=https%3A%2F%2Fwww.lofficielusa.com%2Ffilm-tv%2Fgal-gadot-princess-diana-inspired-wonder-woman-character&docid=nOX4KsC_TuDrkM&tbnid=L_kv8WIdAkdhUM&vet=12ahUKEwiomJny85-HAxUnrokEHTqWCH0QM3oFCIQBEAA..i&w=2000&h=1333&hcb=2&ved=2ahUKEwiomJny85-HAxUnrokEHTqWCH0QM3oFCIQBEAA');


SELECT * FROM "Profile" 
WHERE "country"  = 'Canada' ;

UPDATE "Profile"
SET bio = 'I am Amy and I probably shouldn''t tell anyone I''m a super hero' 
WHERE  "userId" = 2 ;



DELETE FROM "Profile"
WHERE "profileId" = 3;

SELECT * FROM "Profile"
WHERE "userId" = 2 ;

-- Join the "User" and "Profile" tables to get all the details for ALL users (including the ones without a profile). Hint: Use an outer join.
SELECT * FROM "User" "u" 
FULL OUTER JOIN "Profile" "p" ON "u.userId" = "p.profileId"

SELECT * FROM "User" u 
FULL OUTER JOIN "Profile" p ON u."userId" = p."userId";

-- Join the "User" and "Profile" tables to get the details of the users who have a profile.
SELECT * FROM "User" u
FULL OUTER JOIN "Profile" p ON u."userId" = p."userId"
WHERE p."profileId" IS NOT NULL ;