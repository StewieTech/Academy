CREATE TABLE "FeedMetaData" (
    "feedMetaDataId" INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    "feedId" INTEGER NOT NULL,
    "actionUserId" INTEGER NOT NULL,
    "isLike" BOOLEAN NOT NULL,
    "comment" VARCHAR,
    "createdOn" TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    CONSTRAINT "FeedMetaData_feedId_fkey" FOREIGN KEY ("feedId") REFERENCES "Feed" ("feedId"),
    CONSTRAINT "FeedMetaData_actionUserId_fkey" FOREIGN KEY ("actionUserId") REFERENCES "User" ("userId")
);


INSERT INTO "FeedMetaData" ("actionUserId", "feedId", "isLike", "comment", "createdOn")
VALUES (2, 1, TRUE, 'Thanks!', CURRENT_TIMESTAMP);

INSERT INTO "FeedMetaData" ("actionUserId", "feedId", "isLike", "comment", "createdOn")
VALUES 
(3, 2, TRUE, 'Great idea!', CURRENT_TIMESTAMP),
(4, 3, FALSE, 'Terrible Thought!!', CURRENT_TIMESTAMP);

SELECT * FROM "FeedMetaData" ;

UPDATE "FeedMetaData"
SET 
comment = 'Thanks fam!'
WHERE "feedMetaDataId" = 1;

DELETE FROM "FeedMetaData"
WHERE "feedMetaDataId" = 2;

SELECT * FROM "FeedMetaData"
WHERE "feedMetaDataId" = 1;

SELECT * FROM "User" ;

SELECT * FROM "FeedMetaData" m
FULL OUTER JOIN "Feed" f ON m."feedId" = f."feedId" 
WHERE m."feedId" = 1 ; 

SELECT * FROM "FeedMetaData" m
FULL OUTER JOIN "Feed" f ON m."feedId" = f."feedId" 
FULL OUTER JOIN "User" u ON u."userId" = f."userId"
WHERE u."userId" = 2 ; 