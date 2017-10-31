public class MyLinkedList<T> {


    public int length;
    Node<T> first;
    Node<T> prev;
    Node<T> next;


    public MyLinkedList() {
        prev = null;
        next = null;
        length = 0;
    }

    public void add(T value) {
        if (length == 0) {
            first = new Node<T>(value, null, null);
            next = first;
        } else {
            Node<T> node = new Node<>(value, null, next);
            next.next = node;
            next = node;
        }
/*
        if (!(length==0)) {
            prev = null;
            first = new Node(value, null, null);
            first.next = next;
        }
        else {
            prev = next;
            next = new Node(value, null, next);

        }*/
        length++;
    }

    public void clear() {

        for (Node<T> iterator = first; iterator != null; ) {
            Node<T> next = iterator.next;
            iterator.data = null;
            iterator.next = null;
            iterator.prev = null;
            iterator = next;
        }
    }

    public void remove(int index) {
        if (index > 0 && index <= length) {
            if (index == 1) {
                Node<T> newFirst = first.next;
                first = null;
                first = newFirst;
            } else {
                next = first.next;
                for (int i = 2; i < index; i++) {
                    next = next.next;
                }
                next.data = null;
            }
        } else
            System.out.println("there is no element with such index");
    }

    public int size() {
        return length;
    }

    public Node<T> get(int index) {
        if (index == 1) {
            return first;
        } else {
            next = first.next;
            for (int i = 2; i < index; i++) {
                next = next.next;
            }
            return next;
        }
    }

    public void show() {

        Node<T> iterator = first;
        if (iterator == null) return;

        do {
            System.out.print("" + iterator.data + " ");
            iterator = iterator.next;
        } while (iterator != null);
        System.out.println();

    }


    private class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data, Node<T> next, Node<T> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}


