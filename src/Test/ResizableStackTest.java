package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import Main.ResizableStack;

class ResizableStackTest {

    ResizableStack<String> test;

    @Test
    void create(){
        test = new ResizableStack<String>(5);
    }
    @Test
    void push() {
        for(int i = 0; i < 10; i++){
            test.push(" " + i);
        }
    }

    @Test
    void pop() {
    }

    @Test
    void size() {
        System.out.println(test.size());
    }
}