package Main;


import java.lang.reflect.Array;

public class StackArray<T> {

    /**
     * Team: Nils Lütke, Basel Alwani, Laura Weber, Benny Burkert
     */

    private T[] array;
    private int size;
    private int curIndex;//Index of next spot

    /**
     * Initialzies a new StackArray, with given size
     * @param pSize The length of the array
     * @exception IllegalArgumentException if size is negative
     */
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

    /**
     * Pushes a Object T onto the stack
     * @param x Object to push
     * @exception IllegalStateException if the Array is already full
     */
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

    /**
     * Pops/Remvoes and returns the upper object of the stack
     * @return upper object
     * @exception IllegalStateException if the array is already empty
     */
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
