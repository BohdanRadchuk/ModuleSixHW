public class MyLinkedList<T> {


    public int length;
    Node prev;
    Node next;

    public MyLinkedList() {
        prev = null;
        next = null;
        length = 0;
    }


    private class Node <T> {
         T data;
         Node<T> next;
         Node<T> prev;

        public Node(T data, Node<T> next, Node<T> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }



    public void add(T value){

        if (!(length==0)) {
            Node prev = next;
            next = new Node(value, null, null);
            prev.next = next;
        }
        else {
            next = new Node(value, null, next);
            prev = next;
        }
        length++;
    }
    public void show(){
        for(int i = 0; i<=length; i++)
            System.out.println(next.data);
    }

}


