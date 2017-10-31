public class Main {
    public static void main(String[] args) {

       /* MyArrayList myList = new MyArrayList();
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
        System.out.println("list.size = " + myList.size());*/

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);

        myLinkedList.remove(1);
        myLinkedList.show();
        myLinkedList.clear();
        myLinkedList.show();

        /*Queue queue = new Queue();
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
        Stack stack = new Stack();
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
        stack.show();*/
    }
}
