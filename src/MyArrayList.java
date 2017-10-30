public class MyArrayList<T> {


    private T [] myArrayList= (T[])new Object[0];

    public void add(T varriable){

        T [] tempArray = (T[])new Object [myArrayList.length+1];
        System.arraycopy(myArrayList,0,tempArray,0,myArrayList.length);
        tempArray[myArrayList.length] = varriable;
        myArrayList = tempArray;

    }

    public void remove(int index) {
        if (index > myArrayList.length-1 || index < 0)
            System.out.println("такого елемента в массиве нет. введите другой элемент");

        else {
            T[] tempArray = (T[]) new Object[myArrayList.length - 1];
            System.arraycopy(myArrayList, 0, tempArray, 0, index);
            System.arraycopy(myArrayList, index + 1, tempArray, index, myArrayList.length - index - 1);
            myArrayList = tempArray;
        }
    }

    public void clear(){
        T[] tempArray = (T[])new Object[0];
        myArrayList = tempArray;
        /*for (int i = 0; i<myArrayList.length; i++)                        //не оптимальный в планепроизводительности
            remove(i);
        */}

    public int size(){
        return myArrayList.length;
    }

    public T get(int index){
        return myArrayList[index];
    }

    public void show(){
        for (T data:myArrayList) {
            System.out.print(data + "; ");
        }
    }
}
