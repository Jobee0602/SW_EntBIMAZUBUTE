package Main;

public class ResizableStack<T> {

    private T[] array;
    private int size;
    private int curIndex;//Index of next spot

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

    public T pop() {
        if(curIndex == 0){
            throw new IllegalStateException("The Array is already empty");
        }
        else{
            curIndex-= 1;
            return array[curIndex];
        }
    }

    public int size(){
        return size;
    }
}
