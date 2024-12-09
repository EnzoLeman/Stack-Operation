public class Stack {
    // Variables (attributes) Declaration
    public int top;
    String[] array = new String[5];

    // Makeups Stack Structure
    public Stack(){
        top = -1;  // lower level before index 0
        for(int i = 0; i < array.length ; i++){
            array[i] = "empty";
        }
    }

    // Create Stack Operations
    Boolean isEmpty(){
        if ( top == -1) {
            return true;
        }
        else{
            return false;
        }
    }
    Boolean isFull(){
        if ( top == 4) {
            return true;
        }
        else{
            return false;
        }
    }

    // PUSH & POP Operations
    public void push(String value){
        if (isFull()) {
            System.out.println("Stack overflow!!");
        }else{
            top++; // new location in a stack
            array[top] = value;
        }
    }
    public String pop(){
        if (isEmpty()) {
            System.out.println("Stack underflow!!");
            return null;
        }else{
            String popValue = array[top];
            array[top] = "empty";
            top--;
            return popValue;
        }
    }

    // COUNT ,PEEK & CHANGE Operations
    public int count(){
        return top + 1;
    }

    public String peek(int position){
        if(isEmpty()){
            System.out.println("Stack underflow!!");
            return null;
        }else{
            return array[position];
        }
    }

    public void change(int position, String value){
        if (position < 0 || position > top) {
            System.out.println("Invalid position!");
        } else {
            array[position] = value;
            System.out.printf("Value has changed at location %d!%n", position);
        }
    }
    // Display Operation
    void display(){
        System.out.println("*******************");
        for (int i = 4; i > 0; i--) {
            System.out.println(array[i]);
        }
        System.out.println("*********************");

    }
}
