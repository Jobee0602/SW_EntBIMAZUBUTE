package Test;

import Main.StackArray;
import org.junit.jupiter.api.Test;

class StackArrayTest {
    StackArray<String> test;

    @org.junit.jupiter.api.Test
    void create(){
        test = new StackArray<String>(5);
    }

    @org.junit.jupiter.api.Test
    void push() {
        test.push("Das ist ein Test");
    }

    @org.junit.jupiter.api.Test
    void pop() {
        System.out.println(test.pop());
    }
}