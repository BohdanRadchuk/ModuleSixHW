public class Main {
    public static void main(String[] args) {

        MyArrayList myList = new MyArrayList();
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

    }
}
