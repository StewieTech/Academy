CREATE TABLE "Feed" (
    "feedId" INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    "userId" INTEGER NOT NULL,
    "content" VARCHAR NOT NULL,
    "picture" VARCHAR NOT NULL,
    "createdOn" TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    CONSTRAINT "Feed_userId_fkey" FOREIGN KEY ("userId") REFERENCES "User" ("userId")
);

INSERT INTO "Feed" ("userId", "content", "picture" ,"createdOn")
VALUES (2, 'This is my first post!', 'https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg', CURRENT_TIMESTAMP );

