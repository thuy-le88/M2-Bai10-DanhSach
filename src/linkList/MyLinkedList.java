package linkList;

import javax.xml.soap.Node;

public class MyLinkedList {
    private int numNode=0;
    private Node head;

    public MyLinkedList(Object data) {
        head=new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data=data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp=head;
        Node holder;

        for (int i=0;i<index-1 && temp.next!=null;i++) {
            temp=temp.next;
        }

        holder=temp.next;
        temp.next=new Node(data);
        temp.next.next=holder;
        numNode++;
    }

    public void addFirst(Object data) {
        Node temp=head;
        head = new Node(data);
        head.next=temp;
        numNode++;
    }

    public Node get(int index) {
        Node temp=head;
        for (int i=0;i<index;i++) {
            temp=temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

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
