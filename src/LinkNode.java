public class LinkNode<T> {
    private int index;
    private T data;
    private LinkNode<T> next;
    private LinkNode<T> prev;

    public LinkNode(T data, int index, LinkNode<T> prev){
        this.data = data;
        this.index = index;
        this.next = null;
        this.prev = prev;
    }

    public int getIndex(){
        return index;
    }

    public void setIndex(int index){
        this.index = index;
    }

    public T getData(){
        return this.data;
    }

    public void setData(T data){
        this.data = data;
    }

    public void setPrev(LinkNode<T> linkNode){
        this.prev = linkNode;
    }

    public void setNext(LinkNode<T> next){
        this.next = next;
    }

    public LinkNode<T> getNext(){
        return this.next;
    }

    public LinkNode<T> getPrev(){
        return this.prev;
    }
}
