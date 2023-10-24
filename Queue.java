public class Queue<T>{
    private Node<T> head;
    private Node<T> tail;
    
    public Queue()
    {
        head = null;
        tail = null;
    }
    public T front(){
        if(isEmpty())
        {
            return null;
        } 
        return head.getData();
    }
    public void dequeue()
    {
        head = head.next();
    }
    public void enqueue(T content)
    {
        if(head == null)
        {
            head.setData(content);
        }
        if(head.next() == null)
        {
            tail = new Node<T>(content);
            head.setNextNode(tail);
        }
        tail.next().setNextNode(new Node<T>(content));
        tail = tail.next();
    }
    public boolean isEmpty(){return head == null;}
    
}