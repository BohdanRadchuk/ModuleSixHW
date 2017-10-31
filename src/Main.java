public class Main {
    public static void main(String[] args) {
        System.out.println("----------MyArrayList-------------");
        MyArrayList myList = new MyArrayList();                       //arrayList example
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.remove(5);
        myList.show();
        System.out.println("элемент под индексом n = " + myList.get(2));

        myList.clear();
        myList.show();
        System.out.println();
        System.out.println("list.size = " + myList.size());
        
        System.out.println();
        System.out.println("----------MyLinkedList-------------");
        MyLinkedList myLinkedList = new MyLinkedList();             //LinkedList example
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);

        myLinkedList.remove(1);
        myLinkedList.show();
        myLinkedList.clear();
        myLinkedList.show();
        System.out.println();
        System.out.println("----------MyQueue-------------");
        Queue queue = new Queue();                                //Queue example
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.remove(3);
        queue.show();
        System.out.println();
        System.out.println("размер очереди = " + queue.size());
        System.out.println("peek element = " + queue.peek());
        System.out.println("poll element 0 = " + queue.poll());
        System.out.println("poll element 1 = " + queue.poll());
        queue.show();
        queue.clear();
        queue.show();
        System.out.println();
        System.out.println("----------MyStack-------------");
        Stack stack = new Stack();                                  //Stack example
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.remove(3);
        stack.show();
        System.out.println();
        System.out.println("размер очереди = " + stack.size());
        System.out.println("peek element = " + stack.peek());
        System.out.println("poll last element  = " + stack.poll());
        System.out.println("poll one more element = " + stack.poll());
        stack.show();
        stack.clear();
        stack.show();
        System.out.println();
        System.out.println("----------MyHashMap-------------");
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.put(1, "asd");
        myHashMap.put(2, "asd1");
        myHashMap.put(1, "asd2");
        myHashMap.put(4, "asd3");
        myHashMap.show();
        System.out.println("выводим значение объекта с ключём 2 = "+ myHashMap.get(2));
        myHashMap.remove(2);
        myHashMap.show();

        System.out.println("myHashMap.size = "+ myHashMap.size());
        myHashMap.clear();
        myHashMap.show();


    }
}
