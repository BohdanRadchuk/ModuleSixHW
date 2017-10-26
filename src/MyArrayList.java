import java.util.ArrayList;

public class MyArrayList<T> {


    T [] myArrayList= (T[])new Object[0];

    public void add(T varriable){

        T [] tempArray = (T[])new Object [myArrayList.length+1];
        System.arraycopy(myArrayList,0,tempArray,0,myArrayList.length);
        tempArray[myArrayList.length] = varriable;
        myArrayList = tempArray;

    }

    public void remove(int index){
       // T [] tempArray = (T[])new Object [myArrayList.length-2];
        //System.arraycopy();
    }


    public void show(){
        for (T data:myArrayList) {
            System.out.println(data);

        }
    }

      public void ar() {
          ArrayList<T> asd = new ArrayList();

    }

}
