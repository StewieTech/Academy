
public class ShoeRackExampleFinal {
    public static void main(String[] args) {
        // Declaring and allocating an array of shoes
        
        //First, we declare a variable shoeRack which is of type String array. 
        // The variable (a reference to the array) is stored on the stack
        String[] shoeRack ; 
// 
        // We then allocate memory for the shoeRack array on the heap by initializing it with new String[5], which means we reserve space for 5 elements in this array on the heap.
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
        
        // Accessing and printing the type of the first pair of shoes
        String firstPair = shoeRack[0];
        System.out.println(firstPair); // Output: Sneakers
        }
        }
        
        
