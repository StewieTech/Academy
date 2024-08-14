// const characters = ['a', 'b', 'c', 'd', 'e'];

// //Using for, print elements in characters array
// for (let i = 0; i < characters.length; ++i) {
//     console.log(characters[i]);
// }

// characters.forEach((character,i) => 
//     {console.log(character)} 
// );

// for (let i in characters) {
//     console.log(characters[i])
// }

// for (const character of characters) {
//     console.log(character)
// }

const students = [
  { name: "John", age: 18, major: "Computer Science" },
  { name: "Newton", age: 19, major: "Mathematics" },
  { name: "Barry", age: 20, major: "Physics" },
];

// Iterate through the array of objects students using for/of
// for (student of students) {
//     console.log(`${student.name} is ${student.age} old and is studying ${student.major}` ) ;
// }

    // Print a message to the console that includes the student's name, age, and major
    // Example: John is 18 years old and is studying Computer Science. 

    // const words = ['bob', 'john', 'marry', 'hilton', 'bala'];

    // Using map() to capitalize the first letter of each word
    // const firstCapital = words.map(word => (word.charAt(0).toUpperCase() + word.slice(1))); 
    // console.log(firstCapital);
    
    // // Using map() to create an array of word lengths
    // const wordLengths = words.map(word => (word.length));
    // console.log(wordLengths);
    
    
    // // Using map() to create an array of objects with word and length properties
    // const wordAndLength = words.map(word => `word: ${word}, length: ${word.length}`);
    // console.log(wordAndLength);
    
    
    //Print capitalized words 
    // ['Bob', 'John', 'Marry', 'Hilton', 'Bala']
    
    
    //Print words length
    // [3, 4, 5, 6, 4]
    
    
    //Print array of objects with word and length properties
    // [{word: "bob", length: 3}, {word: "john", length: 4}, {word: "marry", length: 5}, {word: "hilton", length: 6}, {word: "bala", length: 4}]
    
    
// // Create a new set with some initial values
// const words = new Set(['bob', 'john', 'marry', 'hilton', 'bala']);

// // Add some more values ('rick', 'newton', 'bala') to the set
// words.add('rick',);
// words.add('newton',);
// words.add('bala');
// console.log(words);

// // Check if 'hilton' is in the set
// words.has('hilton')

// // Get the size of the set
// words.size

// // Delete 'rick' from the set
// words.delete('rick');

// // Convert the set to an array
// Array.from(words);

//Print the set
// Set {'bob', 'john', 'marry', 'hilton', 'bala', 'newton'}


//Print the result to check if 'hilton' is in the set
// true


//Print the size of the set
// 7


//Print the array
// ['bob', 'john', 'marry', 'hilton', 'bala', 'newton']

// /** @type {number} */
// const answer = "5" ;
// console.log(answer) ;

const numbers = [1, 2, 3, 4, 5, 6, 7, 9];

// Using map() to create a new array with nested arrays. The second element will be the current number * 2

const numberArray = numbers.map(number => [number, number * 2] ) ;
console.log(numberArray) ; 
const flatArray = numberArray.flat()
console.log(flatArray) ;

numbersMapFlat = numbers.flatMap(number => [number, number * 2]);
console.log(numbersMapFlat) ;

// Using flat() to flatten the nested arrays


// Using flatMap() to create a new flattened array


//Print nested array 
/* 
[
  [ 1, 2 ],  [ 2, 4 ],
  [ 3, 6 ],  [ 4, 8 ],
  [ 5, 10 ], [ 6, 12 ],
  [ 7, 14 ], [ 9, 18 ]
]
*/

//Print flattened array
/*
[
  1,  2, 2,  4, 3,  6,
  4,  8, 5, 10, 6, 12,
  7, 14, 9, 18
]
*/


//Print flat mapped array
/*
[
  1,  2, 2,  4, 3,  6,
  4,  8, 5, 10, 6, 12,
  7, 14, 9, 18
]
*/

// def merge_two_lists(l1, l2):
//     if not l1 or (l2 and l1.value > l2.value): l1, l2 = l2, l1
//     if l1: l1.next = merge_two_lists(l1.next, l2)
//     return l1


// Declare a constant variable using the "const" keyword
const PI = 3.14159;


// Define a class using the "class" keyword
class Shape {
    constructor(x,y) {
        this.x = x;
        this.y = y;
    }
}

// Define a subclass that extends the "Shape" class
class Circle extends Shape {
    constructor(x,y, radius) {
        super(x,y);
        this.radius = radius ;
    }
    
    
    // Create an instance of the "Circle" class
    get area() {
        return PI * this.radius * this.radius;
    }
    
    // Call the "move" method on the "circle" instance
    set diameter(diameter) {
        this.radius = diameter / 2;
    }
}


// Print the area of the circle using the "area" getter
console.log(area(0,0,10))


// Set the diameter of the circle using the "diameter" setter
console.log(diameter(0,0,10))

// Print the area of the circle again
console.log(area());
