public class Queue <T> {
    private T [] myQueueArray = (T[])new Object[0];

    public Queue() {

    }
    public void add (T value){
        T [] tempArray = (T[])new Object [myQueueArray.length+1];
        System.arraycopy(myQueueArray,0,tempArray,0, myQueueArray.length);
        tempArray[myQueueArray.length] = value;
        myQueueArray = tempArray;
    }
    public void remove(int index) {
        if (index > myQueueArray.length-1 || index < 0)
            System.out.println("такого елемента в массиве нет. введите другой элемент");

        else {
            T[] tempArray = (T[]) new Object[myQueueArray.length - 1];
            System.arraycopy(myQueueArray, 0, tempArray, 0, index);
            System.arraycopy(myQueueArray, index + 1, tempArray, index, myQueueArray.length - index - 1);
            myQueueArray = tempArray;
        }
    }
    public void clear(){

        T[] tempArray = (T[])new Object[0];
        myQueueArray = tempArray;
        /*for (int i = 0; i<myQueueArray.length; i++)
            remove(i);*/
    }
    public int size(){
        return myQueueArray.length;
    }

    public T peek(){
        return myQueueArray[0];
    }

    public T poll(){
        T val = myQueueArray[0];
        remove(0);
        return val;
    }
    public void show(){
        for (T data:myQueueArray) {
            System.out.print(data + "; ");
        }
    }

}
