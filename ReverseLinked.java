// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    Node head;  

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void reverIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = null;
        Node currNode = head;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // Update pointers
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;  // Update head to the new first node
    }

    // Reverse recursively
    public void reverseRecursive() {
        head = reverseRecursiveHelper(head);
    }

    private Node reverseRecursiveHelper(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursiveHelper(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

// Main class
public class ReverseLinked {
    public static void main(String[] args) {
        LL list = new LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println("Original list:");
        list.printlist();

        list.reverseRecursive();  // Reverse the linked list recursively

        System.out.println("Reversed list:");
        list.printlist();
    }
}
