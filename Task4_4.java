public class Task4_4 {
    // Реал-ть стэк  с пом-ю массива.
    // Нужно реал-ть методы: size(), empty(), peek(), pop()
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
    
}
