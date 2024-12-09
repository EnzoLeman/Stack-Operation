import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack object = new Stack();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Push Item");
            System.out.println("2. Pop Item");
            System.out.println("3. isEmpty()");
            System.out.println("4. isFull()");
            System.out.println("5. Peek item");
            System.out.println("6. Count items");
            System.out.println("7. Change Item");
            System.out.println("8. Display Items");
            System.out.println("9. Exit");
            System.out.print("> Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Push
                    if (object.isFull()) {
                        System.out.println("\n Stack is Full, You can't add more items");
                    } else {
                        System.out.print("Enter an item to add: ");
                        String value = scanner.nextLine();
                        object.push(value); 
                    }
                    break;

                case 2: // Pop
                    System.out.printf("%nPop Method called - Poped Value: %s%n",object.pop());
                    break;
                
                case 3: // isEmpty 
                    if (object.isEmpty()) {
                        System.out.println("\nStack is Empty");
                    }else{
                        System.out.println("\nStack is not Empty");
                    }
                    break;
                case 4: // isFull
                    if (object.isFull()) {
                        System.out.println("\nStack is Full");
                    } else {
                        System.out.println("\nStack is not Full");
                    }
                    break;    
                case 5: // Peek item
                    System.out.print("Enter position of item: ");
                    int position = scanner.nextInt();
                    object.peek(position);
                    System.out.printf("%nPeek Method Called - Peeked Value: %s, at position %d%n", object.array[position], position );
                    break;

                case 6: // Count
                    System.out.printf("%nCount Method Called - Number of items are: %d%n",object.count());
                    break;
                case 7: // Change item
                    System.out.println("Change Method Called");

                    System.out.print(" >Enter item Position: "); 
                    int newPos = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("\n >Enter new-item Value: \n");
                    String newValue =  scanner.nextLine();

                    object.change(newPos, newValue);
                    break;
                case 8: // Display
                    System.out.println("\nDisplay Method Called");
                    object.display();
                    break;  
                case 9: // Exit
                    System.out.println("Goodbye, Thanks for use me!!");      
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);

        scanner.close();
    }

}
