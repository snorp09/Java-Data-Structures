public class App {
    public static void main(String[] args) throws Exception{
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(25);
        tree.add(20);
        tree.add(10);
        tree.add(22);
        tree.add(36);
        tree.add(30);
        tree.add(28);
        tree.add(40);
        tree.add(12);
        tree.add(38);
        tree.add(48);
        tree.add(5);
        tree.add(15);
        tree.add(11);

        Integer x = tree.get(11);
        System.out.println("X value: " + x);
    }
}
