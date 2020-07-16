package list;

import java.util.Arrays;

public class MyList {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];
    public MyList() {
        elements=new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa() {
        int newSize=elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }

    public void add(int e) {
        if (size==elements.length) {
            ensureCapa();
        }
        elements[size++]=e;
    }

    public int get(int i) {
        if (i>=size||i<0) {
            throw new IndexOutOfBoundsException("Index: "+i+" ,size "+i);
        }
        return (int) elements[i];
    }

    public static void main(String[] args) {
        MyList listInteger = new MyList();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 1: "+listInteger.get(0));
        System.out.println("element 2: "+listInteger.get(1));
        System.out.println("element 3: "+listInteger.get(2));
        System.out.println("element 4: "+listInteger.get(3));

        //listInteger.get(-1);
        System.out.println("element -1: "+listInteger.get(-1));
    }
}
