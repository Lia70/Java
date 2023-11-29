
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
// Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
// int[] arr - числовой массив
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


public class DZ2_2 {
    public class BubbleSort {
        public static void main(String[] args) {
            int[] arr = { 9, 4, 8, 3, 1 };
            sort(arr);
        }

        public static void sort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                writeLog(arr);
            }
        }

        public static void writeLog(int[] arr) {
            try {
                FileWriter fileWriter = new FileWriter("log.txt", true);
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                String formattedDate = now.format(formatter);
                String logEntry = formattedDate + " " + java.util.Arrays.toString(arr) + "\n";
                fileWriter.write(logEntry);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
   
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[] { 9, 4, 8, 3, 1 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        DZ2_2.BubbleSort.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

