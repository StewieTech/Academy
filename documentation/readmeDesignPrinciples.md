
# Design Principles

## Single Responsibility Principle

- anyclass that has more that 5000 lines takes time to read and understand
- If a class has 60000 lines, it could take 1 month to understand it

## Opened Closed Principle
- Open for new features, closed for modifications of existing features
    - Everytime we touch existing code there's always the risk of introducing bugs
    - We can implement this with the interface

## Liskov Subsitution Principle
- If I have a child class in my code I should be able to replace it with a parent class. 
- If a Bird class has fly() then Emu class that can't fly will break this property if it is a child class

## Interface Segregation Principle
- subclasses should implement all the behaviours of the interface. If it doesn't the interface should be split up to abide by this principle

## Dependency Inversion Principle
- related to Open/Close; 
-our code should depend on abstraction 
- If you are creating an instance of a Class, first check if it originally comes from an interface, just use interface instead. This way, to make changes down the line, you don't depend on the concrete class (classes don't change methods because of open/closed ) You can make changes easier because it's loosely coupled
The Dependency Inversion Principle tells us to rely on abstractions, rather than concrete examples. Where possible, we should leverage the power of interfaces to ensure that changes we make in one part of our code don't cause cascading troubles for the rest of our program.

## Github Links
Github link: https://github.com/StewieTech/Academy
Documentation: https://github.com/StewieTech/Academy/tree/master/documentation
Code link: https://github.com/StewieTech/Academy/tree/master/1Week/Eclipse/bptn-java/src/main/java/com/bptn/course