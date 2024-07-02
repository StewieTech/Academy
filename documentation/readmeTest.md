# Test Driven Development

@Test annotation over the method
- we use asserts to test
-  we should only test one behaviour at a time
- We should build the test before we build the method

TDD is important as it creates greater certainty around the behavior of our code. - TDD States that being able to create tests before we actually create the code ensures greater reliability of the code

This allows us greater confidence in refactoring our code as we can ensure that we haven't broken any core functionality

Not only can you test methods to make sure they return the expected result, you can also test exceptions to make sure that they are thrown when they are supposed to

 Writing TDD also helps the developer think more comprehensively about all the edge cases that the code needs to consider leading to more reliable code

Unit Tests help developers create automated testing which is a great tool as projects get larger as larger projects are harder to test. 

Method's with giant bodies are hard to test for but as code is broken down into classes and smaller chucks writing unit tests becomes easier 

TDD methodology includes

Write Tests → Watch if Fail → Code Behaviour that will pass the Test → Check the Test to see if it actually passes → Now you can refactor your code in the future, You never need to refactor the test and the code should always still pass the test if it doesn't there is an error in the code

@Test denotes a method is a test

JUnit 5 leverages features from Java 8 or later, such as lambda functions, making tests more powerful and easier to maintain.

JUnit 5 has added some very useful new features for describing, organizing, and executing tests. For instance, tests get better display names and can be organized hierarchically.
JUnit 5 is organized into multiple libraries, so only the features you need are imported into your project. With build systems such as Maven and Gradle, including the right libraries is easy.
JUnit 5 can use more than one extension at a time, which JUnit 4 could not (only one runner could be used at a time). This means you can easily combine the Spring extension with other extensions (such as your own custom extension).
