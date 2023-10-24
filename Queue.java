public class Queue<T>{
    private Node<T> head;
    private Node<T> tail;
    
    public Queue()
    {
        head = new Node<T>(null);
        tail = new Node<T>(null);
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
        if(head.getData() == null)
        {
            head.setData(content);
            head.setNextNode(tail);
        }
        else if(head.getData() != null && tail.getData() == null)
        {
            tail.setData(content);
            head.setNextNode(tail);
        }
        else{
            tail.next().setNextNode(new Node<T>(content));
            tail = tail.next();
        }
        
    }
    public boolean isEmpty(){return head == null;}
    
}