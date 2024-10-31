public class CustomLinkedList {
    
    Node head;
    private int size;

    CustomLinkedList() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void addInMiddle(int index, String data) {
        if (index > size || index < 0) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node currNode = head;
        for (int i = 1; i < index; i++) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
        size++;
    }

    public boolean contains(String data) {
        Node currNode = head;
        while (currNode != null) {
            if (currNode.data.equals(data)) {
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty list, nothing to delete");
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty list, nothing to delete");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        CustomLinkedList list = new CustomLinkedList();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.addInMiddle(2, "not");
        list.printList();

        System.out.println("List contains 'a': " + list.contains("a"));
        System.out.println("List contains 'not in list': " + list.contains("not in list"));

        list.reverse();
        System.out.print("Reversed List: ");
        list.printList();

        list.clear();
        System.out.println("List after clear:");
        list.printList();

        System.out.println("Size of the list: " + list.getSize());
    }
}
