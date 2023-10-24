public class Node<T>{
    private T data;
    private Node nextNode;
    
    public Node(T data)
    {
        this.data = data;
        nextNode = null;
    }
    public void setNextNode(Node pNextNode){nextNode = pNextNode;}
    public T getData(){return data;}
    public Node next(){return nextNode;}
    public void setData(T data)
    {
        this.data = data;
    }
}