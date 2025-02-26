public class List<T> {
    private int length;
    private LinkNode<T> firstLink;

    public List(){
        this.length = 0;
        this.firstLink = null;
    }

    public T get(int index) throws ListItemNotFoundException{
        LinkNode<T> node = firstLink;
        for(int i = 0; i<this.length; i++){
            if(node.getIndex() == index){
                return node.getData();
            }
            node = node.getNext();
        }
        throw new ListItemNotFoundException();
    }

    public void add(T item){
        if(this.firstLink == null){
            LinkNode<T> link = new LinkNode<T>(item, this.length, null);
            this.firstLink = link;
            this.length++;
            return;
        }

        LinkNode<T> currNode = firstLink;
        while(currNode.getNext() != null){
            currNode = currNode.getNext();
        }
        LinkNode<T> link = new LinkNode<T>(item, length, currNode);
        currNode.setNext(link);
        this.length++;
    }

    public void remove(int index){
        LinkNode<T> node = firstLink;
        for(int i = 0; i<this.length; i++){
            if(node.getIndex() == index){
                node.getPrev().setNext(node.getNext());
                node.getNext().setPrev(node.getPrev());
            }
            if(i > index){
                node.setIndex(node.getIndex()-1);
            }
            node = node.getNext();
        }
        this.length--;
    }

    public int length(){
        return this.length;
    }
}