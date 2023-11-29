import java.util.LinkedList;

public class DZ1_4 {
    // Пусть дан LinkedList с несколькими элементами.
    // Напишите класс LLTasks с методом revert,
    // который принимал бы на вход LinkedList и возвращает “перевернутый” список.
    class LLTasks {
        public static LinkedList<Object> revert(LinkedList<Object> ll) {
            LinkedList<Object> reversed = new LinkedList<>();
            for (Object o : ll) {
                reversed.addFirst(o);
            }
            return reversed;
        }
    }

    public class Printer {
        public static void main(String[] args) {
            LinkedList<Object> ll = new LinkedList<>();

            if (args.length == 0 || args.length != 4) {
                ll.add(1);
                ll.add("One");
                ll.add(2);
                ll.add("Two");
            } else {
                ll.add(Integer.parseInt(args[0]));
                ll.add(args[1]);
                ll.add(Integer.parseInt(args[2]));
                ll.add(args[3]);
            }

            // LLTasks answer = new LLTasks();
            System.out.println(ll);
            // LinkedList<Object> reversedList = answer.revert(ll);
            // System.out.println(reversedList);
        }
    }

}
