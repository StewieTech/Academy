class Animal {
    constructor(name, age) {
        this.name = name ;
        this.age = age;
    }

    makeSound() {
        throw new Error('makeSound method must be implemented');
    }
}


class Dog extends Animal {
    constructor(name, age, breed) {
      super(name, age);
      this.breed = breed;
    }
  
    makeSound() {
      console.log('Woof! Woof!');
    }
  }

  class Cat extends Animal {
    constructor(name, age, color) {
      super(name, age);
      this.color = color;
    }
  
    makeSound() {
      console.log('Meow! Meow!');
    }
  }

  class Zoo {
    constructor() {
      this.animals = [];
    }
  
    addAnimal(animal) {
      if (!(animal instanceof Animal)) {
        throw new Error('Invalid animal type');
      }
      this.animals.push(animal);
    }
  
    makeAllSounds() {
      if (this.animals.length === 0) {
        console.log('No animals in the zoo');
      } else {
        this.animals.forEach(animal => animal.makeSound());
      }
    }
  }

  const dog = new Dog('Max', 2, 'Golden Retriever');
const cat = new Cat('Fluffy', 1, 'White');

const zoo = new Zoo();

try {
    const dogSound = zoo.addAnimal(dog);
    const catSound = zoo.addAnimal(cat);
    // zoo.addAnimal('Invalid animal'); // This will throw an error (Comment this line to pass the test case)
    // console.log(catSound.makeSound)
  } catch (error) {
    console.error(error);
  }

  zoo.makeAllSounds() ; 