class DynamicArray {

    private int capacity ;
    private int length ;
    private int arr[] ; 

    // will initialize an empty array with a capacity of capacity
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[this.capacity];

    }

    // will return the element at index i. 
    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        arr[length] = n;

    }

    public int popback() {
        if (arr.length >0) {
            arr[length] =- 1 ;
        }

    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    // will return number of elements in array
    public int getSize() {
        return length;

    }

    // will return capacity of array
    public int getCapacity() {
        return capacity;

    }
}
