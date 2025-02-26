public class App {
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
