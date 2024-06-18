import java.util.PriorityQueue;

public static void main (String[] args) {
    int [] nums = {1 , 4, 8, 16, 32, 64};

    int key = 8; 

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == key) {
            System.out.println("Key found at index: " + i);
            yield;
        }
    }
}







