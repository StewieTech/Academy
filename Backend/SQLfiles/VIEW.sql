
CREATE VIEW  allUsersWithProfile
AS

SELECT  
u."userId",
CONCAT("firstName" , "lastName") AS "name",
"username"
"headline",
"bio",
"picture"
FROM "User" u
INNER JOIN "Profile" p ON u."userId" = p."userId" ;

SELECT * FROM allusersWithProfile;

ALTER VIEW allUsersWithProfile RENAME TO allUsersWithProfileView;


INSERT INTO "User" ("firstName", "lastName", "username", "password", "phone", "emailId", "emailVerified", "createdOn")
VALUES 
('Bruce', 'Wayne', 'batman', 'password123', '2345678901', 'batman@example.com', true, NOW());

INSERT INTO "Profile" ("userId", "headline", "bio", "city", "country", "picture")
VALUES 
(4, 'Luke the Brave', 'Luke fights for justice and truth.', 'London', 'UK', 'https://www.google.com/example2');

SELECT * FROM AllUsersWithProfileView ;

DROP VIEW allUsersWithProfileView;
