package Grafos;

class LinkedList {
    Node head;
    public void addNode(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1 && current.next != null; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int getData() {
        return head.data;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
