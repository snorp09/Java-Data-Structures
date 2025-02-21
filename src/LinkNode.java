public class LinkNode<T> {
    private int index;
    private T data;
    private LinkNode<T> next;

    public LinkNode(T data, int index){
        this.data = data;
        this.index = index;
        this.next = null;
    }

    public int getIndex(){
        return index;
    }

    public T getData(){
        return this.data;
    }

    public void setData(T data){
        this.data = data;
    }

    public void setNext(LinkNode<T> next){
        this.next = next;
    }

    public LinkNode<T> getNext(){
        return this.next;
    }
}
