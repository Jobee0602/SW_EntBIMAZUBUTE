package Main;

public class ResizableStack<T> {

    /**
     * Team: Nils Lütke, Basel Alwani, Laura Weber, Benny Burkert
     */

    private T[] array;
    private int size;
    private int curIndex;//Index of next spot

    /**
     * Initialzies a new Resizable, with given size
     * @param pSize The starting length of the array
     * @exception IllegalArgumentException if the size is negative
     */
    public ResizableStack(int pSize) {
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
     * Pushes a Object T onto the stack and enlarges it if needed
     * @param x Object to push
     */
    public void push(T x) {
        System.out.println(array.length);
        if(curIndex == size){
            T[] cur = (T[]) new Object[size*2];
            for(int i = 0; i < size;i++){
                cur[i]=array[i];
            }
            array = cur;
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

    /**
     * Simple getter for array.lengths
     * @return Current size of the array
     */
    public int size(){
        return array.length;
    }

    public int getIndex() {
        return curIndex;
    }
}
