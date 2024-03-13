package Collections;
import java.util.Scanner;

public class QueueImpMain {
    public static void main(String[] args) {
        QueueImp myQueue = new QueueImp(5);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Check if Queue is Empty");
            System.out.println("4. Check if Queue is Full");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int data = scanner.nextInt();
                    myQueue.enqueue(data);
                    break;

                case 2:
                    myQueue.dequeue();
                    break;

                case 3:
                    System.out.println("Is Queue Empty: " + myQueue.isEmpty());
                    break;

                case 4:
                    System.out.println("Is Queue Full: " + myQueue.isFull());
                    break;

                case 0:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);
    }
}
