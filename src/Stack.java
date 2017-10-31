public class Stack<T> {
    private T[] myStackArray = (T[]) new Object[0];


    public void push(T value) {
        T[] tempArray = (T[]) new Object[myStackArray.length + 1];
        System.arraycopy(myStackArray, 0, tempArray, 0, myStackArray.length);
        tempArray[myStackArray.length] = value;
        myStackArray = tempArray;
    }

    public void remove(int index) {
        if (index > myStackArray.length - 1 || index < 0)
            System.out.println("такого елемента в массиве нет. введите другой элемент");

        else {
            T[] tempArray = (T[]) new Object[myStackArray.length - 1];
            System.arraycopy(myStackArray, 0, tempArray, 0, index);
            System.arraycopy(myStackArray, index + 1, tempArray, index, myStackArray.length - index - 1);
            myStackArray = tempArray;
        }
    }

    public void clear() {

        T[] tempArray = (T[]) new Object[0];
        myStackArray = tempArray;
    }

    public int size() {
        return myStackArray.length;
    }

    public T peek() {
        return myStackArray[myStackArray.length - 1];           //возвращаем последний элемент массива
    }

    public T poll() {
        T val = peek();
        remove(myStackArray.length - 1);                 //удаляем последний элемент
        return val;
    }

    public void show() {
        for (T data : myStackArray) {
            System.out.print(data + "; ");
        }
    }

}
