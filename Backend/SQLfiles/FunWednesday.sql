
;
SELECT "name", "temp" FROM "City" "c"
INNER JOIN "Weather" "w" ON "w"."cityId" = "c"."cityId" ; 


SELECT "name", "temp" FROM "City" "c"
INNER JOIN "Weather" "w" ON "w"."cityId" = "c"."cityId" ; 



SELECT "name", "timezone" FROM "City" "c"
INNER JOIN "Weather" "w" ON "w"."cityId" = "c"."cityId" 
WHERE "humidity" > 50 ;

SELECT "name", "sunrise" FROM "City" "c"
INNER JOIN "Weather" "w" ON "w"."cityId" = "c"."cityId" 
WHERE "temp" < 20 ;

SELECT "name", "tempMax" FROM "City" "c"
INNER JOIN "Weather" "w" ON "w"."cityId" = "c"."cityId" 
WHERE "windSpeed" < 10 ;

SELECT * FROM "City" "c"
INNER JOIN "Weather" "w" ON "w"."cityId" = "c"."cityId" ; 


SELECT "name", "description" FROM "Weather" "w"  
INNER JOIN "City" "c" ON "w"."cityId" = "c"."cityId" ; 

SELECT "name", "temp" FROM "City" "c"
INNER JOIN "Weather" "w" ON "w"."cityId" = "c"."cityId" ; 


SELECT * FROM "User" ;

SELECT * FROM "Weather" ;

SELECT * FROM "User" 
WHERE "firstName" = 

SELECT * FROM "WeatherView";

CREATE OR REPLACE PROCEDURE insertBulkUser()
LANGUAGE plpgsql 
AS
$$
DECLARE
 randomNumberStartLimit INTEGER := 10000 ;
 randomNumberEndLimit INTEGER := 20000 ;
 randomNumberGenerated INTEGER ; 

BEGIN 
FOR _index IN 1..50 LOOP
randomNumberGenerated := floor(random() * (randomNumberStartLimit-randomNumberEndLimit + 1) + randomNumberEndLimit) ;   

INSERT INTO "User" ("firstName", "lastName", "username" ,"phone", "emailId","password", "emailVerified","createdOn")
VALUES (concat('firstName',_index),
		concat('lastName',_index),
		concat('username',_index), 
		randomNumberGenerated,
		concat('username',_index,'@email.com'),
		concat('password',_index),
		false,
		NOW()); 
END LOOP ; 
END;
$$;

CALL insertBulkUser(); 

SELECT * FROM "User" ; 


CREATE OR REPLACE PROCEDURE updateBulkUserPhone()
LANGUAGE plpgsql
AS
$$
DECLARE
    randomNumberStartLimit INTEGER := 10000;
    randomNumberEndLimit INTEGER := 20000;
    randomNumberGenerated INTEGER;
BEGIN
 

    FOR _userId IN 10..59 LOOP
        -- Generate a random number for the phone field
        randomNumberGenerated := floor(random() * (randomNumberEndLimit - randomNumberStartLimit + 1) + randomNumberStartLimit);
        
        -- Update the phone field for the user with the current _userId
        UPDATE "User"
        SET "phone" = randomNumberGenerated
		WHERE "userId" = _userId;
    END LOOP;
END;
$$;

-- Call the procedure
CALL updateBulkUserPhone();

-- Verify the update
SELECT * FROM "User" ;
WHERE "userId" BETWEEN 10 AND 50;

ROLLBACK;
