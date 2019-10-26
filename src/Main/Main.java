package Main;

public class Main {
    static StackArray<String> test;
    static ResizableStack<String> test2;
    public static void main(String[]args){
        test = new StackArray<String>(5);
        test.push("Test");
        System.out.println(test.pop());

        test2 = new ResizableStack<String>(5);
        test2.push("Test");
        test2.push("Test");
        test2.push("Test");
        test2.push("Test");
        test2.push("Test");
        test2.push("Test");
        test2.push("Test");
        test2.push("Test1");

        System.out.println(test2.pop());
        System.out.println(test2.pop());
        System.out.println(test2.pop());
    }
}
