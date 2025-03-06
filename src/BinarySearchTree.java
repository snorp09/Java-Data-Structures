/*
 * Notes about Binary Trees
 * Binary Trees are good for performing searches.
 * Three types of searching these trees are:
 * Pre-Order Top to Left to Right.
 * In-Order, think of this as left to right reading.
 * Post-order Left to Right, bottom to top.
 * 
 * In a binary search tree, Right is greater than Left in comparison to branches above.
 * No duplicates are allowed.
 */

enum SEARCH_TYPE{
    PREORDER,
    INORDER,
    POSTORDER;
}

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

    public BinaryTreeNode<T> getNode(T value){
        BinaryTreeNode<T> current = root;
        while(current != null){
            int compareVal = current.getValue().compareTo(value);
            if(compareVal == 0){
                return current;
            }
            if(compareVal > 0){
                current = current.getLeft();
            }
            if(compareVal < 0){
                current = current.getRight();
            }
        }
        throw new NodeNotFoundException();
    }

    public BinaryTreeNode<T> getPreOrder(T value){
        BinaryTreeNode<T> current = root;
        while(current != null){
            int compareVal = current.getValue().compareTo(value);
            if(compareVal == 0){
                return current;
            }
            if(compareVal > 0){
                current = current.getLeft();
            }
            if(compareVal < 0){
                current = current.getRight();
            }
        }
        throw new NodeNotFoundException();
    }

    public Boolean contains(T value){
        BinaryTreeNode<T> current = root;
        while(current != null){
            int compareVal = current.getValue().compareTo(value);
            if(compareVal == 0){
                return true;
            }
            if(compareVal > 0){
                current = current.getLeft();
            }
            if(compareVal < 0){
                current = current.getRight();
            }
        }
        throw new NodeNotFoundException();
    }

    public BinaryTreeNode<T> getParentNode(T value){
        BinaryTreeNode<T> parent = null;
        BinaryTreeNode<T> current = root;
        while(current != null){
            int compareVal = current.getValue().compareTo(value);
            if(compareVal == 0){
                return parent;
            }
            parent = current;
            if(compareVal > 0){
                current = current.getLeft();
            }
            if(compareVal < 0){
                current = current.getRight();
            }
        }
        throw new NodeNotFoundException();
    }

    // Remove and replace with the branch from the *right*.
    public void removeNode(T value){
        BinaryTreeNode<T> removeNode = getNode(value);
        BinaryTreeNode<T> parent = getParentNode(value);
        if(removeNode.getValue() == parent.getLeft().getValue()){
            parent.setLeft(removeNode.getLeft());
        }
        if(removeNode.getValue() == parent.getRight().getValue()){
            parent.setRight(removeNode.getRight());
        }
    }
}

class DuplicateNodeException extends RuntimeException {}

class NodeNotFoundException extends RuntimeException {}