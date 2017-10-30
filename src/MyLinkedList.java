

public class MyLinkedList<T> {
    public T value;
    T first;
    T last;
    public int length;
    public MyLinkedList next;
    public MyLinkedList current;
    public MyLinkedList prev;

    public MyLinkedList(T value) {

        current.value = value;

       /* current.next = null;
        current.prev = null;*/
        this.length = 1;

    }
    public void add(T value){

        current.prev = current;
        current.value = value;
        current.next = null;
        length++;

    }
}
