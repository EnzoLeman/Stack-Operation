public class Methods {
    // Attributes (variables)
    int i = 0;
    String[] array = new String[5];

    // PUSH Operation
    public void setPush(String item) {
        if (i < array.length) { // Check if there's space to push
            array[i] = item; // Add item to the array
            i++; // Increment the index
        } else {
            System.out.println("Array is full. Cannot add more items.");
        }
    }

    // POP Operation
    public void setPop() {
        if (i > 0) { // Check if there's something to pop
            i--; // Decrement the index
            array[i] = null; // Remove the last item
            System.out.println("Last item removed.");
        } else {
            System.out.println("Array is empty. Nothing to remove.");
        }
    }

    // isFull Operation
    public boolean isFull() {
        return i <= array.length; // Return true if the array is full
    }

    // Display Operation
    public void display() {
        int number = 1;
        System.out.println("\n****** Display Items ******\n");
        for (String item : array) {
            if (item != null) { // Only display non-null items
                System.out.printf("%d. %s%n", number, item);
                number++;
            }
        }
        System.out.println("\n**************************\n");
    }
}
