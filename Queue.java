public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    public Queue() {
        tail = new Node<T>(null);
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
            head = new Node<T>(content);
            tail = head;
        } else {
            Node<T> newNode = new Node<T>(content);
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

}