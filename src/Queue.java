public class Queue<T> {
    private T[] myQueueArray = (T[]) new Object[0];

    public Queue() {

    }

    public void add(T value) {
        T[] tempArray = (T[]) new Object[myQueueArray.length + 1];                               //создаём временный массив размером на 1 больше
        System.arraycopy(myQueueArray, 0, tempArray, 0, myQueueArray.length);      //копируем старый массив
        tempArray[myQueueArray.length] = value;                                                //присваиваем значение последнему элементу
        myQueueArray = tempArray;                                                              //перезаписываем наш массив на временнный(на 1 элемент больше)
    }

    public void remove(int index) {
        if (index > myQueueArray.length - 1 || index < 0)                                         //проверяем валидность элемента
            System.out.println("такого елемента в массиве нет. введите другой элемент");

        else {
            T[] tempArray = (T[]) new Object[myQueueArray.length - 1];                          //создаём массив на 1 меньше
            System.arraycopy(myQueueArray, 0, tempArray, 0, index);              //копируем первую часть
            System.arraycopy(myQueueArray, index + 1, tempArray, index, myQueueArray.length - index - 1);   //копируем оставшуюся часть без элемента который удалили
            myQueueArray = tempArray;                                                            // перезаписываем наш массив
        }
    }

    public void clear() {

        T[] tempArray = (T[]) new Object[0];                                                     // создаём временный массив размером 0
        myQueueArray = tempArray;
    }

    public int size() {
        return myQueueArray.length;
    }

    public T peek() {
        return myQueueArray[0];         // возвращаем значение 0ого элемента
    }

    public T poll() {
        T val = peek();             //присваиваем временной переменной значение для возврата
        remove(0);            //удаляем 0ой элемент
        return val;
    }

    public void show() {
        for (T data : myQueueArray) {
            System.out.print(data + "; ");
        }
    }

}
