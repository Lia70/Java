
import java.time.LocalTime;
import java.util.Scanner;

public class Task1 {
    /*
      В консоли запросить имя пользователя. В зависимости от текущего
      времени, вывести приветствие вида:
      "Доброе утро, <имя!>", если время от 05:00 до 11:59
      "Добрый день, <имя!>", если время от 12:00 до 17:59
      "Добрый вечер, <имя!>", если время от 18:00 до 22:59
      "Доброй ночи, <имя!>", если время от 23:00 до 04:59
     */
    public static void main(String[] args) {
        System.out.println("Введите ваше имя: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            LocalTime time = LocalTime.now();
            int hour = time.getHour();
            if (hour >= 5 && hour < 12){
                System.out.println(("Доброе утро, " + name + "!"));
            } else if (hour >= 12 && hour < 18){
                System.out.println(("Добрый день, " + name + "!"));
            } else if (hour >= 18 && hour < 23){
                System.out.println(("Добрый вечер, " + name + "!"));
            } else {
                System.out.println(("Доброй ночи, " + name + "!"));
            }
        }
    }
}