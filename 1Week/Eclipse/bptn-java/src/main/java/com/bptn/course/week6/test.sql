    SELECT * FROM "User";

o
SELECT  * FROM "User";

CREATE TABLE "City" (
"cityId" integer not null GENERATED ALWAYS AS IDENTITY primary key ,
"name" varchar not null,
"weatherCityId"  integer not null,
"timezone"  varchar not null,
"latitude" numeric not null,
"longitude" numeric not null,
"countryId"  integer not null  ,
CONSTRAINT "CountryId_fkey" FOREIGN KEY ("countryId") REFERENCES "Country" ("countryId")
);

SELECT * FROM "City";

CREATE TABLE "Weather"  (
"weatherId" integer not null GENERATED ALWAYS AS IDENTITY primary key,
"weatherStatusId" integer not null,
"description" varchar not null,
"icon" varchar not null,
"sunrise" timestamp without timezone not null,
"sunset" timestamp without timezone not null,
"temp" numeric not null,
"feelsLike" numeric not null,
"tempMin" numeric not null,
"tempMax" numeric not null,
"pressure" numeric not null,
"humidity" numeric not null,
"visibility" numeric not null,
"windSpeed" numeric not null,
"windDirection" numeric not null,
"cloudsAll" numeric not null,
"updatedOn" timestamp without timezone not null
"cityId" integer not null  ,
"userId" integer not null  ,
CONSTRAINT "Weather_cityId_fkey" FOREIGN KEY ("cityId") REFERENCES "City" ("cityId")
CONSTRAINT "Weather_userId_fkey" FOREIGN KEY ("userId") REFERENCES "User" ("userId")
)

SELECT * FROM "Country" ;

INSERT INTO "Country" ("countryCode")
VALUES ('CA') ;

