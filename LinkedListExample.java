import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList <String> linkedlist = new LinkedList<String>();

        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        System.out.println("Linked List Content: " + linkedlist);

        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " + linkedlist);

        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last elemet: " + linkedlist);

        linkedlist.add(0, "Newly Added Item");
        linkedlist.remove(2);
        System.out.println("Final Content: ");
    }
}
