public class BinarySearchTree<T extends Comparable<? super T>> {
    private BinaryTreeNode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(T value) {
        root = new BinaryTreeNode<>(value);
    }

    public void add(T newData){
        if(root == null){
            this.root = new BinaryTreeNode<>(newData);
            return;
        }

        BinaryTreeNode<T> current = root;
        while(current != null){
            if(current.getValue().compareTo(newData) == 0){
                throw new DuplicateNodeException();
            }
            if(current.getValue().compareTo(newData) > 0){
                if(current.getLeft() == null){
                    current.setLeft(new BinaryTreeNode<>(newData));
                    break;
                }
                current = current.getLeft();
            }
            else if(current.getValue().compareTo(newData) < 0){
                if(current.getRight() == null){
                    current.setRight(new BinaryTreeNode<>(newData));
                    break;
                }
                current = current.getRight();
            }
        }
    }
}

class DuplicateNodeException extends RuntimeException {}