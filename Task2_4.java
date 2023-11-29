import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task2_4 {
    // Реал-ть консоль-е прил-е, кот-е прин-т от польз-ля и "запом-т" строки.
    // Если введено print, выводит строки так, чтобы  посл-я введ-я была 1-в списке,
    // а первая - посл-й. Если введено revert, удал-т пред-ю введ-ю строку из памяти.
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> list = new LinkedList<>();
            boolean work = true;
            while (work){
                String line = scanner.nextLine();
                switch (line){
                    case "print":
                        for (String s: list){
                            System.out.println(s);
                        }
                        break;
                    case "revert":
                        list.remove(0);
                        break;
                    case "finish":
                        work = false;
                        break;
                    default:
                        list.add(0, line);
                }
            }
        }
    }
}
