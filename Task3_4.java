import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task3_4 {
    // Написать метод, кот-й при-т массив элементов, помещяет их в стэк
    // и выводит на консоль содер-е стэка.
    // Написать метод, кот-й принимает массив элементов, помещяет 
    // их в очередь и выводит на консоль содер-е очереди.
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4"};
//        printStack(arr);
        printQueue(arr);
    }

    private static void printQueue(String[] arr) {
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(arr));
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    static void printStack(String[] arr){
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
//        System.out.println(stack);
//        for (String s: stack){
//            System.out.println(s);
//        }
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
    
}
