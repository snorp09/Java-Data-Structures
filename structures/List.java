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

    public void add(int index, T data){
        LinkNode<T> newNode = new LinkNode<T>(data, index, null);
        LinkNode<T> node = firstLink;
        for(int i = 0; i<this.length+1; i++){
            if(i > index){
                node.setIndex(node.getIndex()+1);
            }
            if(node.getIndex() == index){
                newNode.setNext(node);
                node.getPrev().setNext(newNode);
                newNode.setPrev(node.getPrev());
                node.setPrev(newNode);
                node = newNode;
            }
            node = node.getNext();
        }
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

    public static void main(String[] args) throws Exception {
        List<String> strList = new List<>();
        strList.add("Test");
        strList.add("Test2");
        strList.add("Test4");
        strList.add("Test8");
        LinkNode<String> x;
        for(int i = 0; i<strList.length(); i++){
            System.out.println(strList.get(i));
        }

        strList.remove(2);

        for(int i = 0; i<strList.length(); i++){
            System.out.println(strList.get(i));
        }

    }
}