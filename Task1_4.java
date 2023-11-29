import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1_4 {
    // Реализовать консольное приложение, кот-е принимает от  польз-ля строку вида text-num.
    // Нужно расплитить строку по -, сохр-ть text в связный список на позиц. num
    // Если введено print-num, выводит строку з позиц num в связном списке и удаляет ее из списка.
    public static void main(String[] args){
        List<String> list = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean work = true;
            while (work){
                String line = scanner.nextLine();
                String[] partsLine = line.split("~");
                String text = partsLine[0];
                String strNum = partsLine[1];
                int num = Integer.parseInt(strNum);
                if ((list.isEmpty() && num == 0) || (num <= list.size() && num >= 0)) {
                    switch (text) {
                        case "print":
                            print(num, list);
                            break;
                        case "finish":
                            work = false;
                            break;
                        default:
                            list.add(num, text);
                    }
                } else {
                    System.out.println("Недопустимый индекс. Укажите значение в диапазоне от 0 до " + list.size());
                }
            }
        } catch (NumberFormatException e) {
           
            e.printStackTrace();
        }
    }

    private static void print(int num, List<String> list) {
        if (num == list.size()){
            System.out.println("Недопустимый индекс. Укажите значение в диапазоне от 0 до "
                    + (list.size() - 1));
        } else {
            System.out.println(list.remove(num));
        }
    }
    
}
