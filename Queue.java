public class Queue<T> {
    private class Node {
        private T data;
        private Node nextNode;

        public Node(T data) {
            this.data = data;
            nextNode = null;
        }

        public void setNextNode(Node pNextNode) {
            nextNode = pNextNode;
        }

        public T getData() {
            return data;
        }

        public Node next() {
            return nextNode;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public Queue() {
        tail = new Node(null);
    }

    public T front() {
        if (isEmpty()) {
            return null;
        }
        return head.getData();
    }

    public void dequeue() {
        if (!isEmpty()) {
            head = head.next();
        }
    }

    public void enqueue(T content) {
        if (head == null) {
            head = new Node(content);
            tail = head;
        } else {
            Node newNode = new Node(content);
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}