INSERT INTO "User" ("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified", "createdOn" )
VALUES ('Amy', 'Lee', 'amylee', '+1-555-9012', 'amylee@example.com', 'password789', true, NOW()),
('Tom', 'Jones', 'tomjones', '+1-555-3456', 'tomjones@example.com', 'passwordabc', false, NOW()),
('Diana', 'Hill', 'dianahill', '+1-632-3456', 'dianahill@example.com', 'password123', false, NOW()) ;

INSERT INTO "User" ("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified", "createdOn" ) 
VALUES ('Jessie', 'Doe', 'jessiedoe', '+1-555-1234', 'jessiedoe@example.com', 'password123', true, NOW()) ;



select * FROM "User"  
WHERE "emailVerified" = true ;

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


CREATE TABLE IF NOT EXISTS public."User"
(
    "userId" integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    "firstName" character varying COLLATE pg_catalog."default" NOT NULL,
    "lastName" character varying COLLATE pg_catalog."default" NOT NULL,
    username character varying COLLATE pg_catalog."default" NOT NULL,
    password character varying COLLATE pg_catalog."default" NOT NULL,
    phone character varying COLLATE pg_catalog."default" NOT NULL,
    "emailId" character varying COLLATE pg_catalog."default" NOT NULL,
    "emailVerified" boolean NOT NULL,
    "createdOn" timestamp without time zone NOT NULL,
    CONSTRAINT "User_pkey" PRIMARY KEY ("userId"),
    CONSTRAINT "User_emailId_key" UNIQUE ("emailId"),
    CONSTRAINT "User_username_key" UNIQUE (username)
)

-- ;