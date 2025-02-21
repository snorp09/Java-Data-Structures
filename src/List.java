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
        LinkNode<T> link = new LinkNode<T>(item, this.length);
        if(this.firstLink == null){
            this.firstLink = link;
            this.length++;
            return;
        }

        LinkNode<T> currNode = firstLink;
        while(currNode.getNext() != null){
            currNode = currNode.getNext();
        }
        currNode.setNext(link);
        this.length++;
    }
}