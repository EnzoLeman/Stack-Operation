import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Methods object = new Methods();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Push Item");
            System.out.println("2. Pop Item");
            System.out.println("3. Display Items");
            System.out.println("4. Exit");
            System.out.print("> Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Push
                    if (object.isFull()) {
                        System.out.print("Enter an item to add: ");
                        String item = scanner.nextLine();
                        object.setPush(item);
                    } else {
                        System.out.println("Array is full. Cannot push more items.");
                    }
                    break;

                case 2: // Pop
                    object.setPop();
                    break;

                case 3: // Display
                    object.display();
                    break;

                case 4: // Exit
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
