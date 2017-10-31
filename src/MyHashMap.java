public class MyHashMap<K, T> {
    public int length;
    Node<K, T> first;

    Node<K, T> next;

    public MyHashMap() {
        first = null;
        next = null;
        length = 0;
    }



    public void put(K key, T value) {

            if (length == 0) {
                first = new Node<>(key, value, null);
                next = first;
            } else {
                if (keySearchMatch(key).key!=key) {
                    Node<K, T> node = new Node<>(key, value, null);
                    next.next = node;
                    next = node;
                }
                else System.out.println("this key is already used");

            }
            length++;

    }




    public T get (K key){

        T searchData=null;
        if (keySearchMatch(key).key==key)
            searchData = keySearchMatch(key).data;
        else
            System.out.println("такого ключа нет.");


        return searchData;
    }

    public Node<K,T > keySearchMatch(K key){
        Node<K, T> iterator = first;
        Node<K,T> temp = iterator;

        do {
            if (iterator.key == key )
                temp = iterator;


            iterator = iterator.next;
        } while (iterator != null);
        return temp;
    }

    public int size() {
        return length;
    }

    public void remove(K key) {

        for (Node<K, T> iterator = first; iterator != null; ) {
            Node<K, T> next = iterator.next;
            if (iterator.key == key){
                iterator.key = null;
                iterator.data = null;
                break;
            }

            iterator = next;
        }
    }

    public void clear() {

        for (Node<K, T> iterator = first; iterator != null; ) {
            Node<K, T> next = iterator.next;
            iterator.key = null;
            iterator.data = null;
            iterator.next = null;

            iterator = next;
        }
    }

    public void show() {

        Node<K, T> iterator = first;
        if (iterator == null) return;

        do {
            System.out.print("Ключ: " + iterator.key + " значение " + iterator.data + ". ");
            iterator = iterator.next;
        } while (iterator != null);
        System.out.println();

    }


    private class Node<K, T> {
        K key;
        T data;
        Node<K, T> next;


        public Node(K key, T data, Node<K, T> next) {
            this.key = key;
            this.data = data;
            this.next = next;

        }
    }

}
