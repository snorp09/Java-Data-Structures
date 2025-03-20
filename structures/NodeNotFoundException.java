/*
 * NodeNotFoundException Class
 * Throws when a Node isn't found on the Binary Tree.
 */
public class NodeNotFoundException extends Exception {
    NodeNotFoundException(){
        super("Node was unable to be found.");
    }
}
