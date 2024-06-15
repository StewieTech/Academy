
public class ShoeRackExampleFinal {
    public static void main(String[] args) {
    

        // The variable shoeRack is a reference to the array and is stored on the stack
   
        String[] shoeRack ; 
        
        //First, we declare a variable shoeRack which is of type String array. 
             // Shoe rack is a reference variable. and it's stored on the stack as it is declared within the main method
// 


// We then allocate memory for the shoeRack array on the heap by initializing it with new String[5], which means we reserve space for 5 elements in this array on the heap.
// We are creating an array of 5 String references that are created in the heap
shoeRack = new String[5];
        
        // Creating shoe objects
        String sneakers = "Sneakers";
        String boots = "Boots";
        String sandals = "Sandals";
        
                         
        // Initializing the array with shoes
        shoeRack[0] = sneakers;
        shoeRack[1] = boots;
        shoeRack[2] = sandals;

        // Creating shoe objects and initializing the array with shoes in one line
        // String[] shoeRack = {"Sneakers", "Boots", "Sandals"};
        
        // String firstPair = shoeRack[0];
        
        // Accessing and printing the type of the first pair of shoes
        System.out.println(shoeRack[0]); // Output: Sneakers
        }
        }
        
        
