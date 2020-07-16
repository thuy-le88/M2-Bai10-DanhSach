package linkList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList node11= new MyLinkedList(10);
        node11.addFirst(11);
        node11.addFirst(12);
        node11.addFirst(13);

        node11.add(4,8);
        node11.add(4,9);
        node11.printList();
    }
}
