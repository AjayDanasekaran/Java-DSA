package Collections;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        System.out.println("Is linked list empty? " + linkedList.isEmpty());

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        System.out.println("Is linked list empty? " + linkedList.isEmpty());

        System.out.print("Linked list elements: ");
        linkedList.print();
    }
}
