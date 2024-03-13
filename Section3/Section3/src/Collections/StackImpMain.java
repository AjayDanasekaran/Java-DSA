package Collections;
import java.util.EmptyStackException;
import java.util.Scanner;

public class StackImpMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackImp s = new StackImp(5);
        int choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Empty Check");
            System.out.println("4. Full Check");
            System.out.println("5. Peek");
            System.out.println("6. Exit");

            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter int to push");
                        s.push(sc.nextInt());
                        break;

                    case 2:
                        System.out.println("Popped value: " + s.pop());
                        break;

                    case 3:
                        System.out.println("Empty Check: " + s.isEmpty());
                        break;

                    case 4:
                        System.out.println("Full Check: " + s.isFull());
                        break;

                    case 5:
                        System.out.println("Peeked value: " + s.peek());
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid option");
                }
            } catch (EmptyStackException e) {
                System.err.println("Error: " + e.getMessage());
            }
        } while (choice != 6);
    }
}
