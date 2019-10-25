package Main;


import java.lang.reflect.Array;

public class StackArray<T> {

    private T[] array;
    private int size;
    private int curIndex;//Index of next spot

    public StackArray(int pSize) {
        if(pSize >= 0){
            curIndex = 0;
            size = pSize;
            array = (T[]) new Object[size];
        }
        else{
            throw new IllegalArgumentException("The size of the Stack array is too small");
        }
    }

    public void push(T x) {
        System.out.println(array.length);
        if(curIndex == size){
            throw new IllegalStateException("The Array is full");
        }
        else{
            array[curIndex] = x;
            curIndex+=1;
        }
    }

    public T pop() {
        if(curIndex == 0){
            throw new IllegalStateException("The Array is already empty");
        }
        else{
            curIndex-= 1;
            return array[curIndex];
        }
    }
}
