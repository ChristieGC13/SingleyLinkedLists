public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(this.head == null) {
            this.head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
    public void remove() {
        if(this.head == null) {
            System.out.println("List is Empty");
        } else {
            Node runner = this.head;
            while (runner.next == null) {
                runner = null;
            }
            runner = runner.next;
        }
    }
    public void printValues() {
        if(this.head == null) {
            System.out.println("List is Empty");
        } else {
            Node runner = this.head;
            while(runner != null) {
                System.out.println(runner.value + " > ");
                runner = runner.next;
            }
        }
    } 
    
}
