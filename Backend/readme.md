# FeedApp

## FeedApp
### Functional requirements:
**Backend**
- Registering and authenticating users
- Posting and deleting feeds
- Liking and commenting on feeds
- Fetching feeds to display to users
  **Frontend**
- User Registration and Login forms
- A feed display area to show all posts from users
- Components to create new feeds
- User Profile pages showing personal user information and their posts

### Non-functional requirements:
- Writing Unit Tests
- testing browser using selenium
- Cucumber
- testing RESTful API's using RESTassured
- Using Allure for to streamline test report development
- Using Postgres for the database,
- developing Backend API's using Spring boot
- Using React framework for the frontend

### Design
``` SQL
User
    userId integer (primary key)
    name VARCHAR(255)
    email VARCHAR(255) 
    password VARCHAR(255)
    timeCreated TIMESTAMP
Profile
    profileID INTEGER (primary key)
    userID (foreign key)
    bios TEXT
    location VARCHAR(255)
    profilePicture varchar(255)
    birthdate DATE,
Feed
    feedId INTEGER (primary key)
    userId (foreign key)
    userTextPosts VARCHAR
    userImagesURL VARCHAR
    userVideosURL VARCHAR
FeedMetaData
    FeedMetaDataId (primary key)
    feedId (foreign key)
    likeCount INTEGER
    comments VARCHAR
    shareCount INTEGER
Message
    messageId INTEGER (primary key)
    senderId INTEGER (foreign key)
    receiverId INTEGER (foreign key)
    textMessage TEXT

